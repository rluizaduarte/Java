package POO.KickOff;
import java.util.Scanner;

public class MediaLoop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';
        
        while(continuar == 's' || continuar == 'S'){
    
            System.out.print("\nDigite a primeira nota: ");
            double n1 = scanner.nextDouble();        
            System.out.print("Digite a segunda nota: ");
            double n2 = scanner.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double n3 = scanner.nextDouble();
            
            double media = (n1 + n2 + n3) / 3;        
            System.out.println("\nMédia simples: " + media);
            
            System.out.print("\nDeseja calcular outra média? (s/n): ");
            continuar = scanner.next().charAt(0);
        }
        
        System.out.println("\nPrograma encerrado.\n");
        scanner.close();
    }
}
