/*
Side Window extends JPanel to create side options for the sandwich
Course: CSCI 121 - Computer Science II
Instructor: Greg Schaper
HW11 - SandwichShop
Author: Christine Colvin
 */


 import javax.swing.*;
 import java.awt.*;
 
 /***
  * Creates the instantiated variables
  */
 public class SideWindow extends JPanel {
     public final double CHIPS = 2.00;
     public final double DRINK = 2.50;
     public final double COOKIE = 2.75;
 
     public final double PICKLE = 1.00;
     private JCheckBox chips;
     private JCheckBox drink;
     private JCheckBox cookie;
 
     private JCheckBox pickle;
 
 
     /***
      * Adds the buttons for the side options and adds them to the GUI
      */
     public SideWindow() {
 
         setLayout(new GridLayout(2, 1));
 
         chips = new JCheckBox("Chips");
         drink = new JCheckBox("Drink");
         cookie = new JCheckBox("Cookie");
         pickle = new JCheckBox("Pickle");
 
 
         setBorder(BorderFactory.createTitledBorder("Sides"));
 
         add(chips);
         add(drink);
         add(cookie);
         add(pickle);
 
 
     }
 
     /**
      * Gets the appropriate cost for the sides
      *
      * @return the cost of the selected sides
      */
     public double getSideCost() {
         double sideCost = 0.0;
 
         if (chips.isSelected())
             sideCost += CHIPS;
         if (drink.isSelected())
             sideCost += DRINK;
         if (cookie.isSelected())
             sideCost += COOKIE;
         if (pickle.isSelected())
             sideCost += PICKLE;
 
 
         return sideCost;
     }
 
 }