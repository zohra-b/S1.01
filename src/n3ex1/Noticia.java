package n3ex1;

public class Noticia implements Preu, Puntuacio{

    // 1 atributs
    private String title;
    private String text;
    private int price;

    // 2 constructor
    public Noticia(String title) {
        this.title = title;

    }

    // 3 getters
    public String getTitle() {
        return this.title;
    }
    public String getText() {
        return this.text;
    }

    public int getPuntuacio() {
        return this.calculatePoints();
    }

    public int getPrice() {
        return this.calculatePrice();
    }

    // 4 setters

    // 5 metodes generals

    @Override
    public int calculatePoints() {

        return 0;
    }

    @Override
    public int calculatePrice() {

        return price;
    }

    // 6 metodes propis
    public String toString() {
        return "Esto es una noticia general. Mi titulo es : " + this.title + ".";
    }
}
