package examen.ejercicio2;

import java.util.Date;

public class Asalariado extends Empleado implements Cobro{
	private String departamento;
	
	public Asalariado() {
		super();
	}

	public Asalariado(String nombre, String apellidos, Date fecha_contratacion, Double salario, String cuenta_bancaria,
			String departamento) throws Exception {
		super(nombre, apellidos, fecha_contratacion, salario, cuenta_bancaria);
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Asalariado [departamento=" + departamento + "]";
	}

	@Override
	public void cobro_cuenta(String concepto, double importe, Date fecha_pago) {
		System.out.println("Se han ingesado " + importe + " euros en la cuenta " + getCuenta_bancaria() + " en concepto de " + concepto + " a fecha " + fecha_pago);
	}
}
