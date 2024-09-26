package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("ingrese un nuemro mayor a 3 pero menor a 10");
            int X= sc.nextInt();
            if (X < 3 || X >10){
                System.out.println("numero ingresado es incorrecto, por favor intente otra vez");
            } else{
                System.out.println("el numero esta dentro del rango,proseguimos con el ejercicio");
                System.out.println();
                System.out.println("completando la matriz:");
                int [][] M1 = new int [X][X];
                for (int i = 0; i < X; i++) {
                    for (int j = 0; j < X; j++) {
                        System.out.print("Posicion: " + i + ", " + j + ": ");
                        M1[i][j] = sc.nextInt();
                    }
                }
                System.out.println();
                System.out.println("nuestra matiz es: ");
                for (int i = 0; i < X; i++) {
                    for (int j = 0; j < X; j++) {
                        System.out.print(M1[i][j]);
                    }
                }
                System.out.println();
                int suma=0;
                int []sumaAr = new int[X];
                for (int i = 0; i < X; i++) {
                    for (int j = 0; j < X; j++) {
                        suma+=M1[i][j];
                    }
                }
                for (int i = 0; i < X; i++) {
                    for (int j = 0; j < X; j++) {
                        sumaAr[i]=suma;
                    }
                }
                System.out.println("la suma de las columnas de la matriz es: ");
                for (int i = 0; i < X; i++) {
                    for (int j = 0; j < X; j++) {
                        System.out.print(sumaAr[i]);
                    }
                }
                break;
            }
        }
    }
}

