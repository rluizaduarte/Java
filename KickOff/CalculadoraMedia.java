package POO.KickOff;
import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite a primeira nota: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        
        double media = (n1 + n2 + n3) / 3;
        
        System.out.println("\nMédia simples: " + media + "\n");
        
        scanner.close();
    }
}