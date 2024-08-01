package rellenarmatriz;

import java.util.Scanner;

public class RellenarMatriz {
    public static void main(String[] args) {

        System.out.println("Insert the number with what you desire to fill the matrix: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        // matriz
        int matriz[][] = new int[4][5];

        // rellenar con 5
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < 5; c++) {
                matriz[f][c] = numero;
            }
        }

        // mostrar por pantalla
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("[" + matriz[f][c] + "]");
            }
            System.out.print("\n");
        }

        System.out.println("\n " +
                "Thank you for testing this app in your terminal \n " +
                "Please, visit my github: \n" +
                "https://github.com/MemoSainz/");



    }
}
