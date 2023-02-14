package video;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    public Pessoa(String nome, int idade, String sexo){
        this.experiencia = 0;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;

    }
    public float getExperiencia() {
        return experiencia;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    protected void ganharExp(){

    }
    
}
