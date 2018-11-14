package es.indra.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Empresa {

	private String nombreEmpresa;

	private ArrayList<Producto> productos = new ArrayList<>();

	private Map<String, ArrayList<Compra>> compraCliente = new HashMap<String, ArrayList<Compra>>();

	public Empresa() {

	}

	public Empresa(String nombreEmpresa, ArrayList<Producto> productos, Map<String, ArrayList<Compra>> compraCliente) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.productos = productos;
		this.compraCliente = compraCliente;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public Map<String, ArrayList<Compra>> getCompraCliente() {
		return compraCliente;
	}

	public void setCompraCliente(Map<String, ArrayList<Compra>> compraCliente) {
		this.compraCliente = compraCliente;
	}

	public void crearProducto(String nombre, String descripcion, double precio, Categoria categoria, int stock) {
		this.productos.add(new Producto(nombre, descripcion, categoria, precio, stock));

	}

	public void aumentarStock(int numero, String nombre) {

		int suma = 0;

		for (Producto producto : this.productos) {

			if (nombre.equals(producto.getNombre())) {
				suma = producto.getStock() + numero;
				producto.setStock(suma);
			}
		}

	}

	public void disminuirStock(int numero, String nombre) {
		int resta = 0;

		for (Producto producto : this.productos) {

			if (nombre.equals(producto.getNombre())) {
				resta = producto.getStock() - numero;
				producto.setStock(resta);
			}
		}
	}
}

/*************************************************************************************************************/

// TODO Auto-generated method stub
/*
 * 0 = Alimentaci�n", 1= Perfumer�a", 2= Limpieza"
 */
//Producto producto1 = new Producto("Galletas","Galletas de chocolate", 0,2.95,10);
//Producto producto2 = new Producto("Colonia","Colonia para hombres MUY hombres", 1,12.75,0);
//Producto producto3 = new Producto("Jabon","Jabon de manos", 2,3.95,50);
//Producto producto4 = new Producto("Tofu","Alimento de soya", 0,5.95,100);
//
//
//
//
//List<Compra> compra = new ArrayList<>();
//Cliente clientes1 = new Cliente(0,"Pedro","Alvarez Gonzalez","C/ Colon 21","+346527778");
//Cliente clientes2 = new Cliente(0,"Pablo","Alvarez Gonzalez","C/ Marques de vadillo 21","+3467555678");
//Cliente clientes3 = new Cliente(0,"Miguel","Alvarez Gonzalez","C/ Principe pio 21","+34653278");
//Cliente clientes4 = new Cliente(0,"Maria","Alvarez Gonzalez","C/ Serrano 21","+3465345437");

/*
 * private List<Producto,String> historial= new ArrayList<>();
 * 
 * public ArrayList comprar(String fecha, Producto[] producto) {
 * 
 * historial.add(producto,fecha); return historial;
 * 
 * }
 */
//
//System.out.println(producto1);
//producto1.aumentarStock(6);
//System.out.println(producto1);
