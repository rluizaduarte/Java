/*
Neste exercício você praticará o 
comportamento de precedência de operadores.
*/

public class OperadoresPrecedencia{
	public static void main(String[] args) {
		int numero = 5;
		System.out.println("++numero = " + (++numero));
		System.out.println("numero++ = " + (numero++)); 
		System.out.println("valor após o pós-incremento: " + numero);
		System.out.println("--numero = " + (--numero));
		System.out.println("numero-- = " + (numero--));
		System.out.println("valor após o pós-decremento: " + numero);
	}
}