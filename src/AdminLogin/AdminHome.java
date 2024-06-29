package AdminLogin;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class AdminHome
{
    JFrame homeScreen;
    public AdminHome()
    {
        homeScreen=new JFrame();
        Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
        homeScreen.setSize(1000,800);
        homeScreen.setLayout(null);
        homeScreen.setVisible(true);
        homeScreen.getContentPane().setBackground(Color.CYAN);
        homeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel mainText=new JLabel("Admin");
        mainText.setFont(new Font("Arial",Font.BOLD,80));
        mainText.setBounds(375,60,250,70);
        homeScreen.add(mainText);
        JButton add =new JButton("Add User");
        Font font1=new Font("Arial",Font.PLAIN, 40);
        add.setFont(font1);
        add.setBounds(350,200,300,80);
        homeScreen.add(add);
        add.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        JButton delete =new JButton("Delete User");
        delete.setFont(font1);
        delete.setBounds(350,300,300,80);
        homeScreen.add(delete);
        JButton view =new JButton("View User");
        view.setFont(font1);
        view.setBounds(350,400,300,80);
        homeScreen.add(view);
        JButton edit =new JButton("Edit User");
        edit.setFont(font1);
        edit.setBounds(350,500,300,80);
        homeScreen.add(edit);
        JLabel back=new JLabel("<BACK");
        back.setBounds(50,700,400,60);
        back.setFont(new Font("Arial",Font.BOLD,30));
        homeScreen.add(back);
        back.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e)
            {
                    Admin obj=new Admin();
                    homeScreen.dispose();
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
    }
}