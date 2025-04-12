package builder_pattern;

public class HamburgerBuilder {
    private int id;
    private String patty;
    private String tomato;
    private String cheese;

    public HamburgerBuilder id (int id) {
        this.id = id;
        return this;
    }

    public HamburgerBuilder patty (String patty) {
        this.patty = patty;
        return this;
    }

    public HamburgerBuilder tomato (String tomato) {
        this.tomato = tomato;
        return this;
    }

    public HamburgerBuilder cheese (String cheese) {
        this.cheese = cheese;
        return this;
    }

    // 최종 객체 빌드
    public Hamburger build() {
        return new Hamburger(id,patty,tomato,cheese);
    }

}
