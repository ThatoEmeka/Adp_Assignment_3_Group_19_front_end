package za.ac.cput.gui.account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccount extends JFrame implements ActionListener {


    private JLabel lblBalance, lblRate, lblPeriod;
    private JTextField txtBalance, txtRate, txtPeriod;
    private JButton btnSave, btnCancel;
    public JPanel northPanel, southPanel;

    public CreateAccount(){
        super("Add new Account");

        northPanel = new JPanel();
        southPanel = new JPanel();

        lblBalance = new JLabel("Balance: ");
        lblRate = new JLabel("Interest Rate %: ");
        lblPeriod = new JLabel("Interest period: ");


        txtBalance = new JTextField(30);
        txtRate = new JTextField(30);
        txtPeriod = new JTextField(30);


        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");
    }

    public void setGUI() {
        northPanel.setLayout(new GridLayout(0,2));
        southPanel.setLayout(new GridLayout(1,2));

        northPanel.add(lblBalance);
        northPanel.add(txtBalance);
        northPanel.add(lblRate);
        northPanel.add(txtRate);
        northPanel.add(lblPeriod);
        northPanel.add(txtPeriod);


        southPanel.add(btnSave);
        southPanel.add(btnCancel);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);

        btnSave.addActionListener(this);
        btnCancel.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSave) {
            //store(txtBalance.getText(),
                //    txtRate.getText(),
                  //  txtPeriod.getText());

        } else if (e.getSource() == btnCancel) {
           AccountMenuGUI.main(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new CreateAccount().setGUI();
    }

}
