public class EndevinaNumero {

    public static void main(String[] args) {

        VistaEndevina vista = new VistaEndevina();
        boolean jugarDeNou;

        do {
            ModelEndevina model = new ModelEndevina();
            boolean encertat = false;

            vista.mostrarMissatge("He pensat un número entre 1 i 100.");

            while (!encertat) {
                try {
                    String entrada = vista.demanarNumero();
                    int resultat = model.comprovarNumero(entrada);

                    if (resultat == -1) {
                        vista.mostrarMissatge("El número és més gran.");
                    } else if (resultat == 1) {
                        vista.mostrarMissatge("El número és més petit.");
                    } else {
                        vista.mostrarMissatge("Correcte! Has encertat el número.");
                        encertat = true;
                    }

                } catch (Exception e) {
                    vista.mostrarMissatge(e.getMessage());
                }
            }

            jugarDeNou = vista.tornarAJugar();

        } while (jugarDeNou);

        vista.mostrarMissatge("Gràcies per jugar!");
    }
}
