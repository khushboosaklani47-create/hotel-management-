import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HotelManagementSystem extends JFrame implements ActionListener {

    HotelManagementSystem() {

        setSize(1366, 565);

        setLocation(100, 100);

        
        ImageIcon i1 = new
         ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));

JLabel image = new JLabel(i1);

add(image);
JLabel hotel = new JLabel("PARADISE STAY");
hotel.setBounds(500, 40, 500, 50);
hotel.setForeground(Color.WHITE);
hotel.setFont(new Font("serif", Font.BOLD, 50));

image.add(hotel);
JLabel line = new JLabel("Luxury • Comfort • Happiness");
line.setBounds(520, 85, 400, 30);
line.setForeground(Color.WHITE);
line.setFont(new Font("serif", Font.PLAIN, 25));

image.add(line);
JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
text.setBounds(20, 620, 1000, 100);
text.setForeground(Color.WHITE);
text.setFont(new Font("serif", Font.PLAIN, 50));

image.add(text);
JButton next = new JButton("Next");
next.addActionListener(this);
next.setBounds(1120, 620, 180, 50);
next.setFont(new Font("Tahoma",Font.BOLD,20));
next.setBackground(Color.WHITE);

image.add(next);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae) {
    setVisible(false);
    new Login();
}
    public static void main(String[] args) {

        new HotelManagementSystem();
    }
}