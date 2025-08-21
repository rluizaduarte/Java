package POO.KickOff;
import java.util.Scanner;

public class MediaTurma{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nQuantos alunos há na turma? ");
        int numeroAlunos = scanner.nextInt();
        
        double[] medias = new double[numeroAlunos];
        double[][][] notasAlunos = new double[numeroAlunos][3][1]; 

        double somaTurma = 0;
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("\nAluno " + (i + 1));
            
            System.out.print("Digite a primeira nota: ");
            double n1 = scanner.nextDouble();
            notasAlunos[i][0][0] = n1;
            System.out.print("Digite a segunda nota: ");
            double n2 = scanner.nextDouble();
            notasAlunos[i][1][0] = n2;
            System.out.print("Digite a terceira nota: ");
            double n3 = scanner.nextDouble();
            notasAlunos[i][2][0] = n3;
            
            double media = (n1 + n2 + n3) / 3;
            medias[i] = media;
            somaTurma += media;
        }
        
        double mediaTurma = somaTurma / numeroAlunos;
        System.out.println();
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.println("Notas: " + notasAlunos[i][0][0] + ", " + notasAlunos[i][1][0] + ", " + notasAlunos[i][2][0]);
            System.out.println("Média: " + medias[i]);
            System.out.println("Situação: " + classificarAluno(medias[i]));
        }
        
        System.out.println();
        System.out.println("Média da turma: " + mediaTurma + "\n");
        
        scanner.close();
    }
    
    public static String classificarAluno(double media) {
        if(media >= 7.0){
            return "Aprovado";
        } 
        else if(media >= 5.0){
            return "Final";
        }else{
            return "Reprovado";
        }
    }
}