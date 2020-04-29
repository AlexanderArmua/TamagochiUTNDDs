package com.company.Tamagochi1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EstadoAburrido1 extends TamagochiEstado1 {
    private Date inicioAburrimiento;

    public EstadoAburrido1(Tamagochi1 tamagochi) {
        super(tamagochi);
        this.inicioAburrimiento = new Date();
    }

    @Override
    public void comer() {
        if (this.estaAburridaHaceMasDe80Min()) {
            super.tamagochi.cambiarEstado(new TamagochiContento1(this.tamagochi));
        }
    }

    @Override
    public void jugar() {
        super.tamagochi.cambiarEstado(new TamagochiContento1(this.tamagochi));
    }

    @Override
    public Boolean puedeJugar() {
        return true;
    }

    private Boolean estaAburridaHaceMasDe80Min() {
        final long tiempoTrnascurrido = (new Date()).getTime() - inicioAburrimiento.getTime();
        final long minutosTranscurrido = TimeUnit.MILLISECONDS.convert(tiempoTrnascurrido, TimeUnit.MINUTES);

        return minutosTranscurrido > 80;
    }
}
