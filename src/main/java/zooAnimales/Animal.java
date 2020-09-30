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
		return "Mamiferos: "+ Mamifero.cantidadMamiferos()+"\n"+"Aves: "+Ave.cantidadAves()+"\n"+
	"Reptiles: "+ Reptil.cantidadReptiles()+"\n"+ "Peces: "+ Pez.cantidadPeces()+"\n"+"Anfibios: "+Anfibio.cantidadAnfibios();
		
	}
	
	public String toString() {
		if (zona==null) {
			return "Mi nombre es"+nombre+",tengo una edad de "+edad+", habito en "+habitat+"y mi genero es "+genero;
		}
		else {
			return "Mi nombre es"+nombre+",tengo una edad de "+edad+", habito en "+habitat+"y mi genero es "+genero+
					",la zona en la que me ubico es"+zona+"en el "+ zona.getZoo().getNombre();
		}
		
	}
	
	public Animal(int totalAnimales,String nombre,int edad,String habitat, String genero) {
		totalAnimales++;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		
	}
	public Animal() {
		totalAnimales++;
		
	}
	public static void setTotalAnimales(int x) {
		totalAnimales=x;
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setHabitat(String habitat){
		this.habitat=habitat;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	public String getGenero() {
		return genero;
	}
	public void setZona(Zona zona) {
		this.zona=zona;
	}
	public Zona getZona() {
		return zona;
	}

}
