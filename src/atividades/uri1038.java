package atividades;

import java.util.Scanner;

public class uri1038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0;
		if (codigo == 1) {
			total = 4 * quantidade;
		} else if (codigo == 2) {
			total = 4.5 * quantidade;
		} else if (codigo == 3) {
			total = 5 * quantidade;
		} else if (codigo == 4) {
			total = 2 * quantidade;
		} else {
			total = 1.5 * quantidade;
		}
		System.out.printf("Total: R$ %.2f\n", total);
		sc.close();
	}
}
