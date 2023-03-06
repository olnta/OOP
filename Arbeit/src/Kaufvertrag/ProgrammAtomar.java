package Kaufvertrag;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProgrammAtomar {

    public static void main(String[] args) {

        try {
            ArrayList<String> datenzeilenKaufvertrag = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("H:\\RP_Text/Test.csv"));
            String lines;
            while((lines = br.readLine()) != null){
                datenzeilenKaufvertrag.add(lines);
            }

            for(String datalines : datenzeilenKaufvertrag){


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
