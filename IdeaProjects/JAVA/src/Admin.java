import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import net.miginfocom.swing.MigLayout;
public class Admin extends JFrame implements ActionListener {
    private JPanel backgroundPanel,topPanel,userPanel;
    private JButton homeButton,button,logoutButton,addFundsButton;
    private JLabel userImageLabel,usernameLabel,fundsLabel;
    private Font labelFont;
    private ImageIcon backgroundImage,backgroundImage1,Frameicon;
    private Image image,image1;
    private Cinema cinema1,cinema2,cinema3;
    private User user;
    private ArrayList<String>LoginUsers=new ArrayList<>();
    private ArrayList<String>LoginPassword=new ArrayList<>();
    private ArrayList<User>registerUsers1= new ArrayList<>();
    public Admin(Cinema cinema1,Cinema cinema2,Cinema cinema3,User user){
        this.cinema1=cinema1;
        this.cinema2=cinema2;
        this.cinema3=cinema3;
        this.user=user;
        this.setTitle("Cinema");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        backgroundImage = new ImageIcon("JAVA/film9.jpg");
        Frameicon = new ImageIcon("JAVA/frame.jpg");
        image = backgroundImage.getImage();
        backgroundPanel = new JPanel();
        topPanel = new JPanel(new MigLayout("fill")){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        homeButton = createTopButton("Home", "JAVA/Home1.png");
        homeButton.setFont(new Font(null,Font.PLAIN,20));
        homeButton.setForeground(Color.white);
        homeButton.addActionListener(this);
        topPanel.add(homeButton, "align right");
        backgroundImage1 = new ImageIcon("JAVA/filmm.jpg");
         image1 = backgroundImage1.getImage();
        userPanel = new JPanel(new MigLayout("fill")){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image1, 0, 0, getWidth(), getHeight(), this);
            }
        };
        loadRegisteredUsers();
        ImageIcon userImageIcon = new ImageIcon("JAVA/User.png");
         userImageLabel = new JLabel(userImageIcon);
        userPanel.add(userImageLabel, "span, center, wrap");
        String username=user.getUserName();
        usernameLabel = new JLabel("Username : "+username);
        labelFont = new Font(usernameLabel.getFont().getName(), Font.PLAIN, 50);
        usernameLabel.setForeground(Color.white);
        usernameLabel.setFont(labelFont);
        userPanel.add(usernameLabel, "align center, wrap");
        fundsLabel = new JLabel("Funds : "+user.getFunds());
        fundsLabel.setForeground(Color.white);
        fundsLabel.setFont(labelFont);
        addFundsButton = createTopButton("Add", "JAVA/plus.jpeg");
        addFundsButton.setFont(new Font(null,Font.PLAIN,20));
        addFundsButton.setForeground(Color.white);
        addFundsButton.setContentAreaFilled(false);
        addFundsButton.setBorderPainted(false);
        addFundsButton.addActionListener(this);
        fundsLabel.add(addFundsButton,"align right , wrap");
        userPanel.add(fundsLabel, "align center, wrap");
        logoutButton = createTopButton("Logout","JAVA/logout.png");
        logoutButton.setForeground(Color.white);
        logoutButton.setSize(1000,1000);
        labelFont = new Font(usernameLabel.getFont().getName(), Font.BOLD, 30);
        logoutButton.setFont(labelFont);
        logoutButton.addActionListener(this);
        logoutButton.setContentAreaFilled(false);
        logoutButton.setBorderPainted(false);
        userPanel.add(logoutButton,"align center, wrap");
        this.setContentPane(backgroundPanel);
        userPanel.add(addFundsButton, "align center, wrap");
        backgroundPanel.setLayout(new BorderLayout());
        backgroundPanel.add(topPanel, BorderLayout.NORTH);
        backgroundPanel.add(userPanel, BorderLayout.CENTER);
        this.setIconImage(Frameicon.getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    private JButton createTopButton(String name, String imagePath) {
        button = new JButton(name);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        ImageIcon imageIcon = new ImageIcon(imagePath);
        button.setIcon(imageIcon);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==homeButton)
        {
            MainFrame main = new MainFrame(cinema1,cinema1,cinema3,user);
            main.setVisible(true);
            this.dispose();
        }
        else if(e.getSource()==logoutButton)
        {
            looge();
        }
        else if (e.getSource()==addFundsButton) {
            increaseFunds();
        }
    }
    private void increaseFunds() {
        String input = JOptionPane.showInputDialog(this, "Enter the amount to increase funds:", "Increase Funds", JOptionPane.PLAIN_MESSAGE);
        if (input != null && !input.isEmpty()) {
            try {
                long amountToAdd = Long.parseLong(input);
                user.deposit(amountToAdd);
                fundsLabel.setText("Funds : " + user.getFunds());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void saveRegisteredUsers() {
        try (FileOutputStream fileOut = new FileOutputStream("registeredUsers.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(LoginUsers); // Save usernames
            objectOut.writeObject(LoginPassword); // Save passwords


        } catch (IOException e) {
            e.printStackTrace();
            // Handle exception (e.g., show an error message)
        }
        try (FileOutputStream fileOut = new FileOutputStream("registeredUsers1.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(registerUsers1); // save users
        }
        catch (IOException e) {
            e.printStackTrace();
            // Handle exception (e.g., show an error message)
        }
    }
    private void loadRegisteredUsers() {
        try (FileInputStream fileIn = new FileInputStream("registeredUsers.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            LoginUsers = (ArrayList<String>) objectIn.readObject(); // Load usernames
            LoginPassword = (ArrayList<String>) objectIn.readObject(); // Load passwords
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle exception (e.g., show an error message or initialize the lists)
        }
        try (FileInputStream fileIn = new FileInputStream("registeredUsers1.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
        registerUsers1= (ArrayList<User>)objectIn.readObject();
    }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle exception (e.g., show an error message or initialize the lists)
        }}
    private void looge()
    {
        for(int i=0;i<registerUsers1.size();i++) {
            if ((LoginUsers.get(i).equals(user.getUserName()) && LoginPassword.get(i).equals(user.getPassword()))) {
                registerUsers1.set(i,user);
            }
        }
        saveRegisteredUsers();
        Login login = new Login(cinema1,cinema2,cinema3);
        login.setVisible(true);
        this.dispose();
    }}