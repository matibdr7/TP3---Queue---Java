/*
Escribir un programa para gestionar el acceso de visitantes a los juegos en un parque de diversiones.

Implementar la clase Visitante (idVisitante, aynVisitante, edad). 

Los N (al azar) objetos visitantes deben ser insertados en una cola general para poder acceder a los juegos del parque. 
A los fines de simplificar el ejercicio, se establece que solo existen dos juegos: montaña rusa y calesita. 

Desde la cola general, los visitantes serán transferidos a dos colas específicas: una para la montaña rusa (apta para mayores de 12
años) y otra para la calesita (apta para menores desde los 4 hasta los 12 años). 

Los visitantes deben ser transferidos en grupos de 5 desde la cola general a las colas específicas de los juegos. 

Mostrar los visitantes que van ingresando a los juegos, indicando a cuál juego acceden de acuerdo a su edad. 

Al finalizar, informar la cantidad de visitantes menores de edad que tuvo el parque y la cantidad que ingresó en cada juego. 
*/

package Punto4;
import java.util.Scanner;
import Punto1.Cliente;
import java.util.Random;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        Queue colaGeneral = new Queue<>();
        Queue colaMontaña = new Queue<>();
        Queue colaCalesita = new Queue<>();
        
        ingresarFilaGeneral(entrada, colaGeneral, random);
        System.out.println(colaGeneral);

    }

    public static void ingresarFilaGeneral(Scanner entrada, Queue colaGeneral, Random random){
        int n = random.nextInt(15);
        System.out.println("n = "+n);
        for (int i = 0; i < n; i++) {
            int idVisitante = Helper.getInteger("Ingrese el id del visitante: ", "Ingrese un valor numerico valido");
        
            System.out.println("Ingrese el Apellido y Nombre del visitante");
            String aynVisitante = entrada.nextLine();
            
            int edad = Helper.getInteger("Ingrese la edad del cliente", "Ingrese una edad valida");
    
            Visitante visitante = new Visitante(idVisitante, aynVisitante, edad);
            colaGeneral.add(visitante);
        }    
    }
    

}
