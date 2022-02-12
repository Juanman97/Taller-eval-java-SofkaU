package com.sofkau.tallerjava;

public class Videojuego implements Entregable {
    private String titulo = "";
    private double horasEstimadas = 10;
    boolean entregado = false;
    private String compania = "";

    //constructores
    public Videojuego() {
    }

    public Videojuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, double horasEstimadas, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.compania = compania;
    }

    //métodos
    public String getTitulo() {
        return titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", compania='" + compania + '\'';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego v = (Videojuego) a; //cast de objeto a videojuego
        if (v != null) { //comprueba que el videojuego esté instanciado
            if (this.horasEstimadas >= v.getHorasEstimadas()) { //compara horas
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
}
