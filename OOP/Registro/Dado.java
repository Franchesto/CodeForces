package Registro;

public class Dado {
    private String nome;
    private String dataNascimento;
    private String cpf;

    public Dado(String nome, String dataNascimento, String cpf){
        setNome(nome);
        setDataNascimento(dataNascimento);
        setCpf(cpf);
    }
    public Dado(){
        
    }
    public String getCpf() {
        return cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return this.nome;
    }
}
