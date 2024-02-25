/*
xx
Course: CSCI 121 - Computer Science II
Instructor: Greg Schaper
HW11 - SandwichShop
Author: Christine Colvin
 */

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.text.DecimalFormat;
 
 
 public class SandwichShop extends JFrame {
     private BreadWindow bread;
     private MeatWindow meat;
     private CondimentWindow condiment;
 
     private SideWindow side;
     private JPanel buttonPanel;
     private JSlider slider;
     private JLabel label;
     private double tip;
     final int MAX_WIDTH = 500;
     final int MAX_HEIGHT = 500;
     private final double TAX_RATE = 0.06;
 
     /**
      * Constructor that builds the window with the options
      */
     public SandwichShop() {
 
         setTitle("Christine's Sandwich Shop!");
 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
         setSize(MAX_WIDTH, MAX_HEIGHT);
 
         setLayout(new BorderLayout());
         bread = new BreadWindow();
         meat = new MeatWindow();
         condiment = new CondimentWindow();
         side = new SideWindow();
 
         buildButtonPanel();
 
         add(bread, BorderLayout.WEST);
         add(meat, BorderLayout.CENTER);
         add(condiment, BorderLayout.EAST);
         add(side, BorderLayout.SOUTH);
         add(buttonPanel, BorderLayout.NORTH);
 
         pack();
         setVisible(true);
 
     }
 
     /***
      * Creates the tipping slider
      */
     private void buildButtonPanel() {
 
         buttonPanel = new JPanel();
         slider = new JSlider(0, 50, 1);
         label = new JLabel("\tTip Percentage");
 
 
         JButton calcButton = new JButton("Calculate Bill");
         JButton exitButton = new JButton("Exit Menu");
 
 
         calcButton.addActionListener(new CalcButtonListener());
         exitButton.addActionListener(new ExitButtonListener());
 
         slider.setPaintTrack(true);
         slider.setPaintTicks(true);
         slider.setPaintLabels(true);
         slider.setMajorTickSpacing(10);
         slider.setMinorTickSpacing(1);
 
         buttonPanel.add(label);
         buttonPanel.add(slider);
         buttonPanel.add(calcButton);
         buttonPanel.add(exitButton);
 
 
     }
 
     /***
      * Imports calc to find the total for the sandwich
      */
     private class CalcButtonListener implements ActionListener {
         public void actionPerformed(ActionEvent e) {
             double subtotal, tax, total;
 
 
             subtotal = bread.getBreadCost() +
                     meat.getMeatCost() +
                     condiment.getCondimentCost() +
                     side.getSideCost();
 
 
             tax = subtotal * TAX_RATE;
 
             total = subtotal + tax;
 
             tip = (slider.getValue() / 100.0) * total;
             total += tip;
 
             DecimalFormat dollar = new DecimalFormat("0.00");
 
             JOptionPane.showMessageDialog(null, "Subtotal: $" +
                     dollar.format(subtotal) + "\n" +
                     "Tax: $" + dollar.format(tax) + "\n" +
                     "Tip: $" + dollar.format(tip) + "\n" +
                     "Total: $" + dollar.format(total));
         }
     }
 
     /***
      * Creates event for when the user presses Exit
      */
     private class ExitButtonListener implements ActionListener {
         public void actionPerformed(ActionEvent e) {
             System.exit(0);
         }
     }
 }
 
