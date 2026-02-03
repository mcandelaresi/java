public class Torre {

    private String marca;
    private String model;
    private float preu;
    private String procesador;
    private int ram;
    private int discDur;

    public Torre(String marca, String model, float preu, String procesador, int ram, int discDur) {
        if (marca == null || marca.isEmpty()) {
            throw new Error("La marca no pot ser nul·la o buida");
        }
        if (model == null || model.isEmpty()) {
            throw new Error("El model no pot ser nul·la o buida");
        }
        if (preu < 0.10f) {
            throw new Error("El preu mínim és 0.10€");
        }
        if (procesador == null || procesador.isEmpty()) {
            throw new Error("El processador no pot ser nul·la o buida");
        }
        if (ram <= 0) {
            throw new Error("La RAM ha de ser un valor positiu");
        }
        if (discDur <= 0) {
            throw new Error("El disc dur ha de ser un valor positiu");
        }

        this.marca = marca;
        this.model = model;
        this.preu = preu;
        this.procesador = procesador;
        this.ram = ram;
        this.discDur = discDur;
    }

    public float getPreu() {
        return preu;
    }

    public String toString() {
        return String.format("Torre %s %s: %.2f€, %s, %dGB RAM, %dGB Disc Dur", marca, model, preu, procesador, ram, discDur);
    }
}
