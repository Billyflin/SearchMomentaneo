
package view;

        import org.jdesktop.swingx.JXDatePicker;

        import javax.swing.*;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
class DatePickerExample extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JXPicker Example");
        JPanel panel = new JPanel();
        JButton button = new JButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 400, 250, 100);

        JXDatePicker picker = new JXDatePicker();
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));

        panel.add(picker);
        panel.add(button);
        frame.getContentPane().add(panel);

        frame.setVisible(true);
        button.addActionListener(e -> System.out.println(picker.getDate()));

    }
}