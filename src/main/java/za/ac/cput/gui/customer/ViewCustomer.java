package za.ac.cput.gui.customer;

import antlr.StringUtils;
import org.json.JSONObject;
import za.ac.cput.client.CustomerClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ViewCustomer extends JFrame implements ActionListener {
    JFrame jFrame;
    JPanel panelNorth, panelCenter, panelSouth, panelEast, panelWest;
    JLabel heading,labelFirstName, labelPadding1, labelPadding2,secondLabel,secondList;
    JButton view,exit;
    JTextField firstName, lastName;
    Font headingFont, bodyFont;
    Color color = Color.WHITE;
    Color bg_color=Color.DARK_GRAY;
    JFrame frame;
    JPanel panelNorth2,panelSouth2;
    JButton exit2;

    public ViewCustomer()
    {
        jFrame = new JFrame("View Customer");
        headingFont = new Font("Times new roman", Font.BOLD, 30);
        bodyFont=new Font("Times new roman", Font.PLAIN,20);
        panelNorth=new JPanel();
        panelCenter=new JPanel();
        panelSouth=new JPanel();
        panelWest=new JPanel();
        panelEast=new JPanel();

        heading=new JLabel("VIEW CUSTOMERS");

        labelFirstName=new JLabel("Customer ID: ");
        //labelLastName=new JLabel("Last names: ");

        labelPadding1=new JLabel();
        labelPadding2=new JLabel();

        firstName=new JTextField();
        lastName=new JTextField();

        view=new JButton("View");
        exit=new JButton("Exit");
    }

    public void setGUI()
    {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(1,2));
        panelSouth.setLayout(new GridLayout(1,2));

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

        panelSouth.add(exit);
        panelSouth.add(view);
        view.setBackground(color);
        exit.setBackground(color);

        jFrame.add(panelNorth,BorderLayout.NORTH);
        jFrame.add(panelCenter,BorderLayout.CENTER);
        jFrame.add(panelSouth, BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        exit.addActionListener(this);
        view.addActionListener(this);

        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.pack();
        jFrame.setSize(370, 150);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public void SecondFrame()
    {
        frame=new JFrame("Customers found");
        panelNorth2=new JPanel();
        panelSouth2=new JPanel();
        exit2=new JButton("EXIT");
        secondLabel=new JLabel();
        secondList=new JLabel();
        secondLabel.setFont(bodyFont);
        secondList.setFont(bodyFont);

        panelNorth2.setLayout(new GridLayout(2,1));
        panelSouth2.setLayout(new GridLayout());

        panelNorth2.setBackground(bg_color);
        panelSouth2.setBackground(bg_color);
        panelNorth2.add(secondLabel);
        panelNorth2.add(secondList);

        panelSouth2.add(exit2);
        exit2.setBackground(color);

        frame.add(panelNorth2,BorderLayout.NORTH);
        frame.add(panelSouth2,BorderLayout.SOUTH);

        secondLabel.setText("Customer: ");
        secondLabel.setForeground(color);
        secondList.setForeground(color);

        CustomerClient client=new CustomerClient();
        secondList.setText(String.valueOf(client.readCustomer(firstName.getText())));

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        exit2.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit"))
        {
            jFrame.dispose();
        }
        if(e.getActionCommand().equals("View"))
        {
            SecondFrame();
        }
        if(e.getActionCommand().equals("EXIT"))
        {
            frame.dispose();
        }
    }
}
