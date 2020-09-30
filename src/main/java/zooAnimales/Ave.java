package zooAnimales;

import java.util.*;

public class Ave extends Animal{
	private static ArrayList<Ave>listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public static int cantidadAves() {
		return listado.size();
	}
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad,String genero) {
		halcones++;
		Ave avv = new Ave(nombre,edad,"montanas",genero,"cae glorioso");
		return avv;		
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		Ave agui = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		return agui;
	}	
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);		
	}
	
	public Ave() {
		listado.add(this);		
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas=colorPlumas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public static void setListado(ArrayList<Ave> x) {
		listado=x;
	}
	public static List<Ave> getListado() {
		return listado;
	}

}
