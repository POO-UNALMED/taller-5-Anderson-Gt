package zooAnimales;

import java.util.*;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public static int cantidadMamiferos() {
		return listado.size();
		
	}
	
	public static Mamifero crearCaballo(String nombre,int edad,String genero){
		caballos++;
		Mamifero mam = new Mamifero(nombre,edad,"pradera",genero,true,4);		
		return mam;		
	}
	
	public static Mamifero crearLeon(String nombre,int edad,String genero) {
		leones++;
		Mamifero mam = new Mamifero(nombre,edad,"selva",genero,true,4);
		return mam;
	}
	
	public Mamifero(String nombre,int edad, String habitat,String genero,Boolean pelaje, int patas){
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
		
	}
	public Mamifero() {
		listado.add(this);		
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje=pelaje;
	}
	public boolean getPelaje() {
		return pelaje;
	}
	public void setPatas(int patas) {
		this.patas=patas;
	}
	public int getPatas() {
		return patas;
	}
	public static void setListado(ArrayList<Mamifero> mamifero) {
		listado=mamifero;
	}
	public static ArrayList<Mamifero> getListado(){
		return listado;
	}

}
