package strategy.ducks;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck!!");
    }

}
