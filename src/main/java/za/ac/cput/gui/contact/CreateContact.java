package za.ac.cput.gui.contact;

import za.ac.cput.client.Contact;
import za.ac.cput.client.ContactClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateContact implements ActionListener {
    private JFrame MenuFrame;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading, jLabelId, jLabelName, jLabelEmail, jLabelMobile;
    private JButton btnDelete;
    private JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    private Font headingFont;
    private JTextField txtId, txtName, txtEmail, txtMobile;


    Color btnColor = Color.WHITE;


    public CreateContact(){
        headingFont = new Font("Times new roman", Font.BOLD, 30);

        MenuFrame = new JFrame("CREATE A CONTACT ");
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


        lblHeading = new JLabel("ADD CONTACT",JLabel.CENTER);
        jLabelId = new JLabel("ID Number", JLabel.CENTER);
        jLabelName = new JLabel("Name ", JLabel.CENTER);
        jLabelEmail = new JLabel("Email", JLabel.CENTER);
        jLabelMobile = new JLabel("Mobile Number", JLabel.CENTER);



        txtId = new JTextField(" ", JTextField.CENTER);
        txtName = new JTextField(" ", JTextField.CENTER);
        txtEmail = new JTextField(" ", JTextField.CENTER);
        txtMobile = new JTextField(" ", JTextField.CENTER);


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

        btnDelete = new JButton("CREATE");
        btnDelete.setBackground(btnColor);
    }

    public void setGUI() {
        panelNorth.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(5, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(5, 1));
        panelCenter.setLayout(new GridLayout(10, 1));

        //All Panels

        //Panel North:
        panelNorth.add(Filler5);
        panelNorth.add(lblHeading);

        //Panel West:
        panelWest.add(Filler1);

        //Panel Center:
        panelCenter.add(Filler3);
        //Form

        panelCenter.add(jLabelName);
        panelCenter.add(txtName);
        panelCenter.add(jLabelEmail);
        panelCenter.add(txtEmail);
        panelCenter.add(jLabelMobile);
        panelCenter.add(txtMobile);

        //Panel East
        panelEast.add(Filler2);

        //Panel South:
        panelSouth.add(btnDelete);

        //Heading
        lblHeading.setFont(headingFont);

        MenuFrame.add(panelNorth, BorderLayout.NORTH);
        MenuFrame.add(panelSouth, BorderLayout.SOUTH);
        MenuFrame.add(panelEast, BorderLayout.EAST);
        MenuFrame.add(panelCenter, BorderLayout.CENTER);
        MenuFrame.add(panelWest, BorderLayout.WEST);

        btnDelete.addActionListener(this);


        MenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MenuFrame.pack();
        MenuFrame.setSize(400, 400);
        MenuFrame.setLocationRelativeTo(null);
        MenuFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("CREATE")){


            Contact contact = new Contact();

            contact.setName(txtName.getText());
            contact.setEmail(txtEmail.getText());
            contact.setMobile(txtMobile.getText());

            ContactClient client = new ContactClient();
            client.createContact(contact);
        }
    }
}

