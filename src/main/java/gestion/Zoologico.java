package gestion;
import java.util.*;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona>zonas = new ArrayList<Zona>();
	
	public void agregarZonas(Zona X) {
		zonas.add(X);		
	}
	
	public int cantidadTotalAnimales() {
		int auxiliar=0;
		for(int i=0;i<zonas.size();i++) {
			auxiliar = auxiliar + zonas.get(i).cantidadAnimales();
		}
		return auxiliar;
	
		
	}
	
	public Zoologico(String nombre,String ubicacion) {
		
	}
	
	public Zoologico() {
		
	}
	

	
}
