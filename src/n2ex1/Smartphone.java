package n2ex1;

public class Smartphone extends Telefon
        implements Camera, Rellotge{


    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void alarm() {
        System.out.println("Està sonant l’alarma");
    }

    @Override
    public void photograph() {
        System.out.println("S’està fent una foto");
    }

}
