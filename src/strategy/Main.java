package strategy;

import strategy.ducks.DecoyDuck;
import strategy.ducks.MallardDuck;
import strategy.ducks.RedHeadDuck;
import strategy.ducks.RubberDuck;
import strategy.fly.FlyNoWay;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        System.out.println("당신은 어떤 오리 입니까?");

        mallardDuck.display();

        System.out.println("당신은 날 수 있습니까?");

        mallardDuck.performFly();

        System.out.println("우렁차게 울어주세요");

        mallardDuck.performQuack();

        System.out.println("----------------------------------------");

        RubberDuck rubberDuck = new RubberDuck();

        System.out.println("당신은 어떤 오리 입니까?");

        rubberDuck.display();

        System.out.println("당신은 날 수 있습니까?");

        rubberDuck.performFly();

        System.out.println("우렁차게 울어주세요");

        rubberDuck.performQuack();

        System.out.println("----------------------------------------");

        DecoyDuck decoyDuck = new DecoyDuck();

        System.out.println("당신은 어떤 오리 입니까?");

        decoyDuck.display();

        System.out.println("당신은 날 수 있습니까?");

        decoyDuck.performFly();

        System.out.println("우렁차게 울어주세요");

        decoyDuck.performQuack();

        System.out.println("----------------------------------------");

        RedHeadDuck redHeadDuck = new RedHeadDuck();

        System.out.println("당신은 어떤 오리 입니까?");

        redHeadDuck.display();

        System.out.println("당신은 다친거 같은데 날 수 있습니까?");

        redHeadDuck.setFlyBehavior(new FlyNoWay());

        redHeadDuck.performFly();

        System.out.println("우렁차게 울어주세요");

        redHeadDuck.performQuack();
    }

}
