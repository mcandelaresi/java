import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class Persona {
    private String nif;
    private String nom;
    private String dataNaixement;

    // Constructor
    public Persona(String nif, String nom, String dataNaixement) {
        this.nif = nif;
        this.nom = nom;
        this.dataNaixement = dataNaixement;
    }


    public int obtenirEdat() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(dataNaixement, formatador);
        LocalDate avui = LocalDate.now();
        Period diferencia = Period.between(fechaNacimiento, avui);

        return diferencia.getYears();
    }

    public String toString() {
        return nif + " : " + nom + " : " + obtenirEdat();
    }
}


