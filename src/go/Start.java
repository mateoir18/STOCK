package go;

import ayudas.ComparadorProductos;
import datos.FicheroST1;
import datos.Read;
import datos.Write;

public class Start {

	public static void main(String[] args) {
		
		FicheroST1 fichero1 = new FicheroST1("C:\\Users\\User\\Documents\\stock1.txt");
		FicheroST1 fichero2 = new FicheroST1("C:\\Users\\User\\Documents\\stock2.txt");
		
		
		
		fichero1.guardarDatos(Read.readFiles(fichero1.getFichero()));
		fichero2.guardarDatos(Read.readFiles(fichero2.getFichero()));
		
		System.out.println(fichero1.toString());
		System.out.println(fichero2.toString());
		
		Write.rellenarArchivo(ComparadorProductos.sacarFicheroFusionado());
		

	}

}
