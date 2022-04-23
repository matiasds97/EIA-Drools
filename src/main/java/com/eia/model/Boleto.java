package com.eia.model;

public class Boleto {
	float importe;
	
	public static final float IMPORTE_MINIMO = 20f;

	public Boleto(float importe) {
		this.importe = importe;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Boleto [importe=" + importe + "]";
	}
}
