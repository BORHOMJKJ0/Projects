import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.util.List;
public class movie1 extends JFrame implements ActionListener {
    private String price;
    private ArrayList<Boolean> chairStatusList = new ArrayList<>(List.of(
            false, false, false, false, false, false, false, false, false, false
    ));
    private User User;
    private ArrayList<User>registerUsers1=new ArrayList<>();
    private JButton button, chair1, chair2, chair3, chair4, chair5, chair6, chair7, chair8, chair9, chair10, homeButton, userButton, narrowButton;
    private ImageIcon imageIcon, backgroundImage, backgroundImage1, Frameicon;
    private JLabel backgroundLabel, pricelabel;
    private int j;
    private JPanel topPanel, centerPanel, panel, pricePanel;
    private ArrayList<Integer> nuum= new ArrayList<Integer>();
    private int option;
    private Font font;
    private Cinema cinema1, cinema2, cinema3;
    private User user;

    public movie1(Cinema cinema1, Cinema cinema2, Cinema cinema3, User user) {
        loadChairStatusListFromFile("chairStatus1.txt");
        this.cinema3 = cinema3;
        this.cinema1 = cinema1;
        this.cinema2 = cinema2;
        this.user = user;
        this.setTitle("Cinema");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        backgroundImage = new ImageIcon("JAVA/Chairs00.png");
        Frameicon = new ImageIcon("JAVA/frame.jpg");
        backgroundLabel = new JLabel(backgroundImage);
        this.add(backgroundLabel, BorderLayout.CENTER);
        backgroundLabel.setLayout(new BorderLayout());

        topPanel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundImage1 = new ImageIcon("JAVA/Chairs0.png");
        homeButton = createTopButton0("Home", "JAVA/Home1.png");
        homeButton.addActionListener(this);
        homeButton.setForeground(Color.white);
        homeButton.setFont(new Font(homeButton.getFont().getName(), Font.PLAIN, 20));
        topPanel.add(homeButton, BorderLayout.CENTER);

        userButton = createTopButton0("User", "JAVA/admin1.jpg");
        userButton.setForeground(Color.black);
        userButton.setFont(new Font(userButton.getFont().getName(), Font.PLAIN, 20));
        userButton.addActionListener(this);
        topPanel.add(userButton, BorderLayout.EAST);

        narrowButton = createTopButton0("Back", "JAVA/narrow.png");
        narrowButton.setForeground(Color.white);
        narrowButton.setFont(new Font(narrowButton.getFont().getName(), Font.PLAIN, 20));
        narrowButton.addActionListener(this);
        topPanel.add(narrowButton, BorderLayout.WEST);
        backgroundLabel.add(topPanel, BorderLayout.NORTH);
        centerPanel = new JPanel(new GridLayout(2, 5, 10, 10)) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage1.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(0).getPrice());
        if (!chairStatusList.get(0)) {
            chair1 = createTopButton("chair1", "JAVA/Chairs2.png", price);
        } else {
            chair1 = createTopButton("chair1", "JAVA/Chairs3.png", price);
            hidePricePanel(chair1);
        }
        chair1.setHorizontalAlignment(SwingConstants.CENTER);
        chair1.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair1.setHorizontalTextPosition(SwingConstants.CENTER);
        chair1.addActionListener(this);
        chair1.setMargin(new Insets(10, 10, 10, 10));
        chair1.setSize(700, 700);
        centerPanel.add(chair1);
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(1).getPrice());
        if (!chairStatusList.get(1)) {
            chair2 = createTopButton("chair2", "JAVA/Chairs2.png", price);
        } else {
            chair2 = createTopButton("chair2", "JAVA/Chairs3.png", price);
            hidePricePanel(chair2);
        }
        chair2.setHorizontalAlignment(SwingConstants.CENTER);
        chair2.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair2.setHorizontalTextPosition(SwingConstants.CENTER);
        chair2.addActionListener(this);
        chair2.setMargin(new Insets(10, 10, 10, 10));
        chair2.setSize(700, 700);
        centerPanel.add(chair2);
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(2).getPrice());
        if (!chairStatusList.get(2)) {
            chair3 = createTopButton("chair3", "JAVA/Chairs2.png", price);
        } else {
            chair3 = createTopButton("chair3", "JAVA/Chairs3.png", price);
            hidePricePanel(chair3);
        }
        chair3.setHorizontalAlignment(SwingConstants.CENTER);
        chair3.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair3.setHorizontalTextPosition(SwingConstants.CENTER);
        chair3.addActionListener(this);
        chair3.setMargin(new Insets(10, 10, 10, 10));
        chair3.setSize(700, 700);
        centerPanel.add(chair3);
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(3).getPrice());
        if (!chairStatusList.get(3)) {
            chair4 = createTopButton("chair4", "JAVA/Chairs2.png", price);
        } else {
            chair4 = createTopButton("chair4", "JAVA/Chairs3.png", price);
            hidePricePanel(chair4);
        }
        chair4.setHorizontalAlignment(SwingConstants.CENTER);
        chair4.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair4.setHorizontalTextPosition(SwingConstants.CENTER);
        chair4.addActionListener(this);
        chair4.setMargin(new Insets(10, 10, 10, 10));
        chair4.setSize(700, 700);
        centerPanel.add(chair4);
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(4).getPrice());
        if (!chairStatusList.get(4)) {
            chair5 = createTopButton("chair5", "JAVA/Chairs2.png", price);
        } else {
            chair5 = createTopButton("chair5", "JAVA/Chairs3.png", price);
            hidePricePanel(chair5);
        }
        chair5.setHorizontalAlignment(SwingConstants.CENTER);
        chair5.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair5.setHorizontalTextPosition(SwingConstants.CENTER);
        chair5.addActionListener(this);
        chair5.setMargin(new Insets(10, 10, 10, 10));
        chair5.setSize(700, 700);
        centerPanel.add(chair5);
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(5).getPrice());
        if (!chairStatusList.get(5)) {
            chair6 = createTopButton("chair6", "JAVA/Chairs2.png", price);
        } else {
            chair6 = createTopButton("chair6", "JAVA/Chairs3.png", price);
            hidePricePanel(chair6);
        }
        chair6.setHorizontalAlignment(SwingConstants.CENTER);
        chair6.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair6.setHorizontalTextPosition(SwingConstants.CENTER);
        chair6.addActionListener(this);
        chair6.setMargin(new Insets(10, 10, 10, 10));
        chair6.setSize(700, 700);
        centerPanel.add(chair6);
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(6).getPrice());
        if (!chairStatusList.get(6)) {
            chair7 = createTopButton("chair7", "JAVA/Chairs2.png", price);
        } else {
            chair7 = createTopButton("chair7", "JAVA/Chairs3.png", price);
            hidePricePanel(chair7);
        }
        chair7.setHorizontalAlignment(SwingConstants.CENTER);
        chair7.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair7.setHorizontalTextPosition(SwingConstants.CENTER);
        chair7.addActionListener(this);
        chair7.setMargin(new Insets(10, 10, 10, 10));
        chair7.setSize(700, 700);
        centerPanel.add(chair7);
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(7).getPrice());
        if (!chairStatusList.get(7)) {
            chair8 = createTopButton("chair8", "JAVA/Chairs2.png", price);
        } else {
            chair8 = createTopButton("chair8", "JAVA/Chairs3.png", price);
            hidePricePanel(chair8);
        }
        chair8.setHorizontalAlignment(SwingConstants.CENTER);
        chair8.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair8.setHorizontalTextPosition(SwingConstants.CENTER);
        chair8.addActionListener(this);
        chair8.setMargin(new Insets(10, 10, 10, 10));
        chair8.setSize(700, 700);
        centerPanel.add(chair8);
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(8).getPrice());
        if (!chairStatusList.get(8)) {
            chair9 = createTopButton("chair9", "JAVA/Chairs2.png", price);
        } else {
            chair9 = createTopButton("chair9", "JAVA/Chairs3.png", price);
            hidePricePanel(chair9);
        }
        chair9.setHorizontalAlignment(SwingConstants.CENTER);
        chair9.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair9.setHorizontalTextPosition(SwingConstants.CENTER);
        chair9.addActionListener(this);
        chair9.setMargin(new Insets(10, 10, 10, 10));
        chair9.setSize(700, 700);
        centerPanel.add(chair9);
        price = String.valueOf(cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(9).getPrice());
        if (!chairStatusList.get(9)) {
            chair10 = createTopButton("chair10", "JAVA/Chairs2.png", price);
        } else {
            chair10 = createTopButton("chair10", "JAVA/Chairs3.png", price);
            hidePricePanel(chair10);
        }
        chair10.setHorizontalAlignment(SwingConstants.CENTER);
        chair10.setVerticalTextPosition(SwingConstants.BOTTOM);
        chair10.setHorizontalTextPosition(SwingConstants.CENTER);
        chair10.addActionListener(this);
        chair10.setMargin(new Insets(10, 10, 10, 10));
        chair10.setSize(700, 700);
        centerPanel.add(chair10);
        backgroundLabel.add(centerPanel, BorderLayout.CENTER);
        this.setIconImage(Frameicon.getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setContentPane(backgroundLabel);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == homeButton) {
            MainFrame frame = new MainFrame(cinema1, cinema2, cinema3, user);
            frame.setVisible(true);
            this.dispose();
            saveChairStatusListToFile("chairStatus1.txt");
        } else if (e.getSource() == narrowButton) {
            Hall1 hall1 = new Hall1(cinema1, cinema2, cinema3, user);
            hall1.setVisible(true);
            this.dispose();
            saveChairStatusListToFile("chairStatus1.txt");
        } else if (e.getSource() == userButton) {
            Admin admin = new Admin(cinema1, cinema2, cinema3, user);
            admin.setVisible(true);
            this.dispose();
            saveChairStatusListToFile("chairStatus1.txt");
        } else if (e.getSource() == chair1) {
            reserveChair(chair1,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(0).getPrice(),1);
        } else if (e.getSource() == chair2) {
            reserveChair(chair2,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(1).getPrice(),2);
        } else if (e.getSource() == chair3) {
            reserveChair(chair3,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(2).getPrice(),3);
        } else if (e.getSource() == chair4) {
            reserveChair(chair4,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(3).getPrice(),4);
        } else if (e.getSource() == chair5) {
            reserveChair(chair5,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(4).getPrice(),5);
        } else if (e.getSource() == chair6) {
            reserveChair(chair6,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(5).getPrice(),6);
        } else if (e.getSource() == chair7) {
            reserveChair(chair7,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(6).getPrice(),7);
        } else if (e.getSource() == chair8) {
            reserveChair(chair8,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(7).getPrice(),8);
        } else if (e.getSource() == chair9) {
            reserveChair(chair9,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(8).getPrice(),9);
        } else if (e.getSource() == chair10) {
            reserveChair(chair10,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(9).getPrice(),10);
        }
    }
    private JButton createTopButton(String name, String imagepath, String price) {
        button = new JButton(name);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        if ((name.equals("chair1")) || (name.equals("chair2")) || (name.equals("chair3")) || (name.equals("chair4")) || (name.equals("chair5")) || (name.equals("chair6")) || (name.equals("chair7")) || (name.equals("chair8")) || (name.equals("chair9")) || (name.equals("chair10"))) {
            imageIcon = new ImageIcon(imagepath);
            button.setIcon(imageIcon);
            pricelabel = new JLabel(price, SwingConstants.CENTER);
            pricelabel.setOpaque(true);
            pricelabel.setBackground(Color.black);
            pricelabel.setForeground(Color.white);
            font = new Font(pricelabel.getFont().getName(), Font.BOLD, 20);
            pricelabel.setFont(font);
            pricePanel = new JPanel(new BorderLayout());
            pricePanel.setOpaque(false);
            pricePanel.add(pricelabel, BorderLayout.CENTER);
            button.setLayout(new BorderLayout());
            button.add(pricePanel, BorderLayout.SOUTH);
        }
        return button;
    }


    private JButton createTopButton0(String name, String imagepath) {
        button = new JButton();
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        if (name.equals("Home")) {
            imageIcon = new ImageIcon(imagepath);
        } else if (name.equals("User")) {
            imageIcon = new ImageIcon(imagepath);
        } else if (name.equals("Back")) {
            imageIcon = new ImageIcon(imagepath);
        }
        button.setIcon(imageIcon);
        return button;
    }

    private void reserveChair(JButton chair, int chairPrice, int num) {
        if(chair.getIcon() != null && chair.getIcon().toString().equals("JAVA/Chairs3.png")) {
            for(int i=0;i<user.getBookedTickets().size();i++)
            {
                if(num==user.getBookedTickets().get(i).getN_chair() && user.getBookedTickets().get(i).getShowTime()==1)
                {
                    j=1;
                    option = JOptionPane.showConfirmDialog(this, "This chair is already reserved by you. Do you want to release it?", "Chair Reservation", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        revertChairImage(chair);
                        Ticketing.cancelTicketing(user,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(num-1));
                        chairStatusList.set(num-1, false);
                        User.saveUser(user);
                        Login.printUser();
                        break;
                    }}}
            if(j==0)
            {
                chair.setEnabled(false);
            }
        } else if (chair.getIcon().toString().equals("JAVA/Chairs2.png")) {
            if (user.getFunds() < chairPrice) {
                JOptionPane.showMessageDialog(this, "You don't have enough money to reserve this chair.");
            } else {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to reserve this chair?", "Chair Reservation", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    chair.setIcon(new ImageIcon("JAVA/Chairs3.png"));
                    Ticketing.ticketing(user,cinema1.getMovies().get(0).getShowTime().getTicketsOfShow().get(num-1));
                    user.reserveChair(num-1);
                    chairStatusList.set(num-1, true);
                    hidePricePanel(chair);
                    User.saveUser(user);
                    Login.printUser();
                }
            }
        }
        Save();
        saveChairStatusListToFile("chairStatus1.txt");
    }

    private void hidePricePanel (JButton chair){
        for (Component component : chair.getComponents()) {
            if (component instanceof JPanel) {
                panel = (JPanel) component;
                for (Component innerComponent : panel.getComponents()) {
                    if (innerComponent instanceof JLabel) {
                        innerComponent.setVisible(false);
                    }
                }
            }
        }
    }
    private void revertChairImage (JButton chair){
        chair.setIcon(new ImageIcon("JAVA/Chairs2.png"));
        showPricePanel(chair);
    }

    private void showPricePanel (JButton chair){
        for (Component component : chair.getComponents()) {
            if (component instanceof JPanel) {
                panel = (JPanel) component;
                for (Component innerComponent : panel.getComponents()) {
                    if (innerComponent instanceof JLabel) {
                        innerComponent.setVisible(true);
                    }
                }
            }
        }
    }
    public void saveChairStatusListToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(chairStatusList);
        } catch (IOException e) {
            System.err.println("Error saving chair status list: " + e.getMessage());
        }
    }
    public void loadChairStatusListFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            chairStatusList = (ArrayList<Boolean>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            chairStatusList = new ArrayList<>(List.of(
                    false, false, false, false, false, false, false, false, false, false
            ));
            System.err.println("Error loading chair status list: " + e.getMessage());
        }
    }
    public void Save(){
        try (FileInputStream fileIn = new FileInputStream("registeredUsers1.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            registerUsers1 = (ArrayList<User>) objectIn.readObject();
        } catch (EOFException e) {
            System.err.println("End of file reached unexpectedly.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
      try (FileInputStream fileI = new FileInputStream("user_data.ser.txt");
    ObjectInputStream objectIn = new ObjectInputStream(fileI)) {
        User=(User)objectIn.readObject();
    } catch (FileNotFoundException e) {
          throw new RuntimeException(e);
      } catch (IOException e) {
          throw new RuntimeException(e);
      } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
      }
 for(int i=0;i<registerUsers1.size();i++) {
        if ((registerUsers1.get(i).getUserName().equals(User.getUserName()) && registerUsers1.get(i).getPassword().equals(User.getPassword()))) {
        registerUsers1.set(i,User);
        }
        try (FileOutputStream fileOut = new FileOutputStream("registeredUsers1.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(registerUsers1); //save users
        } catch (IOException e) {
            e.printStackTrace();
        }}
}}