package examen.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import examen.ejercicio2.Asalariado;
import examen.ejercicio2.Contratista;
import examen.ejercicio2.Empleado;
import examen.ejercicio2.EmpresaServicios;
import examen.ejercicio2.SociedadAnonima;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Object> cosas = new ArrayList<Object>();
		
		try {
			cosas.add(new Asalariado("Juan", "Perez", new Date(2008, 05, 13), 1200.25, "ES123 456 789", "Contabilidad"));
			
			ArrayList<String> trabajos = new ArrayList<String>();
			trabajos.add("Pintura");
			trabajos.add("Tejados");
			SociedadAnonima sociedad = new SociedadAnonima("Anonima 1", trabajos);
			ArrayList<SociedadAnonima> sociedades = new ArrayList<SociedadAnonima>();
			sociedades.add(sociedad);
			cosas.add(new Contratista("Pepe", "Alvarez", new Date(2014,  05,  12), 1200.32, "ES132465",  sociedades));
			
			cosas.add(new EmpresaServicios("Empresa a", "catering", 12345.25, "ES145214527"));
			
			Iterator<Object> it2 = cosas.iterator();
			while (it2.hasNext()) {
				Object datos = it2.next();
				System.out.println(datos.toString());
			}
			
			LinkedList<Empleado> empleados = new LinkedList<Empleado>();
			empleados.add(new Asalariado("Julio", "Memuero", new Date(2014,10,28), 1102.3, "EA132465", "profesorado"));
			empleados.add(new Asalariado("Maria", "Patafria", new Date(2014, 9, 12), 985.12, "ES5785425", "suspiros"));
			
			ArrayList<String> trabajos2 = new ArrayList<String>();
			trabajos2.add("Muerte");
			trabajos2.add("Destruccion");
			SociedadAnonima sociedad2 = new SociedadAnonima("Anonima 2", trabajos);
			ArrayList<SociedadAnonima> sociedades2 = new ArrayList<SociedadAnonima>();
			sociedades2.add(sociedad2);
			empleados.add(new Contratista("Agua", "Congas", new Date(2014,  05,  12), 1200.32, "ES132465",  sociedades2));
			
			ArrayList<String> trabajos3 = new ArrayList<String>();
			trabajos3.add("Comer");
			trabajos3.add("Beber");
			SociedadAnonima sociedad3 = new SociedadAnonima("Anonima 2", trabajos);
			ArrayList<SociedadAnonima> sociedades3 = new ArrayList<SociedadAnonima>();
			sociedades2.add(sociedad3);
			empleados.add(new Contratista("Jace", "Solete", new Date(2014,  05,  12), 1200.32, "ES132465",  sociedades3));
			
			Collections.sort(empleados);
			
			for (Empleado empleado: empleados)
				System.out.println(empleado.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
