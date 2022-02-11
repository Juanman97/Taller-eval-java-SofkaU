package com.sofkau.tallerjava;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String DNI = "";
    private char sexo;
    private double peso = 0;
    private double altura = 0;

    public Persona() {
        generaDNI();
        this.sexo = 'H';
    }

    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this(nombre, edad, sexo);
        this.peso = peso;
        this.altura = altura;
    }

    protected int calcularIMC(){
        final int resultado;
        double IMC = peso / Math.pow(altura, 2);
        if (IMC < 20){
            resultado = -1; //por debajo del ideal
        } else if (IMC > 25) {
            resultado = 1; //sobrepeso
        } else {
            resultado = 0; //peso ideal
        }
        return resultado;
    }

    protected boolean esMayorDeEdad() {
        return (this.edad >= 18);
    }

    protected void comprobarSexo(char sexo) {
        this.sexo = (this.sexo == sexo) ? this.sexo :'H';
        System.out.println("el sexo es " + this.sexo);
    }

    private void generaDNI(){
        for (int i = 0; i < 8; i++) {
            this.DNI += "" + (int)Math.floor(Math.random() * 10);
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
