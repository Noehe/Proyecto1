import java.util.Scanner;

 public class Factorial {
	public static void main(String[] args) {
	   Scanner reader = new Scanner (System.in);
	   
	    System.out.println("Introduce numero para calcular factorial:  ");
	    long numero = reader.nextLong();
		
		long factorial = 1;
		
		while(numero > 1) {
			factorial = factorial * numero;
			numero--;
		}
		
		System.out.println("El factorial es: " + factorial);
		
		
	}
 }	