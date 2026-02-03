import java.util.Scanner;

public class VistaEndevina {
    private Scanner scanner;

    public VistaEndevina() {
        scanner = new Scanner(System.in);
    }

    /**
     * Demana un número a l'usuari (com a String).
     * La vista NO valida, només recull l'entrada.
     */
    public String demanarNumero() {
        System.out.print("Introdueix un número entre 1 i 100: ");
        return scanner.next();
    }

    public void mostrarMissatge(String missatge) {
        System.out.println(missatge);
    }

    public boolean tornarAJugar() {
        System.out.print("Vols tornar a jugar? (s/n): ");
        String resposta = scanner.next();
        return resposta.equalsIgnoreCase("s");
    }
}

