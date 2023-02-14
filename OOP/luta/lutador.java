package luta;

public class lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;

    public lutador(String nome, String nacionalidade, int idade, float altura, float peso, 
                     int vitorias, int derrotas, int empate){
    setNome(nome);
    setNacionalidade(nacionalidade);
    setIdade(idade);
    setAltura(altura);
    setPeso(peso);
    setVitorias(vitorias);
    setDerrotas(derrotas);
    setEmpate(empate);
    }
    public float getAltura() {
        return altura;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public int getEmpate() {
        return empate;
    }
    public int getIdade() {
        return idade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public String getNome() {
        return nome;
    }
    public float getPeso() {
        return peso;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public void setCategoria() {
        if(this.peso<52.2){
            this.categoria = "Invalido";
        }
        else if(this.peso<=70.3){
            this.categoria = "Leve";
        }
        else if(this.peso<=83.8){
            this.categoria = "Medio";
        }
        else if(this.peso<=120.2){
            this.categoria = "pesado";
        }
        else{
            this.categoria = "Invalido"; 
        }       
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public void setEmpate(int empate) {
        this.empate = empate;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }   
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatar(){
        setEmpate(getEmpate() + 1);
    }
    public void apresentar(){
        System.out.println(this.nome +" "+ this.nacionalidade +" "+ this.categoria);
    }
    public void status(){
        System.out.println(getIdade());
        System.out.println(getAltura());
        System.out.println(getPeso());
        System.out.println(getVitorias());
        System.out.println(getDerrotas());
        System.out.println(getEmpate());
    }
}
