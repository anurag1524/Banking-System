package AdminLogin;
import User.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Admin 
{
    JLabel back,wrong;
    JFrame screen;
    JTextField username, password;
    JButton login;
    public Admin()
    {
        screen=new JFrame("Admin Login");
        screen.setSize(1000,800);
        screen.setLayout(null);
        screen.setVisible(true);
        screen.getContentPane().setBackground(Color.CYAN);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        back=new JLabel("<BACK");
        back.setBounds(50,700,400,60);
        back.setFont(new Font("Arial",Font.BOLD,30));
        screen.add(back);
        back.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e)
            {
                    CardNumber obj=new CardNumber();
                    screen.dispose();
            }
            public void mouseEntered(MouseEvent e)
            {
                back.setForeground(new Color(102,0,153));
            }
            public void mouseExited(MouseEvent e)
            {
                back.setForeground(Color.BLACK);
            }
            public void mousePressed(MouseEvent e)
            {

            }
            public void mouseReleased(MouseEvent e)
            {

            }

        });
        JLabel Login=new JLabel("Enter Your Login Details");
        Login.setBounds(75,50,850,100);
        Login.setFont(new Font("Arial",Font.BOLD,70));
        screen.add(Login);
        username=new JTextField("Enter Your Username");
        username.setBounds(200,200,600,80);
        username.setFont(new Font("Arial",Font.PLAIN,30));
        screen.add(username);
        username.setForeground(new Color(90,90,90));
        username.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e)
            {
                   username.setText(null);
                   username.setForeground(Color.BLACK);
            }
            public void mouseEntered(MouseEvent e)
            {

            }
            public void mouseExited(MouseEvent e)
            {

            }
            public void mousePressed(MouseEvent e)
            {

            }
            public void mouseReleased(MouseEvent e)
            {

            }

        });
        username.addFocusListener(new FocusAdapter() 
        {
            public void focusLost(FocusEvent e) 
            {
                if (username.getText().isEmpty()) 
                    {
                    username.setText("Enter Your Username");
                    username.setFont(new Font("Arial",Font.PLAIN,30));
                    username.setForeground(new Color(90,90,90));

                    }
            }
        });
        password=new JTextField("Enter Your Password");
        password.setBounds(200,350,600,80);
        password.setFont(new Font("Arial",Font.PLAIN,30));
        screen.add(password);
        password.setForeground(new Color(90,90,90));
        password.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e)
            {
                   password.setText(null);
                   password.setForeground(Color.BLACK);
            }
            public void mouseEntered(MouseEvent e)
            {

            }
            public void mouseExited(MouseEvent e)
            {

            }
            public void mousePressed(MouseEvent e)
            {

            }
            public void mouseReleased(MouseEvent e)
            {

            }

        });
        password.addFocusListener(new FocusAdapter() 
        {
            public void focusLost(FocusEvent e) 
            {
                if (password.getText().isEmpty()) 
                    {
                    password.setFont(new Font("Arial",Font.PLAIN,30));
                    password.setText("Enter Your Password");
                    password.setForeground(new Color(90,90,90));
                    }
            }
        });
        login=new JButton("Login");
        login.setBounds(350,500,300,70);
        login.setFont(new Font("Arial",Font.PLAIN, 40));
        screen.add(login);
        wrong=new JLabel("Incorrect username or passowrd");
        wrong.setBounds(630,600,300,70);
        wrong.setFont(new Font("Arial",Font.PLAIN,20));
        wrong.setForeground(Color.RED);
        screen.add(wrong);
        wrong.setVisible(false);
        screen.getRootPane().setDefaultButton(login);
        login.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(username.getText().equals("anurag1524")&&password.getText().equals("password"))
                {
                    AdminLogin.AdminHome obj1=new AdminLogin.AdminHome();
                    screen.dispose();
                }
                else
                {
                    wrong.setVisible(true);
                }

            }
        });

    }  
}
