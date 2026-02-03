public class Ratoli {

    private String marca;
    private String model;
    private float preu;
    private boolean esInalambric;



    public Ratoli(String marca, String model, float preu, boolean esInalambric) {
        if (marca == null || marca.isEmpty()) {
            throw new Error("La marca no pot ser nul·la o buida");
        }
        if (model == null || model.isEmpty()) {
            throw new Error("El model no pot ser nul·la o buida");
        }
        if (preu < 0.10f) {
            throw new Error("El preu mínim és 0.10€");
        }

        this.marca = marca;
        this.model = model;
        this.preu = preu;
        this.esInalambric = esInalambric;
    }

    public float getPreu() {
        return preu;
    }

    public String toString() {
        return String.format("Ratolí %s %s: %.2f€, %s", marca, model, preu, esInalambric ? "inalàmbric" : "amb cable");
    }


}
