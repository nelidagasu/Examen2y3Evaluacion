package examen.ejercicio2;

import java.util.Date;

public class EmpresaServicios implements Cobro{
	private String nombre_empresa;
	private String tipo_servicio;
	private Double importe_mensual;
	private String numero_cuenta_empresa;
	
	RuntimeException ImporteMensualException;
	
	
	public EmpresaServicios() {
		super();
	}
	
	public EmpresaServicios(String nombre_empresa, String tipo_servicio, Double importe_mensual,
			String numero_cuenta_empresa) throws Exception {
		super();
		comprueba_importe(importe_mensual);
		this.nombre_empresa = nombre_empresa;
		this.tipo_servicio = tipo_servicio;
		this.importe_mensual = importe_mensual;
		this.numero_cuenta_empresa = numero_cuenta_empresa;
	}


	private void comprueba_importe(Double importe_mensual2) throws Exception{
		if (importe_mensual2 < 0)
			throw ImporteMensualException;
	}

	public Double getImporte_mensual() {
		return importe_mensual;
	}

	public void setImporte_mensual(Double importe_mensual) throws Exception {
		comprueba_importe(importe_mensual);
		this.importe_mensual = importe_mensual;
	}

	public String getNumero_cuenta_empresa() {
		return numero_cuenta_empresa;
	}

	public void setNumero_cuenta_empresa(String numero_cuenta_empresa) {
		this.numero_cuenta_empresa = numero_cuenta_empresa;
	}

	public String getNombre_empresa() {
		return nombre_empresa;
	}

	public String getTipo_servicio() {
		return tipo_servicio;
	}

	@Override
	public String toString() {
		return "EmpresaServicios [nombre_empresa=" + nombre_empresa + ", tipo_servicio=" + tipo_servicio
				+ ", importe_mensual=" + importe_mensual + ", numero_cuenta_empresa=" + numero_cuenta_empresa
				+ ", ImporteMensualException=" + ImporteMensualException + "]";
	}

	@Override
	public void cobro_cuenta(String concepto, double importe, Date fecha_pago) {
		System.out.println("Se han ingesado " + importe + " euros en la cuenta " + getNumero_cuenta_empresa() + " en concepto de " + concepto + " a fecha " + fecha_pago);
	}
	
	
}
