
package bankmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUptwo extends JFrame implements ActionListener{
         
    String formno;     
    JTextField PANTextField,AadharTextField,CitizenTextField,AccountTextField;
    JButton nextButton;
    JRadioButton Syes,Sno,eyes,eno;
    JComboBox religion,category,Incom,qualification,Occupation;
    
    SignUptwo(String formno){
        setLayout(null);
        this.formno=formno;
        
        setTitle("New Account Application Form Page 2");
        
        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details"); 
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        AdditionalDetails.setBounds(290, 80, 400, 30);
        add(AdditionalDetails);
        
        
         JLabel  Religion = new JLabel("Religion: "); 
        Religion.setFont(new Font("Raleway",Font.BOLD,22));
        Religion.setBounds(100, 140, 100, 30);
        add(Religion);
        
        String R1[] = {"Hindu","Muslim","Sikh","Other"};
        religion = new JComboBox(R1);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.white);
        add(religion);
        
        
        
        JLabel Category = new JLabel("Category: "); 
        Category.setFont(new Font("Raleway",Font.BOLD,22));
        Category.setBounds(100, 190, 200, 30);
        add(Category); 
        
        String C1[] = {"Gen","BC","AC","Other"};
        category = new JComboBox(C1);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.white);
        add(category);
        
        
        JLabel Income = new JLabel("Income: "); 
        Income.setFont(new Font("Raleway",Font.BOLD,22));
        Income.setBounds(100, 240, 200, 30);
        add(Income);
        
        String I1[] = {"NULL","< 1,50,000","< 2,50,0000","< 5,00,000","Uptp 10,00,000"};
        Incom = new JComboBox(I1);
        Incom.setBounds(300, 240, 400, 30);
        Incom.setBackground(Color.white);
        add(Incom);
        
        
        JLabel Educational = new JLabel("Educational: "); 
        Educational.setFont(new Font("Raleway",Font.BOLD,22));
        Educational.setBounds(100, 290, 200, 30);
        add(Educational);
        
//     
      JLabel Qualification = new JLabel("Qualification: "); 
        Qualification.setFont(new Font("Raleway",Font.BOLD,22));
        Qualification.setBounds(100, 315, 200, 30);
        add(Qualification);
        
        String Q1[] = {"Graduation","Non Graduation","Post Graduation","10th","12th"};
        qualification = new JComboBox(Q1);
        qualification.setBounds(300, 307, 400, 30);
        qualification.setBackground(Color.white);
        add(qualification);
        
        
        
        JLabel Mstatus = new JLabel("Occupation : "); 
        Mstatus.setFont(new Font("Raleway",Font.BOLD,22));
        Mstatus.setBounds(100, 390, 200, 30);
        add(Mstatus); 
        
    String Occ1[] = {"Salarid","Self Employed","Bussiness Man","Student","Retired"};
        Occupation = new JComboBox(Occ1);
        Occupation.setBounds(300, 390, 400, 30);
        Occupation.setBackground(Color.white);
        add(Occupation);
             
       
        
        JLabel PAN = new JLabel("PAN Number : "); 
        PAN.setFont(new Font("Raleway",Font.BOLD,22));
        PAN.setBounds(100, 440, 200, 30);
        add(PAN); 
        
        PANTextField=new JTextField();
        PANTextField.setFont(new Font("Ralwway",Font.BOLD,14));
        PANTextField.setBounds(300, 440, 400, 30);
        add(PANTextField);
        
        JLabel Aadhar = new JLabel("Aadhar Number: "); 
        Aadhar.setFont(new Font("Raleway",Font.BOLD,22));
        Aadhar.setBounds(100, 490, 200, 30);
        add(Aadhar); 
        
        AadharTextField=new JTextField();
        AadharTextField.setFont(new Font("Ralwway",Font.BOLD,14));
        AadharTextField.setBounds(300, 490, 400, 30);
        add(AadharTextField);
        
        
        JLabel Citizen = new JLabel("Senior Citizen: "); 
        Citizen.setFont(new Font("Raleway",Font.BOLD,22));
        Citizen.setBounds(100, 540, 200, 30);
        add(Citizen); 
              
        Syes = new JRadioButton("Yes");
        Syes.setBounds(300, 540, 100,30);
        Syes.setBackground(Color.white);
        add(Syes);
        
        Sno = new JRadioButton("NO");
        Sno.setBounds(450, 540, 100,30);
        Sno.setBackground(Color.white);
        add(Sno);
        
        ButtonGroup  citizengroup = new ButtonGroup();
        citizengroup.add(Syes);
        citizengroup.add(Sno);
        
        JLabel Account = new JLabel("Exisiiting Account: "); 
        Account.setFont(new Font("Raleway",Font.BOLD,22));
        Account.setBounds(100, 590, 200, 30);
        add(Account);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBounds(450, 590, 100,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup  Accountgroup = new ButtonGroup();
        Accountgroup.add(eyes);
        Accountgroup.add(eno);
        
       
        
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
    
    String sreligion = (String) religion.getSelectedItem();
    String scategory = (String) category.getSelectedItem();
    String sIncom = (String) Incom.getSelectedItem();
    String squalification = (String) qualification.getSelectedItem();
    String sOccupation = (String) Occupation.getSelectedItem();
    
    
    
    
    
    String SCitizen = null;
    if(Syes.isSelected()){
        SCitizen = "YES";
    }else if (Sno.isSelected()){
        SCitizen = "NO";
    }
    String AccountE = null;
    if(eyes.isSelected()){
        AccountE = "YES";
    }
    else if(eno.isSelected()){
        AccountE = "NO";
    }
    String Span = PANTextField.getText();
    String Saadhar = AadharTextField.getText();
   
    
    try{
        //SignUpThree Object
        setVisible(false);
        new SignUpThree(formno).setVisible(true); 
     
    ConOne c = new ConOne();
    String query = "insert into SignUpTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sIncom+"','"+sOccupation+"','"+Span+"','"+squalification+"','"+Saadhar+"','"+SCitizen+"','"+AccountE+"')";
    c.s.executeUpdate(query);
    }
    catch(Exception e){
    System.out.print(e);
    }

}
    public static void main(String args[]) {
       new SignUptwo("");
    }
}

