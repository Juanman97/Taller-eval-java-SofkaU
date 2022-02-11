package com.sofkau.tallerjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

    protected double precioBase = 100;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private double peso = 5;
    private static final List<String> coloresDisponibles = new ArrayList<>
            (Arrays.asList("blanco", "negro", "rojo", "azul", "gris"));
    private static final List<Character> consumoEnergeticoDisponible = new ArrayList<>
            (Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));

    //constructores
    public Electrodomestico() {
        precioFinal();
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        precioFinal();
    }

    public Electrodomestico(double precioBase, String color,
                            char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        precioFinal();
    }

    //métodos
    protected void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (consumoEnergeticoDisponible.contains(letra)) {
            this.consumoEnergetico = letra;
        }
    }

    protected void comprobarColor(String color) {
        color = color.toLowerCase();
        if (coloresDisponibles.contains(color)) {
            this.color = color;
        }

    }

    protected void precioFinal(){
        switch (this.consumoEnergetico) {
            case 'A':
                this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                break;
            case 'C':
                this.precioBase += 60;
                break;
            case 'D':
                this.precioBase += 50;
                break;
            case 'E':
                this.precioBase += 30;
                break;
            case 'F':
                this.precioBase += 10;
                break;
            default:
                break;
        }
        if (this.peso >= 80) {
            this.precioBase += 100;
        } else if (this.peso >= 50) {
            this.precioBase += 80;
        } else if (this.peso >= 20) {
            this.precioBase += 50;
        } else {
            this.precioBase += 10;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}
