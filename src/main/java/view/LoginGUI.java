/*
 * Created by JFormDesigner on Wed Dec 01 22:49:02 CLST 2021
 */

package view;

import service.Access;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author billy
 */
public class LoginGUI extends JFrame {
    public LoginGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        initComponents();
//        okButton.addActionListener(e -> verificate());
//        button1.addActionListener(e -> runRegister());
    }
    public static void runRegister(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RegisterGUI GUI =  new RegisterGUI();
                GUI.setVisible(true);
            }
        });
    }
   public void runApp(){
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               MainGUI GUI =  new MainGUI();
               GUI.setVisible(true);
           }
       });
   }

//    private void verificate() {
//        if(loginRut.getText()!=null&&loginPass.getText()!=null&&!loginRut.getText().equals("")&&!loginPass.getText().equals("")){
//            var acceso= Access.isValid(loginRut.getText(), loginPass.getText());
//            Gestor.setAccessGranted(acceso);
//            var nivel= Access.getAccessLevel();
//            if (Gestor.isAccessGranted()&&nivel==0) {
//                runApp();
//                dispose();
//            }else if (Gestor.isAccessGranted()&&nivel==2){
//                runAdmin();
//                dispose();
//
//            }else if(!new Access().isValid(loginRut.getText(), loginPass.getText())){
//                label4.setText("Contraseña Incorrecta");
//            }
//        }else if(loginRut.getText()==null||loginRut.getText().equals("")) {
//            label4.setText("Ingrese Usuario");
//        }else if(loginPass.getText()==null||loginPass.getText().equals("")) {
//            label4.setText("Ingrese Contraseña");
//        }
//    }

    private void runAdmin() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AdminGui GUI =  new AdminGui();
                GUI.setVisible(true);
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        loginRut = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        loginPass = new JPasswordField();
        buttonBar = new JPanel();
        button1 = new JButton();
        okButton = new JButton();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/doctor.png")).getImage());
        setTitle("Login");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- label1 ----
                label1.setText("Rut");

                //---- label2 ----
                label2.setText("Contrase\u00f1a");

                //---- label3 ----
                label3.setText("Dr Search");
                label3.setFont(new Font("I Want My TTR! Condensed", label3.getFont().getStyle() | Font.BOLD, label3.getFont().getSize() + 15));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(4, 4, 4)
                                    .addComponent(loginPass, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(loginRut, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(55, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addGap(0, 80, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                    .addGap(86, 86, 86))))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label3)
                            .addGap(14, 14, 14)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(loginRut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(loginPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addComponent(label4)
                            .addContainerGap(15, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.WEST);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //---- button1 ----
                button1.setText("Registrarse");
                buttonBar.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTextField loginRut;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JPasswordField loginPass;
    private JPanel buttonBar;
    private JButton button1;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
