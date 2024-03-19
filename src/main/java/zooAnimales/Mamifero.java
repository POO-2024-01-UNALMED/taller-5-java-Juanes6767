package zooAnimales;

import java.util.ArrayList;


public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
	}
	public Mamifero (String nombre,int edad ,String habitat,String genero,boolean pelaje, int patas) {
	this.pelaje=pelaje;
	this.patas=patas;
	this.setNombre(nombre);
	this.setEdad(edad);
	this.setHabitat(habitat);
	this.setGenero(genero);
	
	listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return caballos+leones;
	}
	
	public static Mamifero crearCaballo(String nombre,int edad,String genero) {
	Mamifero a=new Mamifero(nombre,edad ,"pradera",genero,true, 4);
	caballos++;
	return a;
	}
	
	public static Mamifero crearLeon(String nombre,int edad,String genero) {
		Mamifero a =new Mamifero(nombre,edad ,"selva",genero,true, 4);
		leones++;
		return a;
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
