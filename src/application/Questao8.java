package application;

/*
8) Elabore um algoritmo que construa uma matriz quadrada de tamanho N em
formato de caracol. Para N igual a 5:
 */

public class Questao8 {
    public static void main(String[] args) {


        int numero = 5;
        int inicio = 0;
        int fim = numero - 1;
        int cont = 0;
        int contador = 5;
        int matriz[][] = new int[numero][numero];

        while(cont <= (25)) {
            for (int i = inicio; i <= fim; i++) {
                matriz[inicio][i] = contador;
                contador+= 5;
            }
            for (int i = inicio + 1; i <= fim; i++) {
                matriz[i][fim] = contador += 5;
            }
            for (int i = fim - 1; i >= inicio; i--) {
                matriz[fim][i] = contador += 5;
            }
            for (int i = fim - 1; i >= inicio + 1; i--) {
                matriz[i][inicio] = contador += 5;
            }

            inicio = inicio + 1;
            fim = fim - 1;
            cont++;
        }

        for (int i = 0; i < numero; i++) {
            System.out.println();
            for (int j = 0; j < numero; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }

    }
}
