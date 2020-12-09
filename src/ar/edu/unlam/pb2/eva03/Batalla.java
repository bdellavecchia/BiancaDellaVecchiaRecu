package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
//import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	private String nombre;
	
	
	public Batalla(String nombre, TipoDeBatalla tipoDeBatalla, Double latidud, Double longitud) {
		// TODO Auto-generated constructor stub
		vehiculosEnLaBatalla = new HashSet<Vehiculo>();
		this.nombre=nombre;
		this.tipo=tipoDeBatalla;
		this.latitud=latidud;
		this.longitud=longitud;
	}
	
	
	public Double getLatitud() {
		return latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	
	public TipoDeBatalla getTipo() {
		return tipo;
	}


	public void agregarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculosEnLaBatalla.add(vehiculo);
	}

//	public Vehiculo getVehiculoBatalla(Integer codigo) {
//		// TODO Auto-generated method stub
//		for (Vehiculo vehiculo : vehiculosEnLaBatalla) {
//			if (vehiculo.getCodigo().equals(codigo))
//				return vehiculo;
//		}
//		return null;
//	}
//	
//	
}
