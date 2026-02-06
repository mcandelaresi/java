import transport.*;
import terrestre.*;
import maritim.*;
import aeri.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Transport[] llista = new Transport[8];

        llista[0] = new Tren("Renfe", 200, 300, true);
        llista[1] = new Cotxe("Tesla", 250, 5, true);
        llista[2] = new Patinet("Xiaomi", 25, 1, true);
        llista[3] = new Vaixell("Titanic", 40, 2000, true);
        llista[4] = new Submari("Nautilus", 50, 50, true);
        llista[5] = new Avio("Boeing 747", 900, 300, true);
        llista[6] = new Tren("AVE", 300, 350, true);
        llista[7] = new Cotxe("Ferrari", 350, 2, true);

        Scanner scan = new Scanner(System.in);
        int opcio = 0;

        while (opcio != 5) {
            System.out.println("\n--- Menú de Transports ---");
            System.out.println("1 - Mostrar tots");
            System.out.println("2 - Mostrar Terrestres");
            System.out.println("3 - Mostrar Marítims");
            System.out.println("4 - Mostrar Aéris");
            System.out.println("5 - Salir");
            System.out.print("Selecciona una opció: ");
            opcio = scan.nextInt();

            switch(opcio) {
                case 1:
                    for (int i = 0; i < llista.length; i++) {
                        System.out.println(llista[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < llista.length; i++) {
                        if (llista[i] instanceof Terrestre) {
                            System.out.println(llista[i]);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < llista.length; i++) {
                        if (llista[i] instanceof Maritim) {
                            System.out.println(llista[i]);
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < llista.length; i++) {
                        if (llista[i] instanceof Aeri) {
                            System.out.println(llista[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

    }
}
