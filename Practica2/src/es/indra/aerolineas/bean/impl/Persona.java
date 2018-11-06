/**
 * 
 */
package es.indra.aerolineas.bean.impl;

/**
 * @author aula16
 *
 */
public abstract class Persona {

	protected String nombre;
	protected String apellido;
	protected String dni;
	private int id;
	
	/*
	 * Contructor de la clase sin variables
	 */
	public Persona() {
		super();
	}
	
	abstract public String solicitarInformacion();
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre.toUpperCase();
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido.toUpperCase();
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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

}
