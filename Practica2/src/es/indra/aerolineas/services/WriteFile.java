package es.indra.aerolineas.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import es.indra.aerolineas.bean.impl.Pasajero;
import es.indra.aerolineas.bean.impl.Vuelo;

public class WriteFile {

	List<Pasajero> p;
	String dni, nombre, apellidos;
	Vuelo[] vuelos;
	
	public static void main(String[] args) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter("./pasajeros.txt"));
			for (Persona : Personas)
			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
	
	
}
