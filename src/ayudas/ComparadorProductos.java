package ayudas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import errores. PrecioNoCoincideException;
import objetos.Producto;

public class ComparadorProductos {

private static HashMap<String, Producto> lista = new HashMap<String, Producto>();

	
	public static  Producto compararProductos(Producto producto) throws PrecioNoCoincideException{
		
			if(lista.containsKey(producto.getId())) {
				if(lista.get(producto.getId()).getPrecio()==producto.getPrecio()) {
					int cantidadExtra = producto.getCantidad();
					int cantidadAntigua = lista.get(producto.getId()).getCantidad();
					lista.get(producto.getId()).setCantidad(cantidadAntigua+cantidadExtra);
				}
				else {
					lista.remove(producto.getId());
					throw new PrecioNoCoincideException("Precio diferente");
				}
			}
			else {
				lista.put(producto.getId(), producto);
			}
		
		return producto;
	}
	
	public static Iterator<Producto> sacarFicheroFusionado(){
		
		ArrayList<Producto> listaFinal = new ArrayList<Producto>();
		
		listaFinal.addAll(lista.values());
		
		return listaFinal.iterator();
		
	}
}
