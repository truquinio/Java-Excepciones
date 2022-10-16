/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
carácter fallido como un intento.
 */
package principal;

//import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num1 = (int) (Math.random() * 10);
        int num2 = 0;
        String numAux;
        int contador = 1;

        do {
            try {
                System.out.println("Intento " + contador);

                System.out.println("Ingrese un N° entero: ");
                numAux = leer.next();

                //Metodo para PARSEAR de STRING a INT.-
                num2 = Integer.parseInt(numAux);

                if (num1 == num2) {

                    System.out.println("\nAdivinaste!!\n");
                } else {

                    System.out.println("\nFallaste!!\n");

                    if (num1 > num2) {

                        System.out.println("El N° es mayor\n");

                    } else {
                        System.out.println("El N° es menor\n");
                    }
                }
                contador++;

                //ACÁ VA LA EXCEPCIÓN que arroja el OUTPUT.-
            } catch (Exception e) {

                System.out.println("\nNo ingresó un N°!\n");

                num2 = 0;

                contador++;

                System.out.println("EXCEPTION = " + e.getClass() + "\n");
            }

        } while (num1 != num2 && contador < 10);
    }
}