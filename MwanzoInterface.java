

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MwanzoInterface extends JFrame implements ActionListener {

        JLabel karibu;
        JLabel Mydividends;
        JTextField TMydividends;
        JLabel Myloans;
        JLabel Totalloans;
        JTextField TTotalloans;
        JLabel Penalty;
        JTextField TPenalty;
        JLabel Repaydate;
        JTextField TRepaydate;
        JLabel Requestloan;
        JLabel Amount;
        JLabel Asgroup;
        JTextField TAmount;
        //JLabel Asmember;
        JButton Request;
        JLabel Repayloan;
        JLabel Repayamount;
        JTextField TRepayamount;
        JButton Repay;
        JLabel Mycontributions;
        JLabel Totalcontributions;
        JTextField TTotalContributions;
        JLabel Contribute;
        JTextField Tcontribute;
        JButton Pay;
        JButton Exit;





        public MwanzoInterface(String name){

            this. setBounds(490,60,420,680);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Mwanzo Group");
            this.setLayout(null);
            this.setResizable(false);

            karibu =new JLabel("Karibu sana "+name);
            karibu.setBounds(20,20,100,30);

            //karibunani =new JLabel();
            //karibunani.setBounds(20,20,90,30);
            // karibunani.setText(username.getText());

            Mydividends = new JLabel("My Dividends");
            Mydividends.setBounds(60,60,110,30);

            TMydividends = new JTextField();
            TMydividends.setBounds(190,60,110,20);

            Myloans = new JLabel("My Loans:");
            Myloans.setBounds(60,100,80,30);

            Totalloans = new JLabel("Total Amount");
            Totalloans.setBounds(90,120,80,30);


            TTotalloans = new JTextField();
            TTotalloans.setBounds(190,120,110,20);

            Penalty = new JLabel("penalties");
            Penalty.setBounds(90,150,80,30);

            TPenalty = new JTextField();
            TPenalty.setBounds(190,150,110,20);

            Repaydate = new JLabel("Repay Date");
            Repaydate.setBounds(90,180,80,30);

            TRepaydate = new JTextField();
            TRepaydate.setBounds(190,180,110,20);

            Requestloan = new JLabel("Request Loan");
            Requestloan.setBounds(60,220,80,30);

            Asgroup = new JLabel("Amount");
            Asgroup.setBounds(90,240,80,30);

            TAmount= new JTextField();
            TAmount.setBounds(190,240,110,20);


            Request= new JButton("Request");
            Request.setBounds(190,270,110,20);
            Request.setFocusable(false);

            Repayloan = new JLabel("Repay Loan");
            Repayloan.setBounds(60,310,80,30);

            Repayamount = new JLabel("Amount");
            Repayamount.setBounds(90,330,80,30);

            TRepayamount= new JTextField();
            TRepayamount.setBounds(190,330,110,20);


            Repay= new JButton("Repay");
            Repay.setBounds(190,360,110,20);
            Repay.setFocusable(false);

            Mycontributions = new JLabel("My Contributions:");
            Mycontributions.setBounds(60,400,120,30);

            Totalcontributions = new JLabel("Total Contribution");
            Totalcontributions.setBounds(70,420,120,30);


            TTotalContributions = new JTextField();
            TTotalContributions.setBounds(210,420,110,20);

            Contribute= new JLabel("Make Contribution");
            Contribute.setBounds(70,450,120,30);

            Tcontribute= new JTextField();
            Tcontribute.setBounds(210,450,110,20);

            Pay= new JButton("Contribute");
            Pay.setBounds(210,490,110,20);

            Exit = new JButton("Exit");
            Exit.setBounds(300,550,80,30);
            Exit.setFocusable(false);
            Exit.addActionListener(this);



            this.add(Penalty);
            this.add(Exit);
            this.add(Mycontributions);
            this.add(Totalcontributions);
            this.add(TTotalContributions);
            this.add(Contribute);
            this.add(Tcontribute);
            this.add(Pay);
            this.add(Repayamount);
            this.add(Repayloan);
            this.add(TRepayamount);
            this.add(Repay);
            this.add(Request);
            this.add(Requestloan);
            this.add(Asgroup);
            this.add(TAmount);
            this.add(TPenalty);
            this.add(Repaydate);
            this.add(TRepaydate);
            this.add(Mydividends);
            this.add(TMydividends);
            this.add(Myloans);
            this.add(Totalloans);
            this.add(TTotalloans);

            this.add(karibu);
            // this.add(karibunani);
            this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
            if(e.getSource()==Exit){
                this.dispose();
            }
        }


    }



