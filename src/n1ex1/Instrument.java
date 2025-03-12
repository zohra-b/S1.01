package n1ex1;


public abstract class Instrument {
    private java.lang.String name;
    private double price;

    public Instrument(java.lang.String name, double price ) {
        this.name = name;
        this.price = price ;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName (java.lang.String name) {
        this.name = name;
    }

    public void setPrice (double price) {
        this.price = price ;
    }

    public abstract void play();

    static void accessStatic() {
        System.out.println( "AIXO ES UN ACCES A TRAVES D'UN MEMBRE STATIC DE UNA CLASSE");
    }

    public java.lang.String toString() {
        return "Això es un " + this.name + " i costa " + this.price;
    }

}
