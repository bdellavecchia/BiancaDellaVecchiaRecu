package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	
	public FuerzaArmada() {
		convoy = new HashSet<Vehiculo>();
		batallas = new HashMap<String, Batalla>();
	}
	
	public void crearBatalla(String nombre, TipoDeBatalla TipoDeBatalla, Double Latidud, Double Longitud) {
		// TODO Auto-generated method stub
		batallas.put(nombre, new Batalla(nombre, TipoDeBatalla, Latidud, Longitud));
	} 

	
	public void agregarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.convoy.add(vehiculo);
	}


	public Integer getCapacidadDeDefensa() {
		// TODO Auto-generated method stub
		return this.convoy.size();
	}

	public Batalla getBatalla(String nombre) {
		// TODO Auto-generated method stub
		return batallas.get(nombre);
	}

	public Vehiculo getVehiculosAdd(Integer codigo) {
		for (Vehiculo v : convoy) {
			if(v.getCodigo().equals(codigo)==true) {
				return v;
			}
		}
		return null;
	}
	
	public Boolean enviarALaBatalla(String nombre, Integer codigo) throws VehiculoInexistente, VehiculoIncompatible{
		// TODO Auto-generated method stub

		Batalla batalla = batallas.get(nombre);
		Vehiculo vehiculo = getVehiculosAdd(codigo);
		batalla.agregarVehiculo(vehiculo);
		Boolean sePuede=false;
		
			if (vehiculo !=null) {
			
				switch (batalla.getTipo()) {
					
					case TERRESTRE:
						if (vehiculo instanceof Terrestre && vehiculo!=null) {
							sePuede=true;
						}
						else {sePuede=false;
						throw new VehiculoIncompatible ("Este vehiculo no es apto");}break;
					
					case NAVAL:
						if (vehiculo instanceof Acuatico && vehiculo!=null) {
							sePuede=true;
						}
						else {sePuede=false;
						throw new VehiculoIncompatible ("Este vehiculo no es apto");}break;

					case AEREA:
						if (vehiculo instanceof Acuatico && vehiculo!=null) {
							sePuede=true;
						}
						else {sePuede=false;
						throw new VehiculoIncompatible ("Este vehiculo no es apto");}break;
					}
			
		}else {throw new VehiculoInexistente ("Este vehiculo no existe");}
			return sePuede;
}

	
}	



