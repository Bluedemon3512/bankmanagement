package bankmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {

JButton SignIN,login,c1;
JTextField pinTextField=new JPasswordField();
JTextField cardTextField=new JTextField();
    
    Login(){
        

       
        JFrame frame = new JFrame("ATM Machine");
        frame.setLayout(null);
        //frame.setSize(800,480 );
        frame.setSize(800,480);
        frame.setLocation(300,60);
         frame.setVisible(true);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(120, 40, 100, 100);
        frame.add(l11);


    JLabel t1=new JLabel("Welcome To ATM");
    t1.setForeground(Color.BLACK);
    t1.setFont(new Font("Serif",Font.BOLD,38));
    t1.setBounds(250, 60, 400, 40);
    frame.add(t1);

//    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
//    JLabel label=new JLabel(i1);
//    frame.add(label);
    
    JLabel t2=new JLabel("Card NO:");
    t2.setFont(new Font("Raleway",Font.BOLD,28));
    t2.setForeground(Color.BLACK);
    t2.setBounds(120, 150, 150, 30);
    frame.add(t2);
    cardTextField=new JTextField();
    cardTextField.setBounds(300, 150,230 , 30);
    cardTextField.setFont(new Font("Arial",Font.BOLD,14));
    frame.add(cardTextField);
    
    JLabel t3=new JLabel("PIN NO:");
    t3.setFont(new Font("Raleway",Font.BOLD,28));
    t3.setBounds(120, 220, 250, 30);
    t3.setForeground(Color.BLACK);
    frame.add(t3);
    pinTextField=new JPasswordField();
    pinTextField.setBounds(300, 220,230 , 30);
    pinTextField.setFont(new Font("Arial",Font.BOLD,14));
    frame.add(pinTextField);
    
    
    login=new JButton("Login");
    login.setBounds(300, 300, 100, 30);
    login.setForeground(Color.white);
    login.setBackground(Color.BLACK);
    login.addActionListener(this);
    frame.add(login);
    
    c1=new JButton("Clear");
    c1.setBounds(430, 300, 100, 30);
    c1.setForeground(Color.white);
    c1.setBackground(Color.BLACK);
    c1.addActionListener(this);
    frame.add(c1);
    
    SignIN=new JButton("SIGN IN");
    SignIN.setBounds(300, 350, 230, 30);
    SignIN.setForeground(Color.white);
    SignIN.setBackground(Color.BLACK);
    SignIN.addActionListener(this);
    frame.add(SignIN);
    frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
}

public void actionPerformed(ActionEvent ac){
    
    
    if(ac.getSource() == login){
        
        ConOne con = new ConOne();
        String cardnumber = cardTextField.getText();
        String pinnumber = pinTextField.getText();
        String query = "select * from login where cardno = '"+cardnumber+"' and pin = '"+pinnumber+"'";
        try{
              ResultSet rs = con.s.executeQuery(query);
              if(rs.next()){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
              }else{
                JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
              }
          
        }catch(Exception e){

            System.out.println(e);
        }
    }else if(ac.getSource() == c1){
        cardTextField.setText("");
        pinTextField.setText("");



    }else if(ac.getSource()== SignIN){
        setVisible(true);
            new SignUpOne().setVisible(true);
    }
    
}    
    public static void main(String[]args){
    new Login();
    
    } 
}
