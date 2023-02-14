package exemploInterface;

public class Sql implements Armazenamento {

    @Override
    public boolean salvar(int valor) {
        // salvar no banco de dados sql
        return true;
    }
    
}
