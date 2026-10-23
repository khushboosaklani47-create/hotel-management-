import javax.swing.*;
import java.awt.*;

public class Employee extends JFrame {

    Employee() {

        setLayout(null);

        JLabel text = new JLabel("EMPLOYEE DETAILS");
        text.setBounds(130, 20, 300, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(text);

        JTextArea area = new JTextArea();

        area.setText(
                "Name : Rishi\n" +
                "Post : Receptionist\n" +
                "Salary : 25000\n\n" +

                "Name : Rose\n" +
                "Post : Manager\n" +
                "Salary : 50000\n\n" +

                "Name : Sana\n" +
                "Post : Chef\n" +
                "Salary : 30000"
        );

        area.setBounds(60, 80, 350, 250);
        area.setFont(new Font("Tahoma", Font.PLAIN, 18));

        add(area);

        setBounds(400, 200, 500, 450);

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }

    public static void main(String[] args) {

        new Employee();

    }
}