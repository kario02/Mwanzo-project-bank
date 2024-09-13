


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

    public class Login extends JFrame implements ActionListener {

        JLabel Name;
        JLabel password;
        JTextField username;
        JTextField userpassword;
        JButton clear;
        JButton Login;
        JButton Register;

        public Login() {
            this.setBounds(490, 210, 400, 300);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setResizable(false);

            Name = new JLabel("Username");
            Name.setBounds(20, 20, 80, 30);

            username = new JTextField();
            username.setBounds(100, 25, 180, 20);

            password = new JLabel("Password");
            password.setBounds(20, 70, 80, 30);

            userpassword = new JTextField();
            userpassword.setBounds(100, 75, 180, 20);

            Login = new JButton("Login");
            Login.setBounds(100, 120, 80, 30);
            Login.setFocusable(false);
            Login.addActionListener(this);

            clear = new JButton("Clear");
            clear.setBounds(200, 120, 80, 30);
            clear.setFocusable(false);
            clear.addActionListener(this);


            Register = new JButton("Register");
            Register.setBounds(140, 160, 100, 30);
            Register.setFocusable(false);
            Register.addActionListener(this);

            this.add(Register);
            this.add(Login);
            this.add(clear);
            this.add(userpassword);
            this.add(password);
            this.add(username);
            this.add(Name);
            this.setVisible(true);


        }

        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==clear){
                username.setText("");
                userpassword.setText("");
            }
            if(e.getSource()==Register){
                username.setText("");
                userpassword.setText("");

                new Register();
            }
            if(e.getSource()==Login){

                System.out.println("connecting to database");

                String T1 =username.getText();
                String T2 =userpassword.getText();

                System.out.println(T1);
                System.out.println(T2);

                Connection conn = Connector.getConnection();
                PreparedStatement stmt = null;
                try {
                    stmt = conn.prepareStatement("SELECT First_Name FROM Members WHERE Member_ID = ? AND " +
                            "Passwd = ?");
                    stmt.setString(1, T1);
                    stmt.setString(2, T2);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()){
                        new MwanzoInterface(rs.getString(1));

                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


                JLabel karibunani=new JLabel();
                username.setText("");
                userpassword.setText("");
                karibunani.setText(username.getText());




            }

        }
    }
