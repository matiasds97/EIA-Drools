package com.eia.model;

public class DiagnosticoPreeliminar {
	EstadoDeSaldoDeTarjeta estadoDeSaldoDeTarjeta;
	EstadoDeTarjeta estadoDeTarjeta;
	EstadoDeLecturaDeTarjeta estadoDeLecturaDetarjeta;
	EstadoDeIdentificacionDeTarjeta estadoDeIdentificacionDeTarjeta;
	EstadoDelMolinete estadoDelMolinete;
	EstadoDelLectorDeTarjetas estadoDelLectorDeTarjetas;
	EstadoDelProcesamientoDelLectorDeTarjetas estadoDelProcesamientoDelLectorDeTarjetas;
	boolean tiempoMaximoDelBoletoEnPantallaExcedido;
	
	public DiagnosticoPreeliminar(EstadoDeSaldoDeTarjeta estadoDeSaldoDeTarjeta, EstadoDeTarjeta estadoDeTarjeta,
			EstadoDeLecturaDeTarjeta estadoDeLecturaDetarjeta,
			EstadoDeIdentificacionDeTarjeta estadoDeIdentificacionDeTarjeta, EstadoDelMolinete estadoDelMolinete,
			EstadoDelLectorDeTarjetas estadoDelLectorDeTarjetas,
			EstadoDelProcesamientoDelLectorDeTarjetas estadoDelProcesamientoDelLectorDeTarjetas,
			boolean tiempoMaximoDelBoletoEnPantallaExcedido) {	
		this.estadoDeSaldoDeTarjeta = estadoDeSaldoDeTarjeta;
		this.estadoDeTarjeta = estadoDeTarjeta;
		this.estadoDeLecturaDetarjeta = estadoDeLecturaDetarjeta;
		this.estadoDeIdentificacionDeTarjeta = estadoDeIdentificacionDeTarjeta;
		this.estadoDelMolinete = estadoDelMolinete;
		this.estadoDelLectorDeTarjetas = estadoDelLectorDeTarjetas;
		this.estadoDelProcesamientoDelLectorDeTarjetas = estadoDelProcesamientoDelLectorDeTarjetas;
		this.tiempoMaximoDelBoletoEnPantallaExcedido = tiempoMaximoDelBoletoEnPantallaExcedido;
	}

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

	public EstadoDeLecturaDeTarjeta getEstadoDeLecturaDetarjeta() {
		return estadoDeLecturaDetarjeta;
	}

	public void setEstadoDeLecturaDetarjeta(EstadoDeLecturaDeTarjeta estadoDeLecturaDetarjeta) {
		this.estadoDeLecturaDetarjeta = estadoDeLecturaDetarjeta;
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

	@Override
	public String toString() {
		return "DiagnosticoPreeliminar [estadoDeSaldoDeTarjeta=" + estadoDeSaldoDeTarjeta + ", estadoDeTarjeta="
				+ estadoDeTarjeta + ", estadoDeLecturaDetarjeta=" + estadoDeLecturaDetarjeta
				+ ", estadoDeIdentificacionDeTarjeta=" + estadoDeIdentificacionDeTarjeta + ", estadoDelMolinete="
				+ estadoDelMolinete + ", estadoDelLectorDeTarjetas=" + estadoDelLectorDeTarjetas
				+ ", estadoDelProcesamientoDelLectorDeTarjetas=" + estadoDelProcesamientoDelLectorDeTarjetas
				+ ", tiempoMaximoDelBoletoEnPantallaExcedido=" + tiempoMaximoDelBoletoEnPantallaExcedido + "]";
	}
	
	
	
}
