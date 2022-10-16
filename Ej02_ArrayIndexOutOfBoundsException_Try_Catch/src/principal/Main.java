/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango).
 */

package principal;
/**
 *
 * @author FT
 */
public class Main {

    public static void main(String[] args) {

        Persona[] listaPersons = new Persona[1];

        try {
            System.out.println(listaPersons[2]);
            
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Esa persona no existe");

        }
    }
}