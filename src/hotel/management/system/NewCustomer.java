import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class NewCustomer extends JFrame implements ActionListener {

    JTextField tname, troom, tphone;
    JButton add;

    NewCustomer() {

        setLayout(null);

        JLabel text = new JLabel("NEW CUSTOMER FORM");
        text.setBounds(100, 20, 300, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(text);

        JLabel name = new JLabel("Name");
        name.setBounds(50, 80, 100, 30);
        add(name);

        tname = new JTextField();
        tname.setBounds(160, 80, 150, 30);
        add(tname);

        JLabel room = new JLabel("Room No");
        room.setBounds(50, 130, 100, 30);
        add(room);

        troom = new JTextField();
        troom.setBounds(160, 130, 150, 30);
        add(troom);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(50, 180, 100, 30);
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(160, 180, 150, 30);
        add(tphone);

        add = new JButton("ADD CUSTOMER");
        add.setBounds(100, 250, 180, 35);
        add(add);

        add.addActionListener(this);

        setBounds(300, 200, 500, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hotelmangement",
                    "root",
                    ""
            );

            Statement st = con.createStatement();

            String query = "insert into customer values('"
                    + tname.getText() + "','"
                    + troom.getText() + "','"
                    + tphone.getText() + "')";

            st.executeUpdate(query);

            System.out.println("Customer Added Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}