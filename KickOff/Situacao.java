package POO.KickOff;
import java.util.Scanner;

public class Situacao{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite a primeira nota: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        
        double media = (n1 + n2 + n3) / 3;        
        
        System.out.println();
        if(media >= 7.0){
            System.out.println("Aprovado(a). Parabéns!");
        }else if(media >= 5.0){
            System.out.println("Você precisa fazer a prova final.");
        }else{
            System.out.println("Reprovado(a). Sinto muito!");
        }
        System.out.println();
        
        scanner.close();
    }
}