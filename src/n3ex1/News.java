package n3ex1;

public class News implements Price, Points {
    private String title;
    private String text;
    private int price;
    private int points;

    public News(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return this.title;
    }
    public String getText() {
        return this.text;
    }

    public int getPoints() {
        return this.calculatePoints();
    }

    public int getPrice() {
        return this.calculatePrice();
    }


    @Override
    public int calculatePoints() {
        return points;
    }

    @Override
    public int calculatePrice() {
        return price;
    }

    public String toString() {
        return "Esto es una noticia general. Mi titulo es : " + this.title + ".";
    }
}
