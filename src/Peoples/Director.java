package Peoples;

public class Director extends Person {
    private final int numberOfShows;

    public Director(String name, String surname, Genders gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void infAboutDirector() {
        System.out.println(
                "Информация о режиссёре спектакля:\n" +
                "Имя: " + getName() + "\n" +
                "Фамилия: " + getSurname());
    }
}
