import java.util.Scanner;

public class Desafio02 {
	/*
	 * Para um ano ser bissexto ele deve ser múltiplo de 4, mas não ser múltiplo de
	 * 100 (com exceção dos anos que forem múltiplos de 400). Crie um programa com
	 * uma função que receba um ano em uma variável inteira, faça os testes para
	 * verificar se ele é bissexto, e retorne uma String dizendo “O ano informado é
	 * bissexto” ou “O ano informado não é bissexto). A main do seu programa deve
	 * conter a digitação do ano, a chamada da função e a exibição do texto
	 * retornado.
	 */

	// Função que recebe uma variável inteira
	public static String verificaAno(int ano) {
		if ((ano % 4 == 0 || ano % 100 != 0) && ano % 400 == 0) {
			return "O ano informado é bissexto";
		} else {
			return "O ano informado não é bissexto";
		}
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int ano;
		System.out.print("Digite o ano: ");
		ano = leitor.nextInt();
		System.out.println(verificaAno(ano));
		leitor.close();
	}

}
