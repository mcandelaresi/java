public class Monitor {
    private String marca;
    private String model;
    private float preu;
    private int polzades;

    public Monitor(String marca, String model, float preu, int polzades) {
        if (marca == null || marca.isEmpty()) {
            throw new Error("La marca no pot ser nul·la o buida");
        }
        if (model == null || model.isEmpty()) {
            throw new Error("El model no pot ser nul·la o buida");
        }
        if (preu < 0.10f) {
            throw new Error("El preu mínim és 0.10€");
        }
        if (polzades <= 0) {
            throw new Error("Les polzades han de ser un valor positiu");
        }

        this.marca = marca;
        this.model = model;
        this.preu = preu;
        this.polzades = polzades;
    }

    public float getPreu() {
        return preu;
    }

    public String toString() {
        return String.format("Monitor %s %s: %.2f€, %d polzades", marca, model, preu, polzades);
    }
}
