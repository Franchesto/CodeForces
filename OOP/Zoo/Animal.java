package Zoo;

public abstract class Animal {
    private String nome;
    private String superficie;
    private String dieta;
    private float tamanho;

     public Animal(String nome, String superficie, String dieta, float tamanho){
        setNome(nome);
        setSuperficie(superficie);
        setDieta(dieta);
        setTamanho(tamanho);
     }
     public String getDieta() {
         return dieta;
     }
     public String getNome() {
         return nome;
     }
     public String getSuperficie() {
         return superficie;
     }
     public float getTamanho() {
         return tamanho;
     }
     public void setDieta(String dieta) {
         this.dieta = dieta;
     }
     public void setNome(String nome) {
         this.nome = nome;
     }
     public void setSuperficie(String superficie) {
         this.superficie = superficie;
     }
     public void setTamanho(float tamanho) {
         this.tamanho = tamanho;
     }
     public void barulho(){}
     public void sujar(){}
     public void reacao(){}

     
     
}
