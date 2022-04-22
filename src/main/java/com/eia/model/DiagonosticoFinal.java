package com.eia.model;

public class DiagonosticoFinal {
	Diagnostico error;

	public DiagonosticoFinal() {
		this.error = Diagnostico.NO_DETERMINADO;
	}

	public Diagnostico getError() {
		return error;
	}

	public void setError(Diagnostico error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "DiagonosticoFinal [error = " + error + "]";
	}
}
