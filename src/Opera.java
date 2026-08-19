import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;

    Opera(int choirSize, String musicAuthor, String  librettoText,String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(musicAuthor, librettoText, title, duration, director, listOfActors);
        this.choirSize = choirSize;
    }
}


