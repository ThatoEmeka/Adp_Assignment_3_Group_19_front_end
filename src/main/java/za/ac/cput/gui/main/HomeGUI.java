package za.ac.cput.gui.main;

import za.ac.cput.gui.account.AccountMenuGUI;
import za.ac.cput.gui.address.AddressMenuGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends JFrame implements ActionListener {
    private JFrame mainframe;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading;
    private JButton btnBank, btnAccount, btnCustomer,  btnContact,btnAddress, btnStatement;
    private JLabel Filler1, Filler2, Filler3, Filler4;
    Color backgroundColor = Color.DARK_GRAY;
    Color btnColor = Color.WHITE;
    private Font headingFont;

    public HomeGUI() {
        //Font
        headingFont = new Font("Times new roman", Font.BOLD, 30);

        mainframe = new JFrame("Group_19_Banking_Application");
        panelWest = new JPanel();
        panelNorth = new JPanel();
        panelEast = new JPanel();
        panelSouth = new JPanel();
        panelCenter = new JPanel();
        panelNorth.setBackground(backgroundColor);
        panelEast.setBackground(backgroundColor);
        panelSouth.setBackground(backgroundColor);
        panelWest.setBackground(backgroundColor);
        panelCenter.setBackground(backgroundColor);

        //Fillers

        Filler1 = new JLabel("======");
        Filler2 = new JLabel("======");
        Filler3 = new JLabel("======");
        Filler4 = new JLabel("======");
        Filler1.setForeground(backgroundColor);
        Filler2.setForeground(backgroundColor);
        Filler3.setForeground(backgroundColor);
        Filler4.setForeground(backgroundColor);
        //Buttons
        btnBank = new JButton("1. Bank");
        btnBank.setBackground(btnColor);
        btnAccount = new JButton("2. Account");
        btnAccount.setBackground(btnColor);
        btnCustomer = new JButton("3. Customer");
        btnCustomer.setBackground(btnColor);
        btnContact = new JButton("4. Contact");
        btnContact.setBackground(btnColor);
        btnAddress = new JButton("5. Address");
        btnAddress.setBackground(btnColor);
        btnStatement = new JButton("6. Statement");
        btnStatement.setBackground(btnColor);
    }

    //Creating the GUI
    public void setGUI() {
        panelNorth.setLayout(new GridLayout(1, 1));
        panelSouth.setLayout(new GridLayout(1, 1));
        panelWest.setLayout(new GridLayout(6, 1));
        panelCenter.setLayout(new GridLayout(6, 1));
        panelEast.setLayout(new GridLayout(6, 1));

        //Panel North
        panelNorth.add(Filler4);

        //Panel West:
        panelWest.add(Filler1);

        //Panel East:
        panelEast.add(Filler2);

        //Panel South:
        panelSouth.add(Filler3);

        //Panel Center
        panelCenter.add(btnBank);
        panelCenter.add(btnAccount);
        panelCenter.add(btnCustomer);
        panelCenter.add(btnContact);
        panelCenter.add(btnAddress);
        panelCenter.add(btnStatement);

        //Adding panels to mainframe:
        mainframe.add(panelNorth, BorderLayout.NORTH);
        mainframe.add(panelSouth, BorderLayout.SOUTH);
        mainframe.add(panelEast, BorderLayout.EAST);
        mainframe.add(panelCenter, BorderLayout.CENTER);
        mainframe.add(panelWest, BorderLayout.WEST);

        //Adding actions to buttons
        btnAccount.addActionListener(this);
        btnBank.addActionListener(this);
        btnCustomer.addActionListener(this);
        btnContact.addActionListener(this);
        btnAddress.addActionListener(this);
        btnStatement.addActionListener(this);

        // Set UI:
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setSize(400,400);
        mainframe.setLocationRelativeTo(null);
        mainframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("5. Address")){
            AddressMenuGui addressMenuGui = new AddressMenuGui();
            addressMenuGui.setGUI();
        }
        else if(e.getActionCommand().equals("2. Account")){
            AccountMenuGUI.main(null);
            this.setVisible(false);
        }
    }
}
