package decorator_pattern;

public class DarkRoast extends Beverage{

    public DarkRoast()  {
        description = "다크 로스팅 커피";
    }
    @Override
    public double cost() {
        return 1.2;
    }
}
