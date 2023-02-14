package video;

public class Projetovideo {
    public static void main(String[] args){
        Video [] v = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 3 encapsulamento");
        v[2] = new Video("Aula 10 projeto");
        
        Gafanhoto [] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "Creuzita");
            
        Visualizacao vis = new Visualizacao(g[0], v[1]);
        vis.avaliar();
        System.out.println(v[1].getAvaliacao());
        
        Visualizacao vis2 = new Visualizacao(g[1], v[1]);
        vis2.avaliar(40.0f);
        v[1].like();
        System.out.println(v[1].getAvaliacao());
        

    
    }
}
