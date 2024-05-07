package application;

import java.util.Scanner;

/*
Faça um algoritmo que receba um valor inteiro. Dado o valor, calcule o menor número
de notas (cédulas) possíveis no qual o valor pode ser decomposto. As notas consideradas
são de 200, 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas
necessárias. Exemplo:
Para 777:
● 3 nota(s) de R$ 200,00
● 1 nota(s) de R$ 100,00
● 1 nota(s) de R$ 50,00
● 1 nota(s) de R$ 20,00
● 0 nota(s) de R$ 10,00
● 1 nota(s) de R$ 5,00
● 1 nota(s) de R$ 2,00
● 0 nota(s) de R$ 1,00
 */
public class Questao3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] quantidade = new int[notas.length];

        System.out.print("Insira o valor: ");
        int valor = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < notas.length; i++) {
            quantidade[i] = valor / notas[i];
            valor %= notas[i];
        }

        System.out.println("Para o valor: " + valor + ": ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(quantidade[i] + " nota(s) de R$" + notas[i]);
        }

        scan.close();

    }
}
