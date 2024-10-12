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
        Queue colaImpresos = new Queue<>();
        menu(entrada, cola, colaImpresos);
    }

    public static void menu(Scanner entrada, Queue cola, Queue colaImpresos){
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
                    imprimirDocumentos(cola, colaImpresos);
                    break;
                case 3:
                    contarCantidad(colaImpresos);
                    System.out.println("\nSaliendo . . .");
                    return;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            System.out.println(cola);
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

    public static void imprimirDocumentos(Queue cola, Queue colaImpresos){
        TrabajoImpresion impreso = (TrabajoImpresion) cola.remove();
        System.out.println("Imprimiendo: "+impreso+" . . .");
        colaImpresos.add(impreso);
    }

    public static void contarCantidad(Queue colaImpresos){
        int num = Helper.getInteger("Ingrese la cantidad de paginas a filtrar: ", "Ingrese un valor numerico valido: ");
        int nBuscado = 0;
        while(!colaImpresos.isEmpty()){
            TrabajoImpresion trabajo = (TrabajoImpresion) colaImpresos.remove();
            if(trabajo.getCantPagTrabajo() == num){
                ++nBuscado;
            }
        }
        System.out.println("La cantidad de trabajos que tienen: "+num+" paginas son: " +nBuscado);  
    }
}
