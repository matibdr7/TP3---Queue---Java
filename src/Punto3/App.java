/*
Crear un programa para gestionar la cola de documentos en una impresora, de manera que se puedan
encolar y desencolar trabajos de impresión. 

En la cola se deben insertar objetos de tipo trabajoImpresion que poseen los atributos (codTrabajo, nomTrabajo, cantPagTrabajo).

Al finalizar, el programa debe mostrar la cantidad de trabajos, cuya cantidad de páginas sea mayor o igual a un valor ingresado por teclado,que se imprimieron. 
*/

package Punto3;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Queue cola = new Queue<>();

    }

    public static void menu(Scanner entrada, Queue cola){
        while(true){
            System.out.println(
                "1- Agregar documento\n"+
                "2- Imprimir documento\n"+
                "3- Salir\n"
                );

            int opcion = Helper.getInteger("Ingrese una opcion: ", "Error... Ingrese un valor numerico valido");

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Saliendo . . .");
                    return;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}
