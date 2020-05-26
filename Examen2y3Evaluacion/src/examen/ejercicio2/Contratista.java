package examen.ejercicio2;

import java.util.Date;
import java.util.List;

public class Contratista extends Empleado{
	private List<SociedadAnonima> sociedades;

	public Contratista() {
		super();
	}

	public Contratista(String nombre, String apellidos, Date fecha_contratacion, Double salario, String cuenta_bancaria,
			List<SociedadAnonima> sociedades) throws Exception {
		super(nombre, apellidos, fecha_contratacion, salario, cuenta_bancaria);
		this.sociedades = sociedades;
	}

	public List<SociedadAnonima> getSociedades() {
		return sociedades;
	}

	public void añadir_sociedad(SociedadAnonima sociedad) {
		sociedades.add(sociedad);
	}
	
	public void eliminar_sociedad(SociedadAnonima sociedad) {
		sociedades.remove(sociedad);
	}

	@Override
	public String toString() {
		return "Contratista [sociedades=" + sociedades + "]";
	}
}
