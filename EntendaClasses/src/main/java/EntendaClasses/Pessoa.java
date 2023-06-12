package EntendaClasses;

public class Pessoa {
    
    //Atributos 
    private float peso;
    private float altura; 
    
    //m�todo construtor
    public Pessoa(float peso, float altura){
        //System.out.println("Executando o m�todo construtor");
        this.peso = peso;
        this.altura = altura;
    }
    
    //m�todos    
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //m�todo acessores 
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
