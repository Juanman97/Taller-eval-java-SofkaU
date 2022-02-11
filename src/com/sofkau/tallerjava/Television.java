package com.sofkau.tallerjava;

public class Television extends Electrodomestico{
    private double resolucion = 20;
    private boolean tdt = false;

    //constructores
    public Television() {
        super();
        super.precioFinal();
        precioFinal();
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        super.precioFinal();
        precioFinal();
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
        super.precioFinal();
        precioFinal();
    }

    //métodos
    @Override
    protected void precioFinal(){
        if (this.tdt) {
            this.precioBase += 50;
        }
        if (this.resolucion > 40) {
            this.precioBase += (precioBase * 0.3);
        }

    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }
}
