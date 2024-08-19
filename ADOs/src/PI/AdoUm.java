package PI;

import java.util.Scanner;

public class AdoUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char continuar;

		do {
			System.out.println("Informe a ordem da matriz");
			int ordem = ler.nextInt();
			int[][] matriz = new int[ordem][ordem];

			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
					matriz[i][j] = ler.nextInt();
				}
			}

			int somaT = 0;
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;
			int somaDP = 0;
			int somaDS = 0;
			
			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					int valor = matriz[i][j];
					somaT += valor;
					if (valor > maior)
						maior = valor;
					if (valor < menor)
						menor = valor;
					if (i == j)
						somaDP += valor;
					if (i + j == ordem - 1)
						somaDS += valor;
				}
			}
			
			System.out.println("Soma de todos os números da matriz: " + somaT);
			System.out.println("Maior número da matriz: " + maior);
			System.out.println("Menor número da matriz: " + menor);
			System.out.println("Soma da diagonal principal: " + somaDP);
			System.out.println("Soma da diagonal secundária: " + somaDS);
			System.out.print("Deseja cadastrar uma nova matriz? (s/n): ");
			
			continuar = ler.next().charAt(0);
		} while (continuar == 's' || continuar == 'S');
		ler.close();
	}
}
