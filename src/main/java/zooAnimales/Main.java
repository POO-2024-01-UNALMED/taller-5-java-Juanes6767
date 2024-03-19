package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class Main {

	public static void main(String[] args) {
		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		
		String  comp = "Mamiferos: 4\n" + 
				"Aves: 4\n" + 
				"Reptiles: 2\n" + 
				"Peces: 2\n" + 
				"Anfibios: 3";
		System.out.println(Animal.totalPorTipo());
	}

}
