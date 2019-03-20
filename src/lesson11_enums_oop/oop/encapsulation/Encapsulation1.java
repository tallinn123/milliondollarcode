package lesson11_enums_oop.oop.encapsulation;

public class Encapsulation1 {

    // constructors are added after the class

    private String foo;
    private String bar;
    private boolean male;

    public Encapsulation1(String foo, String bar, boolean male) {

        this.foo = foo;
        this.bar = bar;
        this.male = male;
    }

    public String getFoo() {
        if (foo.equals("not aloowed")){
            return "you did something wrong";
        }
        return foo;
    }

    public boolean setMale() {
        return male;
    }

    public String getBar() {
        return bar;
    }

    public void setFoo(String foo) {
        if (foo.equals("dangerous")) {
            this.foo = "not allowed";
        } else {
            this.foo = foo;
        }
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setBar(String bar) {
        this.bar=bar;
    }
}
