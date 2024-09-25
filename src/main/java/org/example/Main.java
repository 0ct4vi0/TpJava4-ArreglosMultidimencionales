package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor X: ");
        int x = sc.nextInt();
        System.out.println("ingrese ek valor Y: ");
        int y = sc.nextInt();
        int [][] a1 = new int [x][y];
        int [][] a2 = new int [x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Posicion: " + i + ", " + j + ": ");
                a1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Posicion: " + i + ", " + j + ": ");
                a2[i][j] = sc.nextInt();
            }
        }
        int[][] resultado = multArray(a1,a2);
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print("la multiplicacion de los array es igual a: "+resultado);
            }
        }

    }
    public static int[][] multArray(int [][]a1, int[][] a2){
        int fila= a1[0].length;
        int col = a2[0].length;
        int [][] resultado = new int[fila][col];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < col; k++) {
                    resultado[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }
        return resultado;
    }
}

