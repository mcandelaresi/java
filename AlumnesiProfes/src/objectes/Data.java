package objectes;

public class Data {

    private int dia;
    private int mes;
    private int any;


    public Data(int dia, int mes, int any) {

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || any < 0) {
            throw new IllegalArgumentException("Data invàlida");
        }

        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    // Constructor con String "DD-MM-AAAA"
    public Data(String str) {
        if (!str.matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) {
            throw new IllegalArgumentException("Format de data invàlid");
        }

        // Separar y convertir a enteros
        String[] parts = str.split("-");
        int dia = Integer.parseInt(parts[0]);
        int mes = Integer.parseInt(parts[1]);
        int any = Integer.parseInt(parts[2]);

        // Llamar al constructor de enteros para validar
        this.dia = dia;
        this.mes = mes;
        this.any = any;

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAny() {
        return any;
    }

    public String toString() {
        return String.format("%02d-%02d-%04d", dia, mes, any);
    }

}
