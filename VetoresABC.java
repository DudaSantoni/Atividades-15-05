package vetores;

import java.util.Scanner;

public class VetoresABC {

	public static void main(String[] args) {
		int v1 [] = new int [5];
		int v2 [] = new int [5];
		int v3 [] = new int [10];
		int soma = 0;

		Scanner ler = new Scanner(System.in);


		for (int c =0; c<10; c++) {
			for (int a =0; a<5; a++) {
				System.out.println("Informe um valor " + a + ":");
				v1 [a]= ler.nextInt();
				v3[c]=v1[a];
			}

			for (int b =0; b<5; b++) {
				System.out.println("Informe um valor " + b + ":");
				v2 [b]= ler.nextInt();

			}

			System.out.println("A soma dos vetores é " + soma);
		}

		ler.close();
	}
}

