package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado=new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez () {
		listado.add(this);
	}
	public Pez (String nombre,int edad ,String habitat,String genero,String colorEscamas, int cantidadAletas) {
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		
		listado.add(this);
	}
	
	public static int cantidadPeces() {
		return salmones+bacalaos;
	}
	
	public String movimiento() {
		return "nadar";
		
	}
	
	public static Pez crearSalmon(String nombre,int edad,String genero) {
		Pez a=new Pez(nombre,edad ,"oceano",genero,"rojo", 6);
		salmones++;
		return a;
		}
	
	public static Pez crearBacalao(String nombre,int edad,String genero) {
		Pez a= new Pez(nombre,edad ,"oceano",genero,"gris", 6);
		bacalaos++;
		return a;
	}
	
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> listado) {
		Pez.listado=listado;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas=cantidadAletas;
	}
}
