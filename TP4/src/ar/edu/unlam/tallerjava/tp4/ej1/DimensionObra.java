package ar.edu.unlam.tallerjava.tp4.ej1;

import java.security.InvalidParameterException;

public class DimensionObra {
	private String nombreDimension;
	private Float valor;
	
	public DimensionObra(String nombre, Float valor){
		this.nombreDimension = nombre;
		if( valor != null && valor > 0f){
			this.valor = valor;			
		}
		else{
			throw new InvalidParameterException("Valor de dimensión menor o igual a cero.");
		}			
	}
	
	@Override
	public String toString(){
		return   (nombreDimension == null ? "NOMBRE NO DEFINIDO" : nombreDimension) + ":" + 
		         valor.toString();
	}

	public String getNombreDimension() {
		return nombreDimension;
	}

	public void setNombreDimension(String nombreDimension) {
		this.nombreDimension = nombreDimension;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		if( valor != null && valor > 0f){
			this.valor = valor;			
		}
		else{
			throw new InvalidParameterException("Valor de dimensión menor o igual a cero.");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nombreDimension == null) ? 0 : nombreDimension.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return this.toString().equals(obj.toString());
	}
	
	

}
