/*
Controle de Estoque em uma Padaria

Imagine que você está desenvolvendo um sistema para gerenciar 
o estoque de uma padaria. Vamos criar um programa em Java que 
permita ao usuário registrar a quantidade de farinha e açúcar 
disponíveis.
*/

public class ControleDeEstoque{
	public static void main(String[] args) {
		int quantidadeDeFarinha = 10;
		int quantidadeDeAcucar = 5;
		
		System.out.println("Atualmente há:");
		System.out.println(quantidadeDeFarinha + " unidades de farinha no estoque.");
		System.out.println(quantidadeDeAcucar + " unidades de açúcar no estoque.");
	}
}