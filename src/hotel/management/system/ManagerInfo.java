import javax.swing.*;
import java.awt.*;

public class ManagerInfo extends JFrame {

    ManagerInfo() {

        setLayout(null);

        JLabel text = new JLabel("MANAGER INFORMATION");
        text.setBounds(100, 20, 400, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(text);

        JTextArea area = new JTextArea();

        area.setText(
                "Name : Priya Sharma\n" +
                "Department : Hotel Management\n" +
                "Phone : 9876543210\n" +
                "Experience : 5 Years\n\n" +

                "Name : Mohak Thakur\n" +
                "Department : Operations\n" +
                "Phone : 9123456780\n" +
                "Experience : 3 Years"
        );

        area.setBounds(60, 80, 400, 250);

        area.setFont(new Font("Tahoma", Font.PLAIN, 18));

        add(area);

        setBounds(400, 200, 550, 450);

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }

    public static void main(String[] args) {

        new ManagerInfo();

    }
}
