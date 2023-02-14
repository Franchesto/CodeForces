package exemploInterface;

import java.util.ArrayList;

public class Memoria implements Armazenamento {
    public ArrayList<Integer> bancoDeDados;

    public Memoria()
    {
        bancoDeDados = new ArrayList<Integer>();
    }
    @Override
    public boolean salvar(int valor) {
        bancoDeDados.add(valor);
        return true;
    }
}
