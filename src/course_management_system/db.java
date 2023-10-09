/*
This class establishes connection to the database and it will be refereced for connetion 
through out the program... like this conn = db.database_db();
 */
package course_management_system;

import java.sql.*;
import javax.swing.JOptionPane;

public class db {

    Connection conn = null;

    public static Connection database_db() {
    
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/course_management_system", "root", "Pass@123");

               //JOptionPane.showMessageDialog(null, "Connection to remote server was established");
                
                return conn;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failure to connect " + e.getMessage());
                return null;
            }
        
    }
}
