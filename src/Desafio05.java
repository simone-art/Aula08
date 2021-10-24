import java.util.Scanner;

public class Desafio05 {

	/*
	 * A rede de supermercados MercaJava está levando a sério as restrições de
	 * isolamento social no Brasil. Estão trabalhando para automatizar as portas das
	 * unidades, permitindo a entrada apenas das pessoas que estão atendendo às
	 * solicitações. Toda a identificação das medidas necessárias é feita através de
	 * câmeras e sensores de temperaturas. Sua tarefa é criar as funções que recebam
	 * essas medidas e informem se o cliente pode ou não entrar no estabelecimento.
	 * As funções são: • Temperatura: Clientes com temperatura superior a 37,0 graus
	 * não podem entrar no estabelecimento. • Máscara: Clientes sem máscara não
	 * podem entrar no estabelecimento. • Famílias: grupos com mais de 2 pessoas não
	 * podem entrar no estabelecimento. • Função agregadora: só autoriza a entrada
	 * no estabelecimento de clientes que cumprirem com as 3 funções anteriores.
	 */

	public static double verificarTemperaturaCliente(double temperatura) {
		if (temperatura < 37.0) {
			System.out.println("O cliente pode entrar no estabelecimento");
			return temperatura;
		} else {
			System.out.println("O cliente não pode entrar no estabelecimento");
		}
		return temperatura;

	}

	public static int verificarUsoCorretoMascara(int opcao) {
		switch (opcao) {
		case 1:
			System.out.println("O cliente usa máscara");
			return opcao;
		case 2:
			System.out.println("O cliente não usa máscara");
			return opcao;
		default:
			System.out.println("Opção inválida");
			break;
		}
		return opcao;
	}

	public static String verificarQuantidadeMáximaDeFamilia(int quantidadeFamilia) {
		if (quantidadeFamilia <= 2) {
			return "A familia pode ingresar no estabelecimento";
		} else {
			return "A familia excede o número máximo de pessoas a ingresar no estabelecimento";
		}
	}

	public static String autorizaEntrada(double temperatura, int opcao, int quantidadeFamilia) {
		if (temperatura < 37 && opcao == 1 && quantidadeFamilia == 2) {
			return "O ingreso da familia está autorizado";
		} else {
			return "O ingreso da familia não está autorizado";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("=========== PROGRAMA AUTORIZA INGRESO=====================");
		double temperatura = 0;
		System.out.println("Por favor, digite a temperatura do cliente: ");
		temperatura = scanner.nextDouble();
		System.out.println(verificarTemperaturaCliente(temperatura));
		System.out.println("========VERIRFICANDO USO DE MÁSCARAC===========================");
		int opcao = 0;
		System.out.println("Por favor, digite se o cliente tem máscara ou não: ");
		opcao = scanner.nextInt();
		System.out.println(verificarUsoCorretoMascara(opcao));
		System.out.println("========VERIRFICANDO QUANTIDADE MÁXIMA FAMILIA===========================");
		int quantidadeFamilia = 0;
		System.out.println("Por favor, digite a quantidade de integrantes da familia: ");
		quantidadeFamilia = scanner.nextInt();
		System.out.println(verificarQuantidadeMáximaDeFamilia(quantidadeFamilia));
		System.out.println("==================================================");
		System.out.println(autorizaEntrada(temperatura, opcao, quantidadeFamilia));
		scanner.close();
	}

}
