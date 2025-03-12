package n1ex1;

import java.lang.String;

public class Percussion extends Instrument {


    public Percussion(String name, double price) {
        super(name, price);
    }


    public void play() {

        System.out.println("Està sonant un instrument de percussio");
    }
    public String toString() {
        return "Això es un " + super.getName() + " i costa " + super.getPrice();
    }
}