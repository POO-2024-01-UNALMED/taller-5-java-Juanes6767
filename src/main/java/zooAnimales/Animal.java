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
	private static ArrayList<Zona> zona;
	
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
	
	public void totalPorTipo() {
		System.out.println("Mamiferos:"+ Mamifero.getListado().size()+
				"\n"+"Aves:"+Ave.getListado().size()+
				"\n"+"Reptiles:"+Reptil.getListado().size()+
				"\n"+"Peces:"+Pez.getListado().size()+
				"\n"+"Anfibios:"+Anfibio.getListado().size());
		
	}	


	public String toString(Zona zona,Zoologico zoo) {
		if (zona!=null){
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+
				", la zona en la que me ubico es "+zona.getNombre()+", en el "+zoo.getNombre();
		} else {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
		}
	}	
	
	public int getTotalAnimales(){
		return totalAnimales;
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