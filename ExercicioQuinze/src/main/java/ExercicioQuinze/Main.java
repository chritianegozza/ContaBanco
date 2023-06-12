package ExercicioQuinze;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Main {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        numero = leitorScanner.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("O número está no interevalo");
        }else {
            System.out.println("O número não está no interevalo");
        }
    }
    
}
