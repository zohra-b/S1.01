package n1ex2;

public class N1Ex2 {
    public static void main(String[] args) {
        Car.brake();

        Car myCar = new Car("myModel", 1.8);
        myCar.accelerate();
        myCar.brake(); //aquí vemos que se tenie que llamar desde la clase

        System.out.println(Car.getModel());
        System.out.println(myCar.getPower());
    }
}
