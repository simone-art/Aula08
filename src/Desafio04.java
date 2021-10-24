import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o c�lculo do sal�rio de um professor, dispon�vel em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as fun��es que julgar necess�rias para obter cada um dos valores que fazem parte do sal�rio de um professor
	 * */
	
	
	public static double calculoSalarioBase(int numeroDeAulas, double valorHoraAula) {
		double salarioBase = (numeroDeAulas * 4.5) * valorHoraAula;
		return salarioBase;
	}
	
	public static double calculoHoraAtividade(double horasAtendidas, double valorHoraAula) {
		double horaAtividade = horasAtendidas * valorHoraAula * 0.5;
		return horaAtividade;
	}
	
	public static double calculoDescansoSemanal(int numeroDeAulas, double valorHoraAula, double horasAtendidas) {
		double totalSalarioBase = calculoSalarioBase(numeroDeAulas, valorHoraAula) 
				+ calculoHoraAtividade(horasAtendidas, valorHoraAula);
		return totalSalarioBase;
	}
	
	
	public static void main(String[] args) {
		int numeroDeAulas; 
		final double valorHoraAula = 17.5;
		Scanner leitor = new Scanner(System.in);
		System.out.println("=========== PROGRAMA SALARIO BASE PROFESORES=====================");
		System.out.println("Por favor, digite o n�mero de aulas atendidas por voc�: ");
		numeroDeAulas = leitor.nextInt();
		//System.out.println(calculoSalarioBase(numeroDeAulas, valorHoraAula));
		System.out.println("O total de aulas �: " + numeroDeAulas + " e o c�lculo do sal�rio base �: " 
		+ calculoSalarioBase(numeroDeAulas, valorHoraAula));
		//leitor.close();
		
		//C�lculo da hora com prepara��o das aulas, exercicios e corre��o de provas
		System.out.println("============================================================");
		double horasAtendidas;
		System.out.println("Por favor, digite as horas com prepara��o das aulas gastas: ");
		horasAtendidas = leitor.nextDouble();
		System.out.println("O total de horas atendidas �: " + horasAtendidas + " e o c�lculo das horas atendidas �: " 
		+ calculoHoraAtividade(horasAtendidas, valorHoraAula));
		
		//leitor.close();
		
		//C�lculo do descanso semanal remunerado
		System.out.println("============================================================");
		System.out.println("O total do sal�rio base �: " + calculoDescansoSemanal(numeroDeAulas, valorHoraAula, horasAtendidas) + " reais");
		
		
		leitor.close();
		
	}
	
	
}   
