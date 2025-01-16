package strategy_pattern.simuduck;

import strategy_pattern.simuduck.fly.FlyWithWings;
import strategy_pattern.simuduck.quack.Quack;

public class MallardDuck extends Duck {

    // 여기서 특징을 무엇으로 할지 결정할 수있음.
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        
    }
    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }

}
