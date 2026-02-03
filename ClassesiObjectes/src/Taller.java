public class Taller {
    public static void main(String[] args) {
        Torre torre = new Torre("Dell", "XPS", 999.99f, "Intel i7", 16, 512);
        Monitor monitor = new Monitor("Samsung", "U28E590D", 399.99f, 28);
        Teclat teclat = new Teclat("Logitech", "K380", 39.99f, true);
        Ratoli ratoli = new Ratoli("Logitech", "M185", 19.99f, false);

        System.out.println(torre);
        System.out.println(monitor);
        System.out.println(teclat);
        System.out.println(ratoli);

        float preuTotal = torre.getPreu() + monitor.getPreu() + teclat.getPreu() + ratoli.getPreu();
        System.out.printf("Preu total de l'equip: %.2f€%n", preuTotal);
    }

}
