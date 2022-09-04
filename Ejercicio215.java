/*

 * Nombre de la clase: Clase de la semana del 22
 * Información de la versión: 
 * Fecha: 25/8/2022
 * Aviso de copyright
 * Enunciado: Escriba una aplicación que pida al usuario que escriba dos números, 
 * que obtenga los números del usuario e imprima la suma, producto, diferencia y 
 * cociente (división) de los números
 */

/* Se importa la libreria de java Scanner que permite registrar el input del usuario */
import java.util.Scanner;

public class Ejercicio215{
    /* Se pone el valor del Scanner en la palabra leer para poder llamar a la libreria en el codigo */
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        /*Definicion de variables */
        int num1 = 0;
        int num2 = 0;
        int suma = 0;
        int producto = 0;
        int resta = 0;
        int division = 0;
        /* Codigo principal */
        /*Se solicita al usuario que ingrese un numero y se almacena dicho numero en una variable */
        System.out.println("Por favor ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Por favor ingrese otro numero");
        num2 = leer.nextInt();
        /*Se realizan las operaciones matematicas correspondientes*/
        suma = num1 + num2;
        producto = num1 * num2;
        resta = num1 - num2;
        division = num1 / num2;
        System.out.println(suma);
        /*Se imprime los resultados correspondientes de cada operacion matematica*/
        System.out.print("El resultado de la suma es: " + suma + "\n");
        System.out.print("El resultado del producto es: " + producto + "\n");
        System.out.print("El resultado de la resta es: " + resta + "\n");
        System.out.print("El resultado de la division es: " + division + "\n");


    }
}