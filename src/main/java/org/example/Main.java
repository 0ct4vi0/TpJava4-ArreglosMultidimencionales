package org.example;
import javax.swing.*;
import java.util.Scanner;
public class Main {
    static String[][] golosinas = {
            {"KitKat", "32", "10"},
            {"Chicles", "2", "50"},
            {"Caramelos de Menta", "2", "50"},
            {"Huevo Kinder", "25", "10"},
            {"Chetoos", "30", "10"},
            {"Twix", "26", "10"},
            {"M&M'S", "35", "10"},
            {"Papas Lays", "40", "20"},
            {"Milkybar", "30", "10"},
            {"Alfajor Tofi", "20", "15"},
            {"Lata Coca", "50", "20"},
            {"Chitos", "45", "10"}
    };
    static double montoTotal = 0;

    public static void main(String[] args) {
        menuDeOpciones();
    }

    public static void menuDeOpciones() {
        while (true) {
            System.out.println("Porfavor, elija una de las opciones: ");
            System.out.println("" +
                    "a) Pedir una golosina " +
                    "b) Mostrar golosinas " +
                    "c) Rellenar golosinas " +
                    "d) Salir");
            String option = new Scanner(System.in).nextLine();
            switch (option) {
                case "a":
                    pedirGolosina();
                case "b":
                    System.out.println("las golosinas que quedan son: ");
                    mostrarGolosina();
                case "c":
                    rellenarGolosina();
                case "d":
                    System.out.println("gracias por utilizar nuestra maquina");
                    System.out.println("la cantidad de ventas fueron: " + montoTotal);
                    break;
            }
        }
    }

//Metodo para PEDIR LAS GOLOSINAS----------------

    public static void pedirGolosina() {
        mostrarGolosina();
        System.out.println();
        System.out.println("ingrese la posicion de la golosina");
        int codigo = new Scanner(System.in).nextInt();
        if (codigoIncorrecto(codigo)) {
            System.out.println("Error, el codigo ingresado es incorrecto");
            pedirGolosina();
        }
        int stickActual = Integer.parseInt(golosinas[codigo - 1][2]);
        if (stickActual > 0) {
            golosinas[codigo - 1][2] = Integer.toString(stickActual - 1);
            System.out.println("gracias por su compra" + golosinas[codigo - 1][0] + ".");
            montoTotal += Double.parseDouble(golosinas[codigo - 1][1]);
            menuDeOpciones();
        } else {
            System.out.println("la golosina " + golosinas[codigo - 1][0] + "no posee stock, pro favor seleccione otra golosina");
            pedirGolosina();
        }
    }

    // METODO PARA RELLENAR LAS GOLOSINAS-------------------
    public static void rellenarGolosina() {
        System.out.println("ingrese la clave para ejecutar esta funcion");
        String clave = new Scanner(System.in).nextLine();
        if (clave.equalsIgnoreCase("AdminXYZ")){
            System.out.println("clave correcta");
            while (true) {
                mostrarGolosina();
                System.out.println("ingrese el codigo de la golosina");
                int codigo = new Scanner(System.in).nextInt();
                if (codigoIncorrecto(codigo)) {
                    System.out.println("ERROR;codigo ingresado incorrercto");
                } else {
                    System.out.println("ingrese la cantidad a rellenat");
                    int cantidad = new Scanner(System.in).nextInt();
                    golosinas[codigo - 1][2] = Integer.toString(Integer.parseInt(golosinas[codigo - 1][2] + cantidad));
                    System.out.println("El stock de la golosinas " + golosinas[codigo - 1][0] + " fue actualizado, stock actual: " + golosinas[codigo - 1]);
                    menuDeOpciones();
                }
            }
        }
    }

    //   Metodo para mostrar las golosinas ----------------
    public static void mostrarGolosina() {
        System.out.println();
        for (int i = 0; i < golosinas.length; i++) {
            System.out.println((i + 1) + "\t" + completarConEspacios(golosinas[i][0]) + "\t" + "$" + golosinas[i][i] + "unidades");
            System.out.println("-----------------------------");
        }
        System.out.println("----------------");
    }

    //  Metodo Para completar con ESPACIOS ----------------
    private static String completarConEspacios(String cadena) {
        int cantidadDeEspacios = 25 - cadena.length();
        for (int i = 0; i < cantidadDeEspacios; i++) {
            cadena += (" ");
        }
        return cadena;
    }

    // Metodo de verificacion de CODIGO
    private static boolean codigoIncorrecto(int codigo) {
        if (codigo < 1 || codigo > 12) {
            return false;
        }
        return true;
    }
}