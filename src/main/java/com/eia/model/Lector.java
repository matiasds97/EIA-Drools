package com.eia.model;

public class Lector {
	CondicionLector condicion;
	float distanciaDeLaTarjeta;
	DeteccionDeTarjeta deteccionDeTarjeta;
	float duracionDeBoletoEnPantalla;
	int procesamiento;
	
	public Molinete molinete;
	public Tarjeta tarjeta;
	public Boleto boleto;
	
	public final float DISTANCIA_MINIMA_DETECCION = 0.03f;
	public final float TIEMPO_MAXIMO_BOLETO = 4f;

	public DiagnosticoFinal diagnosticoFinal;
	
	public Lector(CondicionLector condicion, float distanciaDeLaTarjeta, DeteccionDeTarjeta deteccionDeTarjeta,
			float duracionDeBoletoEnPantalla, int procesamiento) {
		this.condicion = condicion;
		this.distanciaDeLaTarjeta = distanciaDeLaTarjeta;
		this.deteccionDeTarjeta = deteccionDeTarjeta;
		this.duracionDeBoletoEnPantalla = duracionDeBoletoEnPantalla;
		this.procesamiento = procesamiento;

		diagnosticoFinal = new DiagnosticoFinal();
		molinete = new Molinete();
		tarjeta = new Tarjeta();
		boleto = new Boleto(Boleto.IMPORTE_MINIMO);
	}

	public CondicionLector getCondicion() {
		return condicion;
	}

	public void setCondicion(CondicionLector condicion) {
		this.condicion = condicion;
	}

	public float getDistanciaDeLaTarjeta() {
		return distanciaDeLaTarjeta;
	}

	public void setDistanciaDeLaTarjeta(float distanciaDeLaTarjeta) {
		this.distanciaDeLaTarjeta = distanciaDeLaTarjeta;
	}

	public DeteccionDeTarjeta getDeteccionDeTarjeta() {
		return deteccionDeTarjeta;
	}

	public void setDeteccionDeTarjeta(DeteccionDeTarjeta deteccionDeTarjeta) {
		this.deteccionDeTarjeta = deteccionDeTarjeta;
	}

	public float getDuracionDeBoletoEnPantalla() {
		return duracionDeBoletoEnPantalla;
	}

	public void setDuracionDeBoletoEnPantalla(float duracionDeBoletoEnPantalla) {
		this.duracionDeBoletoEnPantalla = duracionDeBoletoEnPantalla;
	}

	public int getProcesamiento() {
		return procesamiento;
	}

	public void setProcesamiento(int procesamiento) {
		this.procesamiento = procesamiento;
	}

	public DiagnosticoFinal getDiagnosticoFinal() {
		return diagnosticoFinal;
	}

	public void setDiagnosticoFinal(DiagnosticoFinal diagnosticoFinal) {
		this.diagnosticoFinal = diagnosticoFinal;
	}

	public Molinete getMolinete() {
		return molinete;
	}

	public void setMolinete(Molinete molinete) {
		this.molinete = molinete;
	}
	

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}

	@Override
	public String toString() {
		return"Diagnostico Final= " + diagnosticoFinal + " }";
	}
}
