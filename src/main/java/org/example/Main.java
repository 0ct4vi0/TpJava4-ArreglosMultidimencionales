package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//                                                          EJERCICIO 1
//        Scanner sc = new Scanner(System.in);
//        String[][] paises = new String[4][4];
//        for (int i = 0; i < paises.length; i++) {
//            System.out.println("ingrese un pais");
//            paises[i][i] = sc.nextLine();
//            for (int j = 0; j < paises[0].length; j++) {
//                System.out.println("ingrese tres ciudades");
//                paises[i][j] = sc.nextLine();
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Pais: " + paises[i][i]);
//            for (int j = 0; j < 4; j++) {
//                System.out.println("Ciudades: " + paises[i][j]);
//            }
//        }

//                                                           EJERCICIO 2
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ingrese el valor X: ");
//        int x = sc.nextInt();
//        System.out.println("ingrese ek valor Y: ");
//        int y = sc.nextInt();
//        int [][] a1 = new int [x][y];
//        int [][] a2 = new int [x][y];
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.print("Posicion: " + i + ", " + j + ": ");
//                a1[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.print("Posicion: " + i + ", " + j + ": ");
//                a2[i][j] = sc.nextInt();
//            }
//        }
//        int[][] resultado = multArray(a1,a2);
//        for (int i = 0; i < resultado.length; i++) {
//            for (int j = 0; j < resultado[i].length; j++) {
//                System.out.print("la multiplicacion de los array es igual a: "+resultado);
//            }
//        }
//
//    }
//    public static int[][] multArray(int [][]a1, int[][] a2){
//        int fila= a1[0].length;
//        int col = a2[0].length;
//        int [][] resultado = new int[fila][col];
//        for (int i = 0; i < fila; i++) {
//            for (int j = 0; j < col; j++) {
//                resultado[i][j] = 0;
//                for (int k = 0; k < col; k++) {
//                    resultado[i][j] += a1[i][k] * a2[k][j];
//                }
//            }
//        }
//        return resultado;

//                                                          EJERCICIO 3

//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.println("ingrese un nuemro mayor a 3 pero menor a 10");
//            int X= sc.nextInt();
//            if (X < 3 || X >10){
//                System.out.println("numero ingresado es incorrecto, por favor intente otra vez");
//            } else{
//                System.out.println("el numero esta dentro del rango,proseguimos con el ejercicio");
//                System.out.println();
//                System.out.println("completando la matriz:");
//                int [][] M1 = new int [X][X];
//                for (int i = 0; i < X; i++) {
//                    for (int j = 0; j < X; j++) {
//                        System.out.print("Posicion: " + i + ", " + j + ": ");
//                        M1[i][j] = sc.nextInt();
//                    }
//                }
//                System.out.println();
//                System.out.println("nuestra matiz es: ");
//                for (int i = 0; i < X; i++) {
//                    for (int j = 0; j < X; j++) {
//                        System.out.print(M1[i][j]);
//                    }
//                }
//                System.out.println();
//                int suma=0;
//                int []sumaAr = new int[X];
//                for (int i = 0; i < X; i++) {
//                    for (int j = 0; j < X; j++) {
//                        suma+=M1[i][j];
//                    }
//                }
//                for (int i = 0; i < X; i++) {
//                    for (int j = 0; j < X; j++) {
//                        sumaAr[i]=suma;
//                    }
//                }
//                System.out.println("la suma de las columnas de la matriz es: ");
//                for (int i = 0; i < X; i++) {
//                    for (int j = 0; j < X; j++) {
//                        System.out.print(sumaAr[i]);
//                    }
//                }
//                break;
//            }
//        }
    }
}

