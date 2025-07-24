package com.matriz;

import java.util.Scanner;

public class Matriz {
    static int[][] matriz = new int[3][3];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando....");

        for (int i = 0; i < Matriz.matriz.length; i++) {
            for (int j = 0; j < Matriz.matriz[i].length; j++) {
                System.out.print("Digite os valores para matriz[" + i + ", " + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println();
        System.out.println("Resultado da matriz:");
        for (int[] item : Matriz.matriz) {
            for (int numero : item) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}
