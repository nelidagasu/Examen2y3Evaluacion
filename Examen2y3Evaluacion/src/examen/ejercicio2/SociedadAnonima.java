package examen.ejercicio2;

import java.util.List;

public class SociedadAnonima {
	private String nombre_sociedad;
	private List<String> trabajos;

	public SociedadAnonima() {
		super();
	}
		
	public SociedadAnonima(String nombre_sociedad, List<String> trabajos) {
		super();
		this.nombre_sociedad = nombre_sociedad;
		this.trabajos = trabajos;
	}

	public String getNombre_sociedad() {
		return nombre_sociedad;
	}
	
	public void añadir_trabajo(String trabajo) {
		trabajos.add(trabajo);
	}
	
	public void eliminar_trabajo(String trabajo) {
		trabajos.remove(trabajo);
	}

	@Override
	public String toString() {
		return "SociedadAnonima [nombre_sociedad=" + nombre_sociedad + ", trabajos=" + trabajos + "]";
	}
}
