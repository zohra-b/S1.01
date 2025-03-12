package n1ex2;

public class Car {

    private static final String BRAND = "Mi Marca";
    private static String model;
    private final double POWER;


    public Car(String model, double power) {
        Car.model = model;
        this.POWER = power;
    }

    public static String getBrand() {
        return BRAND;
    }

    public static String getModel() {
        return model;
    }

    public double getPower() {
        return POWER;
    }


    public static void setModel(String model){
        Car.model = model;
    }



    public static void brake() {
        System.out.println("El cotxe frena");
    }

    public void accelerate() {
        System.out.println("El cotxe accelera");
    }

    public String toString(){
       return "Soc un cotxe de marca " + Car.getBrand()+ ", el meu model és " + Car.getModel() + "amb una potencia de " + this.getPower();
    }
}
