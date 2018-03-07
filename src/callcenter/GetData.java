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
    
    public void getDictionary(){
        DefaultTableModel dtm = (DefaultTableModel) h.dictT.getModel();
         dtm.setRowCount(0);
         try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from word_dictionary");
              while (rs.next()){
                  Object[] row = { rs.getInt("word_id"),rs.getString("description"),rs.getString("category"),rs.getInt("score"),rs.getDate("date_added"),
                                    rs.getDate("date_modi"),"Manager"};
                  dtm.addRow(row);
              }
        }catch(SQLException ex){
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getCustomer(){
        DefaultTableModel dtm = (DefaultTableModel) h.customerT.getModel();
         dtm.setRowCount(0);
         try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from customer");
              while (rs.next()){
                  Object[] row = { rs.getInt(1),rs.getString("first_name"),rs.getString("last_name"),rs.getString("emailid"),rs.getLong("mobile"),
                  rs.getString("product_service"),rs.getDate("warranty_date")};
                  dtm.addRow(row);
              }
        }catch(SQLException ex){
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getDepartment(){
        DefaultTableModel dtm = (DefaultTableModel) h.settingsT.getModel();
         dtm.setRowCount(0);
         try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from department");
              while (rs.next()){
                  Object[] row = {"Department",rs.getString(2),rs.getInt(1)};
                  dtm.addRow(row);
              }
        }catch(SQLException ex){
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getDesk(int i){
        DefaultTableModel dtm = (DefaultTableModel) h.settingsT.getModel();
        if(i==1)
            dtm.setRowCount(0);
         try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from desk");
              while (rs.next()){
                  Object[] row = {"Desk",rs.getString(2),rs.getInt(1)};
                  dtm.addRow(row);
              }
        }catch(SQLException ex){
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getCallType(int i){
        DefaultTableModel dtm = (DefaultTableModel) h.settingsT.getModel();
        if(i==1)
            dtm.setRowCount(0);
         try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from call_type");
              while (rs.next()){
                  Object[] row = {"Call Type",rs.getString(2),rs.getInt(1)};
                  dtm.addRow(row);
              }
        }catch(SQLException ex){
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getCallCategory(int i){
        DefaultTableModel dtm = (DefaultTableModel) h.settingsT.getModel();
        if(i==1)
            dtm.setRowCount(0);
         try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from category");
              while (rs.next()){
                  Object[] row = {"Call category",rs.getString(2),rs.getInt(1)};
                  dtm.addRow(row);
              }
        }catch(SQLException ex){
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getError(int i){
        DefaultTableModel dtm = (DefaultTableModel) h.settingsT.getModel();
        if(i==1)
            dtm.setRowCount(0);
         try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from error_type");
              while (rs.next()){
                  Object[] row = {"Error",rs.getString(2),rs.getInt(1)};
                  dtm.addRow(row);
              }
        }catch(SQLException ex){
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
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
