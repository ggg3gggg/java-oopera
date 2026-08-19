import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Золо", Person.Gender.MALE , 172);
        Actor actor2 = new Actor("Олег", "Монгол", Person.Gender.MALE , 180);
        Actor actor3 = new Actor("Слава", "Бустер", Person.Gender.MALE , 182);

        Director director1 = new Director(10, "Квентин", "Тарантино", Person.Gender.MALE );
        Director director2 = new Director(15, "Кристофер", "Нолан", Person.Gender.MALE );

        String musicAuthor = "Алексей";
        String choreographer = "Владислав";

        Show show = new Show("Колобок", 120, director1, new ArrayList<>());

        Opera opera = new Opera(30, musicAuthor, "Ураааа", "Введение", 120, director2, new ArrayList<>());

        Ballet ballet = new Ballet(choreographer, musicAuthor, "Победааа", "Начало", 120, director1, new ArrayList<>());

        show.addActor(actor1);
        show.addActor(actor2);
        opera.addActor(actor2);
        opera.addActor(actor1);
        ballet.addActor(actor3);
        ballet.addActor(actor2);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        show.replaceActor(actor3, "Золо");
        show.printActors();

        opera.replaceActor(actor3, "Несуществующий");

        opera.printLibrettoText();
        ballet.printLibrettoText();

    }
}
