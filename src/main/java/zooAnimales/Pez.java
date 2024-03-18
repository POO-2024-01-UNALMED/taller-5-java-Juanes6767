package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;
public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez () {
		listado.add(this);
	}
	public Pez (String nombre,int edad ,String habitat,String genero,String colorEscamas, int cantidadAletas) {
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		
		listado.add(this);
	}
	
	public int cantidadPeces() {
		return salmones+bacalaos;
	}
	
	public String movimiento() {
		return "nadar";
		
	}
	
	public void crearSalmon(String nombre,int edad,String genero) {
		new Pez(nombre,edad ,"oceano",genero,"rojo", 6);
		salmones++;
		}
	
	public void crearBacalao(String nombre,int edad,String genero) {
		new Pez(nombre,edad ,"oceano",genero,"gris", 6);
		bacalaos++;
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
