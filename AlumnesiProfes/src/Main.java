import objectes.Alumne;
import objectes.Data;
import objectes.Membre;
import objectes.Professor;

public class Main {

    public static void main(String[] args) {


        Membre[] persones = new Membre[4];

        try {
            // Crear alumnes
            persones[0] = new Alumne("Pere", "Garcia Lopez", new Data(15, 5, 2005), 1, "ESO");
            persones[1] = new Alumne("Anna", "Marti Soler", new Data(20, 10, 2004), 2, "DAW");

            // Crear professors
            persones[2] = new Professor("Joan", "Sanchez Puig", new Data(10, 2, 1980), true, "Informatica");
            persones[3] = new Professor("Maria", "Lopez Vidal", new Data(5, 7, 1975), false, "Lletres");

        } catch (IllegalArgumentException e) {
            System.out.println("Error creando miembro: " + e.getMessage());
        }

        // Mostrar tots els membres de l'institut
        System.out.println("Informació dels membres de l'institut:");
        for (Membre m : persones) {
            if (m != null) {
                System.out.println(m.toString());
            }
        }

    }
}
