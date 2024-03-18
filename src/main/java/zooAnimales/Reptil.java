package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil () {
		listado.add(this);
	}
	public Reptil (String nombre,int edad ,String habitat,String genero,String colorEscamas, int largoCola) {
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		
		listado.add(this);
	}
	
	public int cantidadReptiles() {
		return iguanas+serpientes;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre,int edad,String genero) {
		new Reptil(nombre,edad ,"humedal",genero,"verde", 3);
		iguanas++;
		}
	
	public void crearSerpiente(String nombre,int edad,String genero) {
		new Reptil(nombre,edad ,"jungla",genero,"blanco", 1);
		serpientes++;
		}
	
	
	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public static ArrayList<Reptil> getListado(){
		return listado;
	}
}
