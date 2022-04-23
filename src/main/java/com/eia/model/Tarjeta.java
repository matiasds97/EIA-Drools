package com.eia.model;

import java.time.OffsetDateTime;

public class Tarjeta {
	float saldo;
	public PosicionRespectoAlLector posicionRespectoAlLector;
	public EstadoChip estadoChip;
	EstadoLogico estadoLogico;
	public OffsetDateTime fechaYHoraDelUltimoViaje;
	public OffsetDateTime fechaYHoraDelAnteultimoViaje;
	public final float SALDO_MINIMO = -70f;
	
	public Tarjeta(float saldo, PosicionRespectoAlLector posicionRespectoAlLector, EstadoChip estadoChip,
			EstadoLogico estadoLogico, OffsetDateTime fechaYHoraDelUltimoViaje,
			OffsetDateTime fechaYHoraDelAnteultimoViaje) {
		this.saldo = saldo;
		this.posicionRespectoAlLector = posicionRespectoAlLector;
		this.estadoChip = estadoChip;
		this.estadoLogico = estadoLogico;
		this.fechaYHoraDelUltimoViaje = fechaYHoraDelUltimoViaje;
		this.fechaYHoraDelAnteultimoViaje = fechaYHoraDelAnteultimoViaje;
	}

	public Tarjeta() {
		this.saldo = 100f;
		this.posicionRespectoAlLector = PosicionRespectoAlLector.ESTATICA;
		this.estadoChip = EstadoChip.NO_DETERMINADO;
		this.estadoLogico = EstadoLogico.HABILITADA;
		this.fechaYHoraDelUltimoViaje = OffsetDateTime.now().minusHours(1);
		this.fechaYHoraDelAnteultimoViaje = OffsetDateTime.now().minusHours(2);
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
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
		return "Tarjeta [Saldo=" + saldo + ", posicionRespectoAlLector=" + posicionRespectoAlLector + ", estadoChip="
				+ estadoChip + ", estadoLogico=" + estadoLogico + ", fechaYHoraDelUltimoViaje="
				+ fechaYHoraDelUltimoViaje + ", fechaYHoraDelAnteultimoViaje=" + fechaYHoraDelAnteultimoViaje + "]";
	}
}
