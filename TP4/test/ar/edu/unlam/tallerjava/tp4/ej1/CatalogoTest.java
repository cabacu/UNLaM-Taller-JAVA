package ar.edu.unlam.tallerjava.tp4.ej1;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CatalogoTest {

	/**
	 * @uml.property  name="catalogo"
	 * @uml.associationEnd  
	 */
	private Catalogo catalogo;
	
	@Before
	public void setUp(){
		catalogo = new Catalogo();
	}
	
	@After
	public void tearDown(){
		catalogo = null;
	}
	
	@Test
	public void testVerificarObrasAgregadas(){
		// Creo las dimensiones que voy a usar
		DimensionObra alto1 = new DimensionObra("Alto", 123f);
		DimensionObra ancho1 = new DimensionObra("Ancho", 223f);
		DimensionObra largo1 = new DimensionObra("Largo", 53f);		
		DimensionObra alto2 = new DimensionObra("Alto", 223f);
		DimensionObra ancho2 = new DimensionObra("Ancho", 423f);
		DimensionObra largo2 = new DimensionObra("Largo", 153f);		
		// creo listados de dimensiones para usar
		ArrayList<DimensionObra> listaDimension1 = new ArrayList<DimensionObra>();
		ArrayList<DimensionObra> listaDimension2 = new ArrayList<DimensionObra>();
		ArrayList<DimensionObra> listaDimension3 = new ArrayList<DimensionObra>();		
		//Obras de arte a guardar en el catalogo
		Grabado grabado;
		Pintura pintura;
		Escultura escultura;
		// Agrego las dimensiones al primer listado de dimensiones
		listaDimension1.add(alto1);
		listaDimension1.add(ancho1);
		listaDimension1.add(largo1);
		// Agrego las dimensiones al segundo listado de dimensiones		
		listaDimension2.add(alto2);
		listaDimension2.add(ancho2);
		listaDimension2.add(largo2);
		// Agrego las dimensiones al tercer listado de dimensiones		
		listaDimension3.add(alto1);
		listaDimension3.add(ancho2);
		listaDimension3.add(largo2);
		// creo las obras de arte
		grabado = new Grabado("CABACU", "Grabado XMC",listaDimension1);
		pintura = new Pintura("cabacu", "Pintura XVI", listaDimension2);
		escultura = new Escultura("Carlos", "Escultura I", listaDimension3);
		// agrego las obras de arte al catalogo
		catalogo.agregarObra(grabado);
		catalogo.agregarObra(pintura);
		catalogo.agregarObra(escultura);
		// Listado esperado para cada obra de arte
		String grabadoEsperado = "Grabado: CABACU-Grabado XMC-Alto:123.0,Ancho:223.0,Largo:53.0\n";
		String pinturaEsperada = "Pintura: cabacu-Pintura XVI-Alto:223.0,Ancho:423.0,Largo:153.0\n";
		String esculturaEsperada = "Escultura: Carlos-Escultura I-Alto:123.0,Ancho:423.0,Largo:153.0\n";
		// Verifico que el listado esperado sea igual al obtenido
		Assert.assertEquals(grabadoEsperado + pinturaEsperada + esculturaEsperada, catalogo.listarObras());
		// elimino una obra del catalogo
		catalogo.eliminarObra(pintura);
		// verifico que siga mostrando el listado como es eperado que lo haga
		Assert.assertEquals(grabadoEsperado + esculturaEsperada, catalogo.listarObras());
		
	}
	
}
