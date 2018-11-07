/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;

/**
 * @author aula16
 *
 */
public class ReadFile {
	
	List<String> contenido;
	
	public void retornarVuelos() {
		//Path path = Paths.get("/Users/aula16/repositorios/CursoJava/vuelos.txt");
		Path path = Paths.get("/Users/aula11/ivan/cursojava/Vuelos.txt");
		
		try {
			List<String> contenido = Files.readAllLines(path);
			System.out.println(contenido);
		} catch (IOException e) {
			System.out.println("Finalizada lectura de archivos");
		}
	}
	
	public List<String> retornarVuelos2() {
		//Path path = Paths.get("/Users/aula16/repositorios/CursoJava/vuelos.txt");
		Path path = Paths.get("/Users/aula11/ivan/cursojava/Vuelos.txt");
		//Path path = Paths.get(string);
			try {
				return Files.readAllLines(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//throw new ErrorLecturaDeVuelosException("Fallo leyendo el archivo", e);
			/*} finally {
				System.out.println("Finalizada lectura de archivos");*/
			}
			return contenido;
	}
	
	public static void main(String[] args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
		//r.retornarVuelos2();
	}
}
