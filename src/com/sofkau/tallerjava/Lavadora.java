package com.sofkau.tallerjava;

public class Lavadora extends Electrodomestico{
    private double carga = 5;

    //constructores
    public Lavadora() {
        super();
        super.precioFinal();
        precioFinal();
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        super.precioFinal();
        precioFinal();
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        super.precioFinal();
        this.carga = carga;
        precioFinal();
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
