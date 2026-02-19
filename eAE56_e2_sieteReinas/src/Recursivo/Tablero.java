package Recursivo;

public class Tablero {

    private char[][] tablero; // tablero actual 5x5
    private int nFilas = 5;
    private int nColumnas = 5;

    // Constructor
    public Tablero() {
        tablero = new char[nFilas][nColumnas];
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                tablero[i][j] = '-'; // casilla vacía
            }
        }
    }

    // Verifica si se puede colocar una reina en (fila, columna)
    public boolean esSegura(int fila, int columna) {
        for (int i = 0; i < fila; i++) {
            if (tablero[i][columna] == 'Q') return false;
        }

        for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 'Q') return false;
        }

        for (int i = fila - 1, j = columna + 1; i >= 0 && j < nColumnas; i--, j++) {
            if (tablero[i][j] == 'Q') return false;
        }

        return true;
    }

    // Método recursivo para colocar reinas y guardar la primera solución
    public boolean colocarReinas(int fila) {
        if (fila == nFilas) { // caso base: todas las reinas colocadas
            return true;  // encontramos una solución
        }

        for (int col = 0; col < nColumnas; col++) {
            if (esSegura(fila, col)) {
                tablero[fila][col] = 'Q';
                if (colocarReinas(fila + 1)) {
                    return true; // parar al encontrar la primera solución
                }
                tablero[fila][col] = '-'; // backtracking
            }
        }

        return false; // no se pudo colocar reina en esta fila
    }

    // toString según tu estilo
    @Override
    public String toString() {
        String resultado = "";

        for (int f = 0; f < nFilas; f++) {
            for (int c = 0; c < nColumnas; c++) {
                resultado += tablero[f][c];
            }
            resultado += '\n';
        }

        return resultado;
    }
}
