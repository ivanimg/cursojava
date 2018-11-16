package es.indra.beans.impl;

public class Compra {
	
	public Compra(Producto producto, Cliente cliente, double total, String fecha) {
		super();
		this.cliente = cliente;
		this.total = total;
		this.fecha = fecha;
	}
	public Compra() {
		// TODO Auto-generated constructor stub
	}
	private Cliente cliente;
	private double total;
	private String fecha;
	


	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Compra [cliente=" + cliente + ", total=" + total + ", fecha=" + fecha + "]";
	}
	
	
	public void compraTotal(int numero, Producto p) { 
		this.total += numero*p.getPrecio();
		System.out.println("Compra finalizada, gracias por comprar en nuestras instalacione!");
		
	}
	/**
	 * CALCULAR TOTAL DE COMPRA METODO
	 */

//	@Override
//	public String toString() {
//		return "Compra [id=" + id + ", producto=" + producto + ", cliente=" + cliente + ", Total=" + total
//				+ ", fecha=" + fecha + "]";
//	}
//	
//	public Map<Clientes,Compra> Historial()
//	{
//		HashMap<Clientes,Compra> historial = new HashMap<Clientes,Compra>();
//		
//	}
}
