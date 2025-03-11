package n1ex1;

/*Static initializer blocks always execute before the instance initialization blocks because static blocks run at the time of class loading.
However, the instance block runs at the time of instance creation.
The Java compiler copies initializer blocks into every constructor.
Therefore, multiple constructors can use this approach to share a block of code:*/

public abstract class Instrument {
    // 1 atributs
    private String name;
    private double price;



    //2 constructors
    public Instrument(String name,double price ) {
        name = this.name;
        price = this.price;
    }

    // 3 getters (return)
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    //4 setters (void)
    public void setName (String name) {
        name = this.name;
    }

    public void setPrice (double price) {
        price = this.price;
    }

    // 5 methodes generals
    public abstract void play();

    static void access_static() {
        System.out.println( "AIXO ES UN ACCES A TRAVES D'UN MEMBRE STATIC DE UNA CLASSE");
    }

    // 6 metodes propis
    public String toString() {
        return "Això es un " + this.name + " i costa " + this.price;
    }

}
