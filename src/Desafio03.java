
public class Desafio03 {
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: 
	 * a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
     E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
	Crie uma fun��o que valida se um tri�ngulo existe ou n�o. 
	Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
	A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 

	 * */
	
	public static boolean verificaTriangulo(double ladoA, double ladoB, double ladoC) {
		if((ladoA + ladoB)> ladoC && (ladoA + ladoC)> ladoB && (ladoB+ladoC)> ladoA){
			return true;
		}else {
			return false;
		}
	}
	
	public static String verificaTipo(double ladoA, double ladoB, double ladoC) {
		if(verificaTriangulo(ladoA, ladoB, ladoC)) {
			if(ladoA == ladoB && ladoA== ladoC) {
				return "Triangulo Equilatero";
			}else if(ladoA != ladoB && ladoB!= ladoC && ladoA!=ladoC) {
                return "Tri�ngulo escaleno";	
			}else {
                return "Tri�ngulo is�sceles";
            }

			
		}else {
			return "O tri�ngulo n�o existe";
		}
	}
	public static void main(String[] args) {
		System.out.println(verificaTriangulo(3, 7, 10));
		System.out.println(verificaTipo(4, 7, 10));
		System.out.println(verificaTipo(7, 7, 7));
	}
}
