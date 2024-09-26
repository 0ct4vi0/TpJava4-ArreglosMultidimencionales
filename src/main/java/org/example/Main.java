package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("ingrese un nuemro mayor a 4 pero menor a 10");
            int X= sc.nextInt();
            int [][] M1 = new int [X][X];
            if (X < 4 || X >10){
                System.out.println("numero ingresado es incorrecto, por favor intente otra vez");
            } else{
                System.out.println("el numero esta dentro del rango,proseguimos con el ejercicio");
                System.out.println();
                while (true){
                    System.out.println("Porfavor, elija una de las opciones: ");
                    System.out.println(" 1) Rellenar la matriz de números(OBLIGATORIO) " +
                                        "2) Suma de una fila de la matriz " +
                                        "3) Suma de una columna de la matriz " +
                                        "4) Sumar la diagonal principal " +
                                        "5) Sumar la diagonal inversa " +
                                        "6) La media de todos los valores de la matriz)"+
                                        "7) Salir");
                    int option= sc.nextInt();
                    if (option==7){
                        System.out.println("gracias por participar");
                        break;
                    }else if (option!=1){
                        System.out.println("primero tiene que rellenar el array primero");
                    }else{
                        switch (option){
                            case 1:
                                for (int i = 0; i < X; i++) {
                                    for (int j = 0; j < X; j++) {
                                        System.out.print("Posicion: " + i + ", " + j + ": ");
                                        M1[i][j] = sc.nextInt();
                                    }
                                }
                            case 2:
                                System.out.println("ingrese la fila que desea sumar");
                                int i = sc.nextInt();
                                int suma = 0;
                                    for (int j = 0; j < X; j++) {
                                         suma += M1[i][j];
                                    }
                                System.out.println("La suma de la fila " + i + " es: " + suma);
                            case 3:
                                System.out.println("ingrese la columna que desea sumar");
                                int j = sc.nextInt();
                                suma = 0;
                                for ( i = 0; i < X; i++) {
                                    suma += M1[i][j];
                                }
                                System.out.println("La suma de la fila " + j + " es: " + suma);
                            case 4:
                                suma = 0;
                                for (i = 0; i < X; i++) {
                                    suma += M1[i][i];
                                }
                                System.out.println("La suma de la diagonal principal es: " + suma);
                            case 5:
                                 suma = 0;
                                for (i = 0; i < X; i++) {
                                    suma += M1[i][X-1-i];
                                }
                                System.out.println("La suma de la diagonal principal es: " + suma);
                            case 6:
                                int total = X * X;
                                suma=0;
                                for (i = 0; i<X; i++) {
                                    for (j = 0; j < X; j++) {
                                        suma += M1[i][X - 1 - i];
                                    }
                                }
                                double media = suma/total;
                                System.out.println("la media de los valores de la matriz es: "+media);
                        }
                    }
                }
            }
            break;
        }
    }
}