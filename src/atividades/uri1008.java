package atividades;

import java.util.Scanner;

public class uri1008 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int NUMBER = sc.nextInt();
		int HORAS = sc.nextInt();
		double VALOR = sc.nextDouble();
		double SALARY = HORAS * VALOR;

		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);
		sc.close();

	}

}
