package n3ex1;
import java.util.ArrayList;

public class Redactor{

    // 1 atributs
    private String name;
    private String id;
    private static int salary = 1500;
    private ArrayList<Noticia> noticias = new ArrayList<Noticia>();

    // 2 constructor
    public Redactor(String name , String id) {
        this.name = name;
        this.id = id;
    }

    // 3 getters return
    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }

    public ArrayList<Noticia> getNoticias(){
        return noticias;
    }

    // 4 setters void
    public void setNom(String name) {
        this.name = name;
    }
    public static void setSou(int salary) {
        Redactor.salary = salary;
    }

    // 5 metodes generals

    // 6 metodes propis
    public String toString() {
        return "Soy el redactor " + this.name + " con el DNI " + this.id + "y como todos mis compañeros mi sueldo es de "
                + salary + " euros";
    }
}
