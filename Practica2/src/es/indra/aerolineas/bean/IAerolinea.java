package es.indra.aerolineas.bean;

import es.indra.aerolineas.bean.impl.Vuelo;

public interface IAerolinea {

	/*
	 * Funcion para contar el numero de vuelos de un origen
	 */
	int consultarVuelos(String origen);

	/*
	 * Funcion para contar el numero de vuelos entre un origen y un destino
	 */
	int consultarVuelos(String origen, String destino);
	
	public void consultarVuelos2();

	void anularVuelos(String... vuelos);
	
	public String getNombre();
	public Vuelo[] getVuelos();

}