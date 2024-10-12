/*
Implementar una clase “ColaCircular” que utilice un array para gestionar una cola de tamaño fijo de manera
circular que priorice velocidad.
Insertar números enteros en la cola. Verificar que la cola maneje correctamente las inserciones y
eliminaciones en caso de cola llena y cola vacía.
*/

package Punto2;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Queue cola = new Queue<>(6);
        Scanner entrada = new Scanner(System.in);
        menu(entrada, cola);
    }

    public static void menu(Scanner entrada, Queue cola){

        while(true){
            System.out.println(
                "\n"+
                "----------------------\n"+
                "1- Encolar numero\n"+
                "2- Desencolar numero\n"+
                "3- Salir\n"+
                "----------------------\n"
            );

            int opcion = Helper.getInteger("Ingrese la opcion que desee ejecutar", "Ingrese un valor numerico valido");

            switch(opcion){
                case 1:
                    insertarNumeros(cola, entrada);
                    break;
                case 2:
                    removerNumero(cola, entrada);
                    break;
                case 3:
                    System.out.println("Saliendo . . .");
                    return;
                default:
                    System.out.println("Ingrese una opcion valida");
                    menu(entrada, cola);
            }

            System.out.println(cola);
        }
    }

    public static void insertarNumeros(Queue cola, Scanner entrada){
        if(cola.isFull()){
            System.out.println("Cola llena ...");
            return;
        }
        int num = Helper.getInteger("Inserte un numero entero", "Ingrese un valor numerico valido");
        cola.add(num);
        System.out.println("Numero "+num+" agregado a la cola");
    }

    public static void removerNumero(Queue cola, Scanner entrada){
        if(cola.isEmpty()){
            System.out.println("La cola esta vacia . . .");
            return;
        }
        System.out.println("Numero "+cola.remove()+" eliminado");
    }

}
