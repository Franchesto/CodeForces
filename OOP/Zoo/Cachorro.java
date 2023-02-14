package Zoo;

public class Cachorro extends Animal {

    public Cachorro(String nome, String superficie, String dieta, float tamanho) {
        super(nome, superficie, dieta, tamanho);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void barulho(){
        System.out.println("AU, AU AUUU");
    }
    @Override
    public void sujar(){
        System.out.printf("%s solta muito pelo\n", getNome());
    }
    @Override
    public void reacao(){
        System.out.printf("%s esta muito feliz\n", getNome());
    }
    
    
}
