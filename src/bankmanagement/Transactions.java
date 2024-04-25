package bankmanagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{

    //Thera are the button name we use in program

JButton Deposit,Withdrawl,Fastcash,ministatement,pinchange,Balance,Exit;
String pinnumber;
Transactions(String pinnumber){
 this.pinnumber=pinnumber;
setLayout(null);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
Image i2=i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
JLabel image = new JLabel(i3);
image.setBounds(0, 0, 700, 720);
add(image);

JLabel text = new JLabel("Please Select Your Transaction");
text.setBounds(130, 250, 700, 35);
text.setFont(new Font("System",Font.BOLD,16));
text.setForeground(Color.WHITE);
image.add(text);


Deposit = new JButton("Deposit");
Deposit.setBounds(100, 327, 140, 30);
Deposit.setBackground(Color.WHITE);
add(Deposit);
Deposit.addActionListener(this);

Fastcash = new JButton("Fast Cash");
Fastcash.setBounds(100, 362, 140, 30);
Fastcash.setBackground(Color.WHITE);
add(Fastcash);
Fastcash.addActionListener(this);

Withdrawl = new JButton("Cash Withdrawl");
Withdrawl.setBounds(265, 327, 140, 30);
Withdrawl.setBackground(Color.WHITE);
add(Withdrawl);
Withdrawl.addActionListener(this);

ministatement = new JButton("Mini Statement");
ministatement.setBounds(265, 362, 140, 30);
ministatement.setBackground(Color.WHITE);
add(ministatement);
ministatement.addActionListener(this);

pinchange = new JButton("Change Pin");
pinchange.setBounds(100, 397, 140, 30);
pinchange.setBackground(Color.WHITE);
add(pinchange);
pinchange.addActionListener(this);

Balance = new JButton("Check Balance");
Balance.setBounds(265, 397, 140, 30);
Balance.setBackground(Color.WHITE);
add(Balance);
Balance.addActionListener(this);

Exit = new JButton("Exit");
Exit.setBounds(210, 440, 90, 30);
Exit.setBackground(Color.WHITE);
add(Exit);
Exit.addActionListener(this);

setSize(700, 720);
setLocation(350, 0);
setUndecorated(true);
setVisible(true);


}
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==Exit){
    System.exit(0);
}

}
public static void main(String[]args){

    new Transactions("");
    
}
}
