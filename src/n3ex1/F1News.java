package n3ex1;

public class F1News extends News {
    private String team;
    private final int basePrice = 100;
    private final int ferMer = 50;

    public F1News(String title , String team) {
        super(title);
        this.team = team;

    }

    public String getTeam() {
        return this.team;
    }


    public void setTeam(String team) {
        this.team = team;
    }


    public int calculatePrice() {
        int price = basePrice;

        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            price += ferMer;
        }
        return price;
    }

    public int calculatePoints() {
        int points = 4;

        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            points += 2;
        }
        return points;
    }

    public String toString() {
        return "Esto es una noticia de F1. Mi título es : " + super.getTitle() + ". ";
    }




}

