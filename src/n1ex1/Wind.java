package n1ex1;


import java.lang.String;

public class Wind extends Instrument {

    public Wind(String name, double price) {

        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }

    public String toString(){
        return "Això es un " + super.getName() + " i costa " + super.getPrice();
    }
}
