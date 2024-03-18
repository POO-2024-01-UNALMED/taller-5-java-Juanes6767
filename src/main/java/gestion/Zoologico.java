package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas; 
	
	public Zoologico() {}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int n=0;
		int total=0;
		while(n<zonas.size()) {
			total=total +zonas.get(n).getAnimales().size();
			n++;	
		}
		return total;
	}
	
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getUbicacion(){
		return ubicacion;
	}
	public void setUbicacion(String ubicacion){
		this.ubicacion=ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void setZona(ArrayList<Zona>zonas){
		Zoologico.zonas=zonas;
	}
}
