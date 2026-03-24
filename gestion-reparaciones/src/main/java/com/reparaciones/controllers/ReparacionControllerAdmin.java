package com.reparaciones.controllers;

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
import javafx.scene.layout.Priority;

import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReparacionControllerAdmin {

    @FXML private TableView<ReparacionResumen> tablaReparaciones;
    @FXML private TableColumn<ReparacionResumen, Void> colAcciones;
    @FXML private TableColumn<ReparacionResumen, String> colIdRep;
    @FXML private TableColumn<ReparacionResumen, Long> colImei;
    @FXML private TableColumn<ReparacionResumen, String> colReparador;
    @FXML private TableColumn<ReparacionResumen, String> colFecha;
    @FXML private TableColumn<ReparacionResumen, String> colComponente;
    @FXML private TableColumn<ReparacionResumen, String> colObservaciones;
    @FXML private TableColumn<ReparacionResumen, Void> colIncidencia;
    @FXML private TableColumn<ReparacionResumen, String> colIdAnterior;
    @FXML private TextField campoBusqueda;

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

    private void configurarColumnas() {
        colIdRep.setCellValueFactory(data ->
            new javafx.beans.property.SimpleStringProperty(data.getValue().getIdRep()));

        colImei.setCellValueFactory(data ->
            new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getImei()));

        colReparador.setCellValueFactory(data ->
            new javafx.beans.property.SimpleStringProperty(data.getValue().getNombreTecnico()));

        colFecha.setCellValueFactory(data ->
            new javafx.beans.property.SimpleStringProperty(
                data.getValue().getFechaFin().format(FORMATO_FECHA)));

        colComponente.setCellValueFactory(data ->
            new javafx.beans.property.SimpleStringProperty(data.getValue().getTipoComponente()));

        colObservaciones.setCellValueFactory(data ->
            new javafx.beans.property.SimpleStringProperty(data.getValue().getObservaciones()));

        colIdAnterior.setCellValueFactory(data ->
            new javafx.beans.property.SimpleStringProperty(data.getValue().getIdRepAnterior()));

        configurarColAcciones();
        configurarColIncidencia();
    }

    /**
     * Columna acciones — solo icono borrar para el admin.
     */
    private void configurarColAcciones() {
        Image imgBorrar = new Image(getClass().getResourceAsStream("/images/borrar.png"));

        colAcciones.setCellFactory(col -> new TableCell<>() {
            private final ImageView ivBorrar = new ImageView(imgBorrar);
            private final HBox contenedor = new HBox(ivBorrar);

            {
                ivBorrar.setFitWidth(16);
                ivBorrar.setFitHeight(16);
                ivBorrar.setPreserveRatio(true);
                ivBorrar.setStyle("-fx-cursor: hand;");
                contenedor.setAlignment(javafx.geometry.Pos.CENTER);

                ivBorrar.setOnMouseClicked(e -> {
                    ReparacionResumen rep = getTableView().getItems().get(getIndex());
                    borrarReparacion(rep);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty ? null : contenedor);
            }
        });
    }

    /**
     * Columna incidencia — tres estados:
     * Caso 1 (ES_INCIDENCIA=FALSE): botón ancho rojo con icono lápiz + "Añadir una incidencia"
     * Caso 2 (ES_INCIDENCIA=TRUE, ES_RESUELTO=FALSE): botón basura + texto comentario
     * Caso 3 (ES_INCIDENCIA=TRUE, ES_RESUELTO=TRUE): solo texto, fondo gris, sin basura
     */
    private void configurarColIncidencia() {
        Image imgBorrar = new Image(getClass().getResourceAsStream("/images/borrar.png"));
        Image imgLapiz = new Image(getClass().getResourceAsStream("/images/añadir_incidencia.png"));

        colIncidencia.setCellFactory(col -> new TableCell<>() {

            private final ImageView ivLapiz = new ImageView(imgLapiz);
            private final Button btnAniadir = new Button("Añadir una incidencia");
            private final ImageView ivBorrar = new ImageView(imgBorrar);
            private final Button btnBorrarIncidencia = new Button();
            private final Label lblComentario = new Label();
            private final HBox casoUno = new HBox(btnAniadir);
            private final HBox casoDos = new HBox(8, btnBorrarIncidencia, lblComentario);

            {
                // Caso 1 — botón ancho rojo con icono lápiz
                ivLapiz.setFitWidth(16);
                ivLapiz.setFitHeight(16);
                ivLapiz.setPreserveRatio(true);
                btnAniadir.setGraphic(ivLapiz);
                btnAniadir.setContentDisplay(ContentDisplay.LEFT);
                btnAniadir.setStyle(
                    "-fx-background-color: #FB8888;" +
                    "-fx-text-fill: white;" +
                    "-fx-font-weight: bold;" +
                    "-fx-font-size: 12px;" +
                    "-fx-cursor: hand;" +
                    "-fx-background-radius: 0;"
                );
                HBox.setHgrow(btnAniadir, Priority.ALWAYS);
                btnAniadir.setMaxWidth(Double.MAX_VALUE);
                casoUno.setMaxWidth(Double.MAX_VALUE);

                // Caso 2 — botón cuadrado con icono basura + label comentario
                ivBorrar.setFitWidth(16);
                ivBorrar.setFitHeight(16);
                ivBorrar.setPreserveRatio(true);
                btnBorrarIncidencia.setGraphic(ivBorrar);
                btnBorrarIncidencia.setStyle(
                    "-fx-background-color: #FB8888;" +
                    "-fx-background-radius: 2;" +
                    "-fx-min-width: 35;" +
                    "-fx-max-width: 35;" +
                    "-fx-min-height: 35;" +
                    "-fx-max-height: 35;" +
                    "-fx-cursor: hand;"
                );
                lblComentario.setStyle("-fx-font-size: 12px; -fx-text-fill: #000000;");
                HBox.setHgrow(lblComentario, Priority.ALWAYS);
                casoDos.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
                casoDos.setMaxWidth(Double.MAX_VALUE);

                btnAniadir.setOnAction(e -> {
                    ReparacionResumen rep = getTableView().getItems().get(getIndex());
                    abrirDialogoIncidencia(rep);
                });

                btnBorrarIncidencia.setOnAction(e -> {
                    ReparacionResumen rep = getTableView().getItems().get(getIndex());
                    borrarIncidencia(rep);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                    setStyle("");
                    return;
                }

                ReparacionResumen rep = getTableView().getItems().get(getIndex());

                if (rep.isEsIncidencia()) {
                    lblComentario.setText(rep.getIncidencia() != null ? rep.getIncidencia() : "");
                    if (rep.isEsResuelto()) {
                        casoDos.setStyle("-fx-background-color: #E7E7E7;");
                        btnBorrarIncidencia.setVisible(false);
                        btnBorrarIncidencia.setManaged(false);
                    } else {
                        casoDos.setStyle("");
                        btnBorrarIncidencia.setVisible(true);
                        btnBorrarIncidencia.setManaged(true);
                    }
                    setStyle("");
                    setGraphic(casoDos);
                } else {
                    setStyle("");
                    setGraphic(casoUno);
                }
            }
        });
    }

    /**
     * Abre dialog para escribir comentario de incidencia.
     * Botón OK deshabilitado si el campo está vacío — comentario obligatorio.
     * Al confirmar guarda en BD y recarga la tabla.
     */
    private void abrirDialogoIncidencia(ReparacionResumen rep) {
        TextInputDialog dialog = new TextInputDialog(
            rep.getIncidencia() != null ? rep.getIncidencia() : "");
        dialog.setTitle("Añadir incidencia");
        dialog.setHeaderText("Escribe el comentario de incidencia");
        dialog.setContentText("Comentario:");

        Button btnOk = (Button) dialog.getDialogPane().lookupButton(ButtonType.OK);
        TextField input = dialog.getEditor();
        btnOk.setDisable(input.getText().trim().isEmpty());
        input.textProperty().addListener((obs, oldVal, newVal) ->
            btnOk.setDisable(newVal.trim().isEmpty()));

        dialog.showAndWait().ifPresent(texto -> {
            if (!texto.trim().isEmpty()) {
                try {
                    reparacionComponenteDAO.marcarIncidencia(rep.getIdRep(), texto.trim());
                    cargarDatos();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Borra la incidencia tras confirmación — solo si ES_RESUELTO=FALSE.
     * ES_INCIDENCIA vuelve a FALSE e INCIDENCIA a NULL en BD.
     */
    private void borrarIncidencia(ReparacionResumen rep) {
        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
        confirm.setTitle("Borrar incidencia");
        confirm.setHeaderText("¿Seguro que quieres borrar esta incidencia?");
        confirm.setContentText("Esta acción solo es válida si fue un error al añadirla.");

        confirm.showAndWait().ifPresent(respuesta -> {
            if (respuesta == ButtonType.OK) {
                try {
                    reparacionComponenteDAO.borrarIncidencia(rep.getIdRep());
                    cargarDatos();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Pinta en rojo las filas con incidencia activa (ES_INCIDENCIA=TRUE y ES_RESUELTO=FALSE).
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
                        "-fx-border-width: 0 0 0.2 0;"
                    );
                } else {
                    setStyle("");
                }
            }
        });
    }

    private void cargarDatos() {
        try {
            List<ReparacionResumen> lista = reparacionDAO.getReparacionesResumen();
            datos = FXCollections.observableArrayList(lista);
            tablaReparaciones.setItems(datos);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Borra una reparación tras confirmación.
     * Si otra reparación la referencia como anterior, bloquea el borrado
     * y muestra un mensaje indicando qué ID hay que borrar primero.
     */
    private void borrarReparacion(ReparacionResumen rep) {
        try {
            String referenciadora = reparacionDAO.getReferenciadora(rep.getIdRep());
            if (referenciadora != null) {
                Alert alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setTitle("No se puede borrar");
                alerta.setHeaderText("Esta reparación está siendo referenciada");
                alerta.setContentText("La reparación " + referenciadora + " apunta a esta. Bórrala primero.");
                alerta.showAndWait();
                return;
            }

            Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
            confirm.setTitle("Borrar reparación");
            confirm.setHeaderText("¿Seguro que quieres borrar esta reparación?");
            confirm.setContentText("Se borrará " + rep.getIdRep() + " y no se podrá recuperar.");

            confirm.showAndWait().ifPresent(respuesta -> {
                if (respuesta == ButtonType.OK) {
                    try {
                        reparacionDAO.eliminar(rep.getIdRep());
                        cargarDatos();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML private void abrirFormularioAniadir() {
        // TODO: implementar formulario de nueva reparación
    }

    @FXML private void descargarHistorial() {
        // TODO: implementar exportación TXT
    }

    @FXML private void cargarMas() {}
}