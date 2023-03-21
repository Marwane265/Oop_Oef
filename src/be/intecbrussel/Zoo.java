package be.intecbrussel;

public class Zoo {
    public static void main(String[] args) {


        Animal carnivor = new Animal("lion");
        Animal underWater = new Animal("shark", 1);
        Animal bird = new Animal("eagle", 14);


        System.out.println(carnivor);
        System.out.println(underWater);
        System.out.println(bird);

        bird.eating();

        System.out.println(carnivor.eating());
        underWater.eating("Fish");


    }
}
