
public class Desafio03 {
	/*Você deve se lembrar que os triângulos possuem uma regra para existirem: 
	 * a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
     E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
	Crie uma função que valida se um triângulo existe ou não. 
	Além disso, crie uma função que verifica o tipo do triângulo (ela deve primeiro validar se o triângulo existe).
	A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

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
                return "Triângulo escaleno";	
			}else {
                return "Triângulo isósceles";
            }

			
		}else {
			return "O triángulo não existe";
		}
	}
	public static void main(String[] args) {
		System.out.println(verificaTriangulo(3, 7, 10));
		System.out.println(verificaTipo(4, 7, 10));
		System.out.println(verificaTipo(7, 7, 7));
	}
}
