package strategy.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squack!! Squeak!!");
    }
}
