package com.company.Tamagochi2;

/**
 * Utiliza el State como clase abstracta con relacion de asociación unidereccional
 */

public class Tamagochi2 {

    private TamagochiEstado2 estado;
    private Integer nivelDeFelicidad;

    public void TamagochiEstado1() {
        this.estado = new TamagochiContento2();
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

    public void cambiarEstado(TamagochiEstado2 estado) {
        this.estado = estado;
    }

    public void incrementarFelicidad(Integer nivel) {
        this.nivelDeFelicidad += nivel;
    }
}
