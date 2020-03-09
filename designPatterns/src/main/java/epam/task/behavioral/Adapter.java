package epam.task.behavioral;

interface Bird{
    public void fly();
    public void makeSound();
}

class Parrot implements Bird{
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp.");
    }
}

interface Duck{
    public void squeak();
}

class PlasticDuck implements Duck{
    @Override
    public void squeak() {
        System.out.println("Squeak..");
    }
}

class BirdAdapter implements Duck{
    Bird bird;
    public BirdAdapter(){

    }

    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}

public class Adapter{
    public static void main(String args[]){
        Parrot parrot = new Parrot();
        Duck duck = new PlasticDuck();
        Duck birdAdapter = new BirdAdapter(parrot);

        System.out.println("Parrot");
        parrot.fly();
        parrot.makeSound();

        System.out.println("Duck");
        duck.squeak();

        System.out.println("Bird Adapter");
        birdAdapter.squeak();
    }
}