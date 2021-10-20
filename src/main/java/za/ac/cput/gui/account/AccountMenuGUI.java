package za.ac.cput.gui.account;

import za.ac.cput.App;
import za.ac.cput.gui.main.HomeGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountMenuGUI extends JFrame implements ActionListener {
    private JButton btnView, btnAdd, btnUpdate, btnDelete, btnBack;
    private JLabel lblHeading;
    private JPanel northPanel, centerPanel, southPanel;
    private Font fnt1;


    public AccountMenuGUI(){

        super("Account Menu");

        northPanel = new JPanel();
        centerPanel = new JPanel();
        southPanel = new JPanel();

        btnView = new JButton("View All Accounts");
        btnAdd = new JButton("Add New Account");
        btnUpdate = new JButton("Update Account");
        btnDelete = new JButton("Delete Account");
        btnBack = new JButton("Back");

        lblHeading = new JLabel("Accounts", SwingConstants.CENTER);

        fnt1 = new Font("Arial", Font.BOLD, 30);
    }

    public void setGUI(){

        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        centerPanel.setLayout(new GridLayout(4, 1));
        southPanel.setLayout(new GridLayout(1, 1));

        this.setPreferredSize(new Dimension(600, 600));

        lblHeading.setFont(fnt1);

        northPanel.add(lblHeading);

        centerPanel.add(btnView);
        centerPanel.add(btnAdd);
        centerPanel.add(btnUpdate);
        centerPanel.add(btnDelete);

        southPanel.add(btnBack);


        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);

        btnView.addActionListener(this);
        btnAdd .addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnBack.addActionListener(this);


        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case"Add New Account":
                CreateAccount.main(null);
                this.setVisible(false);
                break;
            case "Back":
                App.main(null);
                this.setVisible(false);
                break;
        }
    }

    public static void main(String[] args) {
        new AccountMenuGUI().setGUI();
    }

}
