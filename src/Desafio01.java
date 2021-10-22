import java.util.Scanner;

public class Desafio01 {

	/*
	 * É muito comum que programas que realizam cadastros de pessoas precisem
	 * validar a sigla do estado a que elas pertencem. Crie uma função que receba
	 * uma String contendo a sigla de um estado e verifique se esse estado existe ou
	 * não. Caso exista, a função deve retornar um boolean true. Caso não exista,
	 * ele deve retornar um boolean false. A main do seu programa deve conter a
	 * digitação do estado, a chamada da função e a exibição de uma mensagem para
	 * afirmar se o estado existe ou não, dependendo do que a função retornar.
	 */

	public static boolean validarSiglaEstado(String estado) {
		if (estado.equals( "SP")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String siglaDigitadaPeloUsuario;
		System.out.println("Por favor, ingrese as siglas do estado onde mora:");
		siglaDigitadaPeloUsuario = leitor.next();
		validarSiglaEstado(siglaDigitadaPeloUsuario);
		
		if(validarSiglaEstado(siglaDigitadaPeloUsuario) == true) {
			System.out.println("O Estado existe");
		}else {
			System.out.println("O Estado não existe");
		}
		leitor.close();
	}

}