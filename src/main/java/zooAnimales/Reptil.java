package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil () {}
	public Reptil (ArrayList<Reptil> listado, int iguanas,int serpientes, String colorEscamas, int largoCola, int totalAnimales, String nombre,int edad ,String habitat,String genero, ArrayList<Zona> zona) {
		Reptil.listado=listado;
		this.iguanas=iguanas;
		this.serpientes=serpientes;
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		this.setTotalAnimales(totalAnimales);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		listado.add(this);
	}
	
	public void cantidadReptiles() {
		
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguanas() {
		
	}
	
	public void crearSerpiente() {
		
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
