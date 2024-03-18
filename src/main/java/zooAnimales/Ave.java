package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave  extends Animal {
	private static ArrayList<Ave> listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave () {}
	public Ave (ArrayList<Ave> listado, int halcones,int aguilas, String colorPlumas, int totalAnimales, String nombre,int edad ,String habitat,String genero, ArrayList<Zona> zona) {
		Ave.listado=listado;
		this.halcones=halcones;
		this.aguilas=aguilas;
		this.colorPlumas=colorPlumas;
		this.setTotalAnimales(totalAnimales);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		
		listado.add(this);
	}
	
	public void cantidadAves() {
		
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearhalcon() {
		
	}
	
	public void crearAguila() {
		
	}
	
	
	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static ArrayList<Ave> getListado(){
		return listado;
	}
	public void set{
		this.=;
	}
}
