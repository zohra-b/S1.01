package n3ex1.Models;

public class F1News extends News {
    private String team;
    private final int basePrice = 100;
    private final int ferMer = 50;

    public F1News(String title , String text, String team) {
        super(title, text);
        this.team = team;
    }

    public String getTeam() {
        return this.team;
    }


    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public int calculatePrice() {
        int price = basePrice;

        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            price += ferMer;
        }
        return price;
    }
    @Override
    public int calculatePoints() {
        int points = 4;

        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            points += 2;
        }
        return points;
    }

    @Override
    public String toString() {
        return "noticia de F1. \n Escudería : " + this.team +
                "\n Título : " + super.getTitle() + ". " +
                "\n Texto : " + super.getText();
    }


}

