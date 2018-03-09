package atividades;

import java.util.Scanner;

public class uri1009 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		double sal = sc.nextDouble();
		double mon = sc.nextDouble();
		double total = (sal + mon * 0.15);

		System.out.printf("TOTAL = R$ %.2f%n", total);
		sc.close();

	}

}
