/*
 * Escribe un programa que solicite tres cadenas de caracteres, una llamada
nombre, otra llamada primerApellido y segundoApellido. El programa debe
crear una cadena con el nombre completo y después mostrar por pantalla:
o el nombre completo con todos los caracteres en minúsculas y luego en
mayúsculas y su longitud
o los dos primeros caracteres de la cadena (solo en el caso de que la
longitud de esta sea de dos o más caracteres)
o los dos últimos caracteres de la cadena (solo en el caso de que la
longitud de esta sea de dos o más caracteres)
o el número de ocurrencias en la cadena del último carácter
o la cadena con todas las ocurrencias del primer carácter en mayúsculas
o la cadena con tres asteriscos por delante y por detrás
o la cadena invertida

 */
package t5;
import java.util.*;

/**
 *
 * @author mati
 */
public class ejerc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tcl = new Scanner(System.in);
        System.out.println("Introduce el nombre :"); String nombre = tcl.nextLine();
        
        System.out.println("Introduce el 1er Ape :"); String primerApellido = tcl.nextLine();
        
        System.out.println("Introduce el 2er Ape :"); String segundoApellido = tcl.nextLine();
        
        //MINUS
        String completo = nombre+" "+primerApellido+" "+segundoApellido;
        System.out.println(completo.toLowerCase());
        
        //MAYUS
        System.out.println(completo.toUpperCase());
        //LONGITUD
        System.out.println("Longitud = "+completo.length()+"\n");
        
        
        //2 primeros && 2 ultimos
        
        if (completo.length()> 1  ){
            
            System.out.println("2 primeros :: "+completo.charAt(0)+completo.charAt(1));
            System.out.println("2 ultimos :: "+completo.charAt(completo.length()-2)+completo.charAt(completo.length()-1));
       
            
        }else{
            //NUNCA SE VA A MOSTRAR ESTO XKE LOS INTRO YA CUENTAN COMO CARACTERES 
            System.out.println("Tiene menos de 2 caracteres\n");
            
        }
        //Ocurrencias del ultimo
        char ultimo = completo.charAt(completo.length()-1) ;
        int contador=0;
        for (int i=0; i < completo.length(); i++){
             
            if(completo.charAt(i) == ultimo)
                contador++;                      
        }
        System.out.println("El ultimo caracter:: "+ultimo+" aparece "+contador+" veces");
    
    
        //CADENA CON EL 1er CHAR repetido siempre en  MAYUS
        
        char primero = completo.toUpperCase().charAt(0);
        
        System.out.println(completo.replace(completo.charAt(0), primero));
    
        //Cadena con *** delante y detras
         System.out.println("***"+completo+"***");
         
         //Cadena invertida 
         String invertida = completo;
         int cont= completo.length();
         for (int i=0; i < completo.length();i++){
             cont--;
           
             System.out.print(invertida.charAt(cont));
             
             
         }
         
    }
    
    
}
