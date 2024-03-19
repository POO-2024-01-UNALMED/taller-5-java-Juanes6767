package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private static ArrayList<Zona> zona= new ArrayList<>();
	
	public Animal () {}
	public Animal (String nombre, int edad, String habitat, String genero){
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;

	}
	
	public String movimiento() {
		return "desplazarse";
		
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: "+(Mamifero.cantidadMamiferos())+"\n"+
				"Aves: "+(Ave.cantidadAves())+ "\n"+
				"Reptiles: "+(Reptil.cantidadReptiles())+"\n"+
				"Peces: " +(Pez.cantidadPeces())+ "\n"+
				"Anfibios: "+(Anfibio.cantidadAnfibios());
		
	}	


	public String toString(Zona zona,Zoologico zoo) {
		if (Animal.zona.size()!=0){
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+
				", la zona en la que me ubico es "+Animal.zona.get(0).getNombre()+", en el "+Animal.zona.get(0).getZoo();
		} else {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
		}
	}	
	
	public int getTotalAnimales(){
		return Mamifero.cantidadMamiferos()+Ave.cantidadAves()+Reptil.cantidadReptiles()+Pez.cantidadPeces()+Anfibio.cantidadAnfibios();
	}
	public void setTotalAnimales(int totalAnimales){
		Animal.totalAnimales=totalAnimales;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	public String getHabitat(){
		return habitat;
	}
	public void setHabitat(String habitat){
		this.habitat=habitat;
	}
	
	public String getGenero(){
		return genero;
	}
	public void setGenero(String genero){
		this.genero=genero;
	}
	
	public ArrayList<Zona> getZona(){
		return zona;
	}
	public void setZona(ArrayList<Zona> zona){
		Animal.zona=zona;
	}
}