package exercicio0603;
import java.util.Scanner;

public class atividadeJava {
	public static void main(String[] args) {


		//Variaveis 
		double celsius, fahrenheit;

		//Instaciar classe Scanner 
		Scanner ler =  new Scanner(System.in);

		//entrada de dados 
		System.out.println("informe a temperatura em graus fahrenheit ");
		fahrenheit = ler.nextDouble();

		//Processamento
		celsius = ((fahrenheit - 32)*5) / 9;

		//Saida
		System.out.println ("o valor do graus celsius é equivalente a: " + celsius);
		ler.close();
	}

}







