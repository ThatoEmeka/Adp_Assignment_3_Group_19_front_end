package za.ac.cput.gui.customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerMenuGUI extends JFrame implements ActionListener {
    private final JFrame MenuFrame;
    private final JPanel panelNorth;
    private final JPanel panelSouth;
    private final JPanel panelEast;
    private final JPanel panelWest;
    private final JPanel panelCenter;
    private final JLabel lblHeading;
    private final JButton buttonCreate;
    private final JButton buttonView;
    private final JButton buttonUpdate;
    private final JButton buttonDelete;
    private final JButton buttonExit;
    private final JButton buttonViewAll;
    private final JLabel Filler1;
    private final JLabel Filler2;
    private final JLabel Filler3;
    private final JLabel Filler4;
    private final JLabel Filler5;
    private final Font headingFont;
    Color color = Color.WHITE;
    Color bg_color=Color.DARK_GRAY;

    public CustomerMenuGUI(){
        headingFont = new Font("Times new roman", Font.BOLD, 30);

        MenuFrame = new JFrame("Customer Menu ");
        panelNorth = new JPanel();
        panelSouth = new JPanel();
        panelEast = new JPanel();
        panelWest = new JPanel();
        panelCenter = new JPanel();
        panelNorth.setBackground(bg_color);
        panelEast.setBackground(bg_color);
        panelSouth.setBackground(bg_color);
        panelWest.setBackground(bg_color);
        panelCenter.setBackground(bg_color);

        lblHeading = new JLabel("CUSTOMER MENU",JLabel.CENTER);

        Filler1 = new JLabel("=====");
        Filler1.setForeground(bg_color);
        Filler2 = new JLabel("=====");
        Filler2.setForeground(bg_color);
        Filler3 = new JLabel("================================");
        Filler3.setForeground(bg_color);
        Filler4 = new JLabel("================================");
        Filler4.setForeground(bg_color);
        Filler5 = new JLabel("================================");
        Filler5.setForeground(bg_color);

        //Buttons:
        buttonCreate = new JButton("Add customer");
        buttonCreate.setBackground(color);
        buttonView = new JButton("View customers");
        buttonView.setBackground(color);
        buttonUpdate = new JButton("Update customer");
        buttonUpdate.setBackground(color);
        buttonDelete = new JButton("Delete customer");
        buttonDelete.setBackground(color);
        buttonViewAll=new JButton("View All");
        buttonViewAll.setBackground(color);

        buttonExit = new JButton("EXIT");
        buttonExit.setBackground(color);
    }

    public void setGUI() {
        panelNorth.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(5, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(5, 1));
        panelCenter.setLayout(new GridLayout(8, 1));

        panelNorth.add(Filler5);
        panelNorth.add(lblHeading);

        panelWest.add(Filler1);

        panelCenter.add(Filler3);
        panelCenter.add(buttonCreate);
        panelCenter.add(buttonView);
        panelCenter.add(buttonUpdate);
        panelCenter.add(buttonDelete);
        panelCenter.add(buttonViewAll);
        panelCenter.add(Filler4);

        panelEast.add(Filler2);

        panelSouth.add(buttonExit);

        lblHeading.setFont(headingFont);
        lblHeading.setForeground(color);

        MenuFrame.add(panelNorth, BorderLayout.NORTH);
        MenuFrame.add(panelSouth, BorderLayout.SOUTH);
        MenuFrame.add(panelEast, BorderLayout.EAST);
        MenuFrame.add(panelCenter, BorderLayout.CENTER);
        MenuFrame.add(panelWest, BorderLayout.WEST);

        buttonCreate.addActionListener(this);
        buttonView.addActionListener(this);
        buttonUpdate.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonViewAll.addActionListener(this);
        buttonExit.addActionListener(this);

        MenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MenuFrame.pack();
        MenuFrame.setSize(350, 350);
        MenuFrame.setLocationRelativeTo(null);
        MenuFrame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Add customer")){
            CreateCustomer createCustomer=new CreateCustomer();
            createCustomer.setGUI();
        }
        if(e.getActionCommand().equals("View customers")){
            ViewCustomer viewCustomer=new ViewCustomer();
            viewCustomer.setGUI();
        }
        if(e.getActionCommand().equals("Update customer")){
            UpdateCustomer updateCustomer=new UpdateCustomer();
            updateCustomer.setGUI();
        }
        if(e.getActionCommand().equals("Delete customer")){
            DeleteCustomer deleteCustomer=new DeleteCustomer();
            deleteCustomer.setGUI();
        }
        if(e.getActionCommand().equals("View All")){
            ViewAllCustomers viewAllCustomers=new ViewAllCustomers();
            viewAllCustomers.viewAllGui();
        }


        if(e.getActionCommand().equals("EXIT")){
            MenuFrame.dispose();
        }


    }
}
