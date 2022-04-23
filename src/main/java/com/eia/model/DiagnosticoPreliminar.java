package com.eia.model;

public class DiagnosticoPreliminar {
	EstadoDeSaldoDeTarjeta estadoDeSaldoDeTarjeta;
	EstadoDeTarjeta estadoDeTarjeta;
	EstadoDeLecturaDeTarjeta estadoDeLecturaDeTarjeta;
	EstadoDeIdentificacionDeTarjeta estadoDeIdentificacionDeTarjeta;
	EstadoDelMolinete estadoDelMolinete;
	EstadoDelLectorDeTarjetas estadoDelLectorDeTarjetas;
	EstadoDelProcesamientoDelLectorDeTarjetas estadoDelProcesamientoDelLectorDeTarjetas;
	boolean tiempoMaximoDelBoletoEnPantallaExcedido;
	boolean deteccionDeTarjeta;

	public EstadoDeSaldoDeTarjeta getEstadoDeSaldoDeTarjeta() {
		return estadoDeSaldoDeTarjeta;
	}

	public void setEstadoDeSaldoDeTarjeta(EstadoDeSaldoDeTarjeta estadoDeSaldoDeTarjeta) {
		this.estadoDeSaldoDeTarjeta = estadoDeSaldoDeTarjeta;
	}

	public EstadoDeTarjeta getEstadoDeTarjeta() {
		return estadoDeTarjeta;
	}

	public void setEstadoDeTarjeta(EstadoDeTarjeta estadoDeTarjeta) {
		this.estadoDeTarjeta = estadoDeTarjeta;
	}

	public EstadoDeLecturaDeTarjeta getEstadoDeLecturaDeTarjeta() {
		return estadoDeLecturaDeTarjeta;
	}

	public void setEstadoDeLecturaDeTarjeta(EstadoDeLecturaDeTarjeta estadoDeLecturaDetarjeta) {
		this.estadoDeLecturaDeTarjeta = estadoDeLecturaDetarjeta;
	}

	public EstadoDeIdentificacionDeTarjeta getEstadoDeIdentificacionDeTarjeta() {
		return estadoDeIdentificacionDeTarjeta;
	}

	public void setEstadoDeIdentificacionDeTarjeta(EstadoDeIdentificacionDeTarjeta estadoDeIdentificacionDeTarjeta) {
		this.estadoDeIdentificacionDeTarjeta = estadoDeIdentificacionDeTarjeta;
	}

	public EstadoDelMolinete getEstadoDelMolinete() {
		return estadoDelMolinete;
	}

	public void setEstadoDelMolinete(EstadoDelMolinete estadoDelMolinete) {
		this.estadoDelMolinete = estadoDelMolinete;
	}

	public EstadoDelLectorDeTarjetas getEstadoDelLectorDeTarjetas() {
		return estadoDelLectorDeTarjetas;
	}

	public void setEstadoDelLectorDeTarjetas(EstadoDelLectorDeTarjetas estadoDelLectorDeTarjetas) {
		this.estadoDelLectorDeTarjetas = estadoDelLectorDeTarjetas;
	}

	public EstadoDelProcesamientoDelLectorDeTarjetas getEstadoDelProcesamientoDelLectorDeTarjetas() {
		return estadoDelProcesamientoDelLectorDeTarjetas;
	}

	public void setEstadoDelProcesamientoDelLectorDeTarjetas(
			EstadoDelProcesamientoDelLectorDeTarjetas estadoDelProcesamientoDelLectorDeTarjetas) {
		this.estadoDelProcesamientoDelLectorDeTarjetas = estadoDelProcesamientoDelLectorDeTarjetas;
	}

	public boolean isTiempoMaximoDelBoletoEnPantallaExcedido() {
		return tiempoMaximoDelBoletoEnPantallaExcedido;
	}

	public void setTiempoMaximoDelBoletoEnPantallaExcedido(boolean tiempoMaximoDelBoletoEnPantallaExcedido) {
		this.tiempoMaximoDelBoletoEnPantallaExcedido = tiempoMaximoDelBoletoEnPantallaExcedido;
	}

	public boolean isDeteccionDeTarjeta() {
		return deteccionDeTarjeta;
	}

	public void setDeteccionDeTarjeta(boolean deteccionDeTarjeta) {
		this.deteccionDeTarjeta = deteccionDeTarjeta;
	}

	@Override
	public String toString() {
		return "DiagnosticoPreliminar [estadoDeSaldoDeTarjeta=" + estadoDeSaldoDeTarjeta + ", estadoDeTarjeta="
				+ estadoDeTarjeta + ", estadoDeLecturaDetarjeta=" + estadoDeLecturaDeTarjeta
				+ ", estadoDeIdentificacionDeTarjeta=" + estadoDeIdentificacionDeTarjeta + ", estadoDelMolinete="
				+ estadoDelMolinete + ", estadoDelLectorDeTarjetas=" + estadoDelLectorDeTarjetas
				+ ", estadoDelProcesamientoDelLectorDeTarjetas=" + estadoDelProcesamientoDelLectorDeTarjetas
				+ ", tiempoMaximoDelBoletoEnPantallaExcedido=" + tiempoMaximoDelBoletoEnPantallaExcedido
				+ ", deteccionDeTarjeta=" + deteccionDeTarjeta + "]";
	}
}
