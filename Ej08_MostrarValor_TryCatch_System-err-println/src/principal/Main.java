/*
Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
 */
package principal;

import static principal.Uno.metodo;

/**
 *
 * @author FT
 */
public class Main {

    public static void main(String[] args) {

//TRY CATCH para CLASE UNO.-
System.out.println("CLASE 1:");

        try {

            System.out.println(Uno.metodo());

        } catch (Exception e) {

            System.err.println("Excepción en metodo()");

            e.printStackTrace();
        }

//TRY CATCH para CLASE DOS.-
System.out.println("\nCLASE 2:");

        try {

            System.out.println(Dos.metodo());

        } catch (Exception e) {

            System.err.println("Excepción en metodo()");

            e.printStackTrace();
        }

//TRY CATCH para CLASE TRES.-
System.out.println("\nCLASE 3:");
        try {

            System.out.println(Tres.metodo());

        } catch (Exception e) {

            System.err.println("Excepción en metodo()");

            e.printStackTrace();
        }
    }
}