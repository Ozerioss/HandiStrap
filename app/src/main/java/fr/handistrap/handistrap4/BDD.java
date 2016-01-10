package fr.handistrap.handistrap4;

/**
 * Created by Ozerioss on 25/11/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BDD {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("C:\\testing.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}