import java.util.Iterator;

public class Ticketing {
    public static void ticketing(User user,Ticket ticket){
        if(user.getFunds()<ticket.getPrice())
            System.out.println("Sorry, you don't have enough funds!");
        else
        {
            user.withdraw(ticket.getPrice());
            ticket.setBooked(true);
            user.getBookedTickets().add(ticket);
            System.out.println("Chair has booked successfully :>");
        }
    }

    public static void cancelTicketing(User user, Ticket ticket) {
        Iterator<Ticket> iterator = user.getBookedTickets().iterator();

        while (iterator.hasNext()) {
            Ticket t = iterator.next();
            if (ticket.equals(t)) {
                ticket.setBooked(false);
                user.deposit(ticket.getPrice());
                iterator.remove();
                System.out.println("Ticket has been canceled successfully :>");
                break;
            }}}}