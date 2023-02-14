package exemploInterface;

public class Main {
    public static void main(String args[])
    {
        Sql a = new Sql();
        Qualquer joao = new Qualquer(a);
        Qualquer francisco = new Qualquer(new Memoria());

        joao.Loucura(7);
        francisco.Loucura(8);
    }
}
