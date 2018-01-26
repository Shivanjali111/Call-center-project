package callcenter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CountWords {

    public static void main(String args[]) throws Exception {

        ArrayList<String> words = new ArrayList<>();
        System.out.println("Counting Words");
        FileReader fr = new FileReader("d:\\words.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int count = 0;
        while (line != null) {
            String[] parts = line.split(" ");
            for (String w : parts) {
                words.add(w);
                count++;
                //System.out.println(w);
            }
            line = br.readLine();
        }
        System.out.println(count);
        words.stream().forEach((w) -> {
            System.out.println(w);
        });
    }
}
