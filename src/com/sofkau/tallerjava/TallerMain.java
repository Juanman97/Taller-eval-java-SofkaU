package com.sofkau.tallerjava;

import java.net.SocketTimeoutException;
import java.nio.file.attribute.PosixFileAttributes;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

public class TallerMain {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        //Ejercicio 1
//        Funciones.numeroMayor(-1,-2);
//
//        //Ejercicio 2
//        System.out.print("Ingresar el primer número: ");
//        int num1 = Integer.parseInt(sc.nextLine());
//        System.out.print("Ingresar el segundo número: ");
//        int num2 = Integer.parseInt(sc.nextLine());
//        Funciones.numeroMayor(num1, num2);
//
//        //Ejercicio 3
//        System.out.print("Ingrese el radio del círculo: ");
//        double radio = Double.parseDouble(sc.nextLine());
//        double area = Funciones.areaCirculo(radio);
//        System.out.println("El área del círculo es " + area);

//        //Ejercicio 4
//        System.out.print("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(sc.nextLine());
//        double precioConIVA = Funciones.agregarIVA(precio);
//        System.out.println("El precio con IVA es : " + precioConIVA);

//        //Ejercicio 5
//        List<ArrayList<Integer>> resultado = Funciones.parImparWhile(1, 100);
//        System.out.println("Números pares: ");
//        for (int i : resultado.get(0)) {
//            System.out.print(i + ", ");
//        }
//        System.out.println("");
//        System.out.println("Números impares: ");
//        for (int i : resultado.get(1)) {
//            System.out.print(i + ", ");
//        }

//        //Ejercicio 6
//        List<ArrayList<Integer>> resultado = Funciones.parImparFor(1, 100);
//        System.out.println("Números pares: ");
//        for (int i : resultado.get(0)) {
//            System.out.print(i + ", ");
//        }
//        System.out.println("");
//        System.out.println("Números impares: ");
//        for (int i : resultado.get(1)) {
//            System.out.print(i + ", ");
//        }

//        //Ejercicio 7
//        System.out.print("Ingrese el número: ");
//        do {
//            double positivo = Funciones.numeroPositivo(Double.parseDouble(sc.nextLine()));
//            if (positivo != -1) {
//                System.out.println("El número " + positivo + " es mayor o igual a 0");
//                break;
//            } else {
//                System.out.print("El número ingresado no es positivo, intente nuevamente: ");
//            }
//        } while (true);

//        //Ejercicio 8
//        System.out.print("Ingrese un día de la semana sin tildes: ");
//        String dia = sc.nextLine();
//        Funciones.diaLaboral(dia);

//        //Ejercicio 9
//        System.out.println("Ingrese su frase");
//        String frase = sc.nextLine();
//        Funciones.reemplazarYConcatenar(frase);

//        //Ejercicio 10
//        System.out.println("Ingrese su frase");
//        String frase = sc.nextLine();
//        Funciones.eliminarEspacios(frase);

//        //Ejercicio 11
//        System.out.println("Ingrese su frase");
//        String frase = sc.nextLine();
//        Funciones.longitudYContarCaracteres(frase);

//        //Ejercicio 12
//        //FIXME: si las palabras son de diferente longitud sale error
//        System.out.print("Ingrese la palabra 1 :");
//        String palabra1 = sc.nextLine();
//        System.out.print("Ingrese la palabra 2 :");
//        String palabra2 = sc.nextLine();
//        Funciones.compararDosPalabras(palabra1, palabra2);

//        //Ejercicio 13
//        Funciones.fechaYHoraActual();

//        //Ejercicio 14
//        System.out.print("Ingrese el número inicial: ");
//        int numero = Integer.parseInt(sc.nextLine());
//        Funciones.hastaMil(numero);

//        //Ejercicio 15
//        while (true) {
//            System.out.println("****** GESTION CINEMATOGRÁFICA ********");
//            System.out.println("1-NUEVO ACTOR");
//            System.out.println("2-BUSCAR ACTOR");
//            System.out.println("3-ELIMINAR ACTOR");
//            System.out.println("4-MODIFICAR ACTOR");
//            System.out.println("5-VER TODOS LOS ACTORES");
//            System.out.println("6- VER PELICULAS DE LOS ACTORES");
//            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
//            System.out.println("8-SALIR");
//
//            int input = Integer.parseInt(sc.nextLine());
//            if (input == 8) {
//                break;
//            } else if ((input < 1) || (input > 8)) {
//                System.out.println("Número no válido");
//            }
//        }

//        //Ejercicio 16
//        Funciones.ejercicio16();

//        //Ejercicio 17
//        Funciones.ejercicio17();

        }
}
