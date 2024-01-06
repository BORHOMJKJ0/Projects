import java.io.Serializable;

public class Time implements Serializable {

    //Attributes
    private String hour;
    private String duration;
    private String date;

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public String getDate() {
        return date;
    }

    //Constructor
    public Time(String hour, String duration, String date) {
        this.hour = hour;
        this.duration = duration;
        this.date = date;
    }


    //Printing time
    public void print() {
        System.out.println(this.hour+" - "+this.duration+" - "+this.date);
    }
}
