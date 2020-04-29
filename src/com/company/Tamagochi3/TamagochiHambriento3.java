package com.company.Tamagochi3;

public class TamagochiHambriento3 implements TamagochiEstado3 {
    @Override
    public void comer(Tamagochi3 tamagochi3) {
        tamagochi3.cambiarEstado(new TamagochiContento3());
    }

    @Override
    public void jugar(Tamagochi3 tamagochi3) {

    }

    @Override
    public Boolean puedeJugar(Tamagochi3 tamagochi3) {
        return false;
    }
}
