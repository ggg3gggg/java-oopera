import java.util.ArrayList;

public class Show {
    private String title;              //название
    private int duration;           //длительность в минутах
    private Director director;           //режиссер
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }//список актеров

    public void printDirector() {
        System.out.println(director.getName() + " " + director.getSurname());
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor actor) {
        for (Actor existingActor : listOfActors) {
            if (existingActor.getName().equals(actor.getName()) &&
            existingActor.getSurname().equals(actor.getSurname()) &&
            existingActor.getHeight() == actor.getHeight()) {
                System.out.println("Предупреждение");
                return;
            }
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor actor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, actor);
                return;
            }
        }
        System.out.println("Предупреждение");
    }
}
