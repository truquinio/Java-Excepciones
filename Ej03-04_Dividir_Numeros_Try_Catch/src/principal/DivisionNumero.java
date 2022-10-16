/*
Ej 03:
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado.
 */
package principal;

/**
 *
 * @author FT
 */
public class DivisionNumero {

    ///MÉTODO DIVIDIR NÚMEROS:
    public static void DividirNumeros(int a, int b) {

        System.out.print("\nResultado división: " + a / b + "\n");
        System.out.println("");
    }
}