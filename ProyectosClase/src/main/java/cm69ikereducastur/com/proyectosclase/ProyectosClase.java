/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cm69ikereducastur.com.proyectosclase;

import java.lang.reflect.Array;
import static java.time.temporal.TemporalAdjusters.next;
import java.util.Scanner;

/**
 *
 * @author 1dawd23
 */
public class ProyectosClase {

    public static void main(String[] args) {
        
        //cuadrado();
        //rombo();
        //arrays1Dim();
        arrays2Dim();
    }
    
    //REPASO
    public static void cuadrado (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Filas:");
        int filas = sc.nextInt();
        System.out.println("Columnas:");
        int columnas = sc.nextInt();
        //4 filas, 3 columnas.
        for (int i = 1; i <= filas; i++) {
            
            for (int c = 1; c <= columnas; c++) {
                System.out.print("* ");
            }
            
            System.out.println("");
        }
        
        
        
        
    }
    
    public static void rombo(){
        Scanner sc = new Scanner (System.in);
        System.out.println("altura:");
        int altura = sc.nextInt();
        //5 = altura.
        int espacio = altura-1; //espacio = 4
        int asteriscos = 1;
                //hacer triángulo
        for (int i = 1; i <= altura; i++) {
            
            for (int j = 1; j <= espacio; j++) {
                
                System.out.print(" ");
                
                for (int k = 1; k <= asteriscos; k++) {
                    
                    System.out.print("* ");
                    
                }
                
            }
            System.out.println();
            espacio--;
            asteriscos+=2;
        }
        
        //hacer un rombo
         asteriscos-=4;
        for (int i = 1; i < altura; i++) {
            
            for (int j = 0; j >= espacio; j++) {
                
                System.out.print("");
                
                for (int k = 0; k <= asteriscos; k++) {
                    
                    System.out.print("* ");
                    
                }
                
            }
            espacio++;
            asteriscos-=2;
        }
        System.out.println("");
    }
        
    public static void arrays1Dim(){
        /*la primera posición es siempre 0.
        int [] faltas = new int [25]; 
        si lo hicieramos así, tenemos 25 ceros y
        deberemos de ir calificandolo uno por uno. Es pq el array está vacío.
        */
        int faltas [] = {0,20,0,5,6,8,0,3,11,5,0,0,0,4,5,6,8,20,1,0,0,0,2,4,5,0,0,8,6,0};
        
        for (int i = 0; i < faltas.length; i++) {
            
            System.out.print(faltas[i] + " ");
            
        }
        
        for (int i = 0; i < faltas.length; i++) {
                faltas[i]++;
                
            }
        System.out.println("");
        for (int i = 0; i < faltas.length; i++) {
                System.out.print(faltas[i]+ " ");
                
            }
        
        int totFaltas = 0;
        for (int i = 0; i < faltas.length; i++) {
                totFaltas+=faltas[i];
                
            }
        double mediaFaltas = totFaltas/faltas.length; 
        System.out.println("\nLa media de faltas es: " + mediaFaltas);
        
        //cálculo del máximo.
        
        int maxFaltas = faltas[0];
        
        for (int i = 0; i < faltas.length; i++) {
            
            if (faltas[i] > maxFaltas) {
                maxFaltas = faltas[i];
            }
                
        }
        
        System.out.println("\nEl máximo de faltas es: " + maxFaltas
        + " lo tienen los alumos que están en la posición: ");
        
        for (int i = 0; i < faltas.length; i++) {
            
            if (faltas[i] == maxFaltas) {
                System.out.println(i + " ");
            }
            
            
        }
        
        int minFaltas;
        maxFaltas = minFaltas = faltas[0];
        for (int i = 0; i < faltas.length; i++) {
            maxFaltas = Math.max(maxFaltas, faltas[i]); //lo mismo q lo del "if", pero de forma más compacta.
            minFaltas = Math.min(minFaltas, faltas[i]);
            
        }
                
    }
    
    public static void arrays2Dim(){
        
        int[][]faltasCurso ={{1,0,0,5,6,8,0,3,11,5,0,12,0,4,5,6,8,20,1,0,9,0,2,4,5,0,0,8,6,0},
                             {0,0,2,5,6,5,0,3,0,5,0,0,0,4,5,6,8,20,1,0,0,0,2,4,5,3,0,8,6,0},
                             {0,2,0,5,6,8,0,3,6,5,0,5,0,4,5,6,8,20,1,0,12,0,2,4,5,0,0,8,6,0},
                             {0,0,0,5,6,8,0,3,12,5,0,0,0,4,5,6,8,20,1,0,3,0,2,4,5,0,0,8,8,0},
                             {0,33,0,5,6,8,0,3,6,5,0,4,0,4,5,6,8,20,1,0,5,0,2,4,5,0,7,8,4,0},
                             {0,0,0,5,6,11,0,3,14,5,0,7,0,4,5,6,8,20,1,0,14,0,2,4,5,0,0,8,6,0},
                             {0,7,0,5,6,13,0,3,12,5,0,0,0,4,5,6,8,20,1,0,8,0,2,4,5,12,0,5,6,0},
                             {0,0,0,5,6,8,0,3,9,5,0,21,0,4,5,6,4,11,19,0,5,0,2,4,5,0,0,8,6,0},
                             {0,9,0,5,6,8,0,3,11,5,0,0,0,4,5,6,8,20,1,0,0,0,2,7,5,4,0,8,6,0}};
                             String[] meses ={"OCTUBRE", "NOVIEMBRE", "DICIEMBRE", "ENERO", "FEBRERO", 
                                 "MARZO", "ABRIL", "MAYO", "JUNIO"}; //para que nos diga los meses.
                             String[] alumnos = {"PEPE", "PEPA", "LUIS", "LUISA", "RAFAEL", "RAFAELA",  
                         "CARLOS", "CARLOTA", "ENOL", "EVA","ADRIAN", "ADRIANA", "LEO", "LUCAS", "ANA"};
                             
                             Scanner sc = new Scanner (System.in);
                             
        
       
        System.out.println(faltasCurso[5][4]+ "\n\n"); //Esto es una coordenada
    
        //Bucle para coger todas las faltas del mes (filas).
        for (int f = 0; f < faltasCurso.length; f++) {
            
            for (int c = 0; c < faltasCurso[f].length; c++) {
                System.out.print(faltasCurso[f][c] + ", ");
            }
            System.out.println("");
        }
        
        //Bucle para coger todas las faltas de un alumno (columnas).
        for (int c = 0; c < faltasCurso.length; c++) {
            int totalAlumno = 0; /*ponemos la variable 
                aquí para que se reinicie la variable. */
            
            for (int f = 0; f < faltasCurso.length; f++) {
                
                System.out.print(faltasCurso[f][c] + ", ");
                totalAlumno+=faltasCurso[f][c];
                
            }
            System.out.println("  El total de faltas del alumno/a en la columna " + 
                    c + " es " + totalAlumno);
            System.out.println("");
            
        }
            
        
    //EJERCICIO: PROGRAMA QUE IMPRIME EL TOTAL DE FALTAS POR MES (Y DIGA EL MES).
        /*
        for (int f = 0; f < faltasCurso.length; f++) {
            int totalMes = 0;
            int mediaMes = 0;
            for (int c = 0; c < faltasCurso.length; c++) {
                
                System.out.print(faltasCurso[f][c] + ", ");
                totalMes+=faltasCurso[f][c];
                
            }
            System.out.println("Faltas en este mes: " + totalMes + " en la fila " + f);


            mediaMes = totalMes/2;
            System.out.println("Medía de faltas del mes " + meses[f] + " es: " + mediaMes);
                
            System.out.println("");
            
            
        }
        */
        
        
        
        //FALTAS DE UN ALUMNO DEL QUE TECLEAMOS SU NOMBRE
        
        System.out.println("Teclea el nombre del alumno: ");
        String nombre = sc.nextLine();
                
        int posicion = 0;
        for (int p = 0; p < alumnos.length; p++) {
            
            if (nombre.equalsIgnoreCase(alumnos[p])){
                p=posicion; /*si se acaba el bucle, la p la pierdes, 
                              por lo que hay que guardarla en una variable (posición).*/
                
                break; //para romper el bucle.
                
            }            
        }
             if (posicion == -1) {
                
                 System.out.println("EL ALUMNO/A NO EXISTE.");
                 
            } else {
                
                
                System.out.println("Las faltas del alumno " + nombre + " son:");
            
                for (int f = 0; f < faltasCurso.length; f++) {

                    System.out.print(faltasCurso[f][posicion] + ", ");
                     
                 }
            }
    }
}
