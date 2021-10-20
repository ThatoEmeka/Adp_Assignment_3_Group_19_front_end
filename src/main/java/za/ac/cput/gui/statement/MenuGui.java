package za.ac.cput.gui.statement;

import za.ac.cput.gui.address.CreateAddress;
import za.ac.cput.gui.address.DeleteAddress;
import za.ac.cput.gui.address.UpdateAddress;
import za.ac.cput.gui.address.ViewAddress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGui implements ActionListener{

    private JFrame MenuFrame;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading;
    private JButton btnCreateStatement,  btnViewStatement, btnUpdateStatement, btnDeleteStatement, btnExit;
    private JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    private Font headingFont;
    Color btnColor = Color.WHITE;

    public MenuGui(){
        //Font
        headingFont = new Font("Times new roman", Font.BOLD, 30);

        MenuFrame = new JFrame("ADD STATEMENT ");
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
        lblHeading = new JLabel("ADD STATEMENT",JLabel.CENTER);

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


        btnCreateStatement = new JButton("CREATE  STATEMENT");
        btnCreateStatement.setBackground(btnColor);
        btnViewStatement = new JButton("VIEW  STATEMENT");
        btnViewStatement.setBackground(btnColor);
        btnUpdateStatement = new JButton("UPDATE  STATEMENT");
        btnUpdateStatement.setBackground(btnColor);
        btnDeleteStatement = new JButton("DELETE  STATEMENT");
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


        btnCreateStatement.addActionListener(this);
        btnViewStatement.addActionListener(this);
        btnUpdateStatement.addActionListener(this);
        btnDeleteStatement.addActionListener(this);
        btnExit.addActionListener(this);

        //Set GUI:
        MenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MenuFrame.pack();
        MenuFrame.setSize(350, 350);
        MenuFrame.setLocationRelativeTo(null);
        MenuFrame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("CREATE  STATEMENT")){
            CreateStatement createStatement = new CreateStatement();
            createStatement.setGUI();
        }
        if(e.getActionCommand().equals("VIEW  STATEMENT")){
            ViewStatement viewStatement = new ViewStatement();
            viewStatement.setGUI();
        }
        if(e.getActionCommand().equals("UPDATE  STATEMENT")){
            UpdateStatement updateStatement = new UpdateStatement();
            updateStatement.setGUI();
        }
        if(e.getActionCommand().equals("DELETE  STATEMENT")){
            DeleteStatement deleteStatement = new DeleteStatement();
            deleteStatement.setGUI();
        }

        if(e.getActionCommand().equals("Exit")){
            MenuFrame.dispose();
        }
    }
}
