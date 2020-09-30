package zooAnimales;
import java.util.*;
public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre,int edad,String genero){
		iguanas++;
		Reptil rept = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		return rept;		
	}
	
	public static Reptil crearSerpiente(String nombre,int edad,String genero) {
		serpientes++;
		Reptil serp = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		return serp;
	}
	
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		listado.add(this);
		
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola=largoCola;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public static void setListado(ArrayList<Reptil> x) {
		listado=x;
	}
	public static List<Reptil> getListado() {
		return listado;
	}
	
}
