package builder_pattern;

import builder_pattern.enums.Gender;

public class Hamburger {
    // 학생 기본 정보

    private int id;
    private String patty;
    private String tomato;
    private String cheese;

    public Hamburger(int id, String patty, String tomato, String cheese) {
        this.id = id;
        this.patty = patty;
        this.tomato = tomato;
        this.cheese = cheese;
    }

    public Hamburger(int id, String patty, String tomato) {
        this.id = id;
        this.patty = patty;
        this.tomato = tomato;

    }

    public Hamburger(int id, String patty) {
        this.id = id;
        this.patty = patty;
    }

    public Hamburger(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "id=" + id +
                ", patty='" + patty + '\'' +
                ", tomato='" + tomato + '\'' +
                ", cheese='" + cheese + '\'' +
                '}';
    }
}
