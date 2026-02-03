import java.util.Scanner;

public class Cistella {

    static Article[] productes = new Article[5];
    static Scanner scan = new Scanner(System.in);

    Article a1 = new Article("A001", "Llibre de Java", 2, 25.50f, 4);


    public static void main(String[] args) {

        for (int i = 0; i < productes.length; i++) {
            productes[i] = introduirArticle();
        }


        // Proves setters
        productes[0].setUnitats(50);
        productes[1].setPreu(800);
        productes[4].setIva(10);

        float total = 0;
        for (int i = 0; i < productes.length; i++) {
            System.out.println(productes[i]);
            total += productes[i].getPreuFinal();
        }

        System.out.printf("El total de la cistella és: %.2f €", total);
    }

    private static Article introduirArticle() {
        Article p = null;

        do {
            try {
                System.out.println("Codi (4 caràcters): ");
                String codi = scan.next().trim();
                scan.nextLine(); // netejar buffer

                System.out.println("Descripció: ");
                String descripcio = scan.nextLine().trim();

                System.out.println("Unitats: ");
                int unitats = scan.nextInt();

                System.out.println("Preu: ");
                float preu = scan.nextFloat();

                System.out.println("IVA: ");
                int iva = scan.nextInt();

                p = new Article(codi, descripcio, unitats, preu, iva);
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scan.nextLine();
            }
        } while (p == null);

        return p;
    }
}
