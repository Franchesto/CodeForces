package Registro;

public class Pessoa{
    private float peso;
    private float altura;
    private float imc;
    private Dado dado;
    private String cpf;
    
    public Pessoa(float peso, float altura, String cpf) {
        setAltura(altura);
        setPeso(peso);
        setCpf(cpf);
    } 
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }
    public String getCpf() {
        return cpf;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void Imc(){
        imc = this.peso/(this.altura*this.altura);
        if(imc<18.4){
            System.out.println("Voce esta abaixo do peso");
        }
        else if(imc<29.9){
            System.out.println("Voce esta com o peso ideal");
        }
        else{
            System.out.println("Voce esta acima do peso");
        }
    }
    public void info(){
        System.out.printf("seu imc eh de %.2f. ", imc);
    }
}
