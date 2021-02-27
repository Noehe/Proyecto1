/* 
Realizar este ejercicio:
    Pide 10 números enteros al usuario y almacénalos (array).
    Recorre el array y coloca el número más pequeño en la primera posición del array.
    
*/
 
import java.util.Scanner;
public class MinValueArray {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int[] numeros = new int[10]; 
                
        // rellenar el array
        for(int i=0; i<10; i++) {  // 10 -> numeros.length  
            System.out.print("Introduce un numero: ");
            numeros[i] = reader.nextInt();
        }           
        imprimeArray(numeros);
        
        int min = numeros[0];
        int indexMin = 0;
        for(int i=1; i<10; i++) {
            if (numeros[i] < min) {  // hemos encontrado un valor menor
                min = numeros[i];
                indexMin = i;      // localización (índice donde está el valor mínimo)
            }
        }
        
        // Y ahora... Guardar el mínimo en la primera posición del array
        // ¿Cómo lo harías?  Intercambiar valores... necesitamos una variable auxiliar
        int aux = numeros[0];       
        numeros[0] = min;
        numeros[indexMin] = aux; // donde estaba el mínimo
        
        imprimeArray(numeros);  
        
        // Ahora queremos localizar el segundo valor más pequeño y ponerlo en la 
        // segunda posición del array (en numeros[1])
        Hola
        
         
    }
    
    public static void imprimeArray(int enteros[]) {
        System.out.println();
        for(int i=0; i<enteros.length; i++) {
            System.out.print(enteros[i] + " ");
        }
        System.out.println();
    }
     
}
 
/*  EJERCICIO:
    localizar el segundo valor más pequeño y ponerlo en la 
    segunda posición del array (en numeros[1])
    
*/
