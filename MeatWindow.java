/*
Meat Window extends JPanel to create meat options for the sandwich
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
 public class MeatWindow extends JPanel {
 
     public final double HAM = 2.00;
     public final double TURKEY = 2.50;
     public final double ROAST_BEEF = 3.00;
     public final double CHICKEN = 2.50;
 
     public final double SALAMI = 3.25;
     private JCheckBox ham;
     private JCheckBox turkey;
     private JCheckBox roastBeef;
     private JCheckBox chicken;
 
     private JCheckBox salami;
 
     /***
      * Adds the buttons for the bread options and adds them to the GUI
      */
     public MeatWindow() {
 
         setLayout(new GridLayout(2, 1));
 
         ham = new JCheckBox("Ham");
         turkey = new JCheckBox("Turkey");
         roastBeef = new JCheckBox("Roast Beef");
         chicken = new JCheckBox("Chicken");
 
         salami = new JCheckBox("Salami");
 
 
 
         setBorder(BorderFactory.createTitledBorder("Meats"));
 
         add(ham);
         add(turkey);
         add(roastBeef);
         add(chicken);
         add(salami);
     }
 
     /***
      * Starts at 0 and adds the amount to the total depending on the bread selected
      * @return cost of meat
      */
     public double getMeatCost() {
         double meatCost = 0.0;
 
         if (ham.isSelected())
             meatCost += HAM;
         if (turkey.isSelected())
             meatCost += TURKEY;
         if (roastBeef.isSelected())
             meatCost += ROAST_BEEF;
         if (chicken.isSelected())
             meatCost += CHICKEN;
         if (salami.isSelected())
             meatCost += SALAMI;
 
         return meatCost;
     }
 
 
 }