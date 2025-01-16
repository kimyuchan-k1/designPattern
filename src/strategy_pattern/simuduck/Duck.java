package strategy_pattern.simuduck;

import strategy_pattern.simuduck.fly.FlyBehavior;
import strategy_pattern.simuduck.quack.QuackBehavior;

// 슈퍼클래스
public abstract class Duck {
    //setter - 동적으로 할당!!
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    // 변하는 것들. - quack, fly -인터페이스로 설계
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public Duck()  {    }

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    //변하지 않는 것 - 공통 메서드
    public abstract void display();
    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 물에 뜹니다.");
    }
}
