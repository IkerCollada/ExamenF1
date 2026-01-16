/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cm69ikereducastur.com.f1examen;

import java.util.Scanner;

/**
 *
 * @author 1dawd23
 */
public class F1examen {

    private static int[][] puntosF1 = {
        {25, 0, 18, 15, 8, 6, 18, 5, 5, 0},
        {18, 25, 15, 25, 10, 3, 7, 15, 15, 0},
        {15, 18, 25, 18, 15, 10, 15, 0, 18, 25},
        {10, 15, 4, 10, 18, 15, 3, 18, 25, 18},
        {0, 0, 7, 0, 8, 25, 18, 25, 8, 15},
        {8, 0, 10, 0, 8, 0, 25, 6, 6, 10},
        {6, 0, 8, 6, 8, 0, 4, 8, 10, 0}
    };

    private static String[] pilotos = {"Russel", "Piastri", "Norris", 
        "Leclerq", "Sainz", "Alonso", "Gasly"};
    private static String[] carreras = {"Australia", "Canada", "Italia", "España", 
        "Austria", "Gran Bretaña", "Holanda", "Miami", "Las Vegas", "Quatar"};
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //ejercicio1();
        //System.out.println("");
        //ejercicio2();
        //System.out.println("");
        //ejercicio3();
        //System.out.println("");
        ejercicio4(); //carreras donde haya hecho podio
        System.out.println("");
        ejercicio5();
    }

    public static void ejercicio1() {
        //Imprimiendo filas
        System.out.println("IMPRIMIENDO POR FILAS:");
        for (int x = 0; x < puntosF1.length; x++) {
            
            for (int y = 0; y < puntosF1.length; y++) {
                
                System.out.print(puntosF1[x][y] + ", ");
                
            }
            System.out.println("");
        }
        System.out.println("AHORA POR COLUMNAS:");
        //Imprimiendo columnas
        for (int x = 0; x < puntosF1.length; x++) {
            
            for (int y = 0; y < puntosF1.length; y++) {
                
                System.out.print(puntosF1[y][x] + ", ");
                
            }
            System.out.println("");
        }
    }

    public static void ejercicio2() {
        System.out.println("Piloto:");
        String nombre = sc.nextLine();
        int posicion = 0;
        for (int p = 0; p < pilotos.length; p++) {
            
            if (nombre.equalsIgnoreCase(pilotos[p])) {
                posicion = p;
                break;
            }
        }
        if (posicion == -1) {
                System.out.println("NO EXISTE TAL PILOTO");
        } else{
                
            for (int x = 0; x < puntosF1.length; x++) {
                System.out.print(puntosF1[posicion][x] + ", ");
            }
        }
    }

    public static void ejercicio3() {
        //Total puntos por cada piloto + el piloto con más puntos.
        int maxPuntos = 0;
        String pilotoConMasPuntos = "";
        for (int x = 0; x < pilotos.length; x++) {
            int puntosPiloto = 0;
            for (int y = 0; y < carreras.length; y++) {
                puntosPiloto+=puntosF1[x][y];
            }
            if (puntosPiloto>maxPuntos) {
                maxPuntos = puntosPiloto;
                pilotoConMasPuntos = pilotos[x];
            }
            System.out.println(pilotos[x] + 
                    " ha obtenido " + puntosPiloto + " puntos.");
        }
        System.out.println("\nEl piloto con más puntos es: "
        + pilotoConMasPuntos + " con " + maxPuntos);
    }

    public static void ejercicio4() {
        //revisar bien.
        for (int x = 0; x < pilotos.length; x++) {
            int carrerasGanadas = 0;
            for (int y = 0; y < carreras.length; y++) {
                if (25 == puntosF1.length) {
                    carrerasGanadas++;
                }
                System.out.println(pilotos[x] + " tiene " + carrerasGanadas);
            }
            System.out.println("");
        }
    }

    public static void ejercicio5() {

    }
}
