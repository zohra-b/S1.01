package n1ex1;

public class String extends Instrument {

    public String(java.lang.String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }

    public java.lang.String toString() {
        return "Això es un " + super.getName() + " i costa " + super.getPrice();
    }
}