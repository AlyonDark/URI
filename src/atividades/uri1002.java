package atividades;

import java.util.Scanner;

public class uri1002 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = Math.pow(raio, 2) * pi;
		System.out.printf("A=%.4f\n", area);
		sc.close();
	}

}
