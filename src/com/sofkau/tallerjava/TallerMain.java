package com.sofkau.tallerjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

//        //Ejercicio 3
//        System.out.print("Ingrese el radio del círculo: ");
//        double radio = Double.parseDouble(sc.nextLine());
//        double area = Funciones.areaCirculo(radio);
//        System.out.println("El área del círculo es " + area);
//
//        //Ejercicio 4
//        System.out.print("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(sc.nextLine());
//        double precioConIVA = Funciones.agregarIVA(precio);
//        System.out.println("El precio con IVA es : " + precioConIVA);
//
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
//
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
//
//        //Ejercicio 7
//        System.out.print("Ingrese el número: ");
//        do {
//            if (Funciones.numeroPositivo(Double.parseDouble(sc.nextLine()))) {
//                System.out.println("El número ingresado es mayor o igual a 0");
//                break;
//            } else {
//                System.out.print("El número ingresado no es positivo, intente nuevamente: ");
//            }
//        } while (true);
//
//        //Ejercicio 8
//        System.out.print("Ingrese un día de la semana sin tildes: ");
//        String dia = sc.nextLine();
//        Funciones.diaLaboral(dia);
//
//        //Ejercicio 9
//        System.out.println("Ingrese su frase");
//        String frase = sc.nextLine();
//        Funciones.reemplazarYConcatenar(frase);
//
//        //Ejercicio 10
//        System.out.println("Ingrese su frase");
//        String frase = sc.nextLine();
//        Funciones.eliminarEspacios(frase);
//
//        //Ejercicio 11
//        System.out.println("Ingrese su frase");
//        String frase = sc.nextLine();
//        Funciones.longitudYContarCaracteres(frase);
//
//        //Ejercicio 12
//        //FIXME: si las palabras son de diferente longitud sale error
//        System.out.print("Ingrese la palabra 1 :");
//        String palabra1 = sc.nextLine();
//        System.out.print("Ingrese la palabra 2 :");
//        String palabra2 = sc.nextLine();
//        Funciones.compararDosPalabras(palabra1, palabra2);
//
//        //Ejercicio 13
//        Funciones.fechaYHoraActual();
//
//        //Ejercicio 14
//        System.out.print("Ingrese el número inicial: ");
//        int numero = Integer.parseInt(sc.nextLine());
//        Funciones.hastaMil(numero);
//
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
//
//        //Ejercicio 16
//        Funciones.ejercicio16();
//
//        //Ejercicio 17
//        Funciones.ejercicio17();
//
//        //Ejercicio 18
//        ArrayList <Serie> series = new ArrayList<>();
//        ArrayList <Videojuego> videojuegos = new ArrayList<>();
//        Serie TBBT = new Serie("The big bang theory", 12, "Sitcom", "Chuck Lorre");
//        Serie friends = new Serie("Friends", 10, "Sitcom", "David Crane & Marta Kauffman");
//        Serie vikings = new Serie("Vikings", 6, "Action", "Michael Hirst");
//        Serie you = new Serie("You", "Greg Berlanti & Sera Gamble");
//        Serie LCDP = new Serie("La casa de papel", "Álex Pina");
//        series.add(TBBT);
//        series.add(friends);
//        series.add(vikings);
//        series.add(you);
//        series.add(LCDP);
//
//        Videojuego gtav = new Videojuego("Grand Theft Auto V", 50, "Rockstar");
//        Videojuego GoW = new Videojuego("God of War", 40, "Santa Monica Studio");
//        Videojuego farCry6 = new Videojuego("Far Cry 6", 25, "Ubisoft");
//        Videojuego ACV = new Videojuego("Assassin's Creed: Valhala", 130, "Ubisoft");
//        Videojuego hitman3 = new Videojuego("Hitman 3", 15);
//        videojuegos.add(gtav);
//        videojuegos.add(GoW);
//        videojuegos.add(farCry6);
//        videojuegos.add(ACV);
//        videojuegos.add(hitman3);
//
//        //entregar videojuegos y series
//        for (int i = 0; i < 5; i += 2) {
//            series.get(i).entregar();
//            videojuegos.get(i).entregar();
//        }
//        //contar cuántos y cuáles hay entregados:
//        int seriesEntregadas = 0;
//        int juegosEntregados = 0;
//        System.out.println("Seris entregadas:");
//        for (Serie s : series) {
//            if (s.isEntregado()) {
//                System.out.println(s.getTitulo());
//                seriesEntregadas++;
//            }
//        }
//        System.out.println("En total hay " + seriesEntregadas + " series entregadas");
//
//        System.out.println("Videojuegos entregados:");
//        for (Videojuego v : videojuegos) {
//            if (v.isEntregado()) {
//                System.out.println(v.getTitulo());
//                juegosEntregados++;
//            }
//        }
//        System.out.println("En total hay " + juegosEntregados + " videojuegos entregados");
//
//        //serie con más temporadas
//        int indexSerieMayor = 0;
//        for (int i = 0; i < series.size()-1; i++) {
//            if (series.get(i).compareTo(series.get(indexSerieMayor)) == 1){
//                indexSerieMayor = i;
//            }
//        }
//        System.out.println("La serie con más temporadas es:");
//        System.out.println(series.get(indexSerieMayor).toString());
//        //juego con más horas estimadas
//        int indexJuegoMayor = 0;
//        for (int i = 0; i < videojuegos.size()-1; i++) {
//            if (videojuegos.get(i).compareTo(videojuegos.get(indexJuegoMayor)) == 1){
//                indexJuegoMayor = i;
//            }
//        }
//        System.out.println("El videojuego con más horas estimadas es:");
//        System.out.println(videojuegos.get(indexJuegoMayor).toString());
    }
}
