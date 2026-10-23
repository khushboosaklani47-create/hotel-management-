import javax.swing.*;
import java.awt.*;

public class CustomerInfo extends JFrame {

    CustomerInfo() {

        setLayout(null);

        JLabel text = new JLabel("CUSTOMER INFORMATION");
        text.setBounds(120, 20, 400, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(text);

JTextArea area = new JTextArea();

area.setText(
        "Name  : VANSHAJ\n" +
        "Room  : 101\n" +
        "Phone : 9876543210\n" +
        "Status: Checked In\n\n" +

        "Name  : ARAOHI\n" +
        "Room  : 102\n" +
        "Phone : 9123456780\n" +
        "Status: Checked In\n\n" +

        "Name  : JENNIE\n" +
        "Room  : 103\n" +
        "Phone : 9812345678\n" +
        "Status: Checked Out"
);

area.setBounds(50, 80, 450, 320);

area.setFont(new Font("Tahoma", Font.PLAIN, 18));

area.setEditable(false);

add(area);
        setBounds(350, 150, 650, 550);
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }

    public static void main(String[] args) {

        new CustomerInfo();

    }
}
