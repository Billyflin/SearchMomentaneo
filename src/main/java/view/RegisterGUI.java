/*
 * Created by JFormDesigner on Thu Dec 02 00:36:20 CLST 2021
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
public class RegisterGUI extends JFrame {
    public RegisterGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        initComponents();
//        button1.addActionListener(e -> register());
    }
//    private void register() {
//        label3.setText("");
//        if(textField1.getText()!=null&&textField2.getText()!=null&& !textField1.getText().equals("") && !textField2.getText().equals("")){
//            boolean registro=new Access().registerisValid(textField1.getText());
//            System.out.println(registro);
//            if(registro){
//                Gestor.registerUser(textField1.getText(), textField2.getText());
//                JOptionPane.showMessageDialog(null,"registrado");
//                dispose();
//            }
//        }else if(textField1.getText()==null||textField1.getText().equals("")) {
//            label3.setText("Ingrese Usuario");
//        }else if(textField2.getText()==null||textField2.getText().equals("")) {
//            label3.setText("Ingrese Contraseña");
//        }else if (!new Access().registerisValid(textField1.getText())) {
//            label3.setText("Usuario existente");
//        }
//    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        textField1 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        label3 = new JLabel();
        textField2 = new JPasswordField();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/doctor.png")).getImage());
        setTitle("Register");
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

                //---- button1 ----
                button1.setText("Registrarse");

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(button1, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
                            .addContainerGap())
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(49, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1)
                            .addContainerGap())
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTextField textField1;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JLabel label3;
    private JPasswordField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

