package es.indra.aerolineas.bean;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import es.indra.aerolineas.bean.impl.Billete;
import es.indra.aerolineas.bean.impl.Vuelo;

public interface IAerolinea {

	void consultarVuelos(String origen) throws IOException;

	void consultarVuelos(String origen, String destino);

	void anularVuelos(String... vuelos);

	void verBilletesPorFecha(String fechaBillete);

	List<Vuelo> getVuelos();

	public String getNombre();

	void setBilletes(Map<String, List<Billete>> billetes);

}