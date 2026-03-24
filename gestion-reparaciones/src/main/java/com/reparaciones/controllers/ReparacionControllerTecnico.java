package com.reparaciones.controllers;

import com.reparaciones.Sesion;
import com.reparaciones.dao.ReparacionComponenteDAO;
import com.reparaciones.dao.ReparacionDAO;
import com.reparaciones.models.ReparacionResumen;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReparacionControllerTecnico {

    @FXML
    private TableView<ReparacionResumen> tablaReparaciones;
    @FXML
    private TableColumn<ReparacionResumen, Void> colAcciones;
    @FXML
    private TableColumn<ReparacionResumen, String> colIdRep;
    @FXML
    private TableColumn<ReparacionResumen, Long> colImei;
    @FXML
    private TableColumn<ReparacionResumen, String> colReparador;
    @FXML
    private TableColumn<ReparacionResumen, String> colFecha;
    @FXML
    private TableColumn<ReparacionResumen, String> colComponente;
    @FXML
    private TableColumn<ReparacionResumen, String> colObservaciones;
    @FXML
    private TableColumn<ReparacionResumen, Void> colIncidencia;
    @FXML
    private TableColumn<ReparacionResumen, String> colIdAnterior;
    @FXML
    private TextField campoBusqueda;

    private final ReparacionDAO reparacionDAO = new ReparacionDAO();
    private final ReparacionComponenteDAO reparacionComponenteDAO = new ReparacionComponenteDAO();
    private ObservableList<ReparacionResumen> datos = FXCollections.observableArrayList();
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    @FXML
    public void initialize() {
        tablaReparaciones.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_FLEX_LAST_COLUMN);
        configurarColumnas();
        configurarFilas();
        cargarDatos();
    }

    /**
     * Configura las columnas — igual que admin salvo colAcciones y colIncidencia
     * que se desarrollarán con lógica de técnico (solo lectura en filas ajenas).
     */
    private void configurarColumnas() {
        colIdRep.setCellValueFactory(
                data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getIdRep()));

        colImei.setCellValueFactory(
                data -> new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getImei()));

        colReparador.setCellValueFactory(
                data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombreTecnico()));

        colFecha.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(
                data.getValue().getFechaFin().format(FORMATO_FECHA)));

        colComponente.setCellValueFactory(
                data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTipoComponente()));

        colObservaciones.setCellValueFactory(
                data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getObservaciones()));

        colIdAnterior.setCellValueFactory(
                data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getIdRepAnterior()));

        configurarColAcciones();
        configurarColIncidencia();
    }

    /**
     * Columna acciones para técnico — sin botón borrar fila.
     * El técnico no puede borrar reparaciones.
     * TODO: definir qué acciones tendrá el técnico aquí.
     */
    private void configurarColAcciones() {
        colAcciones.setCellFactory(col -> new TableCell<>() {
            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(null); // TODO: acciones técnico
            }
        });
    }

    /**
     * Columna incidencia para técnico — solo lectura.
     * Caso 1 (ES_INCIDENCIA=FALSE): celda vacía, el técnico no puede añadir
     * incidencias
     * Caso 2 (ES_INCIDENCIA=TRUE, ES_RESUELTO=FALSE): label rojo con el comentario
     * Caso 3 (ES_INCIDENCIA=TRUE, ES_RESUELTO=TRUE): label gris con el comentario
     */
    private void configurarColIncidencia() {
        colIncidencia.setCellFactory(col -> new TableCell<>() {
            private final Label lblComentario = new Label();

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                    setStyle("");
                    return;
                }

                ReparacionResumen rep = getTableView().getItems().get(getIndex());

                if (!rep.isEsIncidencia()) {
                    setGraphic(null);
                    setStyle("");
                } else if (!rep.isEsResuelto()) {
                    // Activa — texto en rojo
                    lblComentario.setText(rep.getIncidencia() != null ? rep.getIncidencia() : "");
                    lblComentario.setStyle("-fx-font-size: 12px; -fx-text-fill: #FB8888;");
                    setStyle("");
                    setGraphic(lblComentario);
                } else {
                    // Resuelta — texto gris
                    lblComentario.setText(rep.getIncidencia() != null ? rep.getIncidencia() : "");
                    lblComentario.setStyle("-fx-font-size: 12px; -fx-text-fill: #A9A9A9;");
                    setStyle("-fx-background-color: #E7E7E7;");
                    setGraphic(lblComentario);
                }
            }
        });
    }

    /**
     * Pinta en rojo las filas con incidencia activa — igual que admin.
     */
    private void configurarFilas() {
        tablaReparaciones.setRowFactory(tv -> new TableRow<>() {
            @Override
            protected void updateItem(ReparacionResumen item, boolean empty) {
                super.updateItem(item, empty);
                if (!empty && item != null && item.isEsIncidencia() && !item.isEsResuelto()) {
                    setStyle(
                            "-fx-background-color: rgba(251,136,136,0.16);" +
                                    "-fx-border-color: transparent transparent #FB8888 transparent;" +
                                    "-fx-border-width: 0 0 0.2 0;");
                } else {
                    setStyle("");
                }
            }
        });
    }

    /**
     * Carga todas las reparaciones — el técnico ve todas, no solo las suyas.
     * La restricción de acción se aplica en las celdas, no en la query.
     */
    private void cargarDatos() {
        try {
            List<ReparacionResumen> lista = reparacionDAO.getReparacionesResumen();
            datos = FXCollections.observableArrayList(lista);
            tablaReparaciones.setItems(datos);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void descargarHistorial() {
        // TODO: implementar exportación TXT
    }
}