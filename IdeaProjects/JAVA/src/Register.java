import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class Register extends JFrame implements ActionListener {
    protected static ArrayList<String>RegisterUsers=new ArrayList<>();
    protected static ArrayList<String>RegisterPasswords=new ArrayList<>();
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton Registerbutton;
    private User user;
    private ImageIcon backgroundImage,Frameicon,waw,haapy;
    private ArrayList<User>h=new ArrayList<>();
    private GridBagConstraints gbc;
    private JPanel panel,jPanel;
    private JLabel backgroundLabel;
    private Font enlargedFont;
    private Cinema cinema1,cinema2,cinema3;
    public Register(Cinema cinema1,Cinema cinema2,Cinema cinema3) {
        this.cinema1=cinema1;
        this.cinema2=cinema2;
        this.cinema3=cinema3;
        loadRegisteredUsers();
        backgroundImage = new ImageIcon("JAVA/login.jpg");
        Frameicon = new ImageIcon("JAVA/frame.jpg");
        waw=new ImageIcon("JAVA/waw.png");
        haapy=new ImageIcon("JAVA/happy.png");
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
                checkRegisterFields();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkRegisterFields();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkRegisterFields();
            }
        });

        passwordField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkRegisterFields();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkRegisterFields();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkRegisterFields();
            }
        });
        Registerbutton = new JButton("Register");
        Registerbutton.setFont(new Font(Registerbutton.getFont().getName(),Font.PLAIN,20));
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
        gbc.gridy++;
        panel.add(usernameLabel, gbc);
        gbc.gridy++;
        panel.add(usernameField, gbc);
        gbc.gridy++;
        panel.add(passwordLabel, gbc);
        gbc.gridy++;
        panel.add(passwordField, gbc);
        jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        jPanel.setOpaque(false);
        checkRegisterFields();
        jPanel.add(Registerbutton);
        gbc.gridy++;
        panel.add(jPanel, gbc);
        Registerbutton.addActionListener(this);
        this.setTitle("Cinema");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel, BorderLayout.CENTER);
        this.setIconImage(Frameicon.getImage());
        this.pack();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Registerbutton) {
            String username = String.valueOf(usernameField.getText());
            String password = String.valueOf(passwordField.getPassword());
            if (registerUser(username, password)==0) {
                JOptionPane.showMessageDialog(this, "Registration successful!","Successfully",JOptionPane.PLAIN_MESSAGE,waw);
                saveRegisteredUsers();
                Login loginFrame = new Login(cinema1,cinema2,cinema3);
                loginFrame.setVisible(true);
                this.dispose();
            }
           else if (registerUser(username, password)==1) {
                JOptionPane.showMessageDialog(this, "We have the same information to other account , please change username or password.","Sorry!",JOptionPane.WARNING_MESSAGE,haapy);
            }
            else if (registerUser(username, password)==2) {
                JOptionPane.showMessageDialog(this, "We have the same username to other account , please change username.","Sorry!",JOptionPane.WARNING_MESSAGE,haapy);
            }
            else if (registerUser(username, password)==3) {
                JOptionPane.showMessageDialog(this, "We have the same password to other account , please change password .","Sorry!",JOptionPane.WARNING_MESSAGE,haapy);
            }
        }
    }
    /*private boolean registerUser(String username, String password)
    {
        if(RegisterUsers.size()==0 && RegisterPasswords.size()==0)
        {
            RegisterUsers.add(username);
            RegisterPasswords.add(password);
            return true;
        }
        else {
            for(int i=0;i<RegisterUsers.size();i++)
                if((RegisterUsers.get(i).equals(username) && RegisterPasswords.get(i).equals(password))||(RegisterUsers.get(i).equals(username) && RegisterPasswords.get(i)!=password))
                    return false;
            RegisterUsers.add(username);
            RegisterPasswords.add(password);
            return true;
    }
}*/
    private void checkRegisterFields() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        boolean fieldsFilled = !username.isEmpty() && !password.isEmpty();
        Registerbutton.setEnabled(fieldsFilled);
    }
    private void loadRegisteredUsers() {
        try (FileInputStream fileIn = new FileInputStream("registeredUsers.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            RegisterUsers = (ArrayList<String>) objectIn.readObject(); // Load usernames
            RegisterPasswords = (ArrayList<String>) objectIn.readObject(); // Load passwords

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle exception (e.g., show an error message or initialize the lists)
        }
    }
    private void saveRegisteredUsers() {
        try (FileOutputStream fileOut = new FileOutputStream("registeredUsers.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(RegisterUsers); // Save usernames
            objectOut.writeObject(RegisterPasswords);// Save passwords

        } catch (IOException e) {
            e.printStackTrace();
            // Handle exception (e.g., show an error message)
        } try (FileOutputStream fileOut = new FileOutputStream("registeredUsers1.txt");
               ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            for(int i=0;i<RegisterUsers.size();i++) {
                user = new User(RegisterUsers.get(i),RegisterPasswords.get(i));
                h.add(user);
            }
            objectOut.writeObject(h); //save users

        } catch (IOException e) {
            e.printStackTrace();
            // Handle exception (e.g., show an error message)
        }}
    private void saveRegisteredUsers1() {
        try (FileOutputStream fileOut = new FileOutputStream("registeredUsers1.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            for(int i=0;i<RegisterUsers.size();i++) {
                user = new User(RegisterUsers.get(i),RegisterPasswords.get(i));
                h.add(user);
            }
            objectOut.writeObject(h); //save users

        } catch (IOException e) {
            e.printStackTrace();
            // Handle exception (e.g., show an error message)
        }}
    private int registerUser(String username, String password) {
        if (RegisterUsers.isEmpty() && RegisterPasswords.isEmpty()) {
            RegisterUsers.add(username);
            RegisterPasswords.add(password);
            return 0;
        } else {
            for (int i = 0; i < RegisterUsers.size(); i++) {
                if (RegisterUsers.get(i).equals(username) && RegisterPasswords.get(i).equals(password)) {
                    return 1;
                }
                if (RegisterUsers.get(i).equals(username) && !RegisterPasswords.get(i).equals(password)) {
                    return 2;
                }
                if (!RegisterUsers.get(i).equals(username) && RegisterPasswords.get(i).equals(password)) {
                    return 3;
                }
            }
            RegisterUsers.add(username);
            RegisterPasswords.add(password);
            return 0;
        }
    }}
