package epam.task.structural;

abstract class Game{
    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}

class Cricket extends Game{
    @Override
    void initialize(){
        System.out.println("Cricket Initialized");
    }
    @Override
    void start(){
        System.out.println("Cricket Started");
    }
    @Override
    void end(){
        System.out.println("Cricket Finished");
    }

}


class Badminton extends Game{
    @Override
    void initialize(){
        System.out.println("Badminton Initialized");
    }
    @Override
    void start(){
        System.out.println("Badminton Started");
    }
    @Override
    void end(){
        System.out.println("Badminton Finished");
    }

}


public class Template{
    public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException {
        Class c = Class.forName("epam.task.structural.Cricket");
        Game game = (Game)c.newInstance();
        game.play();

    }
}