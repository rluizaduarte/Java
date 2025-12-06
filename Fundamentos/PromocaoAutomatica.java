/*
Promoção Automática de Tipos em Java

Criar um programa Java que demonstre a 
promoção automática de tipos em expressões.
*/

public class PromocaoAutomatica{
	public static void main(String[] args) {
		byte a = 10;
		short b = 20;
		char c = 'A';
		int d = 30;
		long e = 40L;
		float f = 1.5f;
		double g = 2.5D;

	    // ex de promoção automática: byte e short promovidos para int
		int soma = a + b;
	    System.out.println("Resultado da soma: " + soma);		
		
		// ex de promoção automática: int e long promovidos pra float
		float multiplicacao = d * e;
	    System.out.println("Resultado da multiplicação: " + multiplicacao);		
	}
}