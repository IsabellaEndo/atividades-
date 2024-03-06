package atividadegasolina;
import java.util.Scanner;

public class gasolina 
	public static void main(String[] args) {

		//variaveis
		double litro, distancia, consumo, valor, gasolina;

		//Instaciar classe Scanner 
		Scanner ler =  new Scanner(System.in);
		//entrada de dados 
		System.out.println("quanto qual o valor da gasolina ");
		litro= ler.nextDouble();
		System.out.println("qual é a diatnacia que voce quer percorrer ");
		distancia = ler.nextDouble();	
		System.out.println("qual o consumo");
		consumo = ler.nextDouble();
		System.out.println("quantos litros gastos ");
		litro = ler.nextDouble();
		System.out.println("qual o valor total ");
		valor = ler.nextDouble();


		//processamento 
		consumo= distancia / valor;
		valor = consumo * litro;

		//saida 
		System.out.println("quantos litros gastos: " + litro);
		System.out.println("quantos valor: " + valor);
		
	


