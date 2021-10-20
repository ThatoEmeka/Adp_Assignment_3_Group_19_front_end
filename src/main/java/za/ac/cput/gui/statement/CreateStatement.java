package za.ac.cput.gui.statement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateStatement implements ActionListener{

    private JFrame MenuFrame;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading,lblBalance, lblFirstName, lblLastName;
    private JButton btnCreate;
    private JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    private Font headingFont;
    private JTextField txtBalance,txtFirstName,txtLastName;
    Color btnColor = Color.WHITE;

    public CreateStatement(){
        headingFont = new Font("Times new roman", Font.BOLD, 30);

        MenuFrame = new JFrame("CREATE YOUR STATEMENT");
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




        lblHeading = new JLabel("PLEASE FILL OUT",JLabel.CENTER);
        lblBalance = new JLabel("How much money you have", JLabel.CENTER);
        lblFirstName = new JLabel("First Name? ", JLabel.CENTER);
        lblLastName = new JLabel("Last Name", JLabel.CENTER);


        txtBalance = new JTextField(" ", JTextField.CENTER);
        txtFirstName = new JTextField(" ", JTextField.CENTER);
        txtLastName = new JTextField(" ", JTextField.CENTER);



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

        panelNorth.add(Filler5);
        panelNorth.add(lblHeading);

        panelWest.add(Filler1);

        panelCenter.add(Filler3);

        panelCenter.add(lblBalance);
        panelCenter.add(txtBalance);

        panelCenter.add(lblFirstName);
        panelCenter.add(txtFirstName);

        panelCenter.add(lblLastName);
        panelCenter.add(txtLastName);


        panelEast.add(Filler2);


        panelSouth.add(btnCreate);


        lblHeading.setFont(headingFont);


        MenuFrame.add(panelNorth, BorderLayout.NORTH);
        MenuFrame.add(panelSouth, BorderLayout.SOUTH);
        MenuFrame.add(panelEast, BorderLayout.EAST);
        MenuFrame.add(panelCenter, BorderLayout.CENTER);
        MenuFrame.add(panelWest, BorderLayout.WEST);


        btnCreate.addActionListener(this);


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
