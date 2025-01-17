package strategy.ducks;

import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck");
    }

}
