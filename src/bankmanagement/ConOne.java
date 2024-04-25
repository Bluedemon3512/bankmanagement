package bankmanagement;
import java.sql.*;
public class ConOne {
Connection c;
Statement s;
    public ConOne(){
    
    try{
    
    
    c = DriverManager.getConnection("jdbc:mysql:///bankmanagement","root","");
    s = c.createStatement();
    
    }catch (Exception e) {
        System.out.print(e);
    
    
    }
    
    
    }
  
}
