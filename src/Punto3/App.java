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
        menu(entrada, cola);
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
                    insertarDocumentos(entrada, cola);
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

    public static void insertarDocumentos(Scanner entrada, Queue cola){
        int codTrabajo = Helper.getInteger("Ingrese el codigo de trabajo", "Ingrese un valor numerico valido");
        
        System.out.println("Ingrese el nombre de trabajo: ");
        String nomTrabajo = entrada.nextLine();
        
        int cantPagTrabajo = Helper.getInteger("Ingrese la cantidad de paginas: ", "Ingrese un valor numerico valido: ");

        TrabajoImpresion trabajo = new TrabajoImpresion(codTrabajo, nomTrabajo, cantPagTrabajo);
        cola.add(trabajo);
    }

}
