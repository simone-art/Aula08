import java.util.Scanner;

public class Desafio01 {

	/*
	 * � muito comum que programas que realizam cadastros de pessoas precisem
	 * validar a sigla do estado a que elas pertencem. Crie uma fun��o que receba
	 * uma String contendo a sigla de um estado e verifique se esse estado existe ou
	 * n�o. Caso exista, a fun��o deve retornar um boolean true. Caso n�o exista,
	 * ele deve retornar um boolean false. A main do seu programa deve conter a
	 * digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para
	 * afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.
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
			System.out.println("O Estado n�o existe");
		}
		leitor.close();
	}

}