package examen.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * En un fichero de texto se guardan datos de compuestos qu�micos a raz�n de uno por l�nea con el formato siguiente:
nombre_del_compuesto: elemento_qu�mico_1 elemento_qu�mico_2 elemento_qu�mico_3 �
Ejemplos:
Hidr�xido de sodio: Na O H
Nitrato de potasio: K N O3
Sulfato de cobre: Cu S O4
Cloruro de sodio: Na Cl
Escribe un programa que lea el contenido del fichero y almacene en una colecci�n los compuestos qu�micos ordenados por su nombre,
entendiendo por compuesto qu�mico una colecci�n de elementos qu�micos almacenados en el mismo orden en que se leen del fichero.
Una vez le�do el contenido del fichero, muestra por pantalla todos los compuestos qu�micos almacenados en la colecci�n iterando de tres
formas diferentes.
Mostrar tambi�n todos los elementos qu�micos sin repetir que intervienen en los compuestos le�dos.
 * 
 * 
 * 
 */
public class Ejericio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> c = new ArrayList<String>();
		List<String> comp = new ArrayList<String>();
		File archivo = new File("C:\\Users\\nelid\\Desktop\\compuestos.txt");

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = br.readLine();

			while (linea != null) {
				c.add(linea);

				String partes1[] = linea.split(":");
				String partes2[] = partes1[1].split(" ");

				for (int i = 0; i < partes2.length; i++)
					comp.add(partes2[i]);

				linea = br.readLine();
			}

			Collections.sort(c);

			// Eliminar compuesto repetidos
			Set<String> hashSet = new HashSet<String>(comp);
			comp.clear();
			comp.addAll(hashSet);

			// Mostrar compuestos
			System.out.println("Compuestos mostrados con iterador:");
			Iterator<String> it = c.iterator();
			while (it.hasNext()) {
				String nombre = it.next();
				System.out.println(nombre);
			}
			
			System.out.println("\n");
			System.out.println("Compuestos mostrados con for mejorado:");
			for (String nombre: c)
				System.out.println(nombre);

			System.out.println("\n");
			System.out.println("Compuestos mostrados con foreach:");
			c.forEach(nombre -> System.out.println(nombre));

			// Mostrar componentes
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("componentes mostrados con iterador:");
			Iterator<String> it2 = comp.iterator();
			while (it2.hasNext()) {
				String nombre = it2.next();
				System.out.println(nombre);
			}
			
			System.out.println("\n");
			System.out.println("Componentes con for mejorado:");
			for (String componente: comp)
				System.out.println(componente);
			
			System.out.println("\n");
			System.out.println("Componentes con foreach:");
			comp.forEach(componente -> System.out.println(componente));
			

		} catch (Exception e) {
			System.err.println();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar el fichero");
				System.out.println(e.getMessage());
			}
		}

	}

}
