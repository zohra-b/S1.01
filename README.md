# S1.01 Inheritance and polymorphism
## _Objects Oriented Programmation_


## Objectives 
Learn to use Object Oriented Programming correctly through inheritance and polymorphisme concepts.


### Level 1 - ex 1
> In a music group there are different types of musical instruments. There are wind instruments, string instruments and percussion instruments.
All instruments have as attributes their name, and their sound. In addition, they have a method called play(). This is abstract to the instrument class and therefore has to be implemented to the full classes. If a wind instrument is playing, the method must show by console: ‘A wind instrument is playing’, if a string instrument is playing: ‘A string instrument is playing’ and if a percussion instrument is playing: ‘A percussion instrument is playing’.

### Level 1 - ex 2
>Create a "Car" class with attributes: brand, model and power. The brand has to be final, the model has final power. Demonstrate the difference between them. Doesn’t it seem like you can initiate the class constructor?
Affix the methods to the class "Car" A method estàtic anomenat brake() and another no estàtic anomenat accelerate(). The accelerator method has the console display: “The vehicle is accelerating” and the brake method () has the display: “The vehicle is slowing”.
Demonstrate how to invoke the estàtic and non-estàtic method of the main() of the main class.


### Level 2 - ex 1
>Create a class called ‘Phone’ with the attributes brand and model, and the method trucar(). This method must receive a String with a phone number. The method must display a message on the console saying that the number received by the parameter is being processed. 
Create an interface called ‘Camera’ with the photograph() method, and another interface called Rellotge with the alarm() method.
Create a class called ‘Smartphone’ that is a subclass of ‘Phone’ and at the same time implements the interfaces ‘Camera’ and ‘Plot’.
The photograph() method must show on the console: ‘A photo is being taken’ and the alarm() method must show: ‘The alarm is ringing’.
From the main() of the application, create a Smartphone object andThe process of class registration only takes place once. It shows that the chair can be triggered for the creation of the first instance of this class or for the access to a static member of this class. 
More information about initialisation blocks and static blocks in Java.

### Level 3 - ex 1
>A sports newsroom has news classified by sport: football, basketball, tennis, F1 and motorcycling.
The newsroom can have more than one editor, and we want to know the name, ID number and the name of each one of them. Once an ID has been assigned, it can never change. All editors have the same salary, and if in the future the company can increase it, it will do so for everyone equally. At the moment the current salary is 1500 €.
Each editor can work on more than one story. The news must have a headline, a text, a punctuation and a price. At the moment of creation, the text must be empty.
In addition, football news must know which competition it refers to (String), which club (String) and which player (String).
For basketball news, you must indicate which competition(String) you are referring to and which club(String).
For tennis news, you have to know which competition(String) you are talking about and which players(String).
From the F1 news we have to know which team(String) they refer to.
Motorcycling news must indicate which team(String) they are from.
The news are sent to different media. To know the price of each news we have to implement a method called calculatePreuNews(). 
The following explains how to calculate the price of each news item.
In the main class we have to create a menu with the following options:
1.- Introduce editor.
2.- Delete editor.
3.- Introduce a news item to an editor.
4.- Delete news (you have to ask for the editor and the headline of the news).
5.- Show all the news per editor.
6.- Calculate the score of the news.
7.- Calculate the price.

## Tech
- Java - JDK23
- IntelliJ
