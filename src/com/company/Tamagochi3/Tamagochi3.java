package com.company.Tamagochi3;

/**
 * Utiliza el State como una intercace
 */

public class Tamagochi3 {

    private TamagochiEstado3 estado;
    private Integer nivelDeFelicidad;

    public void TamagochiEstado1() {
        this.estado = new TamagochiContento3();
    }

    public void comer() {
        this.estado.comer(this);
    }

    public void jugar() {
        this.estado.jugar(this);
    }

    public Boolean puedeJugar() {
        return this.estado.puedeJugar(this);
    }

    public Integer nivelDeFelicidad() {
        return nivelDeFelicidad;
    }

    public void cambiarEstado(TamagochiEstado3 estado) {
        this.estado = estado;
    }

    public void incrementarFelicidad(Integer nivel) {
        this.nivelDeFelicidad += nivel;
    }
}
