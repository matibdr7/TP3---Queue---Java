/*
Desarrollar un programa que simule un sistema de atención de clientes que hacen fila en una tienda.

Implementar la clase cliente con los atributos (codCliente, aynCliente, mailCliente).

Los clientes deben ingresar a la cola y esperar su turno para recibir la atención requerida. Mostrar los datos
del cliente cuando sale de la cola. Al finalizar la “jornada” mostrar la cantidad de clientes cuyo apellido
coincida con uno ingresado por teclado
*/

package Punto1;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int nClientes = nClientes(entrada);
        Queue cola = new Queue<>(nClientes);
        Queue colaAtendidos = new Queue<>();

        llenarFila(cola, entrada, nClientes);
        atenderClientes(cola, colaAtendidos);
        buscarApellido(entrada, colaAtendidos);
    }

    public static int nClientes(Scanner entrada){
        return Helper.getInteger("Ingrese la cantidad de clientes: ", "Ingrese una cantidad valida");
    }

    public static void buscarApellido(Scanner entrada, Queue colaAtendidos){
        System.out.println("Ingrese un el apellido y nombre a buscar: ");
        String apellido = entrada.nextLine();
        int vecesAparece = 0;

        while(!colaAtendidos.isEmpty()){
            Cliente cliente = (Cliente) colaAtendidos.remove();
            if(cliente.getAynCliente().equals(apellido)){
                ++vecesAparece;
            }
        }
        System.out.println("La cantidad de clientes de nombre "+apellido+" es: "+vecesAparece);
    }

    public static void llenarFila(Queue cola, Scanner entrada, int nClientes){
        for(int i = 0; i<nClientes; i++){
            añadirCliente(cola, entrada);
        }
    }

    public static void añadirCliente(Queue cola, Scanner entrada){
        Cliente cliente = new Cliente(ingresoCodigo(), ingresoAyN(entrada), ingresoMail(entrada));
        cola.add(cliente);
    }

    public static void atenderClientes(Queue cola, Queue colaAtendidos){
        while(!cola.isEmpty()){
            Cliente atendido = (Cliente) cola.remove();
            System.out.println("Cliente atendido: "+atendido);
            colaAtendidos.add(atendido);
        }
    }

    public static int ingresoCodigo(){
        return Helper.getInteger("Ingrese el codigo de cliente: ", "Ingrese un valor numerico valido . . .");
    }

    public static String ingresoAyN(Scanner entrada){
        System.out.println("Ingrese el su Apellido y Nombre: ");
        return entrada.nextLine();
    }

    public static String ingresoMail(Scanner entrada){
        System.out.println("Ingrese su eMail: ");
        return entrada.nextLine();
    } 
}
