package n1ex1;

public class Corda extends Instrument {
    // 1 atributs
    // 2 constructors
    public Corda(String name, double price) {
        super(name, price);
    }
    // 3 getters
    // 4 setters
    // 5 metodes generals
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }
}