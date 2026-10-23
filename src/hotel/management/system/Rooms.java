import javax.swing.*;
import java.awt.*;

public class Rooms extends JFrame {

    Rooms() {

        setLayout(null);

        JLabel text = new JLabel("ROOM DETAILS");
        text.setBounds(180, 20, 300, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(text);

       JLabel room1 = new JLabel("Room 101");
room1.setBounds(60, 80, 150, 30);
room1.setFont(new Font("Tahoma", Font.BOLD, 18));
add(room1);

JLabel status1 = new JLabel("Available");
status1.setBounds(250, 80, 120, 30);
status1.setForeground(Color.GREEN);
status1.setFont(new Font("Tahoma", Font.BOLD, 18));
add(status1);


JLabel room2 = new JLabel("Room 102");
room2.setBounds(60, 140, 150, 30);
room2.setFont(new Font("Tahoma", Font.BOLD, 18));
add(room2);

JLabel status2 = new JLabel("Booked");
status2.setBounds(250, 140, 120, 30);
status2.setForeground(Color.RED);
status2.setFont(new Font("Tahoma", Font.BOLD, 18));
add(status2);


JLabel room3 = new JLabel("Room 103");
room3.setBounds(60, 200, 150, 30);
room3.setFont(new Font("Tahoma", Font.BOLD, 18));
add(room3);

JLabel status3 = new JLabel("Available");
status3.setBounds(250, 200, 120, 30);
status3.setForeground(Color.GREEN);
status3.setFont(new Font("Tahoma", Font.BOLD, 18));
add(status3);
        setBounds(400, 200, 500, 350);
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Rooms();
    }
}