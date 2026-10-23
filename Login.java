import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame  implements ActionListener{
    JButton login,cancel;

    Login() {

        setSize(600, 300);
        setLocation(350, 200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel user = new JLabel("Username");
        user.setBounds(40, 50, 100, 30);
        add(user);

        JTextField username = new JTextField();
        username.setBounds(150, 50, 150, 30);
        add(username);

        JLabel pass = new JLabel("Password");
        pass.setBounds(40, 100, 100, 30);
        add(pass);

        JPasswordField password = new JPasswordField();
        password.setBounds(150, 100, 150, 30);
        add(password);
JButton login , cancel;
        login = new JButton("Login");
        login.setBounds(40, 180, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);
        login.addActionListener(this);
        login.addActionListener(e -> {new Dashboard();
            setVisible(false);
        });
         cancel = new JButton("Cancel");
        cancel.setBounds(180, 180, 120, 30);
        cancel.setBackground(Color.BLACK);  
        cancel.setForeground(Color.WHITE);
        add(cancel);
        cancel.addActionListener(this);


        JLabel heading = new JLabel("ENJOY YOUR STAY");

heading.setBounds(350, 80, 500, 40);

heading.setFont(new Font("Tahoma", Font.BOLD, 24));

heading.setForeground(Color.RED);

add(heading);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == login) {

            new Dashboard();
            setVisible(false);

        }

        else if(ae.getSource() == cancel) {

            setVisible(false);

        }
    }

    
    public static void main(String[] args) {
        
        new Login();
    }
}