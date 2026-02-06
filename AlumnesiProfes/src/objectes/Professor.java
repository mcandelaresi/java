package objectes;

public class Professor extends Membre {

    private static final String[] departaments = {"Informatica", "Ciencies", "Lletres"};
    private boolean funcionari;
    private String departament;

    public Professor(String nom, String cognoms, Data dataNaixement, boolean funcionari, String departament) {
        super(nom, cognoms, dataNaixement);

        this.funcionari = funcionari;
        for (String dep : Professor.departaments) {
            if (dep.equals(departament)) {
                this.departament = dep;
                return;
            }
        }
        throw new IllegalArgumentException("Departament invàlid");
    }

    public boolean isFuncionari() {
        return funcionari;
    }


    public String getDepartament() {
        return departament;
    }

    @Override
    public String toString() {
        return String.format("%s, Departament: %s, Funcionari: %b", super.toString(), departament, funcionari);
    }

}
