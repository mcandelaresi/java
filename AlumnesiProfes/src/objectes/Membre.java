package objectes;

public class Membre {

    private String nom;
    private String cognoms;
    private Data dataNaixement;
    private String usuari;

    public Membre(String nom, String cognoms, Data dataNaixement) {
        if (nom == null || nom.isEmpty() || cognoms == null || cognoms.isEmpty()) {
            throw new IllegalArgumentException("El nom/cognom no pot ser buit");
        }

        this.nom = nom;
        this.cognoms = cognoms;
        this.dataNaixement = dataNaixement;
        String primerCognom = cognoms.split(" ")[0];
        this.usuari = Character.toLowerCase(nom.charAt(0)) + primerCognom.toLowerCase();

    }

    @Override
    public String toString() {
        return String.format("%s %s, Usuari: %s, Naixement: %s", nom, cognoms, usuari, dataNaixement.toString());
    }

}
