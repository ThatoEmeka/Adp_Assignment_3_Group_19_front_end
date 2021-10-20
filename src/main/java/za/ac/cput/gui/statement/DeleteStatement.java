package za.ac.cput.gui.statement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteStatement implements ActionListener {
    private JFrame MenuFrame;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading,lblBalance, lblFirstName, lblLastName;
    private JButton btnCreateStatement,  btnViewStatement, btnUpdateStatement, btnDeleteStatement, btnExit;
    private JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    private Font headingFont;
    private JTextField txtBalance,txtFirstName,txtLastName;
    Color btnColor = Color.WHITE;

    public DeleteStatement() {
        headingFont = new Font("Times new roman", Font.BOLD, 30);

        MenuFrame = new JFrame("DELETE YOUR STATEMENT");
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

        lblHeading = new JLabel("DELETE STATEMENT", JLabel.CENTER);

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

        btnCreateStatement = new JButton("Please create a bank statement");
        btnCreateStatement.setBackground(btnColor);
        btnViewStatement = new JButton("View your bank statement");
        btnViewStatement.setBackground(btnColor);
        btnUpdateStatement = new JButton("Update your bank statement");
        btnUpdateStatement.setBackground(btnColor);
        btnDeleteStatement = new JButton("Delete your bank statement");
        btnDeleteStatement.setBackground(btnColor);
        btnExit = new JButton("Exit");
        btnExit.setBackground(btnColor);
    }

    public void setGUI() {
        panelNorth.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(5, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(5, 1));
        panelCenter.setLayout(new GridLayout(7, 1));


        panelNorth.add(Filler5);
        panelNorth.add(lblHeading);


        panelWest.add(Filler1);


        panelCenter.add(Filler3);
        panelCenter.add(btnCreateStatement);
        panelCenter.add(btnViewStatement);
        panelCenter.add(btnUpdateStatement);
        panelCenter.add(btnDeleteStatement);
        panelCenter.add(Filler4);


        panelEast.add(Filler2);


        panelSouth.add(btnExit);


        lblHeading.setFont(headingFont);


        MenuFrame.add(panelNorth, BorderLayout.NORTH);
        MenuFrame.add(panelSouth, BorderLayout.SOUTH);
        MenuFrame.add(panelEast, BorderLayout.EAST);
        MenuFrame.add(panelCenter, BorderLayout.CENTER);
        MenuFrame.add(panelWest, BorderLayout.WEST);
        MenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MenuFrame.pack();
        MenuFrame.setSize(350, 350);
        MenuFrame.setLocationRelativeTo(null);
        MenuFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getActionCommand().equals("Exit")){
            MenuFrame.dispose();
        }
    }
}

