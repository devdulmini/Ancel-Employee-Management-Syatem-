/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

 
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author just
 */
public class db {
    
     static Connection dbnnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ancel_employee","root","");
            
        return con;
        
        
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
             return null;
    }
    
}
}
