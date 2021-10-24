package za.ac.cput.gui.address;
/*
 * Author: Shyam Prag 28115873
 * */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressMenuGui implements ActionListener {
    private JFrame MenuFrame;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading;
    private JButton btnCreateAddress,  btnViewAddress, btnUpdateAddress, btnDeleteAddress, btnExit;
    private JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    private Font headingFont;
    Color btnColor = Color.WHITE;

    public AddressMenuGui(){
        //Font
        headingFont = new Font("Times new roman", Font.BOLD, 30);

        MenuFrame = new JFrame("ADD ADDRESS ");
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
        lblHeading = new JLabel("ADD ADDRESS",JLabel.CENTER);

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

        //Buttons:
        btnCreateAddress = new JButton("CREATE  ADDRESS");
        btnCreateAddress.setBackground(btnColor);
        btnViewAddress = new JButton("VIEW  ADDRESS");
        btnViewAddress.setBackground(btnColor);
        btnUpdateAddress = new JButton("UPDATE  ADDRESS");
        btnUpdateAddress.setBackground(btnColor);
        btnDeleteAddress = new JButton("DELETE  ADDRESS");
        btnDeleteAddress.setBackground(btnColor);

        btnExit = new JButton("Exit");
        btnExit.setBackground(btnColor);
    }

    public void setGUI() {
        panelNorth.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(5, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(5, 1));
        panelCenter.setLayout(new GridLayout(7, 1));

        //Adding the components to the panels:
        //Panel North:
        panelNorth.add(Filler5);
        panelNorth.add(lblHeading);

        //Panel West:
        panelWest.add(Filler1);

        //Panel Center:
        panelCenter.add(Filler3);
        panelCenter.add(btnCreateAddress);
        panelCenter.add(btnViewAddress);
        panelCenter.add(btnUpdateAddress);
        panelCenter.add(btnDeleteAddress);
        panelCenter.add(Filler4);

        //Panel East
        panelEast.add(Filler2);

        //Panel South:
        panelSouth.add(btnExit);

        //Heading
        lblHeading.setFont(headingFont);

        //Adding panels to Customer Frame:
        MenuFrame.add(panelNorth, BorderLayout.NORTH);
        MenuFrame.add(panelSouth, BorderLayout.SOUTH);
        MenuFrame.add(panelEast, BorderLayout.EAST);
        MenuFrame.add(panelCenter, BorderLayout.CENTER);
        MenuFrame.add(panelWest, BorderLayout.WEST);

        //Telling compiler to listen for actions from the buttons:
        btnCreateAddress.addActionListener(this);
        btnViewAddress.addActionListener(this);
        btnUpdateAddress.addActionListener(this);
        btnDeleteAddress.addActionListener(this);
        btnExit.addActionListener(this);

        //Set GUI:
        MenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MenuFrame.pack();
        MenuFrame.setSize(350, 350);
        MenuFrame.setLocationRelativeTo(null);
        MenuFrame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("CREATE  ADDRESS")){
            CreateAddress createAddress = new CreateAddress();
               createAddress.setGUI();
            MenuFrame.dispose();
        }
        if(e.getActionCommand().equals("VIEW  ADDRESS")){
         ViewAddress viewAddress = new ViewAddress();
            viewAddress.setGUI();
            MenuFrame.dispose();
        }
        if(e.getActionCommand().equals("UPDATE  ADDRESS")){
            UpdateAddress updateAddress = new UpdateAddress();
            updateAddress.setGUI();
            MenuFrame.dispose();
        }
        if(e.getActionCommand().equals("DELETE  ADDRESS")){
            DeleteAddress deleteAddress = new DeleteAddress();
            deleteAddress.setGUI();
            MenuFrame.dispose();
        }

        if(e.getActionCommand().equals("Exit")){
            MenuFrame.dispose();
        }
    }

}
