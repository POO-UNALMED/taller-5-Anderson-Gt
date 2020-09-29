package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico Zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	
	public void agregarAnimales(Animal X) {
	animales.add(X);	
		
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public Zona(String nombre, Zoologico zoo) {
		
	}
	
	public Zona() {
		
	}
	
	
	
}
