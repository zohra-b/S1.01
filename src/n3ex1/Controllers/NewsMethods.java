package n3ex1.Controllers;

import n3ex1.Models.*;

import static n3ex1.Controllers.CopywriterMethods.copywriterIndex;
import static n3ex1.Controllers.CopywriterMethods.copywriterIndexByName;
import static n3ex1.N3Ex1.*;

public class NewsMethods {
    public static String newsList() {
        String newsList = "Lista noticias : \n";
        int i = 1;
        for(Copywriter r : copywriters) {
            for (News n : r.getNews()) {
                newsList += i++ + ". " + r.getName()  + " - " + getSport(n) + " - "+ n.getTitle() +  ".\n";
            }
        }
        return newsList;
    }


    public static String copywriterArticles(String id) {
        int index = copywriterIndex(id);
        String copywriterArticles = "Lista de las noticias del redactor/a : \n";
        News copywriterArticle;
        String answer;
        if (index == -1){
            answer = "Comprueba el DNI introducido";
        } else {
            for (int i = 0 ; i < copywriters.get(index).getNews().size() ; i++) {

                copywriterArticle = copywriters.get(index).getNews().get(i);
                copywriterArticles += (i+1) + ".- " + getSport(copywriterArticle) + " - " + copywriterArticle.getTitle() + "\n";
            }
            answer = copywriterArticles;
        }
        return answer;
    }

    public static String copywriterArticlesByName(String name) {
        int index = copywriterIndexByName(name);
        String copywriterArticles = "Lista de las noticias del redactor/a : \n";
        String answer;
        News news;
        if (index == -1){
            answer = "Se ha equivocado introduciendo el nombre. Inténtalo de nuevo.";
        } else {
            for (int i = 0 ; i < copywriters.get(index).getNews().size() ; i++) {

                news = copywriters.get(index).getNews().get(i);
                copywriterArticles += (i+1) + ".- " + getSport(news) + " - " + news.getTitle() + "\n";
            }
            answer = copywriterArticles;
        }
        return answer;
    }

    public static String getSport(News news) {
        String sport = "";
        if(news instanceof FootballNews) {
            sport = "Futbol";
        } else if(news instanceof BasketNews) {
            sport = "Basquet";
        } else if(news instanceof TennisNews) {
            sport = "Tenis";
        } else if(news instanceof F1News) {
            sport = "F1";
        } else if(news instanceof MotoNews) {
            sport = "Motociclisme";
        }
        return sport;
    }

    public static int articleIndex(String name, String title) {
        int copywriterIndex = copywriterIndexByName(name);
        int articleIndex = -1;
        for (int i = 0 ; i < copywriters.get(copywriterIndex).getNews().size(); i++) {
            if(title.equalsIgnoreCase(copywriters.get(copywriterIndex).getNews().get(i).getTitle())) {
                articleIndex = i;
            }
        }
        return articleIndex;
    }

    public static String createFootballNews(String id, String title, String text,
                                            String competition, String club, String player){
        String answer="";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    FootballNews newArticle = new FootballNews(title, text, competition, club, player);
                    r.getNews().add(newArticle);
                    answer = "Se ha creado una "+ newArticle;
                }
            }
        }
        return answer;
    }

    public static String createBasketNews(String id, String title, String text,
                                          String competition, String club){
        String answer = "";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    BasketNews newArticle = new BasketNews(title, text, competition, club);
                    r.getNews().add(newArticle);
                    answer = "Se ha creado una "+ newArticle;
                } 			}
        }
        return answer;
    }

    public static String createTennisNews(String id, String title, String text,
                                          String competition, String player){
        String answer = "";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    TennisNews newArticle = new TennisNews(title, text, competition, player);
                    r.getNews().add(newArticle);
                    answer = "Se ha creado una "+ newArticle;
                }
            }
        }
        return answer;
    }

    public static String createF1News(String id, String title, String text,
                                      String team){
        String answer = "";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    F1News newArticle = new F1News(title, text, team);
                    r.getNews().add(newArticle);
                    answer = "Se ha creado una "+ newArticle;
                }
            }
        }
        return answer;
    }


    public static String createMotoNews(String id, String title, String text,
                                        String team){
        String answer = "";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    MotoNews newArticle = new MotoNews(title, text, team);
                    r.getNews().add(newArticle);
                    answer = "Se ha creado una "+ newArticle;
                }
            }
        }
        return answer;
    }

    public static String deleteNews(String name, String title) {
        int copywriterIndex = copywriterIndexByName(name);
        int articleIndex = articleIndex(name, title);
        String answer;

        if(copywriterIndex == -1) {
            answer = "Este nombre no existe ";
        } else if(articleIndex == -1) {
            answer = "Este título no existe";
        } else {
            copywriters.get(copywriterIndex).getNews().remove(articleIndex);
            answer =  "La noticia ha sido eliminada";
        }
        return answer ;
    }

    public static String calculatePrice(String name, String title) {
        int copywriterIndex = copywriterIndexByName(name);
        int articleIndex = articleIndex(name, title);
        String answer;
        int price;
        if(copywriterIndex == -1) {
            answer = "Este nombre no existe ";
        } else if(articleIndex == -1) {
            answer = "Este título no existe";
        } else {
            price = copywriters.get(copywriterIndex).getNews().get(articleIndex).calculatePrice();
            answer = "El precio de la noticia es de " + price + " euros";
        }
        return answer;
    }

    public static String calculatePoints(String name, String title) {
        int copywriterIndex = copywriterIndexByName(name);
        int articleIndex = articleIndex(name, title);
        String answer;
        int points;
        if(copywriterIndex == -1) {
            answer = "Este nombre no existe ";
        } else if(articleIndex == -1) {
            answer = "Este título no existe";
        } else {
            points =  copywriters.get(copywriterIndex).getNews().get(articleIndex).calculatePoints();
            answer = "la noticia vale " + points + " puntos";
        }
        return answer;
    }

}
