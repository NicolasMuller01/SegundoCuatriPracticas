package Unidad3Ejercicio6;

public class Name {
    String firstName;
    Character mi;
    String lastName;

    public Name(String firstName, Character mi, String lastName) {
        this.firstName = firstName;
        this.mi = mi;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Character getMi() {
        return mi;
    }

    public void setMi(Character mi) {
        this.mi = mi;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
