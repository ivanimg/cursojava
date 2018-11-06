/**
 * 
 */
package es.indra.aerolineas.bean;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona{
	
	public Vuelo[] vuelos;

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
}
