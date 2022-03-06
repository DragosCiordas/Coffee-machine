package ex4;

public class Definition {
    private String description;

    public Definition(){
    }

    public Definition(String description0){
        this.description = description0;
    }


    @Override
    public String toString() {
        return "Definition{" + description + '}';
    }
}
