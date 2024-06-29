package User;
import AdminLogin.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class CardNumber 
{
    JFrame card;
    JButton enter;
    JTextField number, PIN;
    JLabel admin;
    public  CardNumber()
    {
        Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
        card=new JFrame("ATM Machine");
        card.setSize(1000,800);
        card.setLayout(null);
        card.setVisible(true);
        card.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        card.getContentPane().setBackground(Color.CYAN);
        JLabel mainText=new JLabel("ATM");
        mainText.setFont(new Font("Arial",Font.BOLD,80));
        mainText.setBounds(400,60,200,70);
        card.add(mainText);
        JLabel subText=new JLabel("Management System");
        subText.setFont(new Font("Arial",Font.BOLD,40));
        subText.setBounds(300,150,400,70);
        card.add(subText);
        number=new JTextField("Enter Card Number");
        number.setBounds(150,300,700,70);
        number.setFont(new Font("Arial",Font.PLAIN,30));
        number.setForeground(new Color(90,90,90));
        card.add(number);
        number.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e)
            {
                number.setText("");
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
        number.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c)) 
                {
                    e.consume(); 
                }
            }
        public void keyReleased(KeyEvent e) {
        JTextField textField = (JTextField) e.getSource();
        String text = textField.getText();
            if (text.length() > 16) 
                {
                    textField.setText(text.substring(0, 16)); 
                }
            }
        });
        number.addFocusListener(new FocusAdapter() 
        {
            public void focusLost(FocusEvent e) 
            {
                if (number.getText().isEmpty()) 
                    {
                        number.setText("Enter Card Number");
                        number.setFont(new Font("Arial",Font.PLAIN,30));
                        number.setForeground(new Color(90,90,90));
                    }
            }
        });
        Font font1=new Font("Arial",Font.PLAIN, 40);
        PIN=new JTextField("Enter PIN Number");
        PIN.setBounds(150,400,700,70);
        PIN.setFont(new Font("Arial",Font.PLAIN,30));
        PIN.setForeground(new Color(90,90,90));
        card.add(PIN);
        PIN.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e)
            {
                PIN.setText("");
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
        PIN.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c)) 
                {
                    e.consume(); 
                }
            }
        public void keyReleased(KeyEvent e) {
        JTextField textField1 = (JTextField) e.getSource();
        String text = textField1.getText();
            if (text.length() > 4) 
                {
                    textField1.setText(text.substring(0, 4)); 
                }
            }
        });
        PIN.addFocusListener(new FocusAdapter() 
        {
            public void focusLost(FocusEvent e) 
            {
                if (PIN.getText().isEmpty()) 
                    {
                        PIN.setText("Enter PIN Number");
                        PIN.setFont(new Font("Arial",Font.PLAIN,30));
                        PIN.setForeground(new Color(90,90,90));
                    }
            }
        });
        enter=new JButton("Continue");
        enter.setBounds(300,500,400,70);
        enter.setFont(font1);
        card.add(enter);
        admin=new JLabel("ADMIN LOGIN>");
        admin.setBounds(750,700,250,60);
        admin.setFont(new Font("Arial",Font.BOLD,30));
        card.add(admin);
        admin.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e)
            {
                    Admin obj1=new Admin();
                    card.dispose();
            }
            public void mouseEntered(MouseEvent e)
            {
                admin.setForeground(new Color(102,0,153));
            }
            public void mouseExited(MouseEvent e)
            {
                admin.setForeground(Color.BLACK);

            }
            public void mousePressed(MouseEvent e)
            {

            }
            public void mouseReleased(MouseEvent e)
            {

            }

        });
        JLabel subtitle=new JLabel("Powered by Anurag");
        subtitle.setBounds(20,700,500,60);
        subtitle.setFont(new Font("Arial",Font.BOLD,15));
        Color darkGray=new Color(90,90,90);
        subtitle.setForeground(Color.darkGray);
        card.add(subtitle);
    }
}
