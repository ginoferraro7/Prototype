package com.mycompany.protoproject;

public class Personaje implements PersonajePrototipo {

    private String nombre;
    private int puntosVida;
    private String[] habilidades;

    public Personaje(String nombre, int puntosVida, String[] habilidades) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.habilidades = habilidades;
    }

    @Override
    public PersonajePrototipo clonar() {
        return new Personaje(this.nombre, this.puntosVida, this.habilidades);
    }

    @Override
    public String toString() {
        return "Personaje{nombre='" + nombre + "', puntosVida=" + puntosVida + ", habilidades=" + String.join(", ", habilidades) + "}";
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }
}
