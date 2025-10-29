package Peoples;

public class Person {
    private final String name;
    private final String surname;
    private final Genders gender;

    public Person(String name, String surname, Genders gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Genders getGender() {
        return gender;
    }
}
