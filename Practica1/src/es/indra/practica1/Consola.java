package es.indra.practica1;

import java.io.IOException;

import org.xml.sax.InputSource;

public class Consola {

	public static void main(String[] args) {
		String nombre = "";

		
		try {
			nombre = Integer.toString(System.in.read());
			//System.in.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hola "+nombre);
	}

}
