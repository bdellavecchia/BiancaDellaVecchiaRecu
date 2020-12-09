package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Avion extends Vehiculo implements Volador{

	
	private Double altura;


	public Avion(Integer Codigo, String Nombre) {
		super(Codigo, Nombre);
		// TODO Auto-generated constructor stub
		this.altura=0.0;
	}

	
	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return this.altura;
	}

}
