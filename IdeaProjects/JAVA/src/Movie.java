import java.io.Serializable;
import java.util.ArrayList;

public class Movie implements Serializable {

    //Attributes
    private static int baseID =10000;
    private int movieID;
    private String type;
    private ShowTime showTime;


    //Constructor
    public Movie(String type, ShowTime showTime) {
        this.movieID = baseID++;
        this.type = type;
        this.showTime = showTime;
    }
    public ShowTime getShowTime() {
        return showTime;
    }

    public static int getBaseID() {
        return baseID;
    }

    public static void setBaseID(int baseID) {
        Movie.baseID = baseID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }

    //Printing the attributes of film
    public void print() {
        System.out.println("Movie ID: "+this.movieID);
        System.out.println("Type: "+this.type);
        System.out.println("Show Time: "+this.showTime);
    }
}
