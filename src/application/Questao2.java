package application;

/*
2) Faça um algoritmo que receba 4 valores inteiros A, B, C e D. Dados os valores, se B for
maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de
A e B, e ainda, se ambos, C e D forem positivos e A for par, escrever a mensagem "Valores
aceitos", se não escrever "Valores não aceitos".
 */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A, B, C, D;

        System.out.print("Insira o valor de A: ");
        A = scan.nextInt();
        System.out.println();
        System.out.print("Insira o valor de B: ");
        B = scan.nextInt();
        System.out.println();
        System.out.print("Insira o valor de C: ");
        C = scan.nextInt();
        System.out.println();
        System.out.print("Insira o valor de D: ");
        D = scan.nextInt();
        System.out.println();

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }


    }
}
