package n3ex1;

public class NoticiaMoto extends Noticia {
    //atributs
    private String team;
    private final int basePrice = 100;
    private final int honYam = 50;

    //constructor
    public NoticiaMoto(String title , String team) {
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

        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            price += honYam;
        }
        return price;
    }

    public int calculatePoints() {
        int points = 3;

        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            points +=3;
        }
        return points;
    }

    // metodes propis
    public String toString() {
        return "Esto es una noticia de motociclisme. Mi título es : " + super.getTitle() + ". ";
    }

}
