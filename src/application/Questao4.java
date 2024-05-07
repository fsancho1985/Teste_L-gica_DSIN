package application;

import java.util.Scanner;

/*
4) Considerando a expressão: AX + BX + C = 1 .Faça um algoritmo que receba 3 valores
inteiros A, B, e C e calcule o valor de X. Dados os valores caso A e B possuam valor 0 e
C seja diferente de 1 imprimir “solução impossível”.
 */
public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C;
        double X;

        System.out.print("Digite o valor de A: ");
        A = scan.nextInt();
        System.out.print("Digite o valor de B: ");
        B = scan.nextInt();
        System.out.print("Digite o valor de C: ");
        C = scan.nextInt();

        if ((A == 0 && B == 0) && C != 1) {
            System.out.print("Solução impossível!");
        } else if (A == 0 && B == 0) {
            System.out.print("X poderá ser qualquer valor.");
        } else {
            X = (1.0 - C) / (A + B);
            System.out.print("O valor de X é: " + X);
        }
    }
}
