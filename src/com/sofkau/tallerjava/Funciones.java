package com.sofkau.tallerjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Funciones {

    public static void numeroMayor (int numero1, int numero2){
        if (numero1 > numero2) {
            System.out.println("El mayor es " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El mayor es " + numero2);
        } else {
            System.out.println("Los números son iguales");
        }
    }

    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double agregarIVA(double precio) {
        final double IVA = precio * 0.21;
        return precio + IVA;
    }

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

    public static double numeroPositivo(double numero) {
        if (numero >= 0) {
            return numero;
        } else {
            return -1;
        }
    }

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

    public static void reemplazarYConcatenar(String frase) {
        String fraseInicial = "La sonrisa sera la mejor arma contra la tristeza";
        fraseInicial = fraseInicial.replace("a", "e");
        System.out.println(fraseInicial);
        String fraseFinal = fraseInicial + frase;
        System.out.println(fraseFinal);
    }

    public static void eliminarEspacios(String frase) {
        System.out.println(frase.replace(" ", ""));
    }

    public static void longitudYContarCaracteres(String frase) {
        frase = frase.toLowerCase();
        System.out.println(frase.length());
        String vocales = "aeiou";
        for (char a : frase.toCharArray()) {
            if (!vocales.contains(String.valueOf(a))) {
                frase = frase.replace(String.valueOf(a), "");
            }
        }
        System.out.println("La frase tiene " + frase.length() + " vocales");
    }

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
}
