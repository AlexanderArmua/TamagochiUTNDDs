package com.company.Tamagochi3;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TamagochiAburrido3 implements TamagochiEstado3 {
    private Date inicioAburrimiento;

    public TamagochiAburrido3() {
        this.inicioAburrimiento = new Date();
    }

    @Override
    public void comer(Tamagochi3 tamagochi3) {
        if (this.estaAburridaHaceMasDe80Min()) {
            tamagochi3.cambiarEstado(new TamagochiContento3());
        }
    }

    @Override
    public void jugar(Tamagochi3 tamagochi3) {
        tamagochi3.cambiarEstado(new TamagochiContento3());
    }

    @Override
    public Boolean puedeJugar(Tamagochi3 tamagochi3) {
        return true;
    }

    private Boolean estaAburridaHaceMasDe80Min() {
        final long tiempoTrnascurrido = (new Date()).getTime() - inicioAburrimiento.getTime();
        final long minutosTranscurrido = TimeUnit.MILLISECONDS.convert(tiempoTrnascurrido, TimeUnit.MINUTES);

        return minutosTranscurrido > 80;
    }
}
