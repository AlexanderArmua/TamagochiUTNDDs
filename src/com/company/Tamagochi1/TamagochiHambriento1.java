package com.company.Tamagochi1;

public class TamagochiHambriento1 extends TamagochiEstado1 {
    public TamagochiHambriento1(Tamagochi1 tamagochi) {
        super(tamagochi);
    }

    @Override
    public void comer() {
        super.tamagochi.cambiarEstado(new TamagochiContento1(this.tamagochi));
    }

    @Override
    public void jugar() {

    }

    @Override
    public Boolean puedeJugar() {
        return false;
    }
}
