package ex2;
import ex2.Author;
public class Author {
    private String name, email;
    private char gender;

    public Author(String name0, String email0, char gender0) {
        this.name = name0;
        this.email = email0;
        if (gender0 == 'm' || gender0 == 'f')
            this.gender = gender0;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return " " + name + "(" + gender + ")" +" at "+email;
    }

}
