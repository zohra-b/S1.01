package n1ex2;

public class Cotxe {
    /*Whenever a variable is declared as static, this means there is only one copy of it for the entire class,
     *  rather than each instance having its own copy.
     *  A static method means it can be called without creating an instance of the class (as seen in n1exercici1)
     */
    /*las variables static pertenecen a toda la clase y no a un objeto instancia de la clase*/
    /*los metodos static se pueden llamar sin instanciar un objeto de la clase */

    // 1 atributs
    private static final String BRAND = "Mi Marca";
    private static String model;
    private final double POWER = 1.8;

    // 2 constructor
    public Cotxe() {
        /*POWER y BRAND no se pueden poner en el contructor ya que son final
         * Pero model tampoco se debería poner en el contructor ya que al ser static NO PERTENECE a una instancia de la clase
         * sino a la clase misma*/


    }

    // 3 - getters
    public static String getBrand() { // la variable BRAND es static --> el método getBRAND debe ser static también;
        return BRAND; //no hace falta poner this.BRAND porque BRAND es static
    }

    public static String getModel() {
        return model;
    }

    public double getPower() {
        return POWER;
    }

// 4 - setters
    //BRAND y POWER son final --> no setter

    /*de la misma manera que para el constructor, mo tiene sentido crear un setter para el modelo porque
     * al ser static el valor se aplicara a toda la clase y no a un objeto de la clase
     * Por otro lado, si no inicializamos el string model en los atributos pero tampoco lo hacemos en el constructor
     * ni en el setter, el string model siempre estará vacío !
     */

    // 5 metodes generals
    public static void brake() {
        System.out.println("El cotxe frena");
    }

    public void accelerate() {
        System.out.println("El cotxe accelera");
    }
}
