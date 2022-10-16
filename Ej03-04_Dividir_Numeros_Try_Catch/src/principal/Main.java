/*
Ej 03:
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado. 

Ej 04:
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede 
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena 
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un 
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones 
utilizando bloques try/catch para las distintas excepciones
 */
package principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import static principal.DivisionNumero.DividirNumeros;

/**
 *
 * @author FT
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String a;
        String b;
        
        try {
            System.out.print("Ingrese numerador: ");
            a = leer.next();
            
            System.out.print("Ingrese denominador: ");
            b = leer.next();
            
            //Método parseInt() de la clase Integer, para convertir A y B de STRING a INT / Guardo en dos variables de tipo int C y D.-
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);
            
            //LLamo al método DIVIDIR:
            DividirNumeros(c, d);

                //Excepción por si usuario ingresa DENOMINADOR = 0.-
        } catch (ArithmeticException f) {
            
            System.out.println("No se puede dividir por cero");
            
                //Excepción cuando usuario ingrea una LETRA en lugar de un NÚMERO (Siempre que se use el PARSE INT antes).-
        } catch (NumberFormatException h) {
            
            System.out.println("El valor ingresado no es un entero");
            
            //Con GET MESSAGE muestro el MENSAJE que tiene la EXCEPCIÓN por defecto.-
            h.getMessage();
            
            //Con el THROW lo que hago es poder ARROJAR 
            throw new Exception ("EXCEPCIÓN INVENTADA PARA PROBAR");

            //FINALLY hace que el MENSAJE o el CÓDIGO se haga si o si, al momento que se rompa el programa.-
        } finally {
            
            System.out.println("SE HIZO PELOTA TODO!!");
        }
    }
}