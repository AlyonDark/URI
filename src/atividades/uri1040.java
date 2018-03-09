package atividades;

import java.util.Locale;
import java.util.Scanner;
//float 
public class uri1040 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();
		double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
		System.out.printf("Media: %.1f%n",media);
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media <= 4.9) {
			System.out.println("Aluno reprovado.");
		}else if (media>=5.0 && media <=6.9){
			System.out.println("Aluno exame.");
			double notaExame = sc.nextDouble();
			System.out.printf("Nota exame: %.1f%n",notaExame);
		
		}

	}

}
