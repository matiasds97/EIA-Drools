package com.eia.model;

public class DiagnosticoFinal {
	public Diagnostico error;
	public DiagnosticoPreliminar diagnosticoPreliminar;

	public DiagnosticoFinal() {
		this.error = Diagnostico.NO_DETERMINADO;
		diagnosticoPreliminar = new DiagnosticoPreliminar();
	}

	public Diagnostico getError() {
		return error;
	}

	public void setError(Diagnostico error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "DiagnosticoFinal{" +
				"error=" + error +
				", diagnosticoPreliminar=" + diagnosticoPreliminar +
				'}';
	}
}
