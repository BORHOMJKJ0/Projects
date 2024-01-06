import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException , ClassNotFoundException {

        // Show Time 1

        //Movie1  How To Train Your Dragon 1
        Time M1T1 = new Time("2pm", "2:10:00", "1/1/2024");

        ArrayList<Ticket> M1T1Tickets = new ArrayList<Ticket>();
        M1T1Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T1, 1)); //1
        M1T1Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T1, 1)); //2
        M1T1Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T1, 1)); //3
        M1T1Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T1, 1)); //4
        M1T1Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T1, 1)); //5
        M1T1Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T1, 1)); //6
        M1T1Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T1, 1)); //7
        M1T1Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T1, 1)); //8
        M1T1Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T1, 1)); //9
        M1T1Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T1, 1)); //10
        ShowTime M1S1 = new ShowTime(M1T1, M1T1Tickets);

        //Movie2  How To Train Your Dragon 2
        Time M2T1 = new Time("4:30pm", "1:35:00", "1/1/2024");

        ArrayList<Ticket> M2T1Tickets = new ArrayList<Ticket>();
        M2T1Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T1, 1)); //1
        M2T1Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T1, 1)); //2
        M2T1Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T1, 1)); //3
        M2T1Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T1, 1)); //4
        M2T1Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T1, 1)); //5
        M2T1Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T1, 1)); //6
        M2T1Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T1, 1)); //7
        M2T1Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T1, 1)); //8
        M2T1Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T1, 1)); //9
        M2T1Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T1, 1)); //10
        ShowTime M2S1 = new ShowTime(M2T1, M2T1Tickets);

        //Movie3    How To Train Your Dragon 3
        Time M3T1 = new Time("5pm", "2:20:00", "1/1/2024");

        ArrayList<Ticket> M3T1Tickets = new ArrayList<Ticket>();
        M3T1Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T1, 1)); //1
        M3T1Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T1, 1)); //2
        M3T1Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T1, 1)); //3
        M3T1Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T1, 1)); //4
        M3T1Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T1, 1)); //5
        M3T1Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T1, 1)); //6
        M3T1Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T1, 1)); //7
        M3T1Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T1, 1)); //8
        M3T1Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T1, 1)); //9
        M3T1Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T1, 1)); //10
        ShowTime M3S1 = new ShowTime(M3T1, M3T1Tickets);

        //Movie4    Incredibles 1
        Time M4T1 = new Time("8:15pm", "2:48:00", "1/1/2024");

        ArrayList<Ticket> M4T1Tickets = new ArrayList<Ticket>();
        M4T1Tickets.add(new Ticket(25000, "Incredibles 1", M4T1, 1)); //1
        M4T1Tickets.add(new Ticket(25000, "Incredibles 1", M4T1, 1)); //2
        M4T1Tickets.add(new Ticket(25000, "Incredibles 1", M4T1, 1)); //3
        M4T1Tickets.add(new Ticket(25000, "Incredibles 1", M4T1, 1)); //4
        M4T1Tickets.add(new Ticket(25000, "Incredibles 1", M4T1, 1)); //5
        M4T1Tickets.add(new Ticket(17500, "Incredibles 1", M4T1, 1)); //6
        M4T1Tickets.add(new Ticket(17500, "Incredibles 1", M4T1, 1)); //7
        M4T1Tickets.add(new Ticket(17500, "Incredibles 1", M4T1, 1)); //8
        M4T1Tickets.add(new Ticket(17500, "Incredibles 1", M4T1, 1)); //9
        M4T1Tickets.add(new Ticket(17500, "Incredibles 1", M4T1, 1)); //10
        ShowTime M4S1 = new ShowTime(M4T1, M4T1Tickets);

        //Movie5    Incredibles 2
        Time M5T1 = new Time("2pm", "2:10:00", "1/1/2024");

        ArrayList<Ticket> M5T1Tickets = new ArrayList<Ticket>();
        M5T1Tickets.add(new Ticket(25000, "Incredibles 2", M5T1, 1)); //2
        M5T1Tickets.add(new Ticket(25000, "Incredibles 2", M5T1, 1)); //1
        M5T1Tickets.add(new Ticket(25000, "Incredibles 2", M5T1, 1)); //3
        M5T1Tickets.add(new Ticket(25000, "Incredibles 2", M5T1, 1)); //4
        M5T1Tickets.add(new Ticket(25000, "Incredibles 2", M5T1, 1)); //5
        M5T1Tickets.add(new Ticket(17500, "Incredibles 2", M5T1, 1)); //6
        M5T1Tickets.add(new Ticket(17500, "Incredibles 2", M5T1, 1)); //7
        M5T1Tickets.add(new Ticket(17500, "Incredibles 2", M5T1, 1)); //8
        M5T1Tickets.add(new Ticket(17500, "Incredibles 2", M5T1, 1)); //9
        M5T1Tickets.add(new Ticket(17500, "Incredibles 2", M5T1, 1)); //10
        ShowTime M5S1 = new ShowTime(M5T1, M5T1Tickets);

        //Movie6    Cars 1
        Time M6T1 = new Time("1pm", "1:10:00", "2/1/2024");

        ArrayList<Ticket> M6T1Tickets = new ArrayList<Ticket>();
        M6T1Tickets.add(new Ticket(15000, "Cars 1", M6T1, 1)); //1
        M6T1Tickets.add(new Ticket(15000, "Cars 1", M6T1, 1)); //2
        M6T1Tickets.add(new Ticket(15000, "Cars 1", M6T1, 1)); //3
        M6T1Tickets.add(new Ticket(15000, "Cars 1", M6T1, 1)); //4
        M6T1Tickets.add(new Ticket(15000, "Cars 1", M6T1, 1)); //5
        M6T1Tickets.add(new Ticket(10000, "Cars 1", M6T1, 1)); //6
        M6T1Tickets.add(new Ticket(10000, "Cars 1", M6T1, 1)); //7
        M6T1Tickets.add(new Ticket(10000, "Cars 1", M6T1, 1)); //8
        M6T1Tickets.add(new Ticket(10000, "Cars 1", M6T1, 1)); //9
        M6T1Tickets.add(new Ticket(10000, "Cars 1", M6T1, 1)); //10
        ShowTime M6S1 = new ShowTime(M6T1, M6T1Tickets);

        //Movie7    Cars2
        Time M7T1 = new Time("5:25pm", "2:08:00", "2/1/2024");

        ArrayList<Ticket> M7T1Tickets = new ArrayList<Ticket>();
        M7T1Tickets.add(new Ticket(15000, "Cars 2", M7T1, 1)); //1
        M7T1Tickets.add(new Ticket(15000, "Cars 2", M7T1, 1)); //2
        M7T1Tickets.add(new Ticket(15000, "Cars 2", M7T1, 1)); //3
        M7T1Tickets.add(new Ticket(15000, "Cars 2", M7T1, 1)); //4
        M7T1Tickets.add(new Ticket(15000, "Cars 2", M7T1, 1)); //5
        M7T1Tickets.add(new Ticket(10000, "Cars 2", M7T1, 1)); //6
        M7T1Tickets.add(new Ticket(10000, "Cars 2", M7T1, 1)); //7
        M7T1Tickets.add(new Ticket(10000, "Cars 2", M7T1, 1)); //8
        M7T1Tickets.add(new Ticket(10000, "Cars 2", M7T1, 1)); //9
        M7T1Tickets.add(new Ticket(10000, "Cars 2", M7T1, 1)); //10
        ShowTime M7S1 = new ShowTime(M7T1, M7T1Tickets);

        //Movie8 Cars3
        Time M8T1 = new Time("11pm", "3:10:00", "2/1/2024");

        ArrayList<Ticket> M8T1Tickets = new ArrayList<Ticket>();
        M8T1Tickets.add(new Ticket(14000, "Cars 3", M8T1, 1)); //1
        M8T1Tickets.add(new Ticket(14000, "Cars 3", M8T1, 1)); //2
        M8T1Tickets.add(new Ticket(14000, "Cars 3", M8T1, 1)); //3
        M8T1Tickets.add(new Ticket(14000, "Cars 3", M8T1, 1)); //4
        M8T1Tickets.add(new Ticket(14000, "Cars 3", M8T1, 1)); //5
        M8T1Tickets.add(new Ticket(10000, "Cars 3", M8T1, 1)); //6
        M8T1Tickets.add(new Ticket(10000, "Cars 3", M8T1, 1)); //7
        M8T1Tickets.add(new Ticket(10000, "Cars 3", M8T1, 1)); //8
        M8T1Tickets.add(new Ticket(10000, "Cars 3", M8T1, 1)); //9
        M8T1Tickets.add(new Ticket(10000, "Cars 3", M8T1, 1)); //10
        ShowTime M8S1 = new ShowTime(M8T1, M8T1Tickets);

        //Movie9    Toy Story 1
        Time M9T1 = new Time("9:45am", "2:26:00", "3/1/2024");

        ArrayList<Ticket> M9T1Tickets = new ArrayList<Ticket>();
        M9T1Tickets.add(new Ticket(20000, "Toy Story 1", M9T1, 1)); //1
        M9T1Tickets.add(new Ticket(20000, "Toy Story 1", M9T1, 1)); //2
        M9T1Tickets.add(new Ticket(20000, "Toy Story 1", M9T1, 1)); //3
        M9T1Tickets.add(new Ticket(20000, "Toy Story 1", M9T1, 1)); //4
        M9T1Tickets.add(new Ticket(20000, "Toy Story 1", M9T1, 1)); //5
        M9T1Tickets.add(new Ticket(15000, "Toy Story 1", M9T1, 1)); //6
        M9T1Tickets.add(new Ticket(15000, "Toy Story 1", M9T1, 1)); //7
        M9T1Tickets.add(new Ticket(15000, "Toy Story 1", M9T1, 1)); //8
        M9T1Tickets.add(new Ticket(15000, "Toy Story 1", M9T1, 1)); //9
        M9T1Tickets.add(new Ticket(15000, "Toy Story 1", M9T1, 1)); //10
        ShowTime M9S1 = new ShowTime(M9T1, M9T1Tickets);

        //Movie10 Toy Story 2
        Time M10T1 = new Time("1pm", "3:17:00", "3/1/2024");

        ArrayList<Ticket> M10T1Tickets = new ArrayList<Ticket>();
        M10T1Tickets.add(new Ticket(20000, "Toy Story 2", M10T1, 1)); //1
        M10T1Tickets.add(new Ticket(20000, "Toy Story 2", M10T1, 1)); //2
        M10T1Tickets.add(new Ticket(20000, "Toy Story 2", M10T1, 1)); //3
        M10T1Tickets.add(new Ticket(20000, "Toy Story 2", M10T1, 1)); //4
        M10T1Tickets.add(new Ticket(20000, "Toy Story 2", M10T1, 1)); //5
        M10T1Tickets.add(new Ticket(15000, "Toy Story 2", M10T1, 1)); //6
        M10T1Tickets.add(new Ticket(15000, "Toy Story 2", M10T1, 1)); //7
        M10T1Tickets.add(new Ticket(15000, "Toy Story 2", M10T1, 1)); //8
        M10T1Tickets.add(new Ticket(15000, "Toy Story 2", M10T1, 1)); //9
        M10T1Tickets.add(new Ticket(15000, "Toy Story 2", M10T1, 1)); //10
        ShowTime M10S1 = new ShowTime(M10T1, M10T1Tickets);

        //Movie11   Toy Story 3
        Time M11T1 = new Time("4:30pm", "2:05:00", "3/1/2024");

        ArrayList<Ticket> M11T1Tickets = new ArrayList<Ticket>();
        M11T1Tickets.add(new Ticket(20000, "Toy Story 3", M11T1, 1)); //1
        M11T1Tickets.add(new Ticket(20000, "Toy Story 3", M11T1, 1)); //2
        M11T1Tickets.add(new Ticket(20000, "Toy Story 3", M11T1, 1)); //3
        M11T1Tickets.add(new Ticket(20000, "Toy Story 3", M11T1, 1)); //4
        M11T1Tickets.add(new Ticket(20000, "Toy Story 3", M11T1, 1)); //5
        M11T1Tickets.add(new Ticket(15000, "Toy Story 3", M11T1, 1)); //6
        M11T1Tickets.add(new Ticket(15000, "Toy Story 3", M11T1, 1)); //7
        M11T1Tickets.add(new Ticket(15000, "Toy Story 3", M11T1, 1)); //8
        M11T1Tickets.add(new Ticket(15000, "Toy Story 3", M11T1, 1)); //9
        M11T1Tickets.add(new Ticket(15000, "Toy Story 3", M11T1, 1)); //10
        ShowTime M11S1 = new ShowTime(M11T1, M11T1Tickets);

        //Movie12   Toy Story 4
        Time M12T1 = new Time("7pm", "2:55:00", "3/1/2024");

        ArrayList<Ticket> M12T1Tickets = new ArrayList<Ticket>();
        M12T1Tickets.add(new Ticket(20000, "Toy Story 4", M12T1, 1)); //1
        M12T1Tickets.add(new Ticket(20000, "Toy Story 4", M12T1, 1)); //2
        M12T1Tickets.add(new Ticket(20000, "Toy Story 4", M12T1, 1)); //3
        M12T1Tickets.add(new Ticket(20000, "Toy Story 4", M12T1, 1)); //4
        M12T1Tickets.add(new Ticket(20000, "Toy Story 4", M12T1, 1)); //5
        M12T1Tickets.add(new Ticket(15000, "Toy Story 4", M12T1, 1)); //6
        M12T1Tickets.add(new Ticket(15000, "Toy Story 4", M12T1, 1)); //7
        M12T1Tickets.add(new Ticket(15000, "Toy Story 4", M12T1, 1)); //8
        M12T1Tickets.add(new Ticket(15000, "Toy Story 4", M12T1, 1)); //9
        M12T1Tickets.add(new Ticket(15000, "Toy Story 4", M12T1, 1)); //10
        ShowTime M12S1 = new ShowTime(M12T1, M12T1Tickets);


        //Show Time 2
        //Movie1    How To Train Your Dragon
        Time M1T2 = new Time("10am", "2:10:00", "2/1/2024");
        ArrayList<Ticket> M1T2Tickets = new ArrayList<Ticket>();
        M1T2Tickets.add(new Ticket(20000, "How to traing your dragon 1", M1T2, 2)); //1
        M1T2Tickets.add(new Ticket(20000, "How to traing your dragon 1", M1T2, 2)); //2
        M1T2Tickets.add(new Ticket(20000, "How to traing your dragon 1", M1T2, 2)); //3
        M1T2Tickets.add(new Ticket(20000, "How to traing your dragon 1", M1T2, 2)); //4
        M1T2Tickets.add(new Ticket(20000, "How to traing your dragon 1", M1T2, 2)); //5
        M1T2Tickets.add(new Ticket(15000, "How to traing your dragon 1", M1T2, 2)); //6
        M1T2Tickets.add(new Ticket(15000, "How to traing your dragon 1", M1T2, 2)); //7
        M1T2Tickets.add(new Ticket(15000, "How to traing your dragon 1", M1T2, 2)); //8
        M1T2Tickets.add(new Ticket(15000, "How to traing your dragon 1", M1T2, 2)); //9
        M1T2Tickets.add(new Ticket(15000, "How to traing your dragon 1", M1T2, 2)); //10
        ShowTime M1S2 = new ShowTime(M1T2, M1T2Tickets);

        //Movie2  How To Train Your Dragon 2
        Time M2T2 = new Time("12:45pm", "1:35:00", "2/1/2024");

        ArrayList<Ticket> M2T2Tickets = new ArrayList<Ticket>();
        M2T2Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T2, 2)); //1
        M2T2Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T2, 2)); //2
        M2T2Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T2, 2)); //3
        M2T2Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T2, 2)); //4
        M2T2Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T2, 2)); //5
        M2T2Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T2, 2)); //6
        M2T2Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T2, 2)); //7
        M2T2Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T2, 2)); //8
        M2T2Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T2, 2)); //9
        M2T2Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T2, 2)); //10
        ShowTime M2S2 = new ShowTime(M2T2, M2T2Tickets);

        //Movie3    How To Train Your Dragon 3
        Time M3T2 = new Time("3:30pm", "2:20:00", "2/1/2024");

        ArrayList<Ticket> M3T2Tickets = new ArrayList<Ticket>();
        M3T2Tickets.add(new Ticket(20000, "How to train dragon 3", M3T2, 2)); //1
        M3T2Tickets.add(new Ticket(20000, "How to train dragon 3", M3T2, 2)); //2
        M3T2Tickets.add(new Ticket(20000, "How to train dragon 3", M3T2, 2)); //3
        M3T2Tickets.add(new Ticket(20000, "How to train dragon 3", M3T2, 2)); //4
        M3T2Tickets.add(new Ticket(20000, "How to train dragon 3", M3T2, 2)); //5
        M3T2Tickets.add(new Ticket(15000, "How to train dragon 3", M3T2, 2)); //6
        M3T2Tickets.add(new Ticket(15000, "How to train dragon 3", M3T2, 2)); //7
        M3T2Tickets.add(new Ticket(15000, "How to train dragon 3", M3T2, 2)); //8
        M3T2Tickets.add(new Ticket(15000, "How to train dragon 3", M3T2, 2)); //9
        M3T2Tickets.add(new Ticket(15000, "How to train dragon 3", M3T2, 2)); //10
        ShowTime M3S2 = new ShowTime(M3T2, M3T2Tickets);

        //Movie4    Incredibles 1
        Time M4T2 = new Time("6pm", "2:48:00", "2/1/2024");

        ArrayList<Ticket> M4T2Tickets = new ArrayList<Ticket>();
        M4T2Tickets.add(new Ticket(25000, "Incredibles 1", M4T2, 2)); //1
        M4T2Tickets.add(new Ticket(25000, "Incredibles 1", M4T2, 2)); //2
        M4T2Tickets.add(new Ticket(25000, "Incredibles 1", M4T2, 2)); //3
        M4T2Tickets.add(new Ticket(25000, "Incredibles 1", M4T2, 2)); //4
        M4T2Tickets.add(new Ticket(25000, "Incredibles 1", M4T2, 2)); //5
        M4T2Tickets.add(new Ticket(17500, "Incredibles 1", M4T2, 2)); //6
        M4T2Tickets.add(new Ticket(17500, "Incredibles 1", M4T2, 2)); //7
        M4T2Tickets.add(new Ticket(17500, "Incredibles 1", M4T2, 2)); //8
        M4T2Tickets.add(new Ticket(17500, "Incredibles 1", M4T2, 2)); //9
        M4T2Tickets.add(new Ticket(17500, "Incredibles 1", M4T2, 2)); //10
        ShowTime M4S2 = new ShowTime(M4T2, M4T2Tickets);

        //Movie5    Incredibles 2
        Time M5T2 = new Time("9pm", "2:10:00", "2/1/2024");

        ArrayList<Ticket> M5T2Tickets = new ArrayList<Ticket>();
        M5T2Tickets.add(new Ticket(25000, "Incredibles 2", M5T2, 2)); //1
        M5T2Tickets.add(new Ticket(25000, "Incredibles 2", M5T2, 2)); //2
        M5T2Tickets.add(new Ticket(25000, "Incredibles 2", M5T2, 2)); //3
        M5T2Tickets.add(new Ticket(25000, "Incredibles 2", M5T2, 2)); //4
        M5T2Tickets.add(new Ticket(25000, "Incredibles 2", M5T2, 2)); //5
        M5T2Tickets.add(new Ticket(17500, "Incredibles 2", M5T2, 2)); //6
        M5T2Tickets.add(new Ticket(17500, "Incredibles 2", M5T2, 2)); //7
        M5T2Tickets.add(new Ticket(17500, "Incredibles 2", M5T2, 2)); //8
        M5T2Tickets.add(new Ticket(17500, "Incredibles 2", M5T2, 2)); //9
        M5T2Tickets.add(new Ticket(17500, "Incredibles 2", M5T2, 2)); //10
        ShowTime M5S2 = new ShowTime(M5T2, M5T2Tickets);

        //Movie6    Cars 1
        Time M6T2 = new Time("11am", "1:10:00", "3/1/2024");

        ArrayList<Ticket> M6T2Tickets = new ArrayList<Ticket>();
        M6T2Tickets.add(new Ticket(15000, "Cars 1", M6T2, 2)); //1
        M6T2Tickets.add(new Ticket(15000, "Cars 1", M6T2, 2)); //2
        M6T2Tickets.add(new Ticket(15000, "Cars 1", M6T2, 2)); //3
        M6T2Tickets.add(new Ticket(15000, "Cars 1", M6T2, 2)); //4
        M6T2Tickets.add(new Ticket(15000, "Cars 1", M6T2, 2)); //5
        M6T2Tickets.add(new Ticket(10000, "Cars 1", M6T2, 2)); //6
        M6T2Tickets.add(new Ticket(10000, "Cars 1", M6T2, 2)); //7
        M6T2Tickets.add(new Ticket(10000, "Cars 1", M6T2, 2)); //8
        M6T2Tickets.add(new Ticket(10000, "Cars 1", M6T2, 2)); //9
        M6T2Tickets.add(new Ticket(10000, "Cars 1", M6T2, 2)); //10
        ShowTime M6S2 = new ShowTime(M6T2, M6T2Tickets);

        //Movie7    Cars2
        Time M7T2 = new Time("1pm", "2:08:00", "3/1/2024");

        ArrayList<Ticket> M7T2Tickets = new ArrayList<Ticket>();
        M7T2Tickets.add(new Ticket(15000, "Cars 2", M7T2, 2)); //1
        M7T2Tickets.add(new Ticket(15000, "Cars 2", M7T2, 2)); //2
        M7T2Tickets.add(new Ticket(15000, "Cars 2", M7T2, 2)); //3
        M7T2Tickets.add(new Ticket(15000, "Cars 2", M7T2, 2)); //4
        M7T2Tickets.add(new Ticket(15000, "Cars 2", M7T2, 2)); //5
        M7T2Tickets.add(new Ticket(10000, "Cars 2", M7T2, 2)); //6
        M7T2Tickets.add(new Ticket(10000, "Cars 2", M7T2, 2)); //7
        M7T2Tickets.add(new Ticket(10000, "Cars 2", M7T2, 2)); //8
        M7T2Tickets.add(new Ticket(10000, "Cars 2", M7T2, 2)); //9
        M7T2Tickets.add(new Ticket(10000, "Cars 2", M7T2, 2)); //10
        ShowTime M7S2 = new ShowTime(M7T2, M7T2Tickets);

        //Movie8 Cars3
        Time M8T2 = new Time("6:45pm", "3:10:00", "3/1/2024");

        ArrayList<Ticket> M8T2Tickets = new ArrayList<Ticket>();
        M8T2Tickets.add(new Ticket(14000, "Cars 3", M8T2, 2)); //1
        M8T2Tickets.add(new Ticket(14000, "Cars 3", M8T2, 2)); //2
        M8T2Tickets.add(new Ticket(14000, "Cars 3", M8T2, 2)); //3
        M8T2Tickets.add(new Ticket(14000, "Cars 3", M8T2, 2)); //4
        M8T2Tickets.add(new Ticket(14000, "Cars 3", M8T2, 2)); //5
        M8T2Tickets.add(new Ticket(10000, "Cars 3", M8T2, 2)); //6
        M8T2Tickets.add(new Ticket(10000, "Cars 3", M8T2, 2)); //7
        M8T2Tickets.add(new Ticket(10000, "Cars 3", M8T2, 2)); //8
        M8T2Tickets.add(new Ticket(10000, "Cars 3", M8T2, 2)); //9
        M8T2Tickets.add(new Ticket(10000, "Cars 3", M8T2, 2)); //10
        ShowTime M8S2 = new ShowTime(M8T2, M8T2Tickets);

        //Movie9    Toy Story 1
        Time M9T2 = new Time("9am", "2:26:00", "1/1/2024");

        ArrayList<Ticket> M9T2Tickets = new ArrayList<Ticket>();
        M9T2Tickets.add(new Ticket(20000, "Toy Story 1", M9T2, 2)); //1
        M9T2Tickets.add(new Ticket(20000, "Toy Story 1", M9T2, 2)); //2
        M9T2Tickets.add(new Ticket(20000, "Toy Story 1", M9T2, 2)); //3
        M9T2Tickets.add(new Ticket(20000, "Toy Story 1", M9T2, 2)); //4
        M9T2Tickets.add(new Ticket(20000, "Toy Story 1", M9T2, 2)); //5
        M9T2Tickets.add(new Ticket(15000, "Toy Story 1", M9T2, 2)); //6
        M9T2Tickets.add(new Ticket(15000, "Toy Story 1", M9T2, 2)); //7
        M9T2Tickets.add(new Ticket(15000, "Toy Story 1", M9T2, 2)); //8
        M9T2Tickets.add(new Ticket(15000, "Toy Story 1", M9T2, 2)); //9
        M9T2Tickets.add(new Ticket(15000, "Toy Story 1", M9T2, 2)); //10
        ShowTime M9S2 = new ShowTime(M9T2, M9T2Tickets);

        //Movie10 Toy Story 2
        Time M10T2 = new Time("11:30am", "3:17:00", "1/1/2024");

        ArrayList<Ticket> M10T2Tickets = new ArrayList<Ticket>();
        M10T2Tickets.add(new Ticket(20000, "Toy Story2", M10T2, 2)); //1
        M10T2Tickets.add(new Ticket(20000, "Toy Story2", M10T2, 2)); //2
        M10T2Tickets.add(new Ticket(20000, "Toy Story2", M10T2, 2)); //3
        M10T2Tickets.add(new Ticket(20000, "Toy Story2", M10T2, 2)); //4
        M10T2Tickets.add(new Ticket(20000, "Toy Story2", M10T2, 2)); //5
        M10T2Tickets.add(new Ticket(15000, "Toy Story2", M10T2, 2)); //6
        M10T2Tickets.add(new Ticket(15000, "Toy Story2", M10T2, 2)); //7
        M10T2Tickets.add(new Ticket(15000, "Toy Story2", M10T2, 2)); //8
        M10T2Tickets.add(new Ticket(15000, "Toy Story2", M10T2, 2)); //9
        M10T2Tickets.add(new Ticket(15000, "Toy Story2", M10T2, 2)); //10
        ShowTime M10S2 = new ShowTime(M10T2, M10T2Tickets);

        //Movie11   Toy Story 3
        Time M11T2 = new Time("3pm", "2:05:00", "1/1/2024");

        ArrayList<Ticket> M11T2Tickets = new ArrayList<Ticket>();
        M11T2Tickets.add(new Ticket(20000, "Toy Story 3", M11T2, 2)); //1
        M11T2Tickets.add(new Ticket(20000, "Toy Story 3", M11T2, 2)); //2
        M11T2Tickets.add(new Ticket(20000, "Toy Story 3", M11T2, 2)); //3
        M11T2Tickets.add(new Ticket(20000, "Toy Story 3", M11T2, 2)); //4
        M11T2Tickets.add(new Ticket(20000, "Toy Story 3", M11T2, 2)); //5
        M11T2Tickets.add(new Ticket(15000, "Toy Story 3", M11T2, 2)); //6
        M11T2Tickets.add(new Ticket(15000, "Toy Story 3", M11T2, 2)); //7
        M11T2Tickets.add(new Ticket(15000, "Toy Story 3", M11T2, 2)); //8
        M11T2Tickets.add(new Ticket(15000, "Toy Story 3", M11T2, 2)); //9
        M11T2Tickets.add(new Ticket(15000, "Toy Story 3", M11T2, 2)); //10
        ShowTime M11S2 = new ShowTime(M11T2, M11T2Tickets);

        //Movie12   Toy Story 4
        Time M12T2 = new Time("5:15pm", "2:55:00", "1/1/2024");

        ArrayList<Ticket> M12T2Tickets = new ArrayList<Ticket>();
        M12T2Tickets.add(new Ticket(20000, "Toy Story 4", M12T2, 2)); //1
        M12T2Tickets.add(new Ticket(20000, "Toy Story 4", M12T2, 2)); //2
        M12T2Tickets.add(new Ticket(20000, "Toy Story 4", M12T2, 2)); //3
        M12T2Tickets.add(new Ticket(20000, "Toy Story 4", M12T2, 2)); //4
        M12T2Tickets.add(new Ticket(20000, "Toy Story 4", M12T2, 2)); //5
        M12T2Tickets.add(new Ticket(15000, "Toy Story 4", M12T2, 2)); //6
        M12T2Tickets.add(new Ticket(15000, "Toy Story 4", M12T2, 2)); //7
        M12T2Tickets.add(new Ticket(15000, "Toy Story 4", M12T2, 2)); //8
        M12T2Tickets.add(new Ticket(15000, "Toy Story 4", M12T2, 2)); //9
        M12T2Tickets.add(new Ticket(15000, "Toy Story 4", M12T2, 2)); //10
        ShowTime M12S2 = new ShowTime(M12T2, M12T2Tickets);


        //Show Time 3
        //Movie1    How To Train Your Dragon
        Time M1T3 = new Time("2:30pm", "2:10:00", "3/1/2024");
        ArrayList<Ticket> M1T3Tickets = new ArrayList<Ticket>();
        M1T3Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T3, 3)); //1
        M1T3Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T3, 3)); //2
        M1T3Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T3, 3)); //3
        M1T3Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T3, 3)); //4
        M1T3Tickets.add(new Ticket(20000, "How to train your dragon 1", M1T3, 3)); //5
        M1T3Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T3, 3)); //6
        M1T3Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T3, 3)); //7
        M1T3Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T3, 3)); //8
        M1T3Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T3, 3)); //9
        M1T3Tickets.add(new Ticket(15000, "How to train your dragon 1", M1T3, 3)); //10
        ShowTime M1S3 = new ShowTime(M1T3, M1T3Tickets);

        //Movie2  How To Train Your Dragon 2
        Time M2T3 = new Time("5pm", "1:35:00", "3/1/2024");

        ArrayList<Ticket> M2T3Tickets = new ArrayList<Ticket>();
        M2T3Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T3, 3)); //1
        M2T3Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T3, 3)); //2
        M2T3Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T3, 3)); //3
        M2T3Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T3, 3)); //4
        M2T3Tickets.add(new Ticket(20000, "How to train your dragon 2", M2T3, 3)); //5
        M2T3Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T3, 3)); //6
        M2T3Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T3, 3)); //7
        M2T3Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T3, 3)); //8
        M2T3Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T3, 3)); //9
        M2T3Tickets.add(new Ticket(15000, "How to train your dragon 2", M2T3, 3)); //10
        ShowTime M2S3 = new ShowTime(M2T3, M2T3Tickets);

        //Movie3    How To Train Your Dragon 3
        Time M3T3 = new Time("6:45pm", "2:20:00", "3/1/2024");

        ArrayList<Ticket> M3T3Tickets = new ArrayList<Ticket>();
        M3T3Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T3, 3)); //1
        M3T3Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T3, 3)); //2
        M3T3Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T3, 3)); //3
        M3T3Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T3, 3)); //4
        M3T3Tickets.add(new Ticket(20000, "How to train your dragon 3", M3T3, 3)); //5
        M3T3Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T3, 3)); //6
        M3T3Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T3, 3)); //7
        M3T3Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T3, 3)); //8
        M3T3Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T3, 3)); //9
        M3T3Tickets.add(new Ticket(15000, "How to train your dragon 3", M3T3, 3)); //10
        ShowTime M3S3 = new ShowTime(M3T3, M3T3Tickets);

        //Movie4    Incredibles 1
        Time M4T3 = new Time("9:15pm", "2:48:00", "3/1/2024");

        ArrayList<Ticket> M4T3Tickets = new ArrayList<Ticket>();
        M4T3Tickets.add(new Ticket(25000, "Incredibles 1", M4T3, 3)); //1
        M4T3Tickets.add(new Ticket(25000, "Incredibles 1", M4T3, 3)); //2
        M4T3Tickets.add(new Ticket(25000, "Incredibles 1", M4T3, 3)); //3
        M4T3Tickets.add(new Ticket(25000, "Incredibles 1", M4T3, 3)); //4
        M4T3Tickets.add(new Ticket(25000, "Incredibles 1", M4T3, 3)); //5
        M4T3Tickets.add(new Ticket(17500, "Incredibles 1", M4T3, 3)); //6
        M4T3Tickets.add(new Ticket(17500, "Incredibles 1", M4T3, 3)); //7
        M4T3Tickets.add(new Ticket(17500, "Incredibles 1", M4T3, 3)); //8
        M4T3Tickets.add(new Ticket(17500, "Incredibles 1", M4T3, 3)); //9
        M4T3Tickets.add(new Ticket(17500, "Incredibles 1", M4T3, 3)); //10
        ShowTime M4S3 = new ShowTime(M4T3, M4T3Tickets);

        //Movie5    Incredibles 2
        Time M5T3 = new Time("12:15pm", "2:10:00", "3/1/2024");

        ArrayList<Ticket> M5T3Tickets = new ArrayList<Ticket>();
        M5T3Tickets.add(new Ticket(25000, "Incredibles 2", M5T3, 3)); //1
        M5T3Tickets.add(new Ticket(25000, "Incredibles 2", M5T3, 3)); //2
        M5T3Tickets.add(new Ticket(25000, "Incredibles 2", M5T3, 3)); //3
        M5T3Tickets.add(new Ticket(25000, "Incredibles 2", M5T3, 3)); //4
        M5T3Tickets.add(new Ticket(25000, "Incredibles 2", M5T3, 3)); //5
        M5T3Tickets.add(new Ticket(17500, "Incredibles 2", M5T3, 3)); //6
        M5T3Tickets.add(new Ticket(17500, "Incredibles 2", M5T3, 3)); //7
        M5T3Tickets.add(new Ticket(17500, "Incredibles 2", M5T3, 3)); //8
        M5T3Tickets.add(new Ticket(17500, "Incredibles 2", M5T3, 3)); //9
        M5T3Tickets.add(new Ticket(17500, "Incredibles 2", M5T3, 3)); //10
        ShowTime M5S3 = new ShowTime(M5T3, M5T3Tickets);

        //Movie6    Cars 1
        Time M6T3 = new Time("10am", "1:10:00", "1/1/2024");

        ArrayList<Ticket> M6T3Tickets = new ArrayList<Ticket>();
        M6T3Tickets.add(new Ticket(15000, "Cars 1", M6T3, 3)); //1
        M6T3Tickets.add(new Ticket(15000, "Cars 1", M6T3, 3)); //2
        M6T3Tickets.add(new Ticket(15000, "Cars 1", M6T3, 3)); //3
        M6T3Tickets.add(new Ticket(15000, "Cars 1", M6T3, 3)); //4
        M6T3Tickets.add(new Ticket(15000, "Cars 1", M6T3, 3)); //5
        M6T3Tickets.add(new Ticket(10000, "Cars 1", M6T3, 3)); //6
        M6T3Tickets.add(new Ticket(10000, "Cars 1", M6T3, 3)); //7
        M6T3Tickets.add(new Ticket(10000, "Cars 1", M6T3, 3)); //8
        M6T3Tickets.add(new Ticket(10000, "Cars 1", M6T3, 3)); //9
        M6T3Tickets.add(new Ticket(10000, "Cars 1", M6T3, 3)); //10
        ShowTime M6S3 = new ShowTime(M6T3, M6T3Tickets);

        //Movie7    Cars2
        Time M7T3 = new Time("2pm", "2:08:00", "1/1/2024");

        ArrayList<Ticket> M7T3Tickets = new ArrayList<Ticket>();
        M7T3Tickets.add(new Ticket(15000, "Cars 2", M7T3, 3)); //1
        M7T3Tickets.add(new Ticket(15000, "Cars 2", M7T3, 3)); //2
        M7T3Tickets.add(new Ticket(15000, "Cars 2", M7T3, 3)); //3
        M7T3Tickets.add(new Ticket(15000, "Cars 2", M7T3, 3)); //4
        M7T3Tickets.add(new Ticket(15000, "Cars 2", M7T3, 3)); //5
        M7T3Tickets.add(new Ticket(10000, "Cars 2", M7T3, 3)); //6
        M7T3Tickets.add(new Ticket(10000, "Cars 2", M7T3, 3)); //7
        M7T3Tickets.add(new Ticket(10000, "Cars 2", M7T3, 3)); //8
        M7T3Tickets.add(new Ticket(10000, "Cars 2", M7T3, 3)); //9
        M7T3Tickets.add(new Ticket(10000, "Cars 2", M7T3, 3)); //10
        ShowTime M7S3 = new ShowTime(M7T3, M7T3Tickets);

        //Movie8 Cars3
        Time M8T3 = new Time("6pm", "3:10:00", "1/1/2024");

        ArrayList<Ticket> M8T3Tickets = new ArrayList<Ticket>();
        M8T3Tickets.add(new Ticket(14000, "Cars 3", M8T3, 3)); //1
        M8T3Tickets.add(new Ticket(14000, "Cars 3", M8T3, 3)); //2
        M8T3Tickets.add(new Ticket(14000, "Cars 3", M8T3, 3)); //3
        M8T3Tickets.add(new Ticket(14000, "Cars 3", M8T3, 3)); //4
        M8T3Tickets.add(new Ticket(14000, "Cars 3", M8T3, 3)); //5
        M8T3Tickets.add(new Ticket(10000, "Cars 3", M8T3, 3)); //6
        M8T3Tickets.add(new Ticket(10000, "Cars 3", M8T3, 3)); //7
        M8T3Tickets.add(new Ticket(10000, "Cars 3", M8T3, 3)); //8
        M8T3Tickets.add(new Ticket(10000, "Cars 3", M8T3, 3)); //9
        M8T3Tickets.add(new Ticket(10000, "Cars 3", M8T3, 3)); //10
        ShowTime M8S3 = new ShowTime(M8T3, M8T3Tickets);

        //Movie9    Toy Story 1
        Time M9T3 = new Time("9:30am", "2:26:00", "2/1/2024");

        ArrayList<Ticket> M9T3Tickets = new ArrayList<Ticket>();
        M9T3Tickets.add(new Ticket(20000, "Toy Story 1", M9T3, 3)); //1
        M9T3Tickets.add(new Ticket(20000, "Toy Story 1", M9T3, 3)); //2
        M9T3Tickets.add(new Ticket(20000, "Toy Story 1", M9T3, 3)); //3
        M9T3Tickets.add(new Ticket(20000, "Toy Story 1", M9T3, 3)); //4
        M9T3Tickets.add(new Ticket(20000, "Toy Story 1", M9T3, 3)); //5
        M9T3Tickets.add(new Ticket(15000, "Toy Story 1", M9T3, 3)); //6
        M9T3Tickets.add(new Ticket(15000, "Toy Story 1", M9T3, 3)); //7
        M9T3Tickets.add(new Ticket(15000, "Toy Story 1", M9T3, 3)); //8
        M9T3Tickets.add(new Ticket(15000, "Toy Story 1", M9T3, 3)); //9
        M9T3Tickets.add(new Ticket(15000, "Toy Story 1", M9T3, 3)); //10
        ShowTime M9S3 = new ShowTime(M9T3, M9T3Tickets);

        //Movie10 Toy Story 2
        Time M10T3 = new Time("12pm", "3:17:00", "2/1/2024");

        ArrayList<Ticket> M10T3Tickets = new ArrayList<Ticket>();
        M10T3Tickets.add(new Ticket(20000, "Toy Story 2", M10T3, 3)); //1
        M10T3Tickets.add(new Ticket(20000, "Toy Story 2", M10T3, 3)); //2
        M10T3Tickets.add(new Ticket(20000, "Toy Story 2", M10T3, 3)); //3
        M10T3Tickets.add(new Ticket(20000, "Toy Story 2", M10T3, 3)); //4
        M10T3Tickets.add(new Ticket(20000, "Toy Story 2", M10T3, 3)); //5
        M10T3Tickets.add(new Ticket(15000, "Toy Story 2", M10T3, 3)); //6
        M10T3Tickets.add(new Ticket(15000, "Toy Story 2", M10T3, 3)); //7
        M10T3Tickets.add(new Ticket(15000, "Toy Story 2", M10T3, 3)); //8
        M10T3Tickets.add(new Ticket(15000, "Toy Story 2", M10T3, 3)); //9
        M10T3Tickets.add(new Ticket(15000, "Toy Story 2", M10T3, 3)); //10
        ShowTime M10S3 = new ShowTime(M10T3, M10T3Tickets);

        //Movie11   Toy Story 3
        Time M11T3 = new Time("4pm", "2:05:00", "2/1/2024");

        ArrayList<Ticket> M11T3Tickets = new ArrayList<Ticket>();
        M11T3Tickets.add(new Ticket(20000, "Toy Story 3", M11T3, 3)); //1
        M11T3Tickets.add(new Ticket(20000, "Toy Story 3", M11T3, 3)); //2
        M11T3Tickets.add(new Ticket(20000, "Toy Story 3", M11T3, 3)); //3
        M11T3Tickets.add(new Ticket(20000, "Toy Story 3", M11T3, 3)); //4
        M11T3Tickets.add(new Ticket(20000, "Toy Story 3", M11T3, 3)); //5
        M11T3Tickets.add(new Ticket(15000, "Toy Story 3", M11T3, 3)); //6
        M11T3Tickets.add(new Ticket(15000, "Toy Story 3", M11T3, 3)); //7
        M11T3Tickets.add(new Ticket(15000, "Toy Story 3", M11T3, 3)); //8
        M11T3Tickets.add(new Ticket(15000, "Toy Story 3", M11T3, 3)); //9
        M11T3Tickets.add(new Ticket(15000, "Toy Story 3", M11T3, 3)); //10
        ShowTime M11S3 = new ShowTime(M11T3, M11T3Tickets);
        //Movie12   Toy Story 4
        Time M12T3 = new Time("10pm", "2:55:00", "2/1/2024");

        ArrayList<Ticket> M12T3Tickets = new ArrayList<Ticket>();
        M12T3Tickets.add(new Ticket(20000, "Toy Story 4", M12T3, 3)); //1
        M12T3Tickets.add(new Ticket(20000, "Toy Story 4", M12T3, 3)); //2
        M12T3Tickets.add(new Ticket(20000, "Toy Story 4", M12T3, 3)); //3
        M12T3Tickets.add(new Ticket(20000, "Toy Story 4", M12T3, 3)); //4
        M12T3Tickets.add(new Ticket(20000, "Toy Story 4", M12T3, 3)); //5
        M12T3Tickets.add(new Ticket(15000, "Toy Story 4", M12T3, 3)); //6
        M12T3Tickets.add(new Ticket(15000, "Toy Story 4", M12T3, 3)); //7
        M12T3Tickets.add(new Ticket(15000, "Toy Story 4", M12T3, 3)); //8
        M12T3Tickets.add(new Ticket(15000, "Toy Story 4", M12T3, 3)); //9
        M12T3Tickets.add(new Ticket(15000, "Toy Story 4", M12T3, 3)); //10
        ShowTime M12S3 = new ShowTime(M12T3, M12T3Tickets);


        //Movies
        Movie HowToTrainYourDragon1_H1 = new Movie("Action", M1S1);
        Movie HowToTrainYourDragon2_H1 = new Movie("Action", M2S1);
        Movie HowToTrainYourDragon3_H1 = new Movie("Action", M3S1);
        Movie Incredibles1_H1 = new Movie("Action", M4S1);
        Movie Incredibles2_H1 = new Movie("Action", M5S1);
        Movie Cars1_H1 = new Movie("Adventure", M6S1);
        Movie Cars2_H1 = new Movie("Adventure", M7S1);
        Movie Cars3_H1 = new Movie("Adventure", M8S1);
        Movie ToyStory1_H1 = new Movie("For Child", M9S1);
        Movie ToyStory2_H1 = new Movie("For Child", M10S1);
        Movie ToyStory3_H1 = new Movie("For Child", M11S1);
        Movie ToyStory4_H1 = new Movie("For Child", M12S1);

        //ArrayList of movies for hall 1
        ArrayList<Movie> movies_H1 = new ArrayList<Movie>();
        movies_H1.add(HowToTrainYourDragon1_H1);
        movies_H1.add(HowToTrainYourDragon2_H1);
        movies_H1.add(HowToTrainYourDragon3_H1);
        movies_H1.add(Incredibles1_H1);
        movies_H1.add(Incredibles2_H1);
        movies_H1.add(Cars1_H1);
        movies_H1.add(Cars2_H1);
        movies_H1.add(Cars3_H1);
        movies_H1.add(ToyStory1_H1);
        movies_H1.add(ToyStory2_H1);
        movies_H1.add(ToyStory3_H1);
        movies_H1.add(ToyStory4_H1);


        Movie HowToTrainYourDragon1_H2 = new Movie("Action", M1S2);
        Movie HowToTrainYourDragon2_H2 = new Movie("Action", M2S2);
        Movie HowToTrainYourDragon3_H2 = new Movie("Action", M3S2);
        Movie Incredibles1_H2 = new Movie("Action", M4S2);
        Movie Incredibles2_H2 = new Movie("Action", M5S2);
        Movie Cars1_H2 = new Movie("Adventure", M6S2);
        Movie Cars2_H2 = new Movie("Adventure", M7S2);
        Movie Cars3_H2 = new Movie("Adventure", M8S2);
        Movie ToyStory1_H2 = new Movie("For Child", M9S2);
        Movie ToyStory2_H2 = new Movie("For Child", M10S2);
        Movie ToyStory3_H2 = new Movie("For Child", M11S2);
        Movie ToyStory4_H2 = new Movie("For Child", M12S2);

        //ArrayList of movies for hall 2
        ArrayList<Movie> movies_H2 = new ArrayList<Movie>();
        movies_H2.add(HowToTrainYourDragon1_H2);
        movies_H2.add(HowToTrainYourDragon2_H2);
        movies_H2.add(HowToTrainYourDragon3_H2);
        movies_H2.add(Incredibles1_H2);
        movies_H2.add(Incredibles2_H2);
        movies_H2.add(Cars1_H2);
        movies_H2.add(Cars2_H2);
        movies_H2.add(Cars3_H2);
        movies_H2.add(ToyStory1_H2);
        movies_H2.add(ToyStory2_H2);
        movies_H2.add(ToyStory3_H2);
        movies_H2.add(ToyStory4_H2);


        Movie HowToTrainYourDragon1_H3 = new Movie("Action", M1S3);
        Movie HowToTrainYourDragon2_H3 = new Movie("Action", M2S3);
        Movie HowToTrainYourDragon3_H3 = new Movie("Action", M3S3);
        Movie Incredibles1_H3 = new Movie("Action", M4S3);
        Movie Incredibles2_H3 = new Movie("Action", M5S3);
        Movie Cars1_H3 = new Movie("Adventure", M6S3);
        Movie Cars2_H3 = new Movie("Adventure", M7S3);
        Movie Cars3_H3 = new Movie("Adventure", M8S3);
        Movie ToyStory1_H3 = new Movie("For Child", M9S3);
        Movie ToyStory2_H3 = new Movie("For Child", M10S3);
        Movie ToyStory3_H3 = new Movie("For Child", M11S3);
        Movie ToyStory4_H3 = new Movie("For Child", M12S3);

        //ArrayList of movies for hall 3
        ArrayList<Movie> movies_H3 = new ArrayList<Movie>();
        movies_H3.add(HowToTrainYourDragon1_H3);
        movies_H3.add(HowToTrainYourDragon2_H3);
        movies_H3.add(HowToTrainYourDragon3_H3);
        movies_H3.add(Incredibles1_H3);
        movies_H3.add(Incredibles2_H3);
        movies_H3.add(Cars1_H3);
        movies_H3.add(Cars2_H3);
        movies_H3.add(Cars3_H3);
        movies_H3.add(ToyStory1_H3);
        movies_H3.add(ToyStory2_H3);
        movies_H3.add(ToyStory3_H3);
        movies_H3.add(ToyStory4_H3);


        //Cinema halls
        Cinema cinema1 = new Cinema("hall1", movies_H1);
        Cinema cinema2 = new Cinema("hall2", movies_H2);
        Cinema cinema3 = new Cinema("hall3", movies_H3);
        try{
        Login login = new Login(cinema1, cinema2, cinema3);
        login.setVisible(true);
        }
        catch (Exception e)
      {
          // Catch any other unexpected exceptions
          e.printStackTrace(); // This is just an example; handle the exception appropriately
      }
    }}