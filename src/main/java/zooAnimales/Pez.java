package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;
public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez () {}
	public Pez (int salmones, int bacalaos, String colorEscamas, int cantidadAletas,int totalAnimales,String nombre,int edad ,String habitat,String genero, ArrayList<Zona> zona) {
		this.salmones=salmones;
		this.bacalaos=bacalaos;
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		this.setTotalAnimales(totalAnimales);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		listado.add(this);
	}
	
	public void cantidadPeces() {
		
	}
	
	public String movimiento() {
		return "nadar";
		
	}
	
	public void crearSalmon() {
		
	}
	
	public void crearBacalao() {
		
	}
	
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> listado) {
		Pez.listado=listado;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas=cantidadAletas;
	}
}
