package com.company.Tamagochi2;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TamagochiAburrido2 extends TamagochiEstado2 {
    private Date inicioAburrimiento;

    public TamagochiAburrido2() {
        this.inicioAburrimiento = new Date();
    }

    @Override
    public void comer(Tamagochi2 tamagochi2) {
        if (this.estaAburridaHaceMasDe80Min()) {
            tamagochi2.cambiarEstado(new TamagochiContento2());
        }
    }

    @Override
    public void jugar(Tamagochi2 tamagochi2) {
        tamagochi2.cambiarEstado(new TamagochiContento2());
    }

    @Override
    public Boolean puedeJugar(Tamagochi2 tamagochi2) {
        return true;
    }

    private Boolean estaAburridaHaceMasDe80Min() {
        final long tiempoTrnascurrido = (new Date()).getTime() - inicioAburrimiento.getTime();
        final long minutosTranscurrido = TimeUnit.MILLISECONDS.convert(tiempoTrnascurrido, TimeUnit.MINUTES);

        return minutosTranscurrido > 80;
    }
}
