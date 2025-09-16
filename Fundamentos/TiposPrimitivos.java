public class TiposPrimitivos {
	public static void main(String[] args){
		byte idade = 20;
		short ano = 2025;
		int cep = 53405190;
		long contato = 985640276L;
		// o L no final indica que a variável é do tipo long 
		float altura = 1.72f;
		// o f no final indica que a variável é do tipo float
		double salario = 10000.50;
		boolean estudante = true;
		char inicial = 'R';

		System.out.println("Idade: " + idade);
		System.out.println("Ano atual: " + ano);
		System.out.println("CEP: " + cep);
		System.out.println("Número para contato " + contato);
		System.out.println("Altura: " + altura);
		System.out.println("Salario: " + salario);
		System.out.println("É estudante? " + estudante);
		System.out.println("Inicial do nome: " + inicial);
	}
}