package examen_1;

import java.util.Scanner;

public class submenu {

    static int opcion;
    static String[] numerofactura = new String[10];
    static String[] cedula = new String[10];
    static String[] nombre = new String[10];
    static int indice = 0;
    static int sol;
    static int sombra ;
    static int preferencial ;
    static int pagar;
    static int pagarr;

    private static Scanner leer = new Scanner(System.in);

    public submenu() {
    }

    public static void Inicializar() {
        for (int i = 0; i < cedula.length; i++) {
            numerofactura[i] = "";
            cedula[i] = "";
            nombre[i] = "";
        }
        System.out.println("*****Los Registros se han limpiado*****");
    }

    public static void registracompra() {
        char continuar = 'n';
        int pague;
        do {
            if (indice > 9) {
                System.out.println("Completas las entradas a venta");
                continuar = 'n';
            } else {
                System.out.println("Digite el Nombre ");
                nombre[indice] = leer.next();
                System.out.println("Ingrese el numero de cedula ");
                cedula[indice] = leer.next();
                System.out.println("Ingrese el numero de factura ");
                numerofactura[indice] = leer.next();
                System.out.println("Tipo de entradas a la venta");
                System.out.println("Ingrese la catidad a comprar tipo (SOL NORTE/SUR )precio 10500");
                sol[indice] = leer.nextInt();
                pagarr = ((indice) * 10500);
                System.out.println("Ingrese la catidad a comprar tipo (SOMBRA ESTE/ OESTE)precio 20500");
                sombra[indice] = leer.nextInt();
                pagarr = (sombra * 20500);
                System.out.println("Ingrese la catidad a comprar tipo (PREFERENCIAL)precio 22500");
                preferencial[indice] = leer.nextInt();
                pagarr = (preferencial * 22500);
                indice++;
                System.out.println("Desea realizar otra compra s/n ");
                continuar = leer.next().charAt(0);
                pagar = (pagarr);
            }
        } while (continuar != 'n');
        System.out.println("El total a pagar es de " + pagar);
    }

    public static void Salir() {
        char sali = 's';
        do {
            System.out.println("Desea salir del sistema de compras");

            sali = leer.next().charAt(0);

            if ('s' == sali) {
                System.out.println("Muchas gracias ");
                System.exit(0);
            }
        } while (sali != 's');

    }

    public static void estadistica() {

        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Cliente: " + nombre[i] + "Cedula" + cedula[i] + "Numero de factura" + numerofactura[i] + "Entradas compradas" + "Preferencial: " + preferencial + "Sol: " + sol + "Sombra: " + sombra);
        }

    }
}
