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


//                                                           EJERCICIO 4
//
//        } Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.println("ingrese un nuemro mayor a 4 pero menor a 10");
//            int X= sc.nextInt();
//            int [][] M1 = new int [X][X];
//            if (X < 4 || X >10){
//                System.out.println("numero ingresado es incorrecto, por favor intente otra vez");
//            } else{
//                System.out.println("el numero esta dentro del rango,proseguimos con el ejercicio");
//                System.out.println();
//                while (true){
//                    System.out.println("Porfavor, elija una de las opciones: ");
//                    System.out.println(" 1) Rellenar la matriz de números(OBLIGATORIO) " +
//                                        "2) Suma de una fila de la matriz " +
//                                        "3) Suma de una columna de la matriz " +
//                                        "4) Sumar la diagonal principal " +
//                                        "5) Sumar la diagonal inversa " +
//                                        "6) La media de todos los valores de la matriz)"+
//                                        "7) Salir");
//                    int option= sc.nextInt();
//                    if (option==7){
//                        System.out.println("gracias por participar");
//                        break;
//                    }else if (option!=1){
//                        System.out.println("primero tiene que rellenar el array primero");
//                    }else{
//                        switch (option){
//                            case 1:
//                                for (int i = 0; i < X; i++) {
//                                    for (int j = 0; j < X; j++) {
//                                        System.out.print("Posicion: " + i + ", " + j + ": ");
//                                        M1[i][j] = sc.nextInt();
//                                    }
//                                }
//                            case 2:
//                                System.out.println("ingrese la fila que desea sumar");
//                                int i = sc.nextInt();
//                                int suma = 0;
//                                    for (int j = 0; j < X; j++) {
//                                         suma += M1[i][j];
//                                    }
//                                System.out.println("La suma de la fila " + i + " es: " + suma);
//                            case 3:
//                                System.out.println("ingrese la columna que desea sumar");
//                                int j = sc.nextInt();
//                                suma = 0;
//                                for ( i = 0; i < X; i++) {
//                                    suma += M1[i][j];
//                                }
//                                System.out.println("La suma de la fila " + j + " es: " + suma);
//                            case 4:
//                                suma = 0;
//                                for (i = 0; i < X; i++) {
//                                    suma += M1[i][i];
//                                }
//                                System.out.println("La suma de la diagonal principal es: " + suma);
//                            case 5:
//                                 suma = 0;
//                                for (i = 0; i < X; i++) {
//                                    suma += M1[i][X-1-i];
//                                }
//                                System.out.println("La suma de la diagonal principal es: " + suma);
//                            case 6:
//                                int total = X * X;
//                                suma=0;
//                                for (i = 0; i<X; i++) {
//                                    for (j = 0; j < X; j++) {
//                                        suma += M1[i][X - 1 - i];
//                                    }
//                                }
//                                double media = suma/total;
//                                System.out.println("la media de los valores de la matriz es: "+media);
//                        }
//                    }
//                }
//            }
//            break;
//        }
//        static String[][] golosinas = {
//                {"KitKat", "32", "10"},
//                {"Chicles", "2", "50"},
//                {"Caramelos de Menta", "2", "50"},
//                {"Huevo Kinder", "25", "10"},
//                {"Chetoos", "30", "10"},
//                {"Twix", "26", "10"},
//                {"M&M'S", "35", "10"},
//                {"Papas Lays", "40", "20"},
//                {"Milkybar", "30", "10"},
//                {"Alfajor Tofi", "20", "15"},
//                {"Lata Coca", "50", "20"},
//                {"Chitos", "45", "10"}
//        };
//        static double montoTotal = 0;
//
//        public static void main(String[] args) {
//            menuDeOpciones();
//        }
//
//        public static void menuDeOpciones() {
//            while (true) {
//                System.out.println("Porfavor, elija una de las opciones: ");
//                System.out.println("" +
//                        "a) Pedir una golosina " +
//                        "b) Mostrar golosinas " +
//                        "c) Rellenar golosinas " +
//                        "d) Salir");
//                String option = new Scanner(System.in).nextLine();
//                switch (option) {
//                    case "a":
//                        pedirGolosina();
//                    case "b":
//                        System.out.println("las golosinas que quedan son: ");
//                        mostrarGolosina();
//                    case "c":
//                        rellenarGolosina();
//                    case "d":
//                        System.out.println("gracias por utilizar nuestra maquina");
//                        System.out.println("la cantidad de ventas fueron: " + montoTotal);
//                        break;
//                }
//            }
//        }
//
////Metodo para PEDIR LAS GOLOSINAS----------------
//
//        public static void pedirGolosina() {
//            mostrarGolosina();
//            System.out.println();
//            System.out.println("ingrese la posicion de la golosina");
//            int codigo = new Scanner(System.in).nextInt();
//            if (codigoIncorrecto(codigo)) {
//                System.out.println("Error, el codigo ingresado es incorrecto");
//                pedirGolosina();
//            }
//            int stickActual = Integer.parseInt(golosinas[codigo - 1][2]);
//            if (stickActual > 0) {
//                golosinas[codigo - 1][2] = Integer.toString(stickActual - 1);
//                System.out.println("gracias por su compra" + golosinas[codigo - 1][0] + ".");
//                montoTotal += Double.parseDouble(golosinas[codigo - 1][1]);
//                menuDeOpciones();
//            } else {
//                System.out.println("la golosina " + golosinas[codigo - 1][0] + "no posee stock, pro favor seleccione otra golosina");
//                pedirGolosina();
//            }
//        }
//
//        // METODO PARA RELLENAR LAS GOLOSINAS-------------------
//        public static void rellenarGolosina() {
//            System.out.println("ingrese la clave para ejecutar esta funcion");
//            String clave = new Scanner(System.in).nextLine();
//            if (clave.equalsIgnoreCase("AdminXYZ")){
//                System.out.println("clave correcta");
//                while (true) {
//                    mostrarGolosina();
//                    System.out.println("ingrese el codigo de la golosina");
//                    int codigo = new Scanner(System.in).nextInt();
//                    if (codigoIncorrecto(codigo)) {
//                        System.out.println("ERROR;codigo ingresado incorrercto");
//                    } else {
//                        System.out.println("ingrese la cantidad a rellenat");
//                        int cantidad = new Scanner(System.in).nextInt();
//                        golosinas[codigo - 1][2] = Integer.toString(Integer.parseInt(golosinas[codigo - 1][2] + cantidad));
//                        System.out.println("El stock de la golosinas " + golosinas[codigo - 1][0] + " fue actualizado, stock actual: " + golosinas[codigo - 1]);
//                        menuDeOpciones();
//                    }
//                }
//            }
//        }
//
//        //   Metodo para mostrar las golosinas ----------------
//        public static void mostrarGolosina() {
//            System.out.println();
//            for (int i = 0; i < golosinas.length; i++) {
//                System.out.println((i + 1) + "\t" + completarConEspacios(golosinas[i][0]) + "\t" + "$" + golosinas[i][i] + "unidades");
//                System.out.println("-----------------------------");
//            }
//            System.out.println("----------------");
//        }
//
//        //  Metodo Para completar con ESPACIOS ----------------
//        private static String completarConEspacios(String cadena) {
//            int cantidadDeEspacios = 25 - cadena.length();
//            for (int i = 0; i < cantidadDeEspacios; i++) {
//                cadena += (" ");
//            }
//            return cadena;
//        }
//
//        // Metodo de verificacion de CODIGO
//        private static boolean codigoIncorrecto(int codigo) {
//            if (codigo < 1 || codigo > 12) {
//                return false;
//            }
//            return true;
//        }
//    }

    }
}

