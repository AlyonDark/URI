import java.util.Locale;
import java.util.Scanner;

public class trabalho {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Leitura de dados
		System.out.println("Informe a quantidade de clientes: ");
		int N = sc.nextInt();
		String[] vetNome = new String[N];
		int[] vetTel = new int[N];
		int[] vetTipo = new int[N];
		int[] vetPulsos = new int[N];
		double[] vetValConta = new double[N];
		double[][] mat = new double[3][2];
		System.out.println(
				"Informe os preços básicos de assinaturas e dos preços dos pulsos excedentes para cada tipo de assinatura(mensalemente).");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		System.out.println("Informe Nome, Telefone, Tipo, Pulsos, dos clientes: ");
		for (int i = 0; i < N; i++) {
			vetNome[i] = sc.next();
			vetTel[i] = sc.nextInt();
			vetTipo[i] = sc.nextInt();
			vetPulsos[i] = sc.nextInt();
		}

		// Processamento da informação
		// Valor da Conta de cada cliente
		int pulsosPass = 0;
		for (int i = 0; i < N; i++) {
			if (vetPulsos[i] <= 90.0) {
				vetValConta[i] = mat[vetTipo[i]][0];
			} else {
				pulsosPass = vetPulsos[i] - 90;
				vetValConta[i] = (pulsosPass*mat[vetTipo[i]][1])+mat[vetTipo[i]][0];
			}
			pulsosPass = 0;
		}

		// Mostrando a tabela:
		System.out.println("__________________________________________________________");
		System.out.println("|Nome    |Telefone     |Tipo      |Pulsos   |ValorDaConta|");
		System.out.println("==========================================================");
		for (int i = 0; i < N; i++) {
			System.out.println("|#" + vetNome[i] + "    #" + vetTel[i] + "    #" + vetTipo[i] + "    #" + vetPulsos[i]
					+ "        #R$" + vetValConta[i]);
		}
		System.out.println("__________________________________________________________");
		System.out.println(" ");

		// Menu
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("|Escolha uma opção:                                                                            |");
		System.out.println("|1) A receita total da empresa telefônica (soma de todas as contas).                           |");
		System.out.println("|2) Nome e telefone do cliente do qual a conta foi mais barata (supor não haver empates).      |");
		System.out.println("|3) Média de pulsos consumidos por clientes de conta tipo 1.                                   |");
		System.out.println("|4) Nomes e telefones dos clientes que não consumiram pulsos excedentes                        |");
		System.out.println("|5) A quantidade de clientes que consumiu acima de 120 pulsos                                  |");
		System.out.println("|6) A porcentagem de clientes que possuem conta tipo 2, em relação ao total de clientes.       |");
		System.out.println("|7) Sair                                                                                       |");
		System.out.println("------------------------------------------------------------------------------------------------");
		int opcao =0;
		while (opcao !=7) {
			opcao = sc.nextInt();
			if (opcao == 1) {
				// Receita Total
				double receita = 0;
				for (int i = 0; i < N; i++) {
					receita += vetValConta[i];
				}
				System.out.println("(Opção 1) Receita Total: R$" + receita);
			}
			if (opcao == 2) {
				// Conta mais barata
				int pessoa = 0;
				for (int i = 1; i < N; i++) {
					if (vetValConta[0] > vetValConta[i]) {
						pessoa = i;
					}
				}
				System.out.println("(Opção 2) #Nome: " + vetNome[pessoa] + "   #Telefone: " + vetTel[pessoa]);
			}
			if (opcao == 3) {
				// Média de pulsos do tipo 1
				double Tip1 = 0;
				int quantid = 0;
				for (int i = 0; i < N; i++) {
					if (vetTipo[i] == 1) {
						Tip1 += vetPulsos[i];
						quantid++;
					}
				}
				double media = Tip1 / quantid;
				System.out.println("(Opção 3) Média: " + media);
			}
			if (opcao == 4) {
				// Sem pulsos excedentes
				for (int i = 0; i < N; i++) {
					if (vetPulsos[i] < 90) {
						System.out.println("(Opção 4) #Nome: " + vetNome[i] + "     #Telefone: " + vetTel[i]);
					}
				}
			}
			if (opcao == 5) {
				// quantidades de clientes acima de 120 pulsos
				int quantclie = 0;
				for (int i = 0; i < N; i++) {
					if (vetPulsos[i] > 120) {
						quantclie++;
					}
				}
				System.out.println("(Opção 5) Quantidade de clientes: " + quantclie);
			}
			if (opcao == 6) {
				// Porcentagem de clientes que possuem conta 2, em relação ao total de clientes
				int clienTipo2 = 0;
				for (int i = 0; i < N; i++) {
					if (vetTipo[i] == 2) {
						clienTipo2++;
					}
				}
				double porcent = clienTipo2 * 100 / N;
				System.out.println("(Opção 6) Porcentagem de clientes: " + porcent);
			}
			if (opcao == 7) {
				sc.close();
			}
		}
	}
}
