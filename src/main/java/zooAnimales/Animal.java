package zooAnimales;
import gestion.Zona;


public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.getListado().size();
		
	}
	
	public String toString() {
		return "Mi nombre es"+this.getNombre();
		
	}
	
	public Animal(int totalAnimales,String nombre,int edad,String habitat, String genero) {
		totalAnimales++;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setgenero(genero);
		
	}
	public Animal() {
		
	}
	
	
	

}
