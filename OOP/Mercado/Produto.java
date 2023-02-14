package Mercado;

public class Produto {
    private String setor;
    private int estoque;
    private int preco;
    private String item;
    
    public Produto(String nome, String setor, int estoque, int preco) {
        setItem(nome);
        this.setor = setor;
        this.estoque = estoque;
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }
    public int getPreco() {
        return preco;
    }
    public String getSetor() {
        return setor;
    }
    public String getItem() {
        return item;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public void setSetor(String setor) {
        this.setor = setor;
        if(setor.equals("Hortifruti") || setor.equals("Carnes")){
            System.out.println("O preco eh por Kg. Escolha sue produto");
        }
    }
}
