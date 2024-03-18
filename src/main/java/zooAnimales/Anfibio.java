package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio  extends Animal {
	private static ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio () {}
	public Anfibio (ArrayList<Anfibio> listado, int ranas,int salamandras, String colorPiel, boolean venenoso, int totalAnimales, String nombre,int edad ,String habitat,String genero, ArrayList<Zona> zona) {
		Anfibio.listado=listado;
		this.ranas=ranas;
		this.salamandras=salamandras;
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		this.setTotalAnimales(totalAnimales);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		listado.add(this);
	}
	
	public int cantidadAnfibios() {
		
	}
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana() {
		
	}
	
	public void crearSalamandra() {
		
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
	public void set{
		this.=;
	}
}
