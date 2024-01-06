import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hall2 extends JFrame implements ActionListener{
    private ImageIcon movieIcon,imageIcon,Frameicon,film,film1,backgroundImage;
    private JLabel backgroundLabel,timeLabel,durationLabel,dateLabel;
    private JPanel filmPanel,panel,topPanel;
    private Font labelFont;
    private GroupLayout layout;
    private Cinema cinema1,cinema2,cinema3;
    private User user;
    private String names;
    private JButton button,film0,film2,film3,film4,film5,film6,film7,film8,film9,film10,film11,film12,homeButton,userButton,backButton;
    public Hall2(Cinema cinema1,Cinema cinema2,Cinema cinema3,User user) {
        this.user=user;
        this.cinema1=cinema1;
        this.cinema2=cinema2;
        this.cinema3=cinema3;
        this.setTitle("Cinema");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        film = new ImageIcon("JAVA/film07.jpg");
        film1= new ImageIcon("JAVA/film1.png");
        Frameicon = new ImageIcon("JAVA/frame.jpg");
        backgroundImage = new ImageIcon("JAVA/back0.jpg");
        backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setLayout(new BorderLayout());
        filmPanel = new JPanel(new GridLayout(4, 3,10,10)){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(film1.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        movieIcon = new ImageIcon("JAVA/movie1.jpg");
        film0 = new JButton(movieIcon);
        film0.setContentAreaFilled(false);
        film0.setBorderPainted(false);
        film0.addActionListener(this);
        names = cinema2.getMovies().get(0).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(0).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(0).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film0.add(panel);
        filmPanel.add(film0);
        movieIcon = new ImageIcon("JAVA/movie2.jpg");
        film2 = new JButton(movieIcon);
        film2.setContentAreaFilled(false);
        film2.setBorderPainted(false);
        film2.addActionListener(this);
        names = cinema2.getMovies().get(1).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(1).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(1).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film2.add(panel);
        filmPanel.add(film2);
        movieIcon = new ImageIcon("JAVA/movie3.jpg");
        film3 = new JButton(movieIcon);
        film3.setContentAreaFilled(false);
        film3.setBorderPainted(false);
        film3.addActionListener(this);
        names = cinema2.getMovies().get(2).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(2).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(2).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film3.add(panel);
        filmPanel.add(film3);
        movieIcon = new ImageIcon("JAVA/movie4.jpg");
        film4 = new JButton(movieIcon);
        film4.setContentAreaFilled(false);
        film4.setBorderPainted(false);
        film4.addActionListener(this);
        names = cinema2.getMovies().get(3).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(3).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(3).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film4.add(panel);
        filmPanel.add(film4);
        movieIcon = new ImageIcon("JAVA/movie5.jpg");
        film5 = new JButton(movieIcon);
        film5.setContentAreaFilled(false);
        film5.setBorderPainted(false);
        film5.addActionListener(this);
        names = cinema2.getMovies().get(4).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(4).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(4).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film5.add(panel);
        filmPanel.add(film5);
        movieIcon = new ImageIcon("JAVA/movie6.jpg");
        film6 = new JButton(movieIcon);
        film6.setContentAreaFilled(false);
        film6.setBorderPainted(false);
        film6.addActionListener(this);
        names = cinema2.getMovies().get(5).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(5).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(5).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film6.add(panel);
        filmPanel.add(film6);
        movieIcon = new ImageIcon("JAVA/movie7.jpg");
        film7 = new JButton(movieIcon);
        film7.setContentAreaFilled(false);
        film7.setBorderPainted(false);
        film7.addActionListener(this);
        names = cinema2.getMovies().get(6).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(6).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(6).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film7.add(panel);
        filmPanel.add(film7);
        movieIcon = new ImageIcon("JAVA/movie8.jpg");
        film8 = new JButton(movieIcon);
        film8.setContentAreaFilled(false);
        film8.setBorderPainted(false);
        film8.addActionListener(this);
        names = cinema2.getMovies().get(7).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(7).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(7).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film8.add(panel);
        filmPanel.add(film8);
        movieIcon = new ImageIcon("JAVA/movie9.jpg");
        film9 = new JButton(movieIcon);
        film9.setContentAreaFilled(false);
        film9.setBorderPainted(false);
        film9.addActionListener(this);
        names = cinema2.getMovies().get(8).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(8).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(8).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film9.add(panel);
        filmPanel.add(film9);
        movieIcon = new ImageIcon("JAVA/movie10.jpg");
        film10 = new JButton(movieIcon);
        film10.setContentAreaFilled(false);
        film10.setBorderPainted(false);
        film10.addActionListener(this);
        names = cinema2.getMovies().get(9).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(9).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(9).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film10.add(panel);
        filmPanel.add(film10);
        movieIcon = new ImageIcon("JAVA/movie11.jpg");
        film11 = new JButton(movieIcon);
        film11.setContentAreaFilled(false);
        film11.setBorderPainted(false);
        film11.addActionListener(this);
        names = cinema2.getMovies().get(10).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(10).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(10).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film11.add(panel);
        filmPanel.add(film11);
        movieIcon = new ImageIcon("JAVA/movie12.jpg");
        film12 = new JButton(movieIcon);
        film12.setContentAreaFilled(false);
        film12.setBorderPainted(false);
        film12.addActionListener(this);
        names = cinema2.getMovies().get(11).getShowTime().time.getHour();
        timeLabel = new JLabel("Time "+names);
        names = cinema2.getMovies().get(11).getShowTime().time.getDuration();
        durationLabel = new JLabel("Duration "+names);
        names = cinema2.getMovies().get(11).getShowTime().time.getDate();
        dateLabel = new JLabel("Date "+names);
        dateLabel.setForeground(Color.white);
        durationLabel.setForeground(Color.white);
        timeLabel.setForeground(Color.white);
        labelFont = new Font(timeLabel.getFont().getName(), Font.PLAIN, 14);
        timeLabel.setFont(labelFont);
        durationLabel.setFont(labelFont);
        dateLabel.setFont(labelFont);
        panel = new JPanel(new GridLayout(3,1));
        panel.setOpaque(false);
        panel.add(timeLabel);
        panel.add(durationLabel);
        panel.add(dateLabel);
        film12.add(panel);
        filmPanel.add(film12);
        topPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(film.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        layout = new GroupLayout(topPanel);
        topPanel.setLayout(layout);
        homeButton = createTopButton("Home","JAVA/Home1.png");
        userButton = createTopButton("User","JAVA/admin1.jpg");
        backButton = createTopButton("Back","JAVA/narrow.png");
        userButton.setForeground(Color.white);
        homeButton.setForeground(Color.white);
        backButton.setForeground(Color.black);
        homeButton.setFont(new Font(homeButton.getFont().getName(), Font.PLAIN, 20));
        userButton.setFont(new Font(userButton.getFont().getName(), Font.PLAIN, 20));
        backButton.setFont(new Font(backButton.getFont().getName(), Font.PLAIN, 20));
        homeButton.addActionListener(this);
        userButton.addActionListener(this);
        backButton.addActionListener(this);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(homeButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userButton))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(backButton)
                                .addComponent(homeButton)
                                .addComponent(userButton))
        );

        backgroundLabel.add(topPanel, BorderLayout.NORTH);
        backgroundLabel.add(filmPanel, BorderLayout.CENTER);
        this.setIconImage(Frameicon.getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setContentPane(backgroundLabel);
        this.setVisible(true);
    }

    private JButton createTopButton(String name,String imagepath) {
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==homeButton || e.getSource()==backButton)
        {
            MainFrame frame = new MainFrame(cinema1, cinema2, cinema3,user);
            frame.setVisible(true);
            this.dispose();
        }
        else if(e.getSource()==userButton)
        {
            Admin admin = new Admin(cinema1,cinema2,cinema3,user);
            admin.setVisible(true);
            this.dispose();
        } else if (e.getSource()==film0) {
            movie13 movie13 = new movie13(cinema1,cinema2,cinema3,user);
            movie13.setVisible(true);
            this.dispose();

        }
        else if (e.getSource()==film2) {
            movie14 movie14 = new movie14(cinema1,cinema2,cinema3,user);
            movie14.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film3) {
            movie15 movie15 = new movie15(cinema1,cinema2,cinema3,user);
            movie15.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film4) {
            movie16 movie16 = new movie16(cinema1,cinema2,cinema3,user);
            movie16.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film5) {
            movie17 movie17 = new movie17(cinema1,cinema2,cinema3,user);
            movie17.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film6) {
            movie18 movie18 = new movie18(cinema1,cinema2,cinema3,user);
            movie18.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film7) {
            movie19 movie19 = new movie19(cinema1,cinema2,cinema3,user);
            movie19.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film8) {
            movie20 movie20 = new movie20(cinema1,cinema2,cinema3,user);
            movie20.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film9) {
            movie21 movie21 = new movie21(cinema1,cinema2,cinema3,user);
            movie21.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film10) {
            movie22 movie22 = new movie22(cinema1,cinema2,cinema3,user);
            movie22.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film11) {
            movie23 movie23 = new movie23(cinema1,cinema2,cinema3,user);
            movie23.setVisible(true);
            this.dispose();
        }
        else if (e.getSource()==film12) {
            movie24 movie24 = new movie24(cinema1,cinema2,cinema3,user);
            movie24.setVisible(true);
            this.dispose();
        }
    }
}
