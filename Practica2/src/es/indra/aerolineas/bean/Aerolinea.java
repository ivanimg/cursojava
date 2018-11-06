/**
 * 
 */
package es.indra.aerolineas.bean;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	
	public Aerolinea() {		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the vuelos
	 */
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	/*
	 * Funcion para contar el numero de vuelos de un origen
	 */
	public int consultarVuelos(String origen) {
		System.out.println("Llamada a metodo de 1 parametro: "+origen);
		int vuelo=0;
		for(int i=0; i<vuelos.length; i++) {
			if(this.vuelos[i].getOrigen()==origen)
				vuelo++;
		}
		return vuelo;
	}
	
	/*
	 * Funcion para contar el numero de vuelos entre un origen y un destino
	 */
	public int consultarVuelos(String origen, String destino) {
		System.out.println("Llamada a metodo de 2 parametro: "+origen+" y "+destino);
		int vuelo=0;
		for(int i=0; i<vuelos.length; i++) {
			if(this.vuelos[i].getOrigen()==origen && this.vuelos[i].getDestino()==destino)
				vuelo++;
		}
		return vuelo;
	}
	
	public void anularVuelos(String... vuelos ) {
		System.out.println("Numero de vuelos a anular: "+vuelos.length);
	}
	
	
	

}
