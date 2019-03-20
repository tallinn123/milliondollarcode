package codebank.method.getters_and_setters;

public class GeeksForGeeks {

    public String firstName;
    public boolean male;

    public GeeksForGeeks (String firstName, boolean male) {
        this.firstName = firstName;
        this.male = male;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isMale() {
        return male;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
