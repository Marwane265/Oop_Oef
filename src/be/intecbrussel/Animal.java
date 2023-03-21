package be.intecbrussel;

public class Animal {
    // Je maakt 2 klassen:
    // Animal klas
    // Zoo klas -> deze bevat de main methode.

    // Animal klas heeft 2 properties String name en int age.
    // Je zorgt voor validatie op de age properties zodat de leeftijd niet onder 0 kan en boven 100.
    // Je maakt ook een eigen methode van eating(). Hier ga je zorgen dat de dieren kunnen eten.
    // Doormethod overloading zorg je ervoor dat we een methode zonder parameter hebben en een metparameter om een soort voedsel in te voeren als String vorm.
    // Hier zorg je ook voor een validatie bij de methode van eating() dat als het dier onder de 1 jaar is dat het niet het voedsel mag eten. Pas boven de 1.

    // Tot slot maak je een toString methode aan die we kunnen gebruiken om het object netjes te kunnen uitprinten.

    //Properties
    private String name; // van een object dus String is null

    // primitieve: byte, short, int, long -> 0 bij float en double: 0,0 bij boolean -> false en char: \u0000
    private int age; // default is 0,

    // constructors
    public Animal(String name) {
        this.name = name;
    }


    public Animal(String name, int age) {
        this.name = name;
        setAge(age);
    }


    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {


        if (age < 0 || age > 100) {
            System.out.println("Not possible");
        } else {
            this.age = age;
        }

    }


    //Eigen methode 1 zonder parameter en 1 met.
    //Zonder parameter
    public String eating() {
        return "Eating food";
    }

    //met parameter
    public String eating(String food) {
        if (age < 1) {
            System.out.println("You can not eat the food");

        } else {
            System.out.println("Go ahead and eat the food");
        }
        return food;
    }


    public String toString() {
        return "{name= " + name + " Age=" + age + "}";
    }


}



