package Kaufvertrag;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BrCsv {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("test.csv"));

        String csv = "";
        while(null!=br.readLine()){

        }


    }
}
