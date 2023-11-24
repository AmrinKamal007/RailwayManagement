package railwaymanagementsystem;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            //Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","root");
            System.out.println("CONNECTION SUCCESSFULL");
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
public static void main(String...arg){
    conn connection=new conn();
}
}  