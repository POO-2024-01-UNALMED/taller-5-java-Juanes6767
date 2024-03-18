package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {}
	public Mamifero (ArrayList<Mamifero> listado, int caballos, int leones, boolean pelaje, int patas, int totalAnimales, String nombre,int edad ,String habitat,String genero, ArrayList<Zona> zona) {
	Mamifero.listado=listado;
	this.caballos=caballos;
	this.leones=leones;
	this.pelaje=pelaje;
	this.patas=patas;
	this.setTotalAnimales(totalAnimales);
	this.setNombre(nombre);
	this.setEdad(edad);
	this.setHabitat(habitat);
	this.setGenero(genero);
	this.setZona(zona);
	
	listado.add(this);
	}
	
	public void cantidadMamiferos() {
		
	}
	
	public void crearCaballo() {
		
	}
	
	public void crearLeon() {
		
	}
	
	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	
	
}
