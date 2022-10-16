package principal;

import java.util.Scanner;

/*
Dado el método metodoC de la clase C, indique:
a)   ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c)   ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
class C {
void metodoC() throws TuException{ 
sentencia_c1
try {
sentencia_c2 
sentencia_c3
} catch (MioException e){
9.13
sentencia_c4
} catch (TuException e){ 
sentencia_c5 
throw (e)
}
finally
sentencia_c6
}
}
 */


/**
 *
 * @author FT
 */

public class ClaseC {
    
   public void metodoC() throws TuException{ 

       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String a = "4";
        String b = "2";
        
        try {
            System.out.print("Ingrese numerador: ");
            a = leer.next();
            
            System.out.print("Ingrese denominador: ");
            b = leer.next();
            
            //Método parseInt() de la clase Integer, para convertir A y B de STRING a INT / Guardo en dos variables de tipo int C y D.-
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);

        } catch (MioException e){
sentencia_c4
} catch (TuException e){ 
sentencia_c5 
throw (e)
}
finally
sentencia_c6
}
}