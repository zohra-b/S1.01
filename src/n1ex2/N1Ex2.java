package n1ex2;

public class N1Ex2 {
    public static void main(String[] args) {
        Cotxe.brake();

        //si excribimos Cotxe.  nos salen todos los metodos accessibles de manera estatica o sea getBrand(), getModel() y brake();
        //pero para acceder al metodo accelerate(), hay que instanciar un objeto de la clase Cotxe :

        Cotxe myCar = new Cotxe(); //no hace falta ningun argumento ya que no hay nada en el constructor
        myCar.accelerate();
        myCar.brake(); // aquí a pesar de poder ejecutar el metodo brake(), Eclipse nos aconseja accedir de una manera estatica (como en linea 6)

    }
}
