package examen.ejercicio2;

import java.util.Date;

public abstract class Empleado implements Comparable<Empleado>{
	private String nombre;
	private String apellidos;
	private Date fecha_contratacion; 
	private Double salario;
	private String cuenta_bancaria;
	
	RuntimeException SalarioException;
	
	public Empleado(String nombre, String apellidos, Date fecha_contratacion, Double salario, String cuenta_bancaria) throws Exception {
		comprueba_salario(salario);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_contratacion = fecha_contratacion;
		this.salario = salario;
		this.cuenta_bancaria = cuenta_bancaria;
	}

	private void comprueba_salario(Double salario2) throws Exception{
		if (salario2 < 0)
			throw  SalarioException;
	}

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Date getFecha_contratacion() {
		return fecha_contratacion;
	}

	public Double getSalario() {
		return salario;
	}

	public String getCuenta_bancaria() {
		return cuenta_bancaria;
	}

	public void setSalario(Double salario) throws Exception {
		comprueba_salario(salario);
		this.salario = salario;
	}

	public void setCuenta_bancaria(String cuenta_bancaria) {
		this.cuenta_bancaria = cuenta_bancaria;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_contratacion=" + fecha_contratacion
				+ ", salario=" + salario + ", cuenta_bancaria=" + cuenta_bancaria + "]";
	}
	
	@Override
	public int compareTo(Empleado o) {
		return getApellidos().compareTo(o.getNombre());
	}
}
