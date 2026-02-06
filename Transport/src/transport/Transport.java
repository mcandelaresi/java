package transport;

public class Transport {

    private String marca;
    private int velocitatMaxima;
    private int capacitat;
    private boolean motor;

    public Transport(String marca, int velocitatMaxima, int capacitat, boolean motor) {
        this.marca = marca;
        this.velocitatMaxima = velocitatMaxima;
        this.capacitat = capacitat;
        this.motor = motor;

        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("La no pot ser nula");
        }

        if (velocitatMaxima <= 0) {
            throw new IllegalArgumentException("La velocitat màxima ha de ser positiva");
        }

        if (capacitat <= 0) {
            throw new IllegalArgumentException("La capacitat ha de ser positiva");
        }

    }

    public String getMarca() {
        return marca;
    }

    public int getVelocitatMaxima() {
        return velocitatMaxima;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public boolean isMotor() {
        return motor;
    }

    public String toString() {
        return "Marca: " + marca + ", Velocitat Maxima: " + velocitatMaxima + " km/h, Capacitat: " + capacitat + " persones, Motor: " + (motor ? "Sí" : "No");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocitatMaxima(int velocitatMaxima) {
        this.velocitatMaxima = velocitatMaxima;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }


    public static void main(String[] args) {


    }
}