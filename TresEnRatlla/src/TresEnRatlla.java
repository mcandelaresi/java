import java.util.Scanner;

public class TresEnRatlla {
    public static final int FilesColumnes = 3;
    public static Scanner scanner = new Scanner(System.in);
    public static char[][] joc = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {
        int[] fc = new int[2];
        char jugador = 'O';

        do {
            mostrarJoc();
            jugador = jugador == 'X' ? 'O' : 'X';
            do {
                fc = demanarFilaColumna(jugador);
            } while (joc[fc[0]] [fc[1]] != '-');
            joc[fc[0]] [fc[1]] = jugador;
        } while (!tres(jugador));
        System.out.println("Ha guanyat el jugador " + jugador);
        }

        public static int[] demanarFilaColumna (char jugador) {
            String resposta;
            int[] resultat = new int[2];
            do {
                System.out.print("Jugador " + jugador + ", introdueix fila i columna (separades per un espai): ");
                resposta = scanner.nextLine().toUpperCase().trim();
            } while (!resposta.matches("^[A-C][1-3]$"));

            resultat[0] = resposta.charAt(0) - 'A';
            resultat[1] = resposta.charAt(1) - '1';
            return resultat;
        }

        public static boolean tres(char jugador) {
            return tresFila (jugador) || tresColumna(jugador) || tresDiagonal(jugador);
        }

        public static boolean tresFila(char jugador) {
            for (int i = 0; i < FilesColumnes; i++) {
                if (joc[i][0] == jugador && joc[i][1] == jugador && joc[i][2] == jugador) return true;
            }
            return false;
        }

        public static boolean tresColumna(char jugador) {
            for (int i = 0; i < FilesColumnes; i++) {
                if (joc[0][i] == jugador && joc[1][i] == jugador && joc[2][i] == jugador) return true;
            }
            return false;
        }

        public static boolean tresDiagonal(char jugador) {
            if (joc[0][0] == jugador && joc[1][1] == jugador && joc[2][2] == jugador) return true;
            if (joc[0][2] == jugador && joc[1][1] == jugador && joc[2][0] == jugador) return true;
            return false;
        }

        public static void mostrarJoc() {
            System.out.println("  1 2 3");
            for (int i = 0; i < joc.length; i++) {
                System.out.print((char) ('A' + i) + " ");
                for (int j = 0; j < joc[i].length; j++) {
                    System.out.print(joc[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
