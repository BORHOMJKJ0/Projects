import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class Login extends JFrame implements ActionListener{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton,Registerbutton;
    private ImageIcon backgroundImage,Frameicon,happy,sad,waw;
    private GridBagConstraints gbc;
    private JPanel panel,jPanel;
    private JLabel backgroundLabel;
   private Font enlargedFont;
   private User user;
   private Cinema cinema1,cinema2,cinema3;
  // private ArrayList<User> users= new ArrayList<>();
    private ArrayList<String>LoginUsers=new ArrayList<>();
    private ArrayList<User>registerUsers1 = new ArrayList<>();
    private ArrayList<String>LoginPasswords=new ArrayList<>();
    public Login(Cinema cinema1,Cinema cinema2,Cinema cinema3){
        this.cinema1=cinema1;
        this.cinema2=cinema2;
        this.cinema3=cinema3;
        backgroundImage = new ImageIcon("JAVA/login.jpg");
        Frameicon = new ImageIcon("JAVA/frame.jpg");
        happy=new ImageIcon("JAVA/happy.png");
        sad=new ImageIcon("JAVA/sad.png");
        waw=new ImageIcon("JAVA/waw.png");
        backgroundLabel = new JLabel(backgroundImage);
        this.setLayout(new BorderLayout());
        this.add(backgroundLabel);
         panel = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
         panel.setBackground(Color.red);
         panel.setOpaque(false);
         gbc = new GridBagConstraints();
         gbc.gridx = 0;
         gbc.gridy = 0;
         gbc.insets = new Insets(10, 10, 10, 10);
         gbc.fill = GridBagConstraints.HORIZONTAL;
         JLabel usernameLabel = new JLabel("USER NAME:");
         JLabel passwordLabel = new JLabel("PASSWORD:");
         usernameLabel.setForeground(Color.WHITE);
         passwordLabel.setForeground(Color.WHITE);
         enlargedFont = new Font(usernameLabel.getFont().getName(), Font.PLAIN, 20);
         usernameLabel.setFont(enlargedFont);
         passwordLabel.setFont(enlargedFont);
         usernameField = new JTextField(20);
         passwordField = new JPasswordField(20);
         usernameField.setFont(enlargedFont);
         passwordField.setFont(enlargedFont);
         usernameField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkLoginFields();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkLoginFields();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkLoginFields();
            }
        });

        passwordField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkLoginFields();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkLoginFields();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkLoginFields();
            }
        });
         loginButton = new JButton("Login");
         Registerbutton = new JButton("Register");
         loginButton.setFont(new Font(loginButton.getFont().getName(), Font.PLAIN, 20));
         Registerbutton.setFont(new Font(Registerbutton.getFont().getName(),Font.PLAIN,20));
         loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                loginButton.setBackground(UIManager.getColor("Button.background"));
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                loginButton.setBackground(Color.red);
            }
        });
        Registerbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                Registerbutton.setBackground(UIManager.getColor("Button.background"));
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                Registerbutton.setBackground(Color.red);
            }
        });
        retrieveRegisteredUsers();
        gbc.gridy++;
        panel.add(usernameLabel, gbc);
        gbc.gridy++;
        panel.add(usernameField, gbc);
        gbc.gridy++;
        panel.add(passwordLabel, gbc);
        gbc.gridy++;
        panel.add(passwordField, gbc);
        gbc.gridy++;
        jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        jPanel.setOpaque(false);
        checkLoginFields();
        jPanel.add(loginButton);
        jPanel.add(Registerbutton);
        gbc.gridy++;
        panel.add(jPanel, gbc);
        loginButton.addActionListener(this);
        Registerbutton.addActionListener(this);
        this.setTitle("Cinema");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(Frameicon.getImage());
        this.add(panel, BorderLayout.CENTER);
        this.pack();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        printRegisteredUsers();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = String.valueOf(usernameField.getText());
            String password = String.valueOf(passwordField.getPassword());
            if (isValid(username, password)==0) {
                JOptionPane.showMessageDialog(this, "Login successful!","Finally!",JOptionPane.PLAIN_MESSAGE,waw);
                MainFrame mainFrame = new MainFrame(cinema1,cinema2,cinema3,user);
                mainFrame.setVisible(true);
                this.dispose();
            } else if(isValid(username, password)==1) {
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please Register your account.","Error",JOptionPane.WARNING_MESSAGE,happy);
            } else if (isValid(username,password)==2) {
                JOptionPane.showMessageDialog(this, "Password is Wrong.","Error",JOptionPane.ERROR_MESSAGE,sad);
            }
            else if (isValid(username,password)==3) {
                JOptionPane.showMessageDialog(this, "Username is Wrong.","Error",JOptionPane.ERROR_MESSAGE,sad);
            }
        } else if (e.getSource() == Registerbutton) {
            Register registrationFrame = new Register(cinema1,cinema2,cinema3);
            registrationFrame.setVisible(true);
            this.dispose();
        }
    }

    private int isValid(String username, String password)
    {
        if(LoginUsers.size()==0 && LoginPasswords.size()==0)
        {
            return 1;
        }
        else {
            for(int i=0;i<LoginUsers.size();i++)
            {
                if((LoginUsers.get(i).equals(username) && LoginPasswords.get(i).equals(password)))
                {
                    user=registerUsers1.get(i);
                    return 0;
                }
                else if((LoginUsers.get(i).equals(username) && !LoginPasswords.get(i).equals(password)))
                    return 2;
                else if ((!LoginUsers.get(i).equals(username) && LoginPasswords.get(i).equals(password)))
                    return 3;
            }
            return 1;
        }
    }
    private void checkLoginFields() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        boolean fieldsFilled = !username.isEmpty() && !password.isEmpty();
        loginButton.setEnabled(fieldsFilled);
    }
    private void retrieveRegisteredUsers() {
        try (FileInputStream fileIn = new FileInputStream("registeredUsers.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            LoginUsers = (ArrayList<String>) objectIn.readObject();
            LoginPasswords = (ArrayList<String>) objectIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle exception
        }

        try (FileInputStream fileIn = new FileInputStream("registeredUsers1.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            registerUsers1 = (ArrayList<User>) objectIn.readObject();
        } catch (EOFException e) {
            // Handle EOFException if necessary
            System.err.println("End of file reached unexpectedly.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle exception
        }
    }


    private void printRegisteredUsers() {
        try (FileInputStream fileIn = new FileInputStream("registeredUsers.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            ArrayList<String> registerUsers = (ArrayList<String>) objectIn.readObject();
            ArrayList<String> registerPasswords = (ArrayList<String>) objectIn.readObject();

            System.out.println("Registered Users:");
            for (int i = 0; i < registerUsers.size(); i++) {
                System.out.println("Username : " + registerUsers.get(i) + " , Password : " + registerPasswords.get(i));
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void printUser() {
        try (FileInputStream fileIn = new FileInputStream("user_data.ser.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            ArrayList<User>registerUsers = new ArrayList<>();
            registerUsers.add((User)objectIn.readObject());
            System.out.println("User's Info:");
            for (int i = 0; i < registerUsers.size(); i++) {
                System.out.println("Username : "+registerUsers.get(i).getUserName());
                System.out.println("his Funds : "+registerUsers.get(i).getFunds());
                System.out.println("number of Booked tickets : "+registerUsers.get(i).getBookedTickets().size());
                for(int j=0;j<registerUsers.get(i).getBookedTickets().size();j++)
                {
                    System.out.println("Ticket information "+(j+1)+" : ");
                    System.out.println("Movie name : "+registerUsers.get(i).getBookedTickets().get(j).getMovieName());
                    System.out.println("Chair number : "+registerUsers.get(i).getBookedTickets().get(j).getN_chair());
                    System.out.println("Price : "+registerUsers.get(i).getBookedTickets().get(j).getPrice());

            }}
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }}
