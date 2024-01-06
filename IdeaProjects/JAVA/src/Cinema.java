import java.io.Serializable;
import java.util.ArrayList;

public class Cinema implements Serializable {

    //Attributes
    private String hallName;
    private ArrayList<Movie>movies=new ArrayList<>();


    //get
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    //Constructor
    public Cinema(String hallName, ArrayList<Movie> movies) {
        this.hallName = hallName;
        this.movies = movies;
    }
}
