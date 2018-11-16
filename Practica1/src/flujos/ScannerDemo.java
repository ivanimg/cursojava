package flujos;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		//Scanner scanner = new Scanner(File(/User/archivo.txt));
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca su nombre: ");
		
		String nombre = scanner.nextLine();
		
		System.out.println("Por favor, introduzca su edad: ");
		
		int edad = scanner.nextInt();

		System.out.println("Por favor, introduzca su saldo disponible: ");
		
		double disponible = scanner.nextDouble();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Disponible: "+ disponible);
	}

}
