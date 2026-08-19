public class Person {
    private String name;       //имя
    private String surname;    //фамилия
    private Gender gender;

    public enum Gender {
        MALE,
        FEMALE
    }

    Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
