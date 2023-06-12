package EntendaClasses;

public class Pessoa {
    
    //Atributos 
    private float peso;
    private float altura; 
    
    //método construtor
    public Pessoa(float peso, float altura){
        //System.out.println("Executando o método construtor");
        this.peso = peso;
        this.altura = altura;
    }
    
    //métodos    
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //método acessores 
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return peso; 
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura; 
    }
}
