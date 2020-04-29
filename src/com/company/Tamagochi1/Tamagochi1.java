package com.company.Tamagochi1;

/**
 * Utiliza el State como clase abstracta con relación de asociación bidireccional
 */

public class Tamagochi1 {

    private TamagochiEstado1 estado;
    private Integer nivelDeFelicidad;

    public void TamagochiEstado1() {
        this.estado = new TamagochiContento1(this);
    }

    public void comer() {
        this.estado.comer();
    }

    public void jugar() {
        this.estado.jugar();
    }

    public Boolean puedeJugar() {
        return this.estado.puedeJugar();
    }

    public Integer nivelDeFelicidad() {
        return nivelDeFelicidad;
    }

    public void cambiarEstado(TamagochiEstado1 estado) {
        this.estado = estado;
    }

    public void incrementarFelicidad(Integer nivel) {
        this.nivelDeFelicidad += nivel;
    }
}
