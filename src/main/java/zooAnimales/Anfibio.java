package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio  extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio () {
		listado.add(this);
	}
	public Anfibio (String nombre,int edad ,String habitat,String genero,String colorPiel, boolean venenoso) {
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		
		listado.add(this);
	}
	
	public int cantidadAnfibios() {
		return ranas+salamandras;
	}
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre,int edad,String genero) {
		new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		
	}
	
	public void crearSalamandra(String nombre,int edad,String genero) {
		new Anfibio(nombre,edad ,"selva",genero,"negro y amarillo",false);
		salamandras++;
		}
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static ArrayList<Anfibio> getListado(){
		return listado;
	}
}
