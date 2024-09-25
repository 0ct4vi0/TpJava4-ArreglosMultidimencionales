package org.example;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pedido();


    }


    public static  void pedido{
        Scanner sc = new Scanner(System.in);
        int [][] num = new int[1][1];
        for (int i=0;i< num.length;i++){
            System.out.println("ingrese un numero entero: ");
            num[i][i] = sc.nextInt();
            for (int j=0;j< num.length;j++){
                System.out.println("ingrese otro numero entero: ");
            }
        }
    }
}

