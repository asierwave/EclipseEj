package Recursivo;

public class Main {
    public static void main(String[] args) {
        Tablero miTablero = new Tablero(); // crear tablero

        System.out.println(miTablero);

        miTablero.colocarReinas(0);        // empezar desde la fila 0
        
        System.out.println(miTablero);
    }
}


