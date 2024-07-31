package AdminLogin;

import User.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin {
    JLabel back, wrong;
    JFrame screen;
    JTextField username;
    JPasswordField password;
    JButton login;

    public Admin() {
        // Initialize the JFrame
        screen = new JFrame("Admin Login");
        screen.setSize(1000, 800);
        screen.setLayout(null);
        screen.setVisible(true);
        screen.getContentPane().setBackground(Color.CYAN);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the back label
        back = new JLabel("<BACK");
        back.setBounds(50, 700, 400, 60);
        back.setFont(new Font("Arial", Font.BOLD, 30));
        screen.add(back);
        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                CardNumber obj = new CardNumber();
                screen.dispose();
            }

            public void mouseEntered(MouseEvent e) {
                back.setForeground(new Color(102, 0, 153));
            }

            public void mouseExited(MouseEvent e) {
                back.setForeground(Color.BLACK);
            }
        });

        // Initialize the login label
        JLabel loginLabel = new JLabel("Enter Your Login Details");
        loginLabel.setBounds(75, 50, 850, 100);
        loginLabel.setFont(new Font("Arial", Font.BOLD, 70));
        screen.add(loginLabel);

        // Initialize the username field
        username = new JTextField("Enter Your Username");
        username.setBounds(200, 200, 600, 80);
        username.setFont(new Font("Arial", Font.PLAIN, 30));
        username.setForeground(new Color(90, 90, 90));
        screen.add(username);
        username.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (username.getText().equals("Enter Your Username")) {
                    username.setText("");
                    username.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (username.getText().isEmpty()) {
                    username.setText("Enter Your Username");
                    username.setForeground(new Color(90, 90, 90));
                }
            }
        });

        // Initialize the password field
        password = new JPasswordField();
        password.setBounds(200, 350, 600, 80);
        password.setFont(new Font("Arial", Font.PLAIN, 30));
        password.setForeground(new Color(90, 90, 90));
        screen.add(password);
        password.setEchoChar((char) 0);  // Initially, show plain text

        password.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (new String(password.getPassword()).equals("Enter Your Password")) {
                    password.setText("");
                    password.setEchoChar('*');  // Set to echo char '*' to show asterisks
                    password.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (new String(password.getPassword()).isEmpty()) {
                    password.setText("Enter Your Password");
                    password.setEchoChar((char) 0);  // Reset to plain text for placeholder
                    password.setForeground(new Color(90, 90, 90));
                }
            }
        });

        // Initialize the login button
        login = new JButton("Login");
        login.setBounds(350, 500, 300, 70);
        login.setFont(new Font("Arial", Font.PLAIN, 40));
        screen.add(login);

        // Initialize the wrong label
        wrong = new JLabel("Incorrect username or password");
        wrong.setBounds(630, 600, 300, 70);
        wrong.setFont(new Font("Arial", Font.PLAIN, 20));
        wrong.setForeground(Color.RED);
        screen.add(wrong);
        wrong.setVisible(false);

        // Set the login button as the default button
        screen.getRootPane().setDefaultButton(login);

        // Add action listener to the login button
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (username.getText().equals("anurag1524") && new String(password.getPassword()).equals("password")) {
                    AdminLogin.AdminHome obj1 = new AdminLogin.AdminHome();
                    screen.dispose();
                } else {
                    wrong.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Admin();
    }
}
