package application;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        double horasDia;
        double precoHora;
        double desconto = 0.03;
        int diasTrabalhados;
        double total;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        precoHora = scan.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas por dia: ");
        horasDia = scan.nextDouble();
        System.out.print("Digite a quantidade de dias trabalhados: ");
        diasTrabalhados = scan.nextInt();
        scan.nextLine();

        total = salarioBruto(precoHora, horasDia, diasTrabalhados);
        System.out.println("Salário Líquido: R$" + salarioLiquido(total, desconto));

        scan.close();
    }

    public static Double salarioBruto(double precoHora, double horasDia, int diasTrabalhados) {
        return precoHora * horasDia * diasTrabalhados;
    }

    public static Double salarioLiquido(double salarioBruto, double percentual) {
        return salarioBruto - (salarioBruto * percentual);
    }
}
