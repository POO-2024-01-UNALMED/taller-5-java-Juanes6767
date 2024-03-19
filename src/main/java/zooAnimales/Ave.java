package zooAnimales;

import java.util.ArrayList;


public class Ave  extends Animal {
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave () {
		listado.add(this);
	}
	public Ave ( String nombre,int edad ,String habitat,String genero,String colorPlumas) {
		this.colorPlumas=colorPlumas;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return halcones+aguilas;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		Ave a=new Ave(nombre,edad ,"montanas",genero,"cafe glorios");
		halcones++;
		return a;}
	
	
	public static Ave crearAguila(String nombre,int edad,String genero) {
		Ave a=new Ave(nombre,edad ,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return a;}
	
	
	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static ArrayList<Ave> getListado(){
		return listado;
	}
}
