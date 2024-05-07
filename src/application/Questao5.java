package application;

/*
5) Sabendo da existência da nova placa Mercosul, e que um sistema precisa saber qual o
tipo da placa em questão, faça um algoritmo que receba uma placa e imprima qual o
padrão da placa informada e a versão correspondente da mesma placa no outro
padrão.
Considerações:
A placa informada, deverá ser validada, aceitando somente letras maiúsculas de A
a Z (sem acentos), números positivos e estar no formato AAA9999 ou AAA9A99.
Caso a placa informada não cumpra esses critérios, o algoritmo deverá imprimir
“formato inválido”.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String placa;
        char caracterPlaca;
        String replaceCaracter;

        List<Integer> padraoBrasil = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> padraoMercosul = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

        System.out.print("Insira a placa no formado AAA999 para padrão Brasil ou AAA9A99 para o padrão Mercosul: ");
        placa = scan.nextLine();

        if (validaPlacaPadraoBrasil(placa)) {
            caracterPlaca = placa.charAt(4);
            replaceCaracter = caracterMercosul(caracterPlaca, padraoMercosul);
            System.out.println("Placa Padrão Mercosul: " +
                    novaPlaca(separaPlacaAntes(placa), replaceCaracter, separaPlacaDepois(placa)));
        } else if (validaPlacaPadraoMercosul(placa)) {
            String caracterPlacaMercosul = String.valueOf(placa.charAt(4));
            String indice = String.valueOf(padraoMercosul.indexOf(caracterPlacaMercosul));
            System.out.println("Placa Padrão Brasil: " + novaPlaca(separaPlacaAntes(placa), indice, separaPlacaDepois(placa)));
        } else {
            System.out.println("Formato inválido!");
        }
    }

    private static StringBuilder novaPlaca(Object o, String replaceCaracter, Object o1) {
        return new StringBuilder(o + replaceCaracter + o1);
    }

    private static Object separaPlacaDepois(String placa) {
        return placa.substring(5, 7);
    }

    private static Object separaPlacaAntes(String placa) {
        return placa.substring(0, 4);
    }

    private static String caracterMercosul(char caracterPlaca, List<String> padraoMercosul) {
        return padraoMercosul.get(Integer.parseInt(String.valueOf(caracterPlaca)));
    }

    private static Integer caracterBrasil(int indice, List<Integer> padraoBrasil) {
        return padraoBrasil.get(indice);
    }

    private static boolean validaPlacaPadraoBrasil(String placa) {
        String padrao = "[A-Z]{3}\\d{4}";
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(placa);

        return matcher.matches();
    }

    private static boolean validaPlacaPadraoMercosul(String placa) {
        String padrao = "[A-Z]{3}\\d[A-Z]\\d{2}";
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(placa);

        return matcher.matches();
    }
}
