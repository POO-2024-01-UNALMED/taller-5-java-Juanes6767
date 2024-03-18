package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;
public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo=new ArrayList<>(1);
	private static ArrayList<Animal> animales;
	
	public Zona () {}
	public Zona (String nombre, ArrayList<Zoologico> zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Zoologico> getZoo() {
		return zoo;
	}
	public void setZoo(ArrayList<Zoologico> zoo) {
		this.zoo = zoo;
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
}