package application;

/*
7) Escreva um programa que faça a impressão de um título formatado e centralizado.
O sistema vai receber o título desejado, separado em 2 partes, sendo uma superior e
outra inferior e deve devolver um título formato e centralizado como no exemplo
abaixo:
 */

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a parte superior do título:");
        String parteSuperior = scanner.nextLine();

        System.out.println("Digite a parte inferior do título:");
        String parteInferior = scanner.nextLine();

        int larguraDaLinha = Math.max(parteSuperior.length(), parteInferior.length());

        System.out.println(alinharAoCentro(parteSuperior, larguraDaLinha));

        System.out.println(alinharAoCentro(parteInferior, larguraDaLinha));

        scanner.close();
    }

    public static String alinharAoCentro(String texto, int largura) {
        int espacosExtras = largura - texto.length();
        int espacosEsquerda = espacosExtras / 2;
        int espacosDireita = espacosExtras - espacosEsquerda;
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < espacosEsquerda; i++) {
            resultado.append(" ");
        }
        resultado.append(texto);

        for (int i = 0; i < espacosDireita; i++) {
            resultado.append(" ");
        }
        return resultado.toString();
    }
}
