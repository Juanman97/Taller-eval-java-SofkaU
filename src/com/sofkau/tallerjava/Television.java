package com.sofkau.tallerjava;

public class Television extends Electrodomestico{
    private double resolucion = 20;
    private boolean tdt = false;

    //constructores
    public Television() {
        super();//llama al constructor vacío del padre
        super.precioFinal();//aplica el método de precioFinal del padre
        precioFinal();//aplica el método de precioFinal propio sobreescrito
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);//llama al constructor sencillo del padre
        super.precioFinal();//aplica el método de precioFinal del padre
        precioFinal();//aplica el método de precioFinal propio sobreescrito
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);//llama al constructor completo del padre
        this.resolucion = resolucion;
        this.tdt = tdt;
        super.precioFinal();//aplica el método de precioFinal del padre
        precioFinal();//aplica el método de precioFinal propio sobreescrito
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
