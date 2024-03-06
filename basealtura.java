package exercicio0603;
import java.util.Scanner;

public class basealtura {
	//Variaveis 
			double base, altura, area;

			//Instaciar classe Scanner 
			Scanner ler =  new Scanner(System.in);

			//entrada de dados 
			System.out.println("informe a base do triangulo ");
			base = ler.nextDouble();
			System.out.println("informe a altura do triangulo ");
			altura = ler.nextDouble();

			//Processamento
			area = base * altura / 2;

			//Saida
			System.out.println ("o valor da area: " + area);
			ler.close();

}
