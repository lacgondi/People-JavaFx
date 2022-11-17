package hu.petrik.peoplereply;

public class Person {
    private int Id;
    private String name;
    private String email;
    private int age;

    public Person(int id, String name, String email, int age) {
        this.Id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("%-30s %s %3d", name, email, age);
    }


}

