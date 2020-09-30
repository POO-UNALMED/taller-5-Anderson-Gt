package gestion;

import java.util.*;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	
	public void agregarAnimales(Animal X) {
	animales.add(X);	
		
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.setNombre(nombre);
		this.setZoo(zoo);		
	}
	
	public Zona() {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getnombre() {
		return nombre;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo=zoo;		
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setAnimales(ArrayList<Animal> x) {
		animales=x;		
	}
	public ArrayList<Animal> getAnimales(){
		return animales;
	}
		
}
