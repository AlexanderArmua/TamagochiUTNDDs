package com.company.Tamagochi1;

public abstract class TamagochiEstado1 {
    protected Tamagochi1 tamagochi;

    public abstract void comer();
    public abstract void jugar();
    public abstract Boolean puedeJugar();

    public TamagochiEstado1(Tamagochi1 tamagochi) {
        this.tamagochi = tamagochi;
    }
}
