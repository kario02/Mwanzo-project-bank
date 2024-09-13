
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.*;


    public class Register extends JFrame implements ActionListener {

        JLabel Fname;
        JLabel Lname;
        JLabel MemberID;
        JLabel password;
        JLabel Rpassword;
        JTextField TFname;
        JTextField TMemberID;
        JTextField TLname;
        JLabel passentry;
        JTextField Tpassword;
        JTextField TRpassword;
        JTextField Tusername;
        JButton Submit;
        JLabel PhoneNo;
        JTextField TPhoneNo;
        JRadioButton male;
        JRadioButton female;
        ButtonGroup mybuttons;


        Register(){
            this. setBounds(490,210,420,520);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("REGISTER");
            this.setLayout(null);
            this.setResizable(false);

            MemberID =new JLabel("Member ID");
            MemberID.setBounds(20,20,80,30);

            TMemberID =new JTextField();
            TMemberID.setBounds(120,20,170,20);

            Fname =new JLabel("First Name");
            Fname.setBounds(20,60,80,30);

             TFname =new JTextField();
             TFname .setBounds(120,60,170,20);

            Lname =new JLabel("Last Name");
            Lname.setBounds(20,100,80,30);

            TLname =new JTextField();
            TLname .setBounds(120,100,170,20);

            passentry  =new JLabel("Set your password");
            passentry.setBounds(20,130,120,30);

            password =new JLabel("Enter Password");
            password.setBounds(40,160,100,30);

            Tpassword =new JTextField();
            Tpassword .setBounds(160,160,170,20);

            Rpassword =new JLabel("Confirm Password");
            Rpassword.setBounds(40,200,120,30);

            TRpassword =new JTextField();
            TRpassword .setBounds(160,200,170,20);

            PhoneNo = new JLabel("Phone Number");
            PhoneNo.setBounds(20,240,120,30);

            TPhoneNo =new JTextField();
            TPhoneNo.setBounds(120,240,170,20);

            male=new JRadioButton("Male");
            this.add(male);
            female=new JRadioButton("Female");
            this.add(female);
            mybuttons=new ButtonGroup();
            mybuttons.add(male);
            mybuttons.add(female);
            male.setBounds(150,270,80,20);
            female.setBounds(240,270,80,20);

            Submit = new JButton("Submit");
            Submit.setBounds(240,300,80,30);
            Submit.addActionListener(this);

            this.add(Submit);
            this.add(password);
            this.add(PhoneNo);
            this.add(TPhoneNo);
            this.add(Tpassword);
            this.add(Rpassword);
            this.add(TRpassword);
            this.add(passentry);
            this.add(MemberID);
            this.add(TMemberID);
            this.add(Fname);
            this.add(TFname);
            this.add(Lname);
            this.add(TLname);
            this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Submit){
                String id = TMemberID.getText();
                String fName = TFname.getText();
                String lName = TLname.getText();
                String phonenumber = TPhoneNo.getText();
                String pass=Tpassword.getText();
                try {
                    Connection conn =Connector.getConnection();
                    PreparedStatement stmt = conn.prepareStatement(
                            "Insert into members values(?,?,?,?,?,?,?)"
                    );
                    stmt.setString(1, id);
                    stmt.setString(2, fName);
                    stmt.setString(3,lName);
                    stmt.setString(4,phonenumber);
                    stmt.setString(5,pass);
                    stmt.setNull(6, Types.VARCHAR);
                    stmt.setNull(7, Types.INTEGER);

                    stmt.executeUpdate();

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }





            }


        }

    }


