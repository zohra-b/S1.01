package n3ex1;

public class NoticiaF1 extends Noticia {
    //atributs
    private String team;
    private final int basePrice = 100;
    private final int ferMer = 50;

    //constructor
    public NoticiaF1(String title , String team) {
        super(title);
        this.team = team;

    }

    // getters
    public String getTeam() {
        return this.team;
    }




    // setters
    public void setTeam(String team) {
        this.team = team;
    }


    // metodes generals
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

    // metodes propis
    public String toString() {
        return "Esto es una noticia de F1. Mi título es : " + super.getTitle() + ". ";
    }




}

