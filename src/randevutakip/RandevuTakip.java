package randevutakip;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class RandevuTakip {
    public static void main(String[] args) {
        
        try{
        String host = "jdbc:derby://localhost:1527/RandevuDB";
        String uName = "randevu";
        String uPass= "rdb";
        Connection con = DriverManager.getConnection( host, uName, uPass );
        
        Statement stmt = con.createStatement();
        String SQL = "SELECT * FROM RANDEVULAR";
        ResultSet rs = stmt.executeQuery( SQL );
        
        while(rs.next( )){
        int id = rs.getInt("numara");
        String amount = rs.getString("gecerli");
        
        System.out.println(id + " " + amount);
        }
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
        }

        
    
    }