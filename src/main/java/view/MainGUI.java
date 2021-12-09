/*
 * Created by JFormDesigner on Wed Dec 01 22:31:09 CLST 2021
 */

package view;

import model.Especialista;
import org.jdesktop.swingx.*;
import org.jdesktop.swingx.JXDatePicker;
import service.Gestor;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Billy Martinez
 */
public class MainGUI extends JFrame {
    public MainGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        initComponents();
        pantalla3();
        pantalla4();
    }

    private void pantalla4() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("src/main/resources/anime_girl_PNG52.png"));
        } catch (IOException e) {
        }
        xImagePanel1.setImage(img);
        repaint();
    }

    private void pantalla3() {
        for (Especialista e: Gestor.getEspecilistas()
             ) {
            comboBox1.addItem(e.getEspecialidad());

        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - billy
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel2 = new JPanel();
        panel5 = new JPanel();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        xDatePicker1 = new JXDatePicker();
        panel3 = new JPanel();
        panel4 = new JPanel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        comboBox1 = new JComboBox();
        label4 = new JLabel();
        textField1 = new JTextField();
        label5 = new JLabel();
        panel6 = new JPanel();
        scrollPane3 = new JScrollPane();
        xImageView1 = new JXImageView();
        xMonthView1 = new JXMonthView();
        scrollPane4 = new JScrollPane();
        xImagePanel1 = new JXImagePanel();
        panel1 = new JPanel();
        panel7 = new JPanel();
        label8 = new JLabel();
        scrollPane5 = new JScrollPane();
        xImagePanel2 = new JXImagePanel();
        panel8 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label6 = new JLabel();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();
        xMonthView2 = new JXMonthView();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/doctor.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er"
            .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== tabbedPane1 ========
                {

                    //======== panel2 ========
                    {

                        //======== panel5 ========
                        {

                            //======== scrollPane2 ========
                            {
                                scrollPane2.setViewportView(table1);
                            }

                            GroupLayout panel5Layout = new GroupLayout(panel5);
                            panel5.setLayout(panel5Layout);
                            panel5Layout.setHorizontalGroup(
                                panel5Layout.createParallelGroup()
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                            );
                            panel5Layout.setVerticalGroup(
                                panel5Layout.createParallelGroup()
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            );
                        }

                        GroupLayout panel2Layout = new GroupLayout(panel2);
                        panel2.setLayout(panel2Layout);
                        panel2Layout.setHorizontalGroup(
                            panel2Layout.createParallelGroup()
                                .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                    .addContainerGap(440, Short.MAX_VALUE)
                                    .addComponent(xDatePicker1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50))
                        );
                        panel2Layout.setVerticalGroup(
                            panel2Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(xDatePicker1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                    .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        );
                    }
                    tabbedPane1.addTab("Agendar Hora", panel2);

                    //======== panel3 ========
                    {

                        //======== panel4 ========
                        {

                            //======== scrollPane1 ========
                            {
                                scrollPane1.setViewportView(list1);
                            }

                            GroupLayout panel4Layout = new GroupLayout(panel4);
                            panel4.setLayout(panel4Layout);
                            panel4Layout.setHorizontalGroup(
                                panel4Layout.createParallelGroup()
                                    .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                            );
                            panel4Layout.setVerticalGroup(
                                panel4Layout.createParallelGroup()
                                    .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            );
                        }

                        //---- checkBox1 ----
                        checkBox1.setText("Fonasa");

                        //---- checkBox2 ----
                        checkBox2.setText("Isapre");

                        //---- label4 ----
                        label4.setText("Especialidad");

                        //---- label5 ----
                        label5.setText("Buscar ID");

                        GroupLayout panel3Layout = new GroupLayout(panel3);
                        panel3.setLayout(panel3Layout);
                        panel3Layout.setHorizontalGroup(
                            panel3Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                    .addGroup(panel3Layout.createParallelGroup()
                                        .addComponent(checkBox2)
                                        .addComponent(checkBox1))
                                    .addGap(62, 62, 62))
                                .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        panel3Layout.setVerticalGroup(
                            panel3Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkBox1)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label4)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label5))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkBox2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                    .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        );
                    }
                    tabbedPane1.addTab("Ver Especialistas", panel3);

                    //======== panel6 ========
                    {

                        //======== scrollPane3 ========
                        {
                            scrollPane3.setViewportView(xImageView1);
                        }

                        //======== scrollPane4 ========
                        {
                            scrollPane4.setViewportView(xImagePanel1);
                        }

                        GroupLayout panel6Layout = new GroupLayout(panel6);
                        panel6.setLayout(panel6Layout);
                        panel6Layout.setHorizontalGroup(
                            panel6Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                    .addComponent(xMonthView1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                    .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                        .addComponent(scrollPane4, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                        );
                        panel6Layout.setVerticalGroup(
                            panel6Layout.createParallelGroup()
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addComponent(xMonthView1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 221, Short.MAX_VALUE))
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(scrollPane4, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                        );
                    }
                    tabbedPane1.addTab("Pruebas swingX", panel6);

                    //======== panel1 ========
                    {

                        //======== panel7 ========
                        {

                            //---- label8 ----
                            label8.setText("Dias agendados");

                            //======== scrollPane5 ========
                            {
                                scrollPane5.setViewportView(xImagePanel2);
                            }

                            GroupLayout panel7Layout = new GroupLayout(panel7);
                            panel7.setLayout(panel7Layout);
                            panel7Layout.setHorizontalGroup(
                                panel7Layout.createParallelGroup()
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(label8)
                                        .addContainerGap(83, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                        .addGap(0, 104, Short.MAX_VALUE)
                                        .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                            );
                            panel7Layout.setVerticalGroup(
                                panel7Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                        .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                        .addComponent(label8)
                                        .addContainerGap())
                            );
                        }

                        //======== panel8 ========
                        {

                            //---- label1 ----
                            label1.setText("Nombre:");

                            //---- label2 ----
                            label2.setText("Apellido:");

                            //---- label3 ----
                            label3.setText("Rut:");

                            //---- label6 ----
                            label6.setText("Fecha de Creaci\u00f3n:");

                            //---- checkBox3 ----
                            checkBox3.setText("Isapre");

                            //---- checkBox4 ----
                            checkBox4.setText("Fonasa");

                            GroupLayout panel8Layout = new GroupLayout(panel8);
                            panel8.setLayout(panel8Layout);
                            panel8Layout.setHorizontalGroup(
                                panel8Layout.createParallelGroup()
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(panel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(label3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(checkBox3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(checkBox4, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(245, Short.MAX_VALUE))
                            );
                            panel8Layout.setVerticalGroup(
                                panel8Layout.createParallelGroup()
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(label1)
                                        .addGap(33, 33, 33)
                                        .addComponent(label2)
                                        .addGap(18, 18, 18)
                                        .addComponent(label3)
                                        .addGap(18, 18, 18)
                                        .addComponent(label6)
                                        .addGap(18, 18, 18)
                                        .addComponent(checkBox3)
                                        .addGap(28, 28, 28)
                                        .addComponent(checkBox4)
                                        .addContainerGap(132, Short.MAX_VALUE))
                            );
                        }

                        GroupLayout panel1Layout = new GroupLayout(panel1);
                        panel1.setLayout(panel1Layout);
                        panel1Layout.setHorizontalGroup(
                            panel1Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xMonthView2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
                        );
                        panel1Layout.setVerticalGroup(
                            panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(xMonthView2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 35, Short.MAX_VALUE))
                                .addComponent(panel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                    }
                    tabbedPane1.addTab("Perfil", panel1);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
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
    // Generated using JFormDesigner Evaluation license - billy
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTabbedPane tabbedPane1;
    private JPanel panel2;
    private JPanel panel5;
    private JScrollPane scrollPane2;
    private JTable table1;
    private JXDatePicker xDatePicker1;
    private JPanel panel3;
    private JPanel panel4;
    private JScrollPane scrollPane1;
    private JList list1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JComboBox comboBox1;
    private JLabel label4;
    private JTextField textField1;
    private JLabel label5;
    private JPanel panel6;
    private JScrollPane scrollPane3;
    private JXImageView xImageView1;
    private JXMonthView xMonthView1;
    private JScrollPane scrollPane4;
    private JXImagePanel xImagePanel1;
    private JPanel panel1;
    private JPanel panel7;
    private JLabel label8;
    private JScrollPane scrollPane5;
    private JXImagePanel xImagePanel2;
    private JPanel panel8;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label6;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JXMonthView xMonthView2;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
