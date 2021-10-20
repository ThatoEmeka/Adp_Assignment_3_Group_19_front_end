package za.ac.cput.gui.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankItemMenuGui implements ActionListener {
    private JFrame MenuFrame;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading;
    private JButton btnCreateBank,  btnViewBank, btnUpdateBank, btnDeleteBank, btnExit;
    private JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    private Font headingFont;
    Color btnColor = Color.WHITE;

    public BankItemMenuGui(){
        //Font
        headingFont = new Font("Times new roman", Font.BOLD, 30);

        MenuFrame = new JFrame("ADD BANK ");
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
        btnCreateBank = new JButton("CREATE  BANK");
        btnCreateBank.setBackground(btnColor);
        btnViewBank = new JButton("VIEW  BANK");
        btnViewBank.setBackground(btnColor);
        btnUpdateBank = new JButton("UPDATE  BANK");
        btnUpdateBank.setBackground(btnColor);
        btnDeleteBank = new JButton("DELETE  BANK");
        btnDeleteBank.setBackground(btnColor);

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
        panelCenter.add(btnCreateBank);
        panelCenter.add(btnViewBank);
        panelCenter.add(btnUpdateBank);
        panelCenter.add(btnDeleteBank);
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
        btnCreateBank.addActionListener(this);
        btnViewBank.addActionListener(this);
        btnUpdateBank.addActionListener(this);
        btnDeleteBank.addActionListener(this);
        btnExit.addActionListener(this);

        //Set GUI:
        MenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MenuFrame.pack();
        MenuFrame.setSize(350, 350);
        MenuFrame.setLocationRelativeTo(null);
        MenuFrame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("CREATE  BANK")){
            CreateBank createBank = new CreateBank();
            createBank.setGUI();
        }
        if(e.getActionCommand().equals("VIEW  BANK")){
            ViewBank viewBank = new ViewBank();
            viewBank.setGUI();
        }
        if(e.getActionCommand().equals("UPDATE  BANK")){
            UpdateBank updateBank = new UpdateBank();
            updateBank.setGUI();
        }
        if(e.getActionCommand().equals("DELETE  BANK")){
            DeleteBank deleteBank = new DeleteBank();
            deleteBank.setGUI();
        }

        if(e.getActionCommand().equals("Exit")){
            MenuFrame.dispose();
        }
    }

}
