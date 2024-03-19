package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;
public class Zona {
	private String nombre;
	private Zoologico[] zoo=new Zoologico[1];
	private ArrayList<Animal> animales=new ArrayList<>();
	
	public Zona () {}
	public Zona (String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo[0]=zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo[0];
	}
	public void setZoo(Zoologico[] zoo) {
		this.zoo = zoo;
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
}