package Zoo;

public class Gato extends Animal {

    private String especie;
    
    public Gato(String nome, String superficie, String dieta, float tamanho, String especie) {
        super(nome, superficie, dieta, tamanho);
        setEspecie(especie);
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    @Override
    public void barulho(){
        System.out.println("MEAWWWW");
    }
    @Override
    public void sujar(){
        if(this.especie.equals("Normal"))
            System.out.println("Este set solta mt pelo");
        else
        System.out.println("Mt feio, mas n solta pelo");
    }
    @Override
    public void reacao(){
        System.out.println("Indiferenca");
    }
   
}
