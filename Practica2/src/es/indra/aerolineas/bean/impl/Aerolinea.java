/**
 * 
 */
package es.indra.aerolineas.bean.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.indra.aerolineas.bean.IAerolinea;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	
	/*
	 * Constructor vacio
	 */
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
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.bean.IAerolinea#consultarVuelos(java.lang.String)
	 */
	@Override
	public int consultarVuelos(String origen) {
		System.out.println("Llamada a metodo de 1 parametro: "+origen);
		int vuelo=0;
		for(int i=0; i<vuelos.length; i++) {
			if(this.vuelos[i].getOrigen()==origen)
				vuelo++;
		}
		return vuelo;
	}
	public void consultarVuelos2() {
		ReadFile rf = new ReadFile();
		List<String> lista = rf.retornarVuelos2();
		for (String listaVuelos : lista) {
			System.out.println(listaVuelos);
		}
	}
	
	/*
	 * Funcion para contar el numero de vuelos entre un origen y un destino
	 */
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.bean.IAerolinea#consultarVuelos(java.lang.String, java.lang.String)
	 */
	@Override
	public int consultarVuelos(String origen, String destino) {
		System.out.println("Llamada a metodo de 2 parametro: "+origen+" y "+destino);
		int vuelo=0;
		for(int i=0; i<vuelos.length; i++) {
			if(this.vuelos[i].getOrigen()==origen && this.vuelos[i].getDestino()==destino)
				vuelo++;
		}
		return vuelo;
	}
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.bean.IAerolinea#anularVuelos(java.lang.String)
	 */
	@Override
	public void anularVuelos(String... vuelos ) {
		System.out.println("Numero de vuelos a anular: "+vuelos.length);
	}
	
	public void verBilletePorFecha(String fecha){
		Map<String, String> venta = new HashMap<>();; //Cada venta tiene un pasajero y un mapa de billetes
		Map<Integer, Map> billete = new HashMap<>();; //Cada billete tiene un vuelo y un numero
		for(int i=0; i<vuelos.length; i++) {
			//billete.put(vuelos[i], value);
		}
		
	}
	
	
	

}
