import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private String choreographer;

    Ballet(String choreographer, String musicAuthor, String  librettoText,String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(musicAuthor, librettoText, title, duration, director, listOfActors);
        this.choreographer = choreographer;
    }
}
