package com.company.Tamagochi2;

public class TamagochiContento2 extends TamagochiEstado2 {
    private Integer vecesJugadas = 0;

    @Override
    public void comer(Tamagochi2 tamagochi2) {
        tamagochi2.incrementarFelicidad(1);
    }

    @Override
    public void jugar(Tamagochi2 tamagochi2) {
        tamagochi2.incrementarFelicidad(2);
        this.vecesJugadas ++;
        if (vecesJugadas == 5) {
            tamagochi2.cambiarEstado(new TamagochiHambriento2());
        }
    }

    @Override
    public Boolean puedeJugar(Tamagochi2 tamagochi2) {
        return true;
    }
}
