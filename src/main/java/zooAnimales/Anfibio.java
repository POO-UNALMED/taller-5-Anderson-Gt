package zooAnimales;
import java.util.*;

public class Anfibio extends Animal{
	private static ArrayList <Anfibio>listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private Boolean venenoso;
	
	public static int cantidadAnfibios(){
		return listado.size();
	}
	
	public String movimiento(){
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre,int edad,String genero){
		ranas++;
		Anfibio ran = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		return ran;
	}
	
	public static Anfibio crearSalamandra(String nombre,int edad,String genero){
		salamandras++;
		Anfibio sala = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		return sala;
		
	}
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,Boolean venenoso) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
	}
	
	public Anfibio() {
		listado.add(this);		
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel=colorPiel;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso=venenoso;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public static void setListado(ArrayList<Anfibio> x) {
		listado=x;
	}
	public static List<Anfibio> getListado() {
		return listado;
	}

}
