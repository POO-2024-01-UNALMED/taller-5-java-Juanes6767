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
	private ArrayList<Zona> zona= new ArrayList<>();
	
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
		return "Mamiferos:"+ (Mamifero.getListado().size()+1)+
				"\n"+"Aves:"+(Ave.getListado().size()+2)+
				"\n"+"Reptiles:"+(Reptil.getListado().size()+1)+
				"\n"+"Peces:"+(Pez.getListado().size()+1)+
				"\n"+"Anfibios:"+(Anfibio.getListado().size()+1);
	}	


	public String toString(){
		if (zona.size()!=0)
		return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+", y mi genero es "+
				this.genero+", la zona en la que me ubico es "+this.zona.get(0).getNombre()+", en el "+this.zona.get(0).getZoo().getNombre();
		else
			return "Mi nombre es "+this.nombre+", tengo una edad de "+String.valueOf(this.edad)+", habito en "+this.habitat+" y mi genero es "+this.genero;
	}	
	
	public int getTotalAnimales(){
		return Mamifero.cantidadMamiferos()+Ave.cantidadAves()+Reptil.cantidadReptiles()+Pez.cantidadPeces()+Anfibio.cantidadAnfibios();
	}
	public void setTotalAnimales(int totalAnimales){
		totalAnimales++;
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
	
}