package callcenter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Score2 {

    public static void main(String args[]) throws Exception {
        
        int positive=0,temp;
        int negative=0;
        int score=0;
        
        ArrayList<String> words = new ArrayList<>();

        FileReader fr = new FileReader("d:\\words.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int count = 0;
        while (line != null) {
            String[] parts = line.split(" ");
            for (String w : parts) {
                //w = w.replace(System.getProperty("line.separator"), "");
                w=w.trim();
                words.add(w);
                count++;
            }
            line = br.readLine();
        }
        System.out.println("Total Words: "+count);
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "temp2", "123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from words");
            
//            for (String w : words){
//                System.out.print(w+" ");
//            }
//            System.out.println("===================");
//            while (rs.next()){
//                System.out.print(rs.getString(2).trim()+" ");
//            }
            String a[]=new String[count];
            int i=0;
            words.stream().forEach((w) -> {
                a[i]=w;
            });

            
            for (String w : a) {
                //System.out.println(w);
                while (rs.next()) {
                    if(rs.getString(2).trim().equals(w)){ 
                        temp=rs.getInt(3);
                        if(temp>0)
                            positive++;
                        else
                            negative++;
                        score=score+temp;
                        //rs.first();
                        break;
                    }
                }
            }
            System.out.println("Positive words used: "+positive);
            System.out.println("Negative words used: "+negative);
            System.out.println("Total Score: "+score);
            
            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }
        
        
    }
}
