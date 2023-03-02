package examen_1;

import static examen_1.submenu.Inicializar;
import static examen_1.submenu.Salir;
import static examen_1.submenu.estadistica;
import static examen_1.submenu.registracompra;
import java.util.Scanner;

public class menuopcion {

    byte opcion;
    public Scanner leer = new Scanner(System.in);

    public menuopcion() {

        opcion = 0;
    }

    public void mostar() {

        do {
            System.out.println(" Opcion 1- Limpiar registros");
            System.out.println(" Opcion 2- Iniciar nueva compra");
            System.out.println(" Opcion 3- Estadistica");
            System.out.println(" Opcion 4- Salir");
            System.out.println("Digite una opcion para continuar");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    Inicializar();
                    break;
                case 2:
                    registracompra();
                    break;
                case 3:
                    estadistica();

                    break;
                case 4:
                    Salir();
                    break;
                default:
                    System.out.println("Opcion no se encuentra en las opciones , Digite una correcta");

            }
        } while (opcion != 7);
    }

}
