package com.eia.model;

public class Molinete {
	AperturaMolinete apertura;
	CondicionMolinete condicion;
	
	public Molinete(AperturaMolinete apertura, CondicionMolinete condicion) {
		this.apertura = apertura;
		this.condicion = condicion;
	}

	public AperturaMolinete getApertura() {
		return apertura;
	}

	public void setApertura(AperturaMolinete apertura) {
		this.apertura = apertura;
	}

	public CondicionMolinete getCondicion() {
		return condicion;
	}

	public void setCondicion(CondicionMolinete condicion) {
		this.condicion = condicion;
	}

	@Override
	public String toString() {
		return "Molinete [apertura=" + apertura + ", condicion=" + condicion + "]";
	}
}
