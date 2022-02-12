package com.sofkau.tallerjava;

public class Lavadora extends Electrodomestico{
    private double carga = 5;

    //constructores
    public Lavadora() {
        super(); //llama al constructor vacío del padre
        super.precioFinal();//aplica el método de precioFinal del padre
        precioFinal(); //aplica el método de precioFinal propio sobreescrito
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);//llama al constructor sencillo del padre
        super.precioFinal();//aplica el método de precioFinal del padre
        precioFinal();//aplica el método de precioFinal propio sobreescrito
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);//llama al constructor completo del padre
        super.precioFinal();//aplica el método de precioFinal del padre
        this.carga = carga;
        precioFinal();//aplica el método de precioFinal propio sobreescrito
    }

    //métodos
    @Override
    protected void precioFinal() {
        if (this.carga > 30) {
            this.precioBase += 50;
        }
    }

    public double getCarga() {
        return carga;
    }
}
