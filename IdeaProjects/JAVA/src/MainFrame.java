import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener {
    private ImageIcon imageIcon,Frameicon,hal1,hal2,hal3,user,Home,Home2;
    private JLabel backgroundLabel;
    private JPanel panel,pane,main;
    private JButton button,hall1,hall2,hall3,admin;
    private GroupLayout layout;

    private Cinema cinema1,cinema2,cinema3;
    private User user1;
    public MainFrame(Cinema cinema1, Cinema cinema2, Cinema cinema3,User user1) {
        this.user1=user1;
        System.out.println();
        System.out.println("User's Info: ");
        user1.details();
        this.cinema1=cinema1;
        this.cinema2=cinema2;
        this.cinema3=cinema3;
        this.setTitle("Cinema");
        Home = new ImageIcon("JAVA/back0.jpg");
        Frameicon = new ImageIcon("JAVA/frame.jpg");
        hal1= new ImageIcon("JAVA/hall1.jpg");
        hal2= new ImageIcon("JAVA/hall2.jpg");
        hal3= new ImageIcon("JAVA/hall3.jpg");
        user= new ImageIcon("JAVA/admin.jpg");
        Home2 = new ImageIcon("JAVA/back2.jpg");
        main=new JPanel(new BorderLayout());
        backgroundLabel = new JLabel(Home);
        this.setLayout(new GridLayout());
        panel = new JPanel(new GridLayout());
        panel.setOpaque(false);
        hall1 = new JButton();
        hall2 = new JButton();
        hall3 = new JButton();
        admin = new JButton();
        admin.setPreferredSize(new Dimension(100,100));
        hall1.setPreferredSize(new Dimension(400,350));
        hall2.setPreferredSize(new Dimension(400,350));
        hall3.setPreferredSize(new Dimension(400,350));
        hall1.setIcon(hal1);
        hall2.setIcon(hal2);
        hall3.setIcon(hal3);
        admin.setIcon(user);
        pane = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(Home2.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        admin = createTopButton("User","JAVA/admin1.jpg");
        admin.setForeground(Color.white);
        admin.setFont(new Font(admin.getFont().getName(), Font.PLAIN, 20));
        JPanel p = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(Home.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        layout = new GroupLayout(pane);
        pane.setLayout(layout);
        pane.add(admin);
        p.add(hall1);
        p.add(hall2);
        p.add(hall3);
        hall1.addActionListener(this);
        hall2.addActionListener(this);
        hall3.addActionListener(this);
        admin.addActionListener(this);
        layout = new GroupLayout(pane);
        pane.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(admin))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(admin))
        );
        backgroundLabel.add(pane, BorderLayout.NORTH);
        backgroundLabel.add(p, BorderLayout.SOUTH);
        this.setVisible(true);
        main.add(pane,BorderLayout.NORTH);
        main.add(p,BorderLayout.CENTER);
        this.pack();
        this.setContentPane(main);
        this.setIconImage(Frameicon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }
    private JButton createTopButton(String name,String imagepath) {
        button = new JButton();
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        if (name.equals("User")) {
            imageIcon = new ImageIcon(imagepath);
        }
        button.setIcon(imageIcon);
        return button;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==hall1)
        {
            Hall1 h = new Hall1(cinema1,cinema2,cinema3,user1);
            h.setVisible(true);
            this.dispose();
        }
        else if(e.getSource()==hall2)
        {
            Hall2 hh = new Hall2(cinema1,cinema2,cinema3,user1);
            hh.setVisible(true);
            this.dispose();
        }
        else if(e.getSource()==hall3)
        {
            Hall3 hhh = new Hall3(cinema1,cinema2,cinema3,user1);
            hhh.setVisible(true);
            this.dispose();
        }
        else if(e.getSource()==admin)
        {
            Admin admin1 = new Admin(cinema1,cinema2,cinema3,user1);
            admin1.setVisible(true);
            this.dispose();
        }
    }
}