package ar.edu.unlam.tallerjava.tp4.ej1;

import java.util.List;

public class Escultura extends ObraArte{

	public Escultura(String autor, String titulo, List<DimensionObra> dimensiones){
		super(autor, titulo, dimensiones);
	}

	@Override
	public String toString() {
		return "Escultura: " + super.toString();
	}

}
