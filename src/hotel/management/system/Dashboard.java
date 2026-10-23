import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    Dashboard() {

        setBounds(0, 0, 1550, 1000);
        setLayout(null);

        // Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);

        // Heading
        JLabel text = new JLabel("WELCOME TO OUR PARADISE STAY HOTEL");
        text.setBounds(320, 80, 1200, 50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma", Font.PLAIN, 45));
        image.add(text);

       JMenuBar mb = new JMenuBar();
mb.setBounds(0,0,1550,30);
image.add(mb);

// Hotel Menu
JMenu hotel = new JMenu("HOTEL MANAGEMENT");
hotel.setForeground(Color.RED);
mb.add(hotel);

// Admin Menu
JMenu admin = new JMenu("ADMIN");
admin.setForeground(Color.BLUE);
mb.add(admin);
JMenuItem info = new JMenuItem("CUSTOMER INFO");
admin.add(info);

info.addActionListener(this);

JMenuItem employee = new JMenuItem("EMPLOYEES");
admin.add(employee);
employee.addActionListener(this);

JMenuItem manager = new JMenuItem("MANAGER INFO");
admin.add(manager);
manager.addActionListener(this);


// Reception Menu
JMenu reception = new JMenu("RECEPTION");
reception.setForeground(Color.BLACK);
mb.add(reception);

JMenuItem customer = new JMenuItem("NEW CUSTOMER");
reception.add(customer);
customer.addActionListener(this);
JMenuItem room = new JMenuItem("ROOMS");
reception.add(room);
room.addActionListener(this);

JMenuItem checkout = new JMenuItem("CHECKOUT");
reception.add(checkout);
checkout.addActionListener(this);

JMenu logout = new JMenu("LOGOUT");
logout.setForeground(Color.RED);
mb.add(logout);

JMenuItem out = new JMenuItem("EXIT");

logout.add(out);

out.addActionListener(this);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae){ 
    if(ae.getActionCommand().equals("NEW CUSTOMER")){
    new NewCustomer();
}
else
    if(ae.getActionCommand().equals("ROOMS")){
        new Rooms();
    }
    else
        if(ae.getActionCommand().equals("CHECKOUT")){
            new Checkout();
        }
        else if(ae.getActionCommand().equals("CUSTOMER INFO")) {

    new CustomerInfo();

}else if(ae.getActionCommand().equals("EMPLOYEES")) {

    new Employee();

}else if(ae.getActionCommand().equals("MANAGER INFO")) {

    new ManagerInfo();

}else
    if(ae.getActionCommand().equals("EXIT")){
        System.exit(0);
    }
    }
    public static void main(String[] args) {
        new Dashboard();
    }
}