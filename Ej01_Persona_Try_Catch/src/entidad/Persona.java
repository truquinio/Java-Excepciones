/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:
 */
package entidad;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//  Parametros: nombre, edad, sexo, peso y altura
    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;

    /*
    Un constructor por defecto.
    Un constructor con todos los atributos como parámetro.
     */
    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

//  Métodos getters y setters de cada atributo.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    /*
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje.
     */
    public Persona crearPersonas() {

        //Parametros: nombre, edad, sexo, peso y altura
        System.out.println("Ingrese nombre del sujeto:");
        String nombre = leer.next();

        System.out.println("Ingrese edad del sujeto:");
        int edad = leer.nextInt();

        System.out.println("Ingrese sexo del sujeto: (H/M/O)");

        char sexo;

        do {
            sexo = leer.next().toUpperCase().charAt(0);  //Leo lo que ingresa el usuario, lo convierto a MAYÚSCULAS

            if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                System.out.println("Error, ingrese H, M u O");
            }
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');

        System.out.println("Ingrese peso del sujeto:");
        float peso = leer.nextFloat();

        System.out.println("Ingrese altura del sujeto:");
        float altura = leer.nextFloat();

        System.out.println("\n----------------------------------\n");

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)).
- Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1.
- Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. 
- Si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1.
     */
    public float calcularIMC() {

        float imc = peso / (altura * altura);  //peso /(altura * altura)

        if (imc < 20) {                     //Si resultado es un valor menor que 20:
            System.out.println("IMC Sujeto " + nombre + ": " + imc + " = Está por debajo de su peso ideal.");
            return -1;                      //La persona está por debajo de su peso ideal y la función devuelve un -1.

        } else if (imc >= 20 && imc <= 25) { //Si resultado es un número entre 20 y 25 (incl):
            System.out.println("IMC Sujeto " + nombre + ": " + imc + " = Está en su peso ideal.");
            return 0;                       //La persona está en su peso ideal y la función devuelve un 0. 

        } else {                            //Si resultado es un valor mayor que 25:
            System.out.println("IMC Sujeto " + nombre + ": " + imc + " = Tiene sobrepeso.");
            return 1;                       //La persona tiene sobrepeso, y la función devuelve un 1.  
        }
    }

    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
     */
    public boolean esMayorDeEdad() {

        return edad >= 18;
    }
}
