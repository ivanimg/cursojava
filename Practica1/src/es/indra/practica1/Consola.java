package es.indra.practica1;

import java.io.IOException;

public class Consola {

	public static void main(String[] args) {
		
		System.out.println("Introduce tu nombre: ");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
