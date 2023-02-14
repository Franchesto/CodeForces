package exemploInterface;

public class Qualquer {
    public Armazenamento armazenamento;

    public Qualquer(Armazenamento armazenamento)
    {
        this.armazenamento = armazenamento;
    }

    public void Loucura(int valor)
    {
        System.out.println("Loucura total");
        armazenamento.salvar(valor);
    }
}
