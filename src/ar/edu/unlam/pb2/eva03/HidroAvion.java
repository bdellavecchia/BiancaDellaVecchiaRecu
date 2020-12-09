package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Volador, Acuatico{

	private Double profundidad;
	private Double altura;
	
	
	public HidroAvion(Integer Codigo, String Nombre) {
		super(Codigo, Nombre);
		// TODO Auto-generated constructor stub
		this.profundidad=0.0;
		this.altura=0.0;
	}

	
		@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return this.altura;
	}
		
		@Override
		public Double getProfundidad() {
			// TODO Auto-generated method stub
			return this.profundidad;
		}

}
