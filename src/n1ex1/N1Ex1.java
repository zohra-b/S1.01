package n1ex1;

public class N1Ex1 {
    public static void main(java.lang.String[] args) {
        Instrument.accessStatic();

        Instrument myWind = new Wind("Flauta", 200);
        myWind.play();
        String myString = new String("Violin", 750);
        myString.play();
        Percussion myPercussion = new Percussion("tambor", 250);
        myPercussion.play();

    }

}

