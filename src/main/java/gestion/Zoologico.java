package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas; 
	
	public Zoologico() {}
	public Zoologico(String nombre, String ubicacion,ArrayList<Zona> zonas) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonas=zonas;
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
}
