package n3ex1;
import java.util.ArrayList;

public class Copywriter {

    private String name;
    private String id;
    private static int salary = 1500;
    private ArrayList<News> cwNews = new ArrayList<News>();


    public Copywriter(String name , String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }

    public ArrayList<News> getNews(){
        return cwNews;
    }


    public void setName(String name) {
        this.name = name;
    }
    public static void setSalary(int salary) {
        Copywriter.salary = salary;
    }

    @Override
    public String toString() {
        return "el redactor " + this.name + " con el DNI " + this.id + " y como todos mis compañeros mi sueldo es de "
                + salary + " euros";
    }
}
