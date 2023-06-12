package EstruturaWhile;

import java.util.Scanner;
/**
 *
 * @author Chris
 */
public class Main {
    public static void main(String[] args) {
        int totalAlunos = 10;
        
        Scanner leitorScanner = new Scanner(System.in);
        while(totalAlunos > 0){
        
               String nomeAluno = leitorScanner.nextLine();
               int idadeAluno = leitorScanner.nextInt();
               
               System.out.println("O nome do aluno é: " + nomeAluno +
                       " e sua idade é: " + idadeAluno);
               
               totalAlunos = totalAlunos - 1; //descrementar 1  do total de alunos 
        }
    }
    
}
