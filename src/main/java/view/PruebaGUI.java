package view;

import javax.swing.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class PruebaGUI {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGUI GUI =  new MainGUI();
                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI.setVisible(true);
            }
        });
        System.out.println(getRandomString(8));
    }
        public static String getRandomString(int i){
            // bind the length
            byte[] bytearray;
            bytearray = new byte[256];
            String mystring;
            StringBuilder thebuffer;
            String theAlphaNumericS;

            new Random().nextBytes(bytearray);

            mystring = new String(bytearray, StandardCharsets.UTF_8);
            thebuffer = new StringBuilder();

            //remove all spacial char
            theAlphaNumericS = mystring.replaceAll("[^A-Z0-9]", "");

            //random selection
            for (int m = 0; m < theAlphaNumericS.length(); m++) {

                if (Character.isLetter(theAlphaNumericS.charAt(m)) && (i > 0) || Character.isDigit(theAlphaNumericS.charAt(m)) && (i > 0)) {
                    thebuffer.append(theAlphaNumericS.charAt(m));
                    i--;
                }
            }
            // the resulting string
            return thebuffer.toString();
        }
    }
