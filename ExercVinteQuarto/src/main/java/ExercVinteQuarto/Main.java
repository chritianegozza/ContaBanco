package ExercVinteQuarto;

import java.util.Scanner;
/**
 *
 * @author Chris
 */
public class Main {
    public static void main(String[] args) {
        
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){ //enquanto for S ou s 
           
            System.err.println("Digite um n�mero");
            int numero = leitorScanner.nextInt();
            
            if(numero == 0){
                System.err.println("O n�mero � zero");
            }else {
                if(numero > 0){
                    System.err.println("O n�mero � maior que zero");
                }else {
                    System.err.println("O n�mero � menor que zero");
                }
            }
            
            System.err.println("Deseja continuar: S - Sim / N - N�o");
            desejaContinuar = leitorScanner.next().charAt(0);
        }
    }
    
}
