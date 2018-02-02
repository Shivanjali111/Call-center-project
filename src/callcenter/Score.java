package callcenter;

import java.sql.*;

public class Score {

    public static void main(String args[]) {
        
        String s="pppppppp";
        String d="qqqqqqqqqqqqqqq";
        String q="insert into abc values('"+s+"','"+d+"')";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "temp2", "123");
            Statement stmt = con.createStatement();
            /*System.out.println("success");
            ResultSet rs = stmt.executeQuery("select * from words");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            }*/
            stmt.execute(q);
            //stmt.execute("commit");
            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
