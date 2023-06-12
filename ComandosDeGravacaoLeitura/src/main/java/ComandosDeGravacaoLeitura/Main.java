/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComandosDeGravacaoLeitura;
import java.util.Scanner; //pacote scanner 
/**
 *
 * @author Chris
 */
public class Main {

    public static void main(String[] args) {
     
        ///Comando de leitura e Gravação de teclado
        //Criado o leitor
        Scanner leitor = new Scanner(System.in);
        
        //ler os dados
        //int idade = leitor.nextInt();
        
       // float cotacaoDolar = leitor.nextFloat();
        
        //double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine(); //leitora de texto
        //String codigoRua = leitor.next();
        
        //irá mostrar no console 
       // System.out.println("Texto que será exibido no console"); // ler o texto e pula linha 
       // System.out.print("Texto que será exibido no console sem pular linha");
        //System.out.print(idade);
        System.out.print("nome" + nome);
       // System.out.print(cotacaoDolar);
       // System.out.print(cotacaoEuro);
        //System.out.print(codigoRua);
    }
    
}
