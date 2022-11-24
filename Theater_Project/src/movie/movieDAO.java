/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie;
import java.sql.*;
/**
 *
 * @author juhoonlee
 */
public class movieDAO {
    Connection conn;
    ResultSet rs;
    PreparedStatement pstmt;
    public movieDAO(){
        try {
            String dbURL = "jdbc:mysql://localhost:3306/javaProject?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
            String dbId = "root";
            String dbPassword = "Wkrwjs4602!";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbId, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int seatReservation(movieDTO dto){
        
    }
    
    public int[] seat(String movie){
        int available[] = new int[32];
        try{
            pstmt = conn.prepareStatement("select available from " + movie);
            rs = pstmt.executeQuery();
            int i=0;
            while(rs.next()){
                available[i] = Integer.parseInt(rs.getString("available"));
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return available;
    }
    
}
