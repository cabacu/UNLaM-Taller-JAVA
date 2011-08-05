package ar.edu.unlam.tallerjava.tp4.ej1;

import java.security.InvalidParameterException;
import java.util.List;

public abstract class ObraArte {
	protected String autor;
	protected String titulo;
	protected List<DimensionObra> dimensiones;
	
	public ObraArte(String autor,String titulo, List<DimensionObra> dimensiones){
		this.autor = autor;
		this.titulo = titulo;
		if(!dimensiones.isEmpty()){
			this.dimensiones = dimensiones;
		}
		else{
			throw new InvalidParameterException("La obra de arte debe tener por lo menos una dimension.");
		}
	}

	
	public boolean agregarDimension(DimensionObra arg0) {
		return dimensiones.add(arg0);
	}
	

	public boolean eliminarDimension(DimensionObra arg0) {
		return dimensiones.remove(arg0);
	}
	
	public String toString(){
		String retorno = autor + "-" + titulo + "-";
		int i=0;
		for(DimensionObra dim : dimensiones){
			retorno += dim.toString();			
			i++;
			if(i<dimensiones.size()){
				retorno += ",";
			}			
		}
		return retorno;
	}

	public int cantidadDimensiones(){
		return this.dimensiones.size();
	}
	
	public boolean contieneDimension(DimensionObra dim){
		return this.dimensiones.contains(dim);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result
				+ ((dimensiones == null) ? 0 : dimensiones.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		ObraArte obraParam = (ObraArte)obj;
		Boolean dimIguales  = dimensiones.size() == obraParam.cantidadDimensiones();
		if( dimIguales){
			for( DimensionObra dim: dimensiones){
				dimIguales &= obraParam.contieneDimension(dim);
			}
		}		
		return dimIguales && autor.equals(obraParam.getAutor().toString()) && titulo.equals(obraParam.getTitulo().toString());
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
}
