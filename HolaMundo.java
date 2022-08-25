/*

 * Nombre de la clase: Clase de la semana del 22
 * Información de la versión: 
 * Fecha: 25/8/2022
 * Aviso de copyright
 */

import java.util.Scanner;

public class HolaMundo {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        /* Definicion de variables */
        int eleccion = 0;

        while (eleccion == 0){
            System.out.print("¿En que lenguaje desea ver la frase: Hola Mundo?\n");
            System.out.print("""
                    1- Chino
                    2- Portuges
                    3- Ingles
                    4- Aleman
                    5- Salir del programa
                    """);
            eleccion = leer.nextInt();
            if (eleccion == 1){
                System.out.print("'Ni Hao Shijie'\n");
                eleccion = 0;
            }
            else if (eleccion == 2){
                System.out.print("'Olá mundo'\n");
                eleccion = 0;
            }
            else if (eleccion == 3){
                System.out.print("'Hello World'\n");
                eleccion = 0;
            }
            else if (eleccion == 4){
                System.out.print("'Hallo Welt'\n");
                eleccion = 0;
            }
            else if (eleccion == 5){
                System.out.print("Hasta luego!\n");
                eleccion = 1;
            }
            else{
                System.out.print("Por favor ingrese una opcion valida\n");
                eleccion = 0;
            }
        }
    } 
}