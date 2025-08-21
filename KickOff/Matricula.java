package POO.KickOff;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Matricula{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite o nome do aluno: ");
        String nome = scanner.nextLine();

        String matricula = gerarMatricula();
        
        System.out.println("\nNome: " + nome);
        System.out.println("Sua matrícula é: " + matricula);
        System.out.println("\nBem-vindo à escola! Você está matriculado(a).\n");
        
        scanner.close();
    }
    
    public static String gerarMatricula(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmssSSS");
        return "MAT" + agora.format(formatter);
    }
}