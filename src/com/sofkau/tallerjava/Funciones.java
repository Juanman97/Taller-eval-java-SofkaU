package com.sofkau.tallerjava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sofkau.tallerjava.TallerMain.sc;

public class Funciones {

    //Ejercicio 1 y 2
    public static void numeroMayor (int numero1, int numero2){
        if (numero1 > numero2) {
            System.out.println("El mayor es " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El mayor es " + numero2);
        } else {
            System.out.println("Los números son iguales");
        }
    }
    //Ejercicio 3
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    //Ejercicio 4
    public static double agregarIVA(double precio) {
        final double IVA = precio * 0.21;
        return precio + IVA;
    }
    //Ejercicio 5
    public static List<ArrayList<Integer>> parImparWhile(int numInicial, int numFinal) {
        List<ArrayList<Integer>> resultado = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        int i = numInicial;
        while (i <= numFinal) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }

            i++;
        }

        resultado.add(pares);
        resultado.add(impares);
        return resultado;
    }
    //Ejercicio 6
    public static List<ArrayList<Integer>> parImparFor(int numInicial, int numFinal) {
        List<ArrayList<Integer>> resultado = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        for (int i = numInicial; i <= numFinal; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }
        resultado.add(pares);
        resultado.add(impares);
        return resultado;
    }
    //Ejercicio 7
    public static boolean numeroPositivo(double numero) {
        return numero >= 0;
    }
    //Ejercicio 8
    public static void diaLaboral(String dia) {
        dia = dia.toLowerCase();
        switch (dia) {
            case "lunes":
                System.out.println("Es un día laboral");
                break;
            case "martes":
                System.out.println("Es un día laboral");
                break;
            case "miercoles":
                System.out.println("Es un día laboral");
                break;
            case "jueves":
                System.out.println("Es un día laboral");
                break;
            case "viernes":
                System.out.println("Es un día laboral");
                break;
            case "sabado":
                System.out.println("No es un día laboral");
                break;
            case "domingo":
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("No es un día válido");
                break;
        }
    }
    //Ejercicio 9
    public static void reemplazarYConcatenar(String frase) {
        String fraseInicial = "La sonrisa sera la mejor arma contra la tristeza";
        fraseInicial = fraseInicial.replace("a", "e"); //reemplazar a por e
        System.out.println(fraseInicial);
        String fraseFinal = fraseInicial + frase; //concatenar con frase nueva
        System.out.println(fraseFinal);
    }
    //Ejercicio 10
    public static void eliminarEspacios(String frase) {
        System.out.println(frase.replace(" ", ""));
    }
    //Ejercicio 11
    public static void longitudYContarCaracteres(String frase) {
        frase = frase.toLowerCase();
        System.out.println(frase.length()); //longitud
        String vocales = "aeiou"; //para buscar char a char si está en el string de vocales
        for (char a : frase.toCharArray()) {
            if (!vocales.contains(String.valueOf(a))) {
                frase = frase.replace(String.valueOf(a), "");
            }
        }
        System.out.println("La frase tiene " + frase.length() + " vocales");
    }
    //Ejercicio 12
    public static void compararDosPalabras(String palabra1, String palabra2) {
        String palabraMenor;
        String difPalabra1 = "";
        String difPalabra2 = "";
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            if (palabra1.length() >= palabra2.length()) {
                palabraMenor = palabra2;
            } else {
                palabraMenor = palabra1;
            }
            for (int i = 0; i < palabraMenor.length(); i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    difPalabra1 += palabra1.charAt(i);
                    difPalabra2 += palabra2.charAt(i);
                }
            }
            System.out.println("Diferencias:");
            System.out.println("Palabra 1: " + difPalabra1);
            System.out.println("Palabra 2: " + difPalabra2);
        }
    }
    //Ejercicio 13
    public static void fechaYHoraActual(){
        LocalDateTime fechaActual = LocalDateTime.now(); //fecha y hora actual formato predeterminado
        String formatoFecha = "(yyyy/MM/dd)(HH:mm:ss)"; //formato requerido
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(formatoFecha); //crear el formato
        String fechaFormateada = fechaActual.format(formato); //aplicar formato
        System.out.println(fechaFormateada);
    }
    //Ejercicio 14
    public static void hastaMil(int numero) {
        while (numero <= 1000) {
            System.out.println(numero);
            numero += 2;
        }
    }
    //Ejercicio 16
    public static void ejercicio16(){
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad de la persona: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el sexo de la persona (H/M): ");
        char sexo = (sc.nextLine()).charAt(0);
        System.out.print("Ingrese el peso de la persona: ");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese la altura de la persona: ");
        double altura = Double.parseDouble(sc.nextLine());

        Persona personaCompleta = new Persona(nombre, edad, sexo, peso, altura);
        Persona personaSencilla = new Persona(nombre, edad, sexo);
        Persona personaVacia = new Persona(); //se agregan sus atributos con los setters:
        personaVacia.setNombre(nombre);
        personaVacia.setEdad(edad);
        personaVacia.setAltura(altura);
        personaVacia.setPeso(peso);

        int imc;
        String mayor= "";
        //PersonaCompleta:
        System.out.println("Persona Completa:");
        imc = personaCompleta.calcularIMC();
        switch (imc) {
            case -1:
                System.out.println("Por debajo del peso ideal");
                break;
            case 0:
                System.out.println("En el peso ideal");
                break;
            case 1:
                System.out.println("En sobrepeso");
                break;
            default:
                break;
        }

        mayor = (personaCompleta.esMayorDeEdad()) ? "es" : "no es";
        System.out.println("La persona " + mayor + " mayor de edad");

        System.out.println(personaCompleta);

        //PersonaSencilla:
        System.out.println("Persona Sencilla:");
        imc = personaSencilla.calcularIMC();
        switch (imc) {
            case -1:
                System.out.println("Por debajo del peso ideal");
                break;
            case 0:
                System.out.println("En el peso ideal");
                break;
            case 1:
                System.out.println("En sobrepeso");
                break;
            default:
                break;
        }

        mayor = (personaSencilla.esMayorDeEdad()) ? "es" : "no es";
        System.out.println("La persona " + mayor + " mayor de edad");

        System.out.println(personaSencilla);

        //PersonaVacia:
        System.out.println("Persona Vacía:");
        imc = personaVacia.calcularIMC();
        switch (imc) {
            case -1:
                System.out.println("Por debajo del peso ideal");
                break;
            case 0:
                System.out.println("En el peso ideal");
                break;
            case 1:
                System.out.println("En sobrepeso");
                break;
            default:
                break;
        }

        mayor = (personaVacia.esMayorDeEdad()) ? "es" : "no es";
        System.out.println("La persona " + mayor + " mayor de edad");

        System.out.println(personaVacia);
    }
    //Ejercicio 17
    public static void ejercicio17(){

        Lavadora lav1 = new Lavadora(100, "negro", 'D', 90, 35);
        Lavadora lav2 = new Lavadora(80, "VERDE", 'C', 79, 30);
        Lavadora lav3 = new Lavadora(70, "AZUL", 'B', 40, 40);
        Lavadora lav4 = new Lavadora(50, 30);
        Lavadora lav5 = new Lavadora(60, 35);

        Television tv1 = new Television(100, "gris", 'A', 19, 32, true);
        Television tv2 = new Television(200, "negro", 'A', 60, 41, true);
        Television tv3 = new Television(150, "blanco", 'A', 55, 50, false);
        Television tv4 = new Television(60, 52);
        Television tv5 = new Television(40, 31);

        ArrayList <Electrodomestico> electrodomesticos = new ArrayList<>(Arrays.asList(lav1, lav2, lav3, lav4, lav5, tv1, tv2, tv3, tv4, tv5));
        double precioTv = 0;
        double precioLav = 0;
        double precioTotal = 0;
        for (Electrodomestico electrodomestico : electrodomesticos){
            if (electrodomestico instanceof Lavadora) { //para saber si es tv o lavadora
                precioLav += electrodomestico.precioBase;
            } else if (electrodomestico instanceof Television) {
                precioTv += electrodomestico.precioBase;
            }
            precioTotal += electrodomestico.precioBase;
        }

        System.out.println("El precio de las lavadoras es: " + precioLav);
        System.out.println("El precio de los televisores es: " + precioTv);
        System.out.println("El precio total es: " + precioTotal);
    }

}
