package exercicio0603;
import java.util.Scanner;

public class convertermoedas {

	public static void main(String[] args) {

		//variavel 
		double real, dolar; 

		//Instaciar classe Scanner 
		Scanner ler =  new Scanner(System.in);

		//entrada de dados 
		System.out.println("informe o valor em real: ");
		real = ler.nextDouble();

		//Processamento
		dolar = real * 0.20;

		// saida
		System.out.println("O valor do dolar é : " + dolar);


	}

}
