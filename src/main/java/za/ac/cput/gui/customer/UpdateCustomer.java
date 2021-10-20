package za.ac.cput.gui.customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateCustomer extends JFrame implements ActionListener {
    JFrame jFrame;
    JPanel panelNorth, panelCenter, panelSouth, panelEast, panelWest;
    JLabel heading,labelFirstName,labelLastName, labelPadding1, labelPadding2;
    JButton save,exit,clear;
    JTextField firstName, lastName;
    Font headingFont, bodyFont;
    Color color = Color.WHITE;
    Color bg_color=Color.DARK_GRAY;

    public UpdateCustomer()
    {
        jFrame = new JFrame("Update Customer");
        headingFont = new Font("Times new roman", Font.BOLD, 30);
        bodyFont=new Font("Times new roman", Font.PLAIN,20);
        panelNorth=new JPanel();
        panelCenter=new JPanel();
        panelSouth=new JPanel();
        panelWest=new JPanel();
        panelEast=new JPanel();

        heading=new JLabel("Update Customer");

        labelFirstName=new JLabel("First names: ");
        labelLastName=new JLabel("Last names: ");

        labelPadding1=new JLabel();
        labelPadding2=new JLabel();

        firstName=new JTextField();
        lastName=new JTextField();

        save=new JButton("Update");
        exit=new JButton("Exit");
        clear=new JButton("Clear");
    }

    public void setGUI()
    {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(2,2));
        panelSouth.setLayout(new GridLayout(1,3));

        panelNorth.setBackground(bg_color);
        panelEast.setBackground(bg_color);
        panelSouth.setBackground(bg_color);
        panelWest.setBackground(bg_color);
        panelCenter.setBackground(bg_color);

        panelNorth.add(heading);
        heading.setFont(headingFont);
        heading.setForeground(color);

        panelCenter.add(labelFirstName);
        labelFirstName.setFont(bodyFont);
        labelFirstName.setHorizontalAlignment(JLabel.CENTER);
        labelFirstName.setForeground(color);
        panelCenter.add(firstName);
        firstName.setSize(1,1);

        panelCenter.add(labelLastName);
        labelLastName.setFont(bodyFont);
        labelLastName.setHorizontalAlignment(JLabel.CENTER);
        labelLastName.setForeground(color);
        panelCenter.add(lastName);

        panelSouth.add(exit);
        panelSouth.add(clear);
        panelSouth.add(save);
        save.setBackground(color);
        exit.setBackground(color);
        clear.setBackground(color);

        jFrame.add(panelNorth,BorderLayout.NORTH);
        jFrame.add(panelCenter,BorderLayout.CENTER);
        jFrame.add(panelSouth, BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        save.addActionListener(this);
        exit.addActionListener(this);
        clear.addActionListener(this);

        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.pack();
        jFrame.setSize(350, 170);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public void clear()
    {
        firstName.setText("");
        lastName.setText("");
        firstName.requestFocus();
    }

    public void update() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit"))
        {
            jFrame.dispose();
        }
        if(e.getActionCommand().equals("Clear"))
        {
            clear();
        }
        if(e.getActionCommand().equals("Update"))
        {
            update();
        }

    }

}
