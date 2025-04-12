package builder_pattern;

public class BuilderApplication {
    public static void main(String[] args) {
        // 햄버거 생성 - old version - 다른 인스턴스를 넣은 객체를 계속 생성해야해서 번거로움. 또한, 인스턴스가 각각 뭐가 뭔지 헷갈림.
        // setter 로 인스턴스 를 넣는 방식으로 바꿀 경우 의 문제는 객체의 불변성을 보장하지 못하고 일관성 있는 객체 생성을 하지 못함.

        Hamburger burger1 = new Hamburger(1);
        Hamburger burger2 = new Hamburger(2, "cow");
        Hamburger burger3 = new Hamburger(2, "cow","tomato");


        System.out.println(burger1);
        System.out.println(burger2);
        System.out.println(burger3);


        System.out.println();
        System.out.println("====================================================");
        System.out.println();
        // 햄버거 생성 - 빌더 사용 -> 깔끔하고 체이닝 기법으로 쉽게 인슽천스를 추가해 생성 할 수 있음. 불변 보장 , 일관성 보장


        Hamburger builderBurger1 = new HamburgerBuilder().id(1).build();
        Hamburger builderBurger2 = new HamburgerBuilder().id(1).tomato("yes").build();
        Hamburger builderBurger3 = new HamburgerBuilder().id(1).tomato("yes").cheese("yes").patty("yes").build();


        System.out.println(builderBurger1);
        System.out.println(builderBurger2);
        System.out.println(builderBurger3);



    }
}
