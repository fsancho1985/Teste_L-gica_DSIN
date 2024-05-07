package application;

import java.util.Scanner;

/*
6) Construa um algoritmo que recebe um número inteiro positivo N e gere uma
sequência de números inteiros positivos, de 1 a N. O algoritmo deverá avaliar cada
número dessa sequência da seguinte forma:
● Caso seja um número perfeito, imprimir a mensagem “numero perfeito“;
● Caso seja um múltiplo de 3, imprimir “multiplo de 3”;
● Caso seja um múltiplo de 5, imprimir “multiplo de 5”;
● Caso seja um número com a raiz quadrada inteira, imprimir “raiz inteira”.
Considerações:
Um número perfeito é um número cujo a soma de todos os seus divisores
naturais próprios (excluindo ele mesmo) é igual ao próprio número.
Exemplo: 6 pode ser dividido por 1, 2 e 3, e quando você soma esses números o
resultado é 6.
 */
public class Questao6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            if(perfeito(i)) {
                System.out.printf("\nNúmero %d é Perfeito", i);
            } else if (i % 3 == 0) {
                System.out.printf("\nNúmero %d é Multiplo de 3", i);
            } else if (i % 5 == 0) {
                System.out.printf("\nNúmero %d é Multiplo de 5", i);
            } else if (raizQuadrada(i)) {
                System.out.printf("\nNúmero %d é Raiz inteira", i);
            }
        }

    }

    private static boolean perfeito(int num) {
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }

    private static boolean raizQuadrada(int num) {
        double raizQuadrada = Math.sqrt(num);
        int raiz = (int) raizQuadrada;

        return raizQuadrada == raiz;
    }
}
