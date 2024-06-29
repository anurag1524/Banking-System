package AdminLogin;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class AddUser {
   public AddUser()
    {
        JFrame addForm=new JFrame();
        addForm.setSize(1000,800);
        addForm.setLayout(null);
        addForm.setVisible(true);
        addForm.getContentPane().setBackground(Color.CYAN);
        addForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel headerText=new JLabel("Enter User's Details");
        headerText.setBounds(250,50,500,100);
        headerText.setFont(new Font("Arial",Font.BOLD,50));
        addForm.add(headerText);
        JLabel firstName=new JLabel("First Name");
        Font textFont=new Font("Arial",Font.BOLD,30);
        firstName.setBounds(50,150,200,50);
        firstName.setFont(textFont);
        addForm.add(firstName); 
        JTextField typeFirstName =new JTextField();
        
        
    }
}
