package c2.c2_5;

public class Customer1 {
    private int id;
    private String name;
    private char gender;
    public Customer1(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        String text = name + "(" + id + ")";
        return text;
    }
}