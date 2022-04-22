package com.eia.model;

public class Molinete {
	public AperturaMolinete apertura;
	public CondicionMolinete condicion;

	public Molinete() {
		this.apertura = AperturaMolinete.NO_DETERMINADO;
		this.condicion = CondicionMolinete.NO_DETERMINADO;
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
