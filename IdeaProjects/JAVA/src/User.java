import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class User implements Serializable {
    //private static final long serialVersionUID = -3387336704062501803L;
    //Attributes
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    //user image
    private long funds;
    private ArrayList<Ticket>bookedTickets=new ArrayList<Ticket>();
    private Map<Integer, Boolean> chairReservations;


    //Constructor  إنشاءحساب
    public User(String userName,String password) {
        this.userName = userName;
        this.funds = 100000;
        this.password=password;
        this.chairReservations = new HashMap<>();
    }

    public void setFunds(long funds) {
        this.funds = funds;
    }

    //get
    public long getFunds() {
        return funds;
    }

    public ArrayList<Ticket> getBookedTickets() {
        return bookedTickets;
    }

    //deposit
    public void deposit(long amount) {
        this.funds+=amount;
    }

    //withdraw
    public void withdraw(long amount){
        this.funds -= amount;
    }

    //Printing information of user
    public void details(){
        System.out.println("User name: " + this.userName);
        System.out.println("Funds: " + this.funds);
        System.out.println("Booked tickets: "+this.getBookedTickets().size());
        for (Ticket t:this.getBookedTickets()) {
           t.chairInformation();
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBookedTickets(ArrayList<Ticket> bookedTickets) {
        this.bookedTickets = bookedTickets;
    }

    public Map<Integer, Boolean> getChairReservations() {
        return chairReservations;
    }

    public void setChairReservations(Map<Integer, Boolean> chairReservations) {
        this.chairReservations = chairReservations;
    }

    public void bookTicket(Ticket ticket) {
        if (!ticket.isBooked() && funds >= ticket.getPrice()) {
            bookedTickets.add(ticket);
            ticket.setBooked(true);
            withdraw(ticket.getPrice());
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket booking failed!");
        }
    }
    private void loadUsers() {
        try (FileInputStream fileIn = new FileInputStream("user_data.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            ArrayList<User>users = (ArrayList<User>) objectIn.readObject(); // Load usernames// Load passwords
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle exception (e.g., show an error message or initialize the lists)
        }
    }
    public static void saveUser(User user) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user_data.ser.txt"))) {
            oos.writeObject(user);
            //oos.writeLong(user.getFunds());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reserveChair(int chairNumber) {
        chairReservations.put(chairNumber, true);
    }
   /* public void releaseChair(int chairNumber) {
        chairReservations.remove(chairNumber);
    }
    public boolean ownsChair(int chairNumber) {
        return chairReservations.containsKey(chairNumber);
    }*/
    public static User loadUser() {
        User user = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user_data.ser.txt"))) {
            user = (User) ois.readObject();
            user.setFunds(user.getFunds());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
