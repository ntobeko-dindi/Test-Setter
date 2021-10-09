
package testsetter;

//import java.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import java.sql.*;

public class DataAccess {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
   
    private String userId;
    private String password;
    
    //getters
    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
    //TODO setters

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //connection to database
    boolean Search(String sql)
    {
        boolean found = false;
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\TestSetter\\src\\testsetter\\systemDB.accdb");
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
           
            if(rs.next())
            {
                found = true;
                
            }
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            
        } 
        return found;
    }
    void Connect()
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\TestSetter\\src\\testsetter\\systemDB.accdb");
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            
        } 
    }
    
    int Update(String sql)
    {
        int updated = 0;
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\TestSetter\\src\\testsetter\\systemDB.accdb");
            Statement data = conn.createStatement();
            updated = data.executeUpdate(sql);
            
            //st = (PreparedStatement) conn.createStatement();
            //updated = st.executeUpdate(sql);
        }
        catch(ClassNotFoundException | SQLException ex){} 
        
        return updated;
    }
    
     ResultSet getData(String sql)
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\TestSetter\\src\\testsetter\\systemDB.accdb");
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
        }
        catch(ClassNotFoundException | SQLException ex){}
        
        return rs;
    }
}
