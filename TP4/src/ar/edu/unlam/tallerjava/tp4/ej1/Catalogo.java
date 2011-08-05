package ar.edu.unlam.tallerjava.tp4.ej1;

import java.util.LinkedList;
import java.util.List;

public class Catalogo {
	
	private List<ObraArte> obras;
	
	public Catalogo(){
		this.obras = new LinkedList<ObraArte>();
	}
	
	public Catalogo(List<ObraArte> obras){
		this.obras = obras;
	}
	
	public Boolean agregarObra(ObraArte obra){
		return this.obras.add(obra);
	}
	
	public Boolean eliminarObra(ObraArte obra){
		return this.obras.remove(obra);
	}
	
	public String listarObras(){
		String listadoObras = "";
		for( ObraArte obra : obras){
			listadoObras += obra.toString() + "\n";
		}
		return listadoObras;
	}

}
