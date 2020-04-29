package com.company.Tamagochi1;

public class TamagochiContento1 extends TamagochiEstado1 {
    private Integer vecesJugadas = 0;

    public TamagochiContento1(Tamagochi1 tamagochi) {
        super(tamagochi);
    }

    @Override
    public void comer() {
        this.tamagochi.incrementarFelicidad(1);
    }

    @Override
    public void jugar() {
        this.tamagochi.incrementarFelicidad(2);
        this.vecesJugadas ++;
        if (vecesJugadas == 5) {
            super.tamagochi.cambiarEstado(new TamagochiHambriento1(this.tamagochi));
        }
    }

    @Override
    public Boolean puedeJugar() {
        return true;
    }
}
