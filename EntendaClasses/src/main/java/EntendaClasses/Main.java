package EntendaClasses;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        
        //float peso;
        //float altura; 
        
         //Criando um objeto
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);
        
        
        //float imc; 
        Scanner leitor = new Scanner(System.in);
        
       
        System.out.println("Digite o peso da pessoa");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura(leitor.nextFloat()); 
        
        
        
        //imc = peso / (altura * altura);
        System.out.println("IMC: = " + objetoPessoa.calcularIMC());
    }
    
    
}
