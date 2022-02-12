package com.sofkau.tallerjava;

public class Serie implements Entregable {
    private String titulo = "";
    private int numTemporadas = 3;
    boolean entregado = false;
    private String genero = "";
    private String creador = "";

    //constructores
    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    //métodos

    public String getTitulo() {
        return titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'';
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
        //compara el objeto que la llama con el objeto en los parámetros
        Serie s = (Serie) a; //cast de Objeto a Serie
        if (s != null) { //comprueba que la serie esté instanciada
            if (this.numTemporadas >= s.getNumTemporadas()) { //compara temporadas
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
}
