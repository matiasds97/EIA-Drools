package com.eia.model;

import java.time.OffsetDateTime;

public class Tarjeta {
	float Saldo;
	PosicionRespectoAlLector posicionRespectoAlLector;
	EstadoChip estadoChip;
	EstadoLogico estadoLogico;
	OffsetDateTime fechaYHoraDelUltimoViaje;
	OffsetDateTime fechaYHoraDelAnteultimoViaje;
	
	public Tarjeta(float saldo, PosicionRespectoAlLector posicionRespectoAlLector, EstadoChip estadoChip,
			EstadoLogico estadoLogico, OffsetDateTime fechaYHoraDelUltimoViaje,
			OffsetDateTime fechaYHoraDelAnteultimoViaje) {
		Saldo = saldo;
		this.posicionRespectoAlLector = posicionRespectoAlLector;
		this.estadoChip = estadoChip;
		this.estadoLogico = estadoLogico;
		this.fechaYHoraDelUltimoViaje = fechaYHoraDelUltimoViaje;
		this.fechaYHoraDelAnteultimoViaje = fechaYHoraDelAnteultimoViaje;
	}

	public float getSaldo() {
		return Saldo;
	}

	public void setSaldo(float saldo) {
		Saldo = saldo;
	}

	public PosicionRespectoAlLector getPosicionRespectoAlLector() {
		return posicionRespectoAlLector;
	}

	public void setPosicionRespectoAlLector(PosicionRespectoAlLector posicionRespectoAlLector) {
		this.posicionRespectoAlLector = posicionRespectoAlLector;
	}

	public EstadoChip getEstadoChip() {
		return estadoChip;
	}

	public void setEstadoChip(EstadoChip estadoChip) {
		this.estadoChip = estadoChip;
	}

	public EstadoLogico getEstadoLogico() {
		return estadoLogico;
	}

	public void setEstadoLogico(EstadoLogico estadoLogico) {
		this.estadoLogico = estadoLogico;
	}

	public OffsetDateTime getFechaYHoraDelUltimoViaje() {
		return fechaYHoraDelUltimoViaje;
	}

	public void setFechaYHoraDelUltimoViaje(OffsetDateTime fechaYHoraDelUltimoViaje) {
		this.fechaYHoraDelUltimoViaje = fechaYHoraDelUltimoViaje;
	}

	public OffsetDateTime getFechaYHoraDelAnteultimoViaje() {
		return fechaYHoraDelAnteultimoViaje;
	}

	public void setFechaYHoraDelAnteultimoViaje(OffsetDateTime fechaYHoraDelAnteultimoViaje) {
		this.fechaYHoraDelAnteultimoViaje = fechaYHoraDelAnteultimoViaje;
	}

	@Override
	public String toString() {
		return "Tarjeta [Saldo=" + Saldo + ", posicionRespectoAlLector=" + posicionRespectoAlLector + ", estadoChip="
				+ estadoChip + ", estadoLogico=" + estadoLogico + ", fechaYHoraDelUltimoViaje="
				+ fechaYHoraDelUltimoViaje + ", fechaYHoraDelAnteultimoViaje=" + fechaYHoraDelAnteultimoViaje + "]";
	}
}
