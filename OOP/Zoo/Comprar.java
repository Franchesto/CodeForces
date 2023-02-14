package Zoo;

public class Comprar {
    public static void main(String args[]){
        Animal dog = new Cachorro("Tobi", "Peluda", "Onivoro", 0.70f);
        Animal cat = new Gato("Tobias", "Peluda", "Onivoro", 0.50f, "Normal");
        Animal animal = new Cachorro("Doido", "Peluda", "Onivoro", 1.02f);

        dog.barulho();
        dog.sujar();
        dog.reacao();
        
        cat.barulho();
        cat.sujar();
        cat.reacao();

        animal.barulho();




    }
}
