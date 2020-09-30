package zooAnimales;
import java.util.*;

public class Pez extends Animal{
	private static ArrayList<Pez>listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public static int cantidadPeces() {
		return listado.size();		
	}
	
	public String movimiento(){
		return "nadar";
	}
	public static Pez crearSalmon(String nombre,int edad,String genero){
		salmones++;
		Pez salm = new Pez(nombre,edad,"oceano",genero,"gris",6);
		return salm;
		
		
	}
	public static Pez crearBacalao(String nombre,int edad,String genero){
		bacalaos++;
		Pez bacal = new Pez(nombre,edad,"oceano",genero,"gris",6);
		return bacal;
	}
	
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
	}
	
	public Pez() {
		listado.add(this);		
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas=cantidadAletas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public static void setListado(ArrayList<Pez> x) {
		listado=x;
	}
	public static List<Pez> getListado() {
		return listado;
	}

}
