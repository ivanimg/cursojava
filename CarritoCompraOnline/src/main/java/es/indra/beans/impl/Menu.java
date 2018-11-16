package es.indra.beans.impl;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Menu {

	public static void crearProducto(Empresa e) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Itroduzca la categoria; Alimentacion, Limpieza o Perfumeria");
		Categoria categoria = new Categoria();
		categoria.setNombre(sc.nextLine());
		System.out.println("Introduzca el nombre del producto:");
		String nombre = sc.nextLine();
		System.out.println("Introduzca la descripcion del producto:");
		String descripcion = sc.nextLine();
		System.out.println("Introduzca el precio del producto:");
		double precio = sc.nextDouble();
		System.out.println("Introduzca el nĂºmero de stock del producto:");
		int stock = sc.nextInt();

		e.crearProducto(nombre, descripcion, precio, categoria, stock);
	}

	public static void mostrarListaCliente(Empresa e) {
		for (Map.Entry<String, ArrayList<Compra>> entry : e.getCompraCliente().entrySet()) {
			System.out.println("clave=" + entry.getKey());
			for (Compra c : entry.getValue()) {
				System.out.println(c.toString());
			}
		}

	}

	public static void incrementarStock(Empresa e) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del producto:");
		String nombre = sc.nextLine();
		System.out.println("Introduzca la cantidad de incremento de stock:");
		int stock = sc.nextInt();
		for (Producto p : e.getProductos()) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				e.aumentarStock(stock, nombre);
			}
		}
	}

	public static void disminuirStock(Empresa e) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del producto:");
		String nombre = sc.nextLine();
		System.out.println("Introduzca la cantidad de disminucion de stock:");
		int stock = sc.nextInt();
		for (Producto p : e.getProductos()) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				e.disminuirStock(stock, nombre);
			}
		}
	}

	public static boolean isNumeric(String cadena) {

		boolean resultado;
		try {
			Integer.parseInt(cadena);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}

		return resultado;
	}

	public static void pasoCaja(Cliente c, Empresa e, Compra compra, Map<String, ArrayList<Compra>> listaClientes) {
		System.out.println("Precio final: " + compra.getTotal());
		ArrayList<Compra> lista = new ArrayList<>();
		lista.add(compra);

		listaClientes.put(c.getDni(), lista);
		e.setCompraCliente(listaClientes);
	}

	public static void elegirProductos(Cliente c, Empresa e, Compra compra) {
		Scanner sc = new Scanner(System.in);
		mostrarProductos(e);
		String fecha = "09/11/2018";
		System.out.println("Introduzca el nombre del producto");
		String nombre = sc.nextLine();
		System.out.println("Introduzca la cantidad del producto");
		int stock = sc.nextInt();
		for (Producto p : e.getProductos()) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				if (p.getStock() > stock) {
					compra.setCliente(c);
					compra.setFecha(fecha);
					compra.compraTotal(stock, p);
					e.disminuirStock(stock, nombre);
				} else {
					System.out.println("No nos quedan " + nombre + "'s en stock");
				}

			}
		}
	}

	public static void mostrarProductos(Empresa e) {
		for (Producto p : e.getProductos()) {
			System.out.println(p.toString());
		}
	}

}