package launcher;

import view.LoginGUI;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        runCreator();
    }
    public static void runCreator(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginGUI GUI =  new LoginGUI();
                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI.setVisible(true);
            }
        });
    }
}
