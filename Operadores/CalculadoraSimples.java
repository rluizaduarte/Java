/*
Criar um programa Java que realiza operações 
aritméticas básicas usando os operadores mencionados.
*/

public class CalculadoraSimples{
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int soma = a + b;
		System.out.println("soma = " + soma);
		int subtracao = a - b;
		System.out.println("subtração = " + subtracao);
		int multiplicacao = a * b;
		System.out.println("multiplicação = " + multiplicacao);
		float divisao = a / b;
		System.out.println("divisão = " + divisao);
		float resto = a % b;
		System.out.println("resto = " + resto);
	}
}