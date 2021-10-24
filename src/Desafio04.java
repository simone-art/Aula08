import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o cálculo do salário de um professor, disponível em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as funções que julgar necessárias para obter cada um dos valores que fazem parte do salário de um professor
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
		System.out.println("Por favor, digite o número de aulas atendidas por você: ");
		numeroDeAulas = leitor.nextInt();
		//System.out.println(calculoSalarioBase(numeroDeAulas, valorHoraAula));
		System.out.println("O total de aulas é: " + numeroDeAulas + " e o cálculo do salário base é: " 
		+ calculoSalarioBase(numeroDeAulas, valorHoraAula));
		//leitor.close();
		
		//Cálculo da hora com preparação das aulas, exercicios e correção de provas
		System.out.println("============================================================");
		double horasAtendidas;
		System.out.println("Por favor, digite as horas com preparação das aulas gastas: ");
		horasAtendidas = leitor.nextDouble();
		System.out.println("O total de horas atendidas é: " + horasAtendidas + " e o cálculo das horas atendidas é: " 
		+ calculoHoraAtividade(horasAtendidas, valorHoraAula));
		
		//leitor.close();
		
		//Cálculo do descanso semanal remunerado
		System.out.println("============================================================");
		System.out.println("O total do salário base é: " + calculoDescansoSemanal(numeroDeAulas, valorHoraAula, horasAtendidas) + " reais");
		
		
		leitor.close();
		
	}
	
	
}   
