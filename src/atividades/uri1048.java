package atividades;

import java.util.Locale;
import java.util.Scanner;

public class uri1048 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		int perReajuste = 15;
		if (salario >= 400.01 && salario <= 800) {
			perReajuste = 12;
		} else if (salario >= 800.01 && salario <= 1200) {
			perReajuste = 10;
		} else if (salario >= 1200.01 && salario <= 2000) {
			perReajuste = 7;
		} else if (salario >= 2000) {
			perReajuste = 4;
		}
		double reajusteGanho = salario * (perReajuste / 100.00);
		double novoSalario = salario + reajusteGanho;
		System.out.printf("Novo salario: %.2f\n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
		System.out.println("Em percentual: " + perReajuste + " %");

		sc.close();
	}

}
