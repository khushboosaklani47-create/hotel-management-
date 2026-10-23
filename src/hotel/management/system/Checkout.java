import javax.swing.*;
import java.awt.*;

public class Checkout extends JFrame {

    Checkout() {

        setLayout(null);

        JLabel text = new JLabel("CHECKOUT");
        text.setBounds(170, 20, 300, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 28));
        add(text);

        JLabel room = new JLabel("Room Number");
        room.setBounds(50, 100, 120, 30);
        add(room);

        JTextField troom = new JTextField();
        troom.setBounds(200, 100, 150, 30);
        add(troom);

        JLabel name = new JLabel("Customer Name");
        name.setBounds(50, 160, 120, 30);
        add(name);

        JTextField tname = new JTextField();
        tname.setBounds(200, 160, 150, 30);
        add(tname);

        JButton checkout = new JButton("CHECKOUT");
        checkout.setBounds(140, 250, 150, 35);
        add(checkout);

        setBounds(400, 200, 500, 400);
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }

    public static void main(String[] args) {

        new Checkout();

    }
}