package basic.simuduck.quack;

public class Squeak implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("삑");
    }
}
