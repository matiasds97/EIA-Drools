package com.eia.model;

public class Lector {
	CondicionLector condicion;
	float distanciaDeLaTarjeta;
	DeteccionDeTarjeta deteccionDeTarjeta;
	float duracionDeBoletoEnPantalla;
	int procesamiento;
	
	public Lector(CondicionLector condicion, float distanciaDeLaTarjeta, DeteccionDeTarjeta deteccionDeTarjeta,
			float duracionDeBoletoEnPantalla, int procesamiento) {
		this.condicion = condicion;
		this.distanciaDeLaTarjeta = distanciaDeLaTarjeta;
		this.deteccionDeTarjeta = deteccionDeTarjeta;
		this.duracionDeBoletoEnPantalla = duracionDeBoletoEnPantalla;
		this.procesamiento = procesamiento;
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

	@Override
	public String toString() {
		return "Lector [condicion=" + condicion + ", distanciaDeLaTarjeta=" + distanciaDeLaTarjeta
				+ ", deteccionDeTarjeta=" + deteccionDeTarjeta + ", duracionDeBoletoEnPantalla="
				+ duracionDeBoletoEnPantalla + ", procesamiento=" + procesamiento + "]";
	}
}
