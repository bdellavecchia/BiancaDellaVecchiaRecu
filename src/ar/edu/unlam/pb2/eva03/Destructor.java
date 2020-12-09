package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Destructor extends Vehiculo implements Acuatico{

	
	private Double profundidad;

	
	public Destructor(Integer Codigo, String Nombre) {
		super(Codigo, Nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

}
