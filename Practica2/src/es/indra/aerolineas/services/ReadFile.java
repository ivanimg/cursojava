/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author aula16
 *
 */
public class ReadFile {
	
	public void retornarVuelos() {
		Path path = Paths.get("/Users/aula16/repositorios/CursoJava/vuelos.txt");
		
		try {
			List<String> contenido = Files.readAllLines(path);
			System.out.println(contenido);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void retornarVuelos2() {
		Path path = Paths.get("/Users/aula16/repositorios/CursoJava/vuelos.txt");
		//Path path = Paths.get(string);
		try {
			List<String> contenido = Files.readAllLines(path);
			for (int i=0; i < contenido.size();i++)
			{
				System.out.println(contenido.get(i));				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
		r.retornarVuelos2();
	}
}
