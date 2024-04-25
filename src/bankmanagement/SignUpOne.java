package bankmanagement;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{
         
    long random;     
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton nextButton;
    JRadioButton male,female,married,unmStatus,other;
    JDateChooser DateChooser;
    
    SignUpOne(){
        setLayout(null);
        Random ran = new Random();
         random = Math.abs((ran.nextLong()  % 9000L)+ 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random); 
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details"); 
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);
        
        
         JLabel Name = new JLabel("Name: "); 
        Name.setFont(new Font("Raleway",Font.BOLD,22));
        Name.setBounds(100, 140, 100, 30);
        add(Name);
        
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Ralwway",Font.BOLD,14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name: "); 
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100, 190, 200, 30);
        add(fname); 
        
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Ralwway",Font.BOLD,14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth: "); 
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        DateChooser = new JDateChooser();
        DateChooser.setBounds(300, 240, 400, 30);
        DateChooser.setForeground(Color.BLACK);
        add(DateChooser);
        
        JLabel Gender = new JLabel("Gender: "); 
        Gender.setFont(new Font("Raleway",Font.BOLD,22));
        Gender.setBounds(100, 290, 200, 30);
        add(Gender);
        male =new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);
        female =new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);
       
        ButtonGroup GenderButton = new ButtonGroup();
        GenderButton.add(male);
        GenderButton.add(female);
      
      JLabel email = new JLabel("Email Address : "); 
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Ralwway",Font.BOLD,14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        
        JLabel Mstatus = new JLabel("Marital Status : "); 
        Mstatus.setFont(new Font("Raleway",Font.BOLD,22));
        Mstatus.setBounds(100, 390, 200, 30);
        add(Mstatus); 
        
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);
        
        unmStatus = new JRadioButton("Unmarried");
        unmStatus.setBounds(450, 390, 100, 30);
        unmStatus.setBackground(Color.white);
        add(unmStatus);
        
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.white);
        add(other);
        
       
        ButtonGroup mButton = new ButtonGroup();
        mButton.add(married);
        mButton.add(unmStatus);
        mButton.add(other);
        
        JLabel address = new JLabel("Address : "); 
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100, 440, 200, 30);
        add(address); 
        
        addressTextField=new JTextField();
        addressTextField.setFont(new Font("Ralwway",Font.BOLD,14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City : "); 
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100, 490, 200, 30);
        add(city); 
        
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Ralwway",Font.BOLD,14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        
        JLabel state = new JLabel("State: "); 
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100, 540, 200, 30);
        add(state); 
        
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Ralwway",Font.BOLD,14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
         JLabel pincode = new JLabel("Pin Code: "); 
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode); 
        
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Ralwway",Font.BOLD,14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);
        
    setSize(800,720);
    setLocation(320,10);
    setVisible(true);
    getContentPane().setBackground(Color.white);
    
    nextButton = new JButton("NEXT");
    nextButton.setBackground(Color.BLACK);
    nextButton.setForeground(Color.white);
    nextButton.setFont(new Font("Raleway",Font.BOLD,14));
    nextButton.setBounds(620, 630, 80, 30);
    nextButton.addActionListener(this);
    add(nextButton);
   
    
    }
public void actionPerformed(ActionEvent ae){
    String formno = ""+ random;
    String name = nameTextField.getText();
    String fname = fnameTextField.getText();
    String dob = ((JTextField) DateChooser.getDateEditor().getUiComponent()).getText();
    String Gender = null;
    if(male.isSelected()){
        Gender = "Male";
    }else if (female.isSelected()){
        Gender = "Female";
    }
    String MaritalStatus = null;
    if(married.isSelected()){
        MaritalStatus = "Married";
    }
    else if(unmStatus.isSelected()){
        MaritalStatus = "Unmarrid";
    }
    else if(other.isSelected()){
        MaritalStatus = "Other";
    }
    String address = addressTextField.getText();
    String email = emailTextField.getText();
    String city = cityTextField.getText();
    String state = stateTextField.getText();
    String pin = pinTextField.getText();
    
    try{
    if(name.equals("")){
        JOptionPane.showMessageDialog(null, "Name is Required");   
    }
    else{
   ConOne c = new ConOne();
    String query = "insert into SignUp values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+Gender+"','"+MaritalStatus+"','"+address+"','"+email+"','"+city+"','"+state+"','"+pin+"')";
    c.s.executeUpdate(query);
    
    setVisible(true);
    new SignUptwo(formno).setVisible(true);
    
    }
    
    
    }catch(Exception e){
    System.out.print(e);
    }
    
}
    public static void main(String args[]) {
       new SignUpOne();
    }
}
