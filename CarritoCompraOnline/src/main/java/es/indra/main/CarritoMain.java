package es.indra.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import es.indra.beans.impl.Categoria;
import es.indra.beans.impl.Cliente;
import es.indra.beans.impl.Compra;
import es.indra.beans.impl.Empresa;
import es.indra.beans.impl.Menu;
import es.indra.beans.impl.Producto;

public class CarritoMain {
	static Connection conn1 = null;

	public static void main(String[] args) throws SQLException {
		conexion();
				
		String query2 = "SELECT * FROM categorias";
		Statement st = conn1.createStatement();
		ResultSet rs = st.executeQuery(query2);
		Categoria cat = new Categoria();
		while (rs.next())
		{
			cat.setId(rs.getInt("id"));
			cat.setNombre(rs.getString("nombre"));
			System.out.format("%s, %s \n", cat.getId(), cat.getNombre());
		}
		
			Empresa empresa=new Empresa();
			
			empresa.setNombreEmpresa("IvanMarcoSL");
			
			Map <String,ArrayList<Compra>> listaClientes=new HashMap<String,ArrayList<Compra>>();
			
			ArrayList<Producto>productos=new ArrayList<Producto>();
			ArrayList<Cliente>clientes=new ArrayList<Cliente>();
			
			empresa.setProductos(productos);
			Compra compra=new Compra();
			
			Categoria alim = new Categoria(1,"AlimentaciónI");
			insertar(alim);
			Categoria perfu = new Categoria(2,"PerfumeriaI");
			insertar(perfu);
			Categoria limp = new Categoria(3,"LimpiezaI");
			insertar(limp);
			
			Producto producto1 = new Producto("Galletas","Galletas de chocolate", alim,2.95,10);
			Producto producto2 = new Producto("Colonia","Colonia para hombres MUY hombres", perfu,12.75,0);
			Producto producto3 = new Producto("Jabon","Jabon de manos",limp,3.95,50);
			Producto producto4 = new Producto("Tofu","Alimento de soya",alim,5.95,100);
			
			Cliente clientes1 = new Cliente("Pedro","Alvarez Gonzalez","C/ Colon 21","+346527778","1");
			Cliente clientes2 = new Cliente("Pablo","Alvarez Gonzalez","C/ Marques de vadillo 21","+3467555678","2");
			Cliente clientes3 = new Cliente("Miguel","Alvarez Gonzalez","C/ Principe pio 21","+34653278","3");
			Cliente clientes4 = new Cliente("Maria","Alvarez Gonzalez","C/ Serrano 21","+3465345437","4");
			
			productos.add(producto1);
			productos.add(producto2);
			productos.add(producto3);
			productos.add(producto4);
			
			clientes.add(clientes1);
			clientes.add(clientes2);
			clientes.add(clientes3);
			clientes.add(clientes4);

			
			Menu menu = new Menu();

			menu.crearProducto(empresa);
			menu.mostrarListaCliente(empresa);
			menu.incrementarStock(empresa);
			menu.disminuirStock(empresa);
			menu.pasoCaja(clientes3, empresa, compra, listaClientes);
			menu.elegirProductos(clientes3, empresa, compra);
			menu.mostrarProductos(empresa);
			

			conn1.close();
			//st.close();
			
		}
	
	public static void conexion() {
		try {
			String url1 = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7264745";//"jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7265149";//
			String user = "sql7264745";//"sql7265149";//
			String password = "Zb1XGdwrD6";//"e6I6NQESFR";//
			
			//Class.forName("com.mysql.jdbc.Driver");
			conn1 = DriverManager.getConnection(url1, user, password);
			if (conn1 != null) {
				System.out.println("Connected to the database sql7264745");
			}
		} catch (SQLException ex) {
			System.out.println("Error en la conexion,usuario /password incorrecto");
			ex.printStackTrace();
		}
	}
	
	public static void insertar(Categoria categ) throws SQLException {

		String query = " insert into categorias values (?, ?)";
		PreparedStatement preparedStmt =
		conn1.prepareStatement(query);
		preparedStmt.setInt (1, categ.getId());
		preparedStmt.setString (2, categ.getNombre());
		preparedStmt.execute();
	}
}