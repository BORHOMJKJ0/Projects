import java.io.Serializable;
import java.util.ArrayList;

public class ShowTime implements Serializable {
    //Attributes
    Time time;
    private ArrayList<Ticket>TicketsOfShow=new ArrayList<>();

    //Constructor
    public ShowTime(Time time, ArrayList<Ticket> ticketsOfShow) {
        this.time = time;
        TicketsOfShow = ticketsOfShow;
    }


    //get
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setTicketsOfShow(ArrayList<Ticket> ticketsOfShow) {
        TicketsOfShow = ticketsOfShow;
    }

    public ArrayList<Ticket> getTicketsOfShow() {
        return TicketsOfShow;
    }
}
