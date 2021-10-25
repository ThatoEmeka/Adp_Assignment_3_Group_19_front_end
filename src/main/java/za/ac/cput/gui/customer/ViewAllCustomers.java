package za.ac.cput.gui.customer;

import za.ac.cput.client.CustomerClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAllCustomers extends JFrame implements ActionListener {
    JFrame jFrame;
    JPanel panelNorth,panelSouth;
    JTextArea jTextArea;
    JButton jButton;
    Color color = Color.WHITE;
    Color bg_color=Color.DARK_GRAY;
    Font bodyFont;
    JScrollPane scrollPane;

    public ViewAllCustomers()
    {
        jFrame=new JFrame("All Customers");
        bodyFont=new Font("Times new roman", Font.PLAIN,20);
        panelNorth=new JPanel();
        panelSouth=new JPanel();
        jTextArea=new JTextArea();
        jButton=new JButton();
        jButton=new JButton("Exit");
        scrollPane=new JScrollPane(panelNorth);
    }

    public void viewAllGui()
    {
        panelNorth.setLayout(new BorderLayout());
        panelSouth.setLayout(new GridLayout());

        panelNorth.setBackground(bg_color);
        panelNorth.add(jTextArea);
        CustomerClient client=new CustomerClient();
        jTextArea.setText(String.valueOf(client.getAllCustomers()));
        jTextArea.setFont(bodyFont);
        jTextArea.setForeground(color);
        jTextArea.setBackground(bg_color);
        jTextArea.setLineWrap(true);
        jTextArea.setEditable(false);

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        jFrame.getContentPane().add(scrollPane);

        panelSouth.add(jButton);
        jButton.setBackground(color);
        jButton.setForeground(bg_color);

        jButton.addActionListener(this);
        jFrame.add(panelNorth,BorderLayout.CENTER);
        jFrame.add(panelSouth,BorderLayout.SOUTH);

        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit"))
        {
            jFrame.dispose();
        }
    }
}
