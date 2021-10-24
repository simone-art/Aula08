import java.util.Scanner;

public class Desafio05 {

	/*
	 * A rede de supermercados MercaJava est� levando a s�rio as restri��es de
	 * isolamento social no Brasil. Est�o trabalhando para automatizar as portas das
	 * unidades, permitindo a entrada apenas das pessoas que est�o atendendo �s
	 * solicita��es. Toda a identifica��o das medidas necess�rias � feita atrav�s de
	 * c�meras e sensores de temperaturas. Sua tarefa � criar as fun��es que recebam
	 * essas medidas e informem se o cliente pode ou n�o entrar no estabelecimento.
	 * As fun��es s�o: � Temperatura: Clientes com temperatura superior a 37,0 graus
	 * n�o podem entrar no estabelecimento. � M�scara: Clientes sem m�scara n�o
	 * podem entrar no estabelecimento. � Fam�lias: grupos com mais de 2 pessoas n�o
	 * podem entrar no estabelecimento. � Fun��o agregadora: s� autoriza a entrada
	 * no estabelecimento de clientes que cumprirem com as 3 fun��es anteriores.
	 */

	public static double verificarTemperaturaCliente(double temperatura) {
		if (temperatura < 37.0) {
			System.out.println("O cliente pode entrar no estabelecimento");
			return temperatura;
		} else {
			System.out.println("O cliente n�o pode entrar no estabelecimento");
		}
		return temperatura;

	}

	public static int verificarUsoCorretoMascara(int opcao) {
		switch (opcao) {
		case 1:
			System.out.println("O cliente usa m�scara");
			return opcao;
		case 2:
			System.out.println("O cliente n�o usa m�scara");
			return opcao;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		return opcao;
	}

	public static String verificarQuantidadeM�ximaDeFamilia(int quantidadeFamilia) {
		if (quantidadeFamilia <= 2) {
			return "A familia pode ingresar no estabelecimento";
		} else {
			return "A familia excede o n�mero m�ximo de pessoas a ingresar no estabelecimento";
		}
	}

	public static String autorizaEntrada(double temperatura, int opcao, int quantidadeFamilia) {
		if (temperatura < 37 && opcao == 1 && quantidadeFamilia == 2) {
			return "O ingreso da familia est� autorizado";
		} else {
			return "O ingreso da familia n�o est� autorizado";
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
		System.out.println("========VERIRFICANDO USO DE M�SCARAC===========================");
		int opcao = 0;
		System.out.println("Por favor, digite se o cliente tem m�scara ou n�o: ");
		opcao = scanner.nextInt();
		System.out.println(verificarUsoCorretoMascara(opcao));
		System.out.println("========VERIRFICANDO QUANTIDADE M�XIMA FAMILIA===========================");
		int quantidadeFamilia = 0;
		System.out.println("Por favor, digite a quantidade de integrantes da familia: ");
		quantidadeFamilia = scanner.nextInt();
		System.out.println(verificarQuantidadeM�ximaDeFamilia(quantidadeFamilia));
		System.out.println("==================================================");
		System.out.println(autorizaEntrada(temperatura, opcao, quantidadeFamilia));
		scanner.close();
	}

}
