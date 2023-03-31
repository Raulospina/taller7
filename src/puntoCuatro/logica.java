package puntoCuatro;

import java.util.Scanner;

public class logica {
	public static void main(String[] args) {
		int multiplicacion=0;
        int a,b;
        
        
        try (Scanner sc = new Scanner(System.in)) {
        	 System.out.println("ERROR esta dividiendo  y no multiplicando");
        System.out.println("ingrese a");
        a =  sc.nextInt();
        
        System.out.println("ingrese b");
        b =  sc.nextInt();
        multiplicacion = a/b;
        System.out.println("el resultado es " + multiplicacion );
		
		
		
		
	}
}
	
}