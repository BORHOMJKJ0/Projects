import java.io.*;
import java.util.*;

public class Ticket implements Serializable {

    //Attributes
    static int baseN_chair=1;
    private int N_chair;
    private int price;
    private boolean isBooked;
    private String movieName;

    public String getMovieName() {
        return movieName;
    }

    public static void setBaseN_chair(int baseN_chair) {
        Ticket.baseN_chair = baseN_chair;
    }

    public void setN_chair(int n_chair) {
        N_chair = n_chair;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setShowTime(int showTime) {
        ShowTime = showTime;
    }

    public Time getTime() {
        return time;
    }

    public int getShowTime() {
        return ShowTime;
    }

    private Time time;
    private int ShowTime;


    //Constructor
    public Ticket(int price,String movieName,Time time,int ShowTime)
         {
        N_chair = baseN_chair++;
        this.price = price;
        this.isBooked=false;
        this.movieName=movieName;
        this.time=time;
        this.ShowTime=ShowTime;
    }


    //get
    public int getPrice() {
        return price;
    }

    public static int getBaseN_chair() {
        return baseN_chair;
    }


    //set
    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getN_chair() {
        return N_chair;
    }

    public boolean isBooked() {
        return isBooked;
    }

   public void chairInformation(){
        System.out.println("Movie name: "+this.movieName);
        System.out.print("Show Time: ");this.time.print();
        System.out.println("Price: "+this.getPrice());
        System.out.println("Number of chair: "+this.getN_chair());
    }}
/*
    public static void saveTickets(ArrayList<Ticket> tickets) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tickets_data.ser"))) {
            oos.writeObject(tickets);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Ticket> loadTickets() {
        ArrayList<Ticket> tickets = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tickets_data.ser"))) {
            tickets = (ArrayList<Ticket>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tickets;
    }
}*/
