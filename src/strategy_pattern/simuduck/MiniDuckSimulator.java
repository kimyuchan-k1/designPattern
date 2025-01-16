package strategy_pattern.simuduck;

import strategy_pattern.simuduck.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        // 실행 중 동적으로 변경 - 이점
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

