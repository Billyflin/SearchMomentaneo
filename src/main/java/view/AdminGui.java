/*
 * Created by JFormDesigner on Fri Dec 03 17:52:08 CLST 2021
 */

package view;

import service.IDgen;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author billy
 */
public class AdminGui extends JFrame {
    public AdminGui() {
        initComponents();
//        fillComponents();
        button1.addActionListener(e -> label4.setText(IDgen.newID(5)));
    }
//
//    private void fillComponents() {
//        for (String s: Gestor.getEspecialidades()
//             ) {
//
//            comboBoxEspecialidades.addItem(s);
//        }
//    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        label3 = new JLabel();
        comboBoxEspecialidades = new JComboBox();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        label4 = new JLabel();
        textField1 = new JTextField();
        label5 = new JLabel();
        textField2 = new JTextField();
        label6 = new JLabel();
        textField3 = new JTextField();
        panel3 = new JPanel();
        panel2 = new JPanel();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== tabbedPane1 ========
                {

                    //======== panel1 ========
                    {

                        //---- label1 ----
                        label1.setText("Nombre");

                        //---- label2 ----
                        label2.setText("ID");

                        //---- button1 ----
                        button1.setText("Generar id");

                        //---- label3 ----
                        label3.setText("Especialidad");

                        //---- checkBox1 ----
                        checkBox1.setText("Atiende con isapre?");

                        //---- checkBox2 ----
                        checkBox2.setText("Atiende con fonasa?");

                        //---- label4 ----
                        label4.setText("Nuevo ID");

                        //---- label5 ----
                        label5.setText("Rut");

                        //---- label6 ----
                        label6.setText("Direccion de Atenci\u00f3n");

                        GroupLayout panel1Layout = new GroupLayout(panel1);
                        panel1.setLayout(panel1Layout);
                        panel1Layout.setHorizontalGroup(
                            panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(checkBox2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(75, 75, 75))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                                    .addComponent(label2)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                                    .addComponent(label4))
                                                .addComponent(label3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(63, 63, 63)
                                                    .addComponent(button1))
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboBoxEspecialidades, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
                                            .addGap(68, 68, 68))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(label1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label5)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(label6)
                                                    .addGap(33, 33, 33)
                                                    .addComponent(textField3)))
                                            .addGap(0, 32, Short.MAX_VALUE))))
                        );
                        panel1Layout.setVerticalGroup(
                            panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label2)
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label4))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(label1)
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label5)
                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(9, 9, 9)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label3)
                                        .addComponent(comboBoxEspecialidades, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(label6)
                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkBox1)
                                        .addComponent(checkBox2))
                                    .addContainerGap())
                        );
                    }
                    tabbedPane1.addTab("Agregar Especialista", panel1);

                    //======== panel3 ========
                    {

                        GroupLayout panel3Layout = new GroupLayout(panel3);
                        panel3.setLayout(panel3Layout);
                        panel3Layout.setHorizontalGroup(
                            panel3Layout.createParallelGroup()
                                .addGap(0, 369, Short.MAX_VALUE)
                        );
                        panel3Layout.setVerticalGroup(
                            panel3Layout.createParallelGroup()
                                .addGap(0, 181, Short.MAX_VALUE)
                        );
                    }
                    tabbedPane1.addTab("Agregar Paciente", panel3);

                    //======== panel2 ========
                    {

                        GroupLayout panel2Layout = new GroupLayout(panel2);
                        panel2.setLayout(panel2Layout);
                        panel2Layout.setHorizontalGroup(
                            panel2Layout.createParallelGroup()
                                .addGap(0, 369, Short.MAX_VALUE)
                        );
                        panel2Layout.setVerticalGroup(
                            panel2Layout.createParallelGroup()
                                .addGap(0, 181, Short.MAX_VALUE)
                        );
                    }
                    tabbedPane1.addTab("Editar Especialistas", panel2);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addComponent(tabbedPane1, GroupLayout.Alignment.TRAILING)
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addComponent(tabbedPane1, GroupLayout.Alignment.TRAILING)
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JLabel label3;
    private JComboBox comboBoxEspecialidades;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JLabel label4;
    private JTextField textField1;
    private JLabel label5;
    private JTextField textField2;
    private JLabel label6;
    private JTextField textField3;
    private JPanel panel3;
    private JPanel panel2;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
