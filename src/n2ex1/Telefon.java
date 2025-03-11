package n2ex1;

public class Telefon {
    // 1 atributs brand i model, i el mètode call()
    private String brand;
    private String model;


    // 2 constructor
    public Telefon(String brand,String model ) {
        this.brand = brand;
        this.model = model;
    }

    // 3 getters (return)
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    // 4 setters (void)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // 5 metodes
    public void call(String phoneNumber) {
        System.out.println("s’està trucant al número " + phoneNumber);

    }
}
