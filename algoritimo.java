package exercicio0603;
import java.util.Scanner;

public class algoritimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variaveis
		double a,b, soma, multiplicacao, divisao, subtracao;
		//Instaciar classe Scanner 
		Scanner ler = new Scanner(System.in); 

		//Entrada de dados 
		System.out.println("informe o valor 1: ");
		a = ler.nextDouble();

		System.out.println("informe o valor 2: ");
		b = ler.nextDouble();

		//Processamento
		soma = a+b;
		multiplicacao = a+b;
		divisao = a+b;
		subtracao = a+b;
		//Saida
		System.out.println("O resultado é : " + soma);
		System.out.println("O resultado é : " + divisao);
		System.out.println("O resultado é : " + multiplicacao);
		System.out.println("O resultado é : " + divisao);
	}

}
