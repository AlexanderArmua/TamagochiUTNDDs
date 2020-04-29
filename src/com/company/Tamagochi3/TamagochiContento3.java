package com.company.Tamagochi3;

public class TamagochiContento3 implements TamagochiEstado3 {
    private Integer vecesJugadas = 0;

    @Override
    public void comer(Tamagochi3 tamagochi3) {
        tamagochi3.incrementarFelicidad(1);
    }

    @Override
    public void jugar(Tamagochi3 tamagochi3) {
        tamagochi3.incrementarFelicidad(2);
        this.vecesJugadas ++;
        if (vecesJugadas == 5) {
            tamagochi3.cambiarEstado(new TamagochiHambriento3());
        }
    }

    @Override
    public Boolean puedeJugar(Tamagochi3 tamagochi3) {
        return true;
    }
}
