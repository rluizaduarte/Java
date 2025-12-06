public class Logicos{
	public static void main(String[] args) {
		System.out.println("verdadeiro e falso dá " + (true && false));
		System.out.println("verdadeiro e verdadeiro dá " + (true && true));
		System.out.println("falso e falso dá " + (false && false));
		System.out.println();
		System.out.println("verdadeiro ou falso dá " + (true || false));
		System.out.println("verdadeiro ou verdadeiro dá " + (true || false));
		System.out.println("falso ou falso dá " + (false || false));
		System.out.println();
		System.out.println("a negação de verdadeiro é " + (!true));
		System.out.println("a negação de falso é " + (!false));
		System.out.println();
		System.out.println("10 é maior que 5 E 10 é diferente de 5? " + ((10 > 5) && (10 != 5)));
		System.out.println("5 é maior que 10 E 5 é igual a 10? " + ((5 > 10) && (5 == 10)));
		System.out.println("10 é maior ou igual a 5 E 10 é igual a 5? " + ((10 >= 5) && (10 == 5)));
		System.out.println();
		System.out.println("10 é maior que 5 OU 10 é diferente de 5? " + ((10 > 5) || (10 != 5)));
		System.out.println("5 é maior que 10 OU 5 é igual a 10? " + ((5 > 10) || (5 == 10)));
		System.out.println("10 é maior ou igual a 5 OU 10 é igual a 5? " + ((10 >= 5) || (10 == 5)));
		System.out.println();
		System.out.println("a negação de 10 é diferente de 5 é " + (!(10 != 5)));
		System.out.println("a negação de 10 é igual a 5 é " + (!(10 == 5)));
	}
}