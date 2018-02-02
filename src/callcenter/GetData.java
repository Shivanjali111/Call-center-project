package callcenter;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class GetData {
    
    static Connection connection;
    Home h;
    
    public GetData(Home h){
        this.h=h;
    }
    
    GetData(){
        
    }
    
    public void createConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "project", "root123");
        } catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void getEmployeeInfo(){
         DefaultTableModel dtm = (DefaultTableModel) h.empInfoT.getModel();
         dtm.setRowCount(0);
         try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee2");
              while (rs.next()){
                  Date d=rs.getDate("date_join");
                  //Object[] row = { rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(5),rs.getString(12),rs.getInt(15),rs.getInt(15),rs.getDate(16)};
                  Object[] row = { rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getLong(5),rs.getString(6),rs.getString(7),
                                    rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getLong(13),rs.getInt(14),
                                    rs.getInt(15),rs.getDate(16)};
                  dtm.addRow(row);
//                   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getLong(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+
//                                    rs.getString(8)+" "+rs.getString(9)+" "+rs.getInt(10)+" "+rs.getString(11)+" "+rs.getString(12)+" "+rs.getLong(13)+" "+rs.getInt(14)+" "+
//                                   rs.getInt(15)+" "+rs.getDate(16));
              }
        }catch(SQLException ex){
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        GetData gd=new GetData();
        gd.createConnection();
       // gd.getEmployeeInfo();
    }
}
