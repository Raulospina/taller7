
package puntoTres;

import java.util.Scanner;

public class arreglos {
	public static void main(String[] args) {
		int[] Pruebas = new int[5];
		double promedio = 0;
		try (Scanner sc = new Scanner(System.in)) {
	
			

			for (int i = 0; i < Pruebas.length; i++) {
				System.out.println("ingresa un resultad para las pruebas ");
				Pruebas[i] = sc.nextInt();

			}
			System.out.println("los resultados son:");
			for (int y = 0; y < Pruebas.length; y++) {
				System.out.println("pruebas[" + (y+1) + "] = " + Pruebas[y]);
			}
			int suma = 0;
			for (int x = 0; x < Pruebas.length; x++) {
				suma += Pruebas[x];

			}
			System.out.println("la suma total de los resultados es :" + suma);
			
			promedio = suma / 5;
			
		}catch(Exception e) {
			System.out.println("error solo se puede digitar enteros ");
		}
		
		System.out.println("el promedio de los resultados es de " + promedio);
			
			
		}
	}

