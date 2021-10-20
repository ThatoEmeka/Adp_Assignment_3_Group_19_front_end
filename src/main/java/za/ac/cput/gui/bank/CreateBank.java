package za.ac.cput.gui.bank;
/*
 * Author: Emeka Thato Nwamadi 219404070
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateBank implements ActionListener {
    private JFrame MenuFrame;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading,lblBankName, lblBranchCode, lblCity, lblZipCode;
    private JButton btnCreate;
    private JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    private Font headingFont;
    private JTextField txtBankName,  txtBranchCode ,txtCity, txtZipCode;


    Color btnColor = Color.WHITE;


    public CreateBank(){
        //Font
        headingFont = new Font("Times new roman", Font.BOLD, 30);

        MenuFrame = new JFrame("CREATE BANK ");
        panelNorth = new JPanel();
        panelSouth = new JPanel();
        panelEast = new JPanel();
        panelWest = new JPanel();
        panelCenter = new JPanel();


        panelNorth.setBackground(Color.LIGHT_GRAY);
        panelEast.setBackground(Color.LIGHT_GRAY);
        panelSouth.setBackground(Color.LIGHT_GRAY);
        panelWest.setBackground(Color.LIGHT_GRAY);
        panelCenter.setBackground(Color.LIGHT_GRAY);

        //Heading
        lblHeading = new JLabel("ADD BANK",JLabel.CENTER);
        lblBankName = new JLabel("Bank Name ", JLabel.CENTER);
        lblBranchCode = new JLabel("Branch Code ", JLabel.CENTER);
        lblCity = new JLabel("City", JLabel.CENTER);
        lblZipCode = new JLabel("Zip code", JLabel.CENTER);
        //text fields
        txtBankName = new JTextField(" ", JTextField.CENTER);
        txtBranchCode = new JTextField(" ", JTextField.CENTER);
        txtCity = new JTextField(" ", JTextField.CENTER);
        txtZipCode = new JTextField(" ", JTextField.CENTER);


        //Fillers:
        Filler1 = new JLabel("=====");
        Filler1.setForeground(Color.LIGHT_GRAY);
        Filler2 = new JLabel("=====");
        Filler2.setForeground(Color.LIGHT_GRAY);
        Filler3 = new JLabel("================================");
        Filler3.setForeground(Color.LIGHT_GRAY);
        Filler4 = new JLabel("================================");
        Filler4.setForeground(Color.LIGHT_GRAY);
        Filler5 = new JLabel("================================");
        Filler5.setForeground(Color.LIGHT_GRAY);

        btnCreate = new JButton("Create");
        btnCreate.setBackground(btnColor);
    }

    public void setGUI() {
        panelNorth.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(5, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(5, 1));
        panelCenter.setLayout(new GridLayout(10, 1));

        //Add components to panels
        //Panel North:
        panelNorth.add(Filler5);
        panelNorth.add(lblHeading);

        //Panel West:
        panelWest.add(Filler1);

        //Panel Center:
        panelCenter.add(Filler3);
        //houseNumber
        panelCenter.add(lblBankName);
        panelCenter.add(txtBankName);
        //street name
        panelCenter.add(lblBranchCode);
        panelCenter.add(txtBranchCode);
        //city
        panelCenter.add(lblCity);
        panelCenter.add(txtCity);
        //zipCode
        panelCenter.add(lblZipCode);
        panelCenter.add(txtZipCode);

        //Panel East
        panelEast.add(Filler2);

        //Panel South:
        panelSouth.add(btnCreate);

        //Heading
        lblHeading.setFont(headingFont);

        //Adding panels to Customer Frame:
        MenuFrame.add(panelNorth, BorderLayout.NORTH);
        MenuFrame.add(panelSouth, BorderLayout.SOUTH);
        MenuFrame.add(panelEast, BorderLayout.EAST);
        MenuFrame.add(panelCenter, BorderLayout.CENTER);
        MenuFrame.add(panelWest, BorderLayout.WEST);

        //Telling compiler to listen for actions from the buttons:
        btnCreate.addActionListener(this);

        //Set GUI:
        MenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MenuFrame.pack();
        MenuFrame.setSize(400, 400);
        MenuFrame.setLocationRelativeTo(null);
        MenuFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Create")){

        }
    }
}
