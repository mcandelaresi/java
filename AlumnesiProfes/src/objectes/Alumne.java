package objectes;

public class Alumne extends Membre{
    private String cicleCurs;

    private static final String[] cicle = {"ESO", "BTX", "SMX", "ASIX", "DAW"};
    private int curs;


    public Alumne(String nom, String cognoms, Data dataNaixement, int curs, String cicle) {
        super(nom, cognoms, dataNaixement);

        if (curs < 1 || curs > 2) {
            throw new IllegalArgumentException("Curs invàlid");
        }
        this.curs = curs;

        for (String c : Alumne.cicle) {
            if (c.equals(cicle.toUpperCase())) {
                this.cicleCurs = c;
                return;
            }
        }
        throw new IllegalArgumentException("Cicle invàlid");

    }

    public String getCicleCurs() {
        return cicleCurs;
    }

    public int getCurs() {
        return curs;
    }

    public String toString() {
        return String.format("%s, Curs: %d, Cicle: %s", super.toString(), curs, cicleCurs);
    }


}
