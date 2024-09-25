package org.example;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] paises = new String[4][4];
        for (int i=0;i<paises.length;i++){
            System.out.println("ingrese un pais");
            paises[i][i] = sc.nextLine();
            for (int j=0;j<paises[0].length;j++){
                System.out.println("ingrese tres ciudades");
                paises[i][j] = sc.nextLine();
            }
        }
        for (int i=0;i<4;i++) {
            System.out.println("Pais: " + paises[i][i]);
            for (int j = 0; j < 4; j++) {
                System.out.println("Ciudades: " + paises[i][j]);
            }
        }
    }
}

