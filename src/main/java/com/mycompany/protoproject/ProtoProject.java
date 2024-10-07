package com.mycompany.protoproject;

public class ProtoProject {

    public static void main(String[] args) {
        // personaje original
        String[] habilidadesOriginales = {"Corte", "Bloqueo con Escudo", "Curación"};
        Personaje original = new Personaje("Guerrero", 100, habilidadesOriginales);
        
        // clona 2 personajes (casting)
        Personaje clon1 = (Personaje) original.clonar();
        Personaje clon2 = (Personaje) original.clonar();
        
        // muestra personajes
        System.out.println("Original: " + original);
        System.out.println("Clon 1: " + clon1);
        System.out.println("Clon 2: " + clon2);
        
        // modifica clon1 y muestra los 3 de nuevo
        clon1.setNombre("Mago");
        clon1.setPuntosVida(80);
        clon1.setHabilidades(new String[]{"Bola de Fuego", "Teletransportación", "Escudo de Hielo"});
        
        System.out.println("\nDespués de la modificación:");
        System.out.println("Original: " + original);
        System.out.println("Clon 1: " + clon1);
        System.out.println("Clon 2: " + clon2);
        
        
        Personaje clon3 = (Personaje) clon1.clonar();
        
        System.out.println("Clon 3 (que es clon del 1, del mago): " + clon3);
    }
}
