package n2ex1;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model ) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void call(String phoneNumber) {
        System.out.println("s’està trucant al número " + phoneNumber);

    }
}
