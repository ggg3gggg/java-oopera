public class Director extends Person{
    private int numberOfShows;

    Director(int numberOfShows, String name, String surname, Gender gender) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }
}
