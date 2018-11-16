package es.indra.aerolineas.bean.impl;

import java.util.Scanner;

public class CompraVenta {

	public static void main(String[] args) {

		boolean fin=false;
		int opcion = 0, precio, stock, categ, id, stockV,cliente;
		String nombre, desc, nombreC, apel, direc, telef, productoV;
		Scanner sc = new Scanner(System.in);
		//Map <String,ArrayList<Compra>> listaClientes=new HashMap<Integer,ArrayList<Compra>>();
		
		while (fin==false) {
			System.out.println("Introduce una opción. Compra o modifica el Stock");
			System.out.println("1 - Comprar");
			System.out.println("2 - Aumentar Stock");
			System.out.println("3 - Disminuir Stock");
			System.out.println("4 - Añadir cliente");
			System.out.println("5 - Añadir producto");
			System.out.println("6 - Salir");
			opcion = Integer.valueOf(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("¿Que cliente eres?");
				cliente = Integer.valueOf(sc.nextLine());
				System.out.println("¿Que quieres comprar? Escriba vacio para terminar");
				productoV = sc.nextLine();
				while (productoV!="") {
					System.out.println("¿Que quieres comprar? Escriba vacio para terminar");
					productoV = sc.nextLine();
					System.out.println("¿Cuanto quieres comprar?");
					stockV = Integer.valueOf(sc.nextLine());
					//listaClientes[cliente].compra(stockV, productoV);
				}
				
				break;
			case 2:
				System.out.println("¿Cuanto quiere aumentar?");
				stockV = Integer.valueOf(sc.nextLine());
				//aumentarStock(stockV);
				
				break;
			case 3:
				System.out.println("¿Cuanto quiere disminuir?");
				stockV = Integer.valueOf(sc.nextLine());
				//disminuirStock(stockV);
				
				break;
			case 4:
				System.out.println("Introduce los datos del nuevo cliente");
				System.out.println("Nombre");
				nombreC = sc.nextLine();
				System.out.println("Descripcion");
				apel = sc.nextLine();
				System.out.println("Categoria");
				categ = Integer.valueOf(sc.nextLine());
				System.out.println("Precio");
				precio = Integer.valueOf(sc.nextLine());
				System.out.println("Stock");
				stock = Integer.valueOf(sc.nextLine());
				//Cliente clientes = new Cliente(nombreC,apel,direc,telef,id);
				
				break;
			case 5:
				System.out.println("Introduce los datos del nuevo producto");
				System.out.println("Nombre");
				nombre = sc.nextLine();
				System.out.println("Descripcion");
				desc = sc.nextLine();
				System.out.println("Categoria");
				categ = Integer.valueOf(sc.nextLine());
				System.out.println("Precio");
				precio = Integer.valueOf(sc.nextLine());
				System.out.println("Stock");
				stock = Integer.valueOf(sc.nextLine());
				//Producto productoNuevo = new Producto(nombre,desc,categ,precio,stock);
				//productos.add(producto1);
				
				break;
			case 6:
				System.out.println("Hasta la proxima compra");
				fin = true;
				
				break;

			default:
				break;
			}
		}

	}

}
