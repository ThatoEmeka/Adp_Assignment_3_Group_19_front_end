package za.ac.cput.gui.customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteCustomer extends JFrame implements ActionListener {
    JFrame jFrame;
    JPanel panelNorth, panelCenter, panelSouth, panelEast, panelWest;
    JLabel heading,labelFirstName,labelLastName, labelPadding1, labelPadding2;
    JButton delete,exit;
    JTextField firstName, lastName;
    Font headingFont, bodyFont;
    Color color = Color.WHITE;
    Color bg_color=Color.DARK_GRAY;

    public DeleteCustomer()
    {
        jFrame = new JFrame("Delete Customer");
        headingFont = new Font("Times new roman", Font.BOLD, 30);
        bodyFont=new Font("Times new roman", Font.PLAIN,20);
        panelNorth=new JPanel();
        panelCenter=new JPanel();
        panelSouth=new JPanel();
        panelWest=new JPanel();
        panelEast=new JPanel();

        heading=new JLabel("REMOVE CUSTOMER");

        labelFirstName=new JLabel("Customer first name: ");
        //labelLastName=new JLabel("Last names: ");

        labelPadding1=new JLabel();
        labelPadding2=new JLabel();

        firstName=new JTextField();
        lastName=new JTextField();

        delete=new JButton("Delete");
        exit=new JButton("Exit");
    }

    public void setGUI()
    {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(1,2));
        panelSouth.setLayout(new GridLayout(1,2));

        panelNorth.setBackground(Color.DARK_GRAY);
        panelEast.setBackground(Color.DARK_GRAY);
        panelSouth.setBackground(Color.DARK_GRAY);
        panelWest.setBackground(Color.DARK_GRAY);
        panelCenter.setBackground(Color.DARK_GRAY);

        panelNorth.add(heading);
        heading.setFont(headingFont);
        heading.setForeground(color);

        panelCenter.add(labelFirstName);
        labelFirstName.setFont(bodyFont);
        labelFirstName.setHorizontalAlignment(JLabel.CENTER);
        labelFirstName.setForeground(color);
        panelCenter.add(firstName);
/*
        panelCenter.add(labelLastName);
        labelLastName.setFont(bodyFont);
        labelLastName.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lastName);

 */

        panelSouth.add(exit);
        panelSouth.add(delete);
        delete.setBackground(color);
        exit.setBackground(color);

        jFrame.add(panelNorth,BorderLayout.NORTH);
        jFrame.add(panelCenter,BorderLayout.CENTER);
        jFrame.add(panelSouth, BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        exit.addActionListener(this);
        delete.addActionListener(this);

        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.pack();
        jFrame.setSize(370, 150);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public void delete()
    {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit"))
        {
            jFrame.dispose();
        }
        if(e.getActionCommand().equals("Delete"))
        {
            delete();
        }

    }

}
