import java.util.Random;

public class ModelEndevina {
    private int numeroSecret;

    /**
     * Inicialitza el número secret aleatoriament entre 1 i 100
     */
    public ModelEndevina() {
        Random random = new Random();
        numeroSecret = random.nextInt(100) + 1;
    }

    /**
     * Comprova el número introduït per l'usuari
     *
     * @param numeroUsuari número ja validat
     * @return -1 si és més petit, 1 si és més gran, 0 si és correcte
     */
    public int comprovarNumero(int numeroUsuari) {
        if (numeroUsuari < numeroSecret) {
            return -1;
        } else if (numeroUsuari > numeroSecret) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Valida i comprova el número introduït com a String
     *
     * @param numeroUsuariStr entrada de l'usuari
     * @return resultat de la comparació
     * @throws Exception si no és un enter vàlid
     */
    public int comprovarNumero(String numeroUsuariStr) throws Exception {
        try {
            int numero = Integer.parseInt(numeroUsuariStr.trim());
            return comprovarNumero(numero);
        } catch (NumberFormatException e) {
            throw new Exception("Entrada no vàlida: has d'introduir un número enter.", e);
        }
    }
}
