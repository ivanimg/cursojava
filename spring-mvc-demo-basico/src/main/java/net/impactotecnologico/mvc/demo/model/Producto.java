package net.impactotecnologico.mvc.demo.model;

public class Producto {
	private String nombre;
	private String descripcion;
	private Categoria categoria;
	private double precio;
	private int stock;
	
	public Producto()
	{
		
	}	

	public Producto(String nombre, String descripcion, Categoria categoria, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria + ", precio="
				+ precio + ", stock=" + stock + "]";
	}



}
