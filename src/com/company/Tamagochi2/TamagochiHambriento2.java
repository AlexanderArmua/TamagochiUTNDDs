package com.company.Tamagochi2;

public class TamagochiHambriento2 extends TamagochiEstado2 {
    @Override
    public void comer(Tamagochi2 tamagochi2) {
        tamagochi2.cambiarEstado(new TamagochiContento2());
    }

    @Override
    public void jugar(Tamagochi2 tamagochi2) {

    }

    @Override
    public Boolean puedeJugar(Tamagochi2 tamagochi2) {
        return false;
    }
}
