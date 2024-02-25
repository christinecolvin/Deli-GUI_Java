/*
Condiment Window extends JPanel to create condiment options for the sandwich
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
 public class CondimentWindow extends JPanel {
     public final double MAYONNAISE = 0.25;
     public final double LETTUCE = 1.00;
     public final double SPINACH = 1.25;
     public final double CHEESE = 1.00;
     public final double MUSTARD = 0.50;
     public final double TOMATO = 1.00;
     public final double ONION = 1.25;
     public final double PEPPERS = 0.75;
     public final double OIL = 0.50;
     public final double VINEGAR = 0.50;
     private JCheckBox mayonnaise;
     private JCheckBox lettuce;
     private JCheckBox spinach;
     private JCheckBox cheese;
     private JCheckBox mustard;
     private JCheckBox tomato;
     private JCheckBox onion;
     private JCheckBox peppers;
     private JCheckBox oil;
     private JCheckBox vinegar;
 
     /***
      * Adds the buttons for the condiment options and adds them to the GUI
      */
     public CondimentWindow() {
 
         setLayout(new GridLayout(2, 1));
 
         mayonnaise = new JCheckBox("Mayonnaise");
         lettuce = new JCheckBox("Lettuce");
         spinach = new JCheckBox("Spinach");
         cheese = new JCheckBox("Cheese");
         mustard = new JCheckBox("Mustard");
         tomato = new JCheckBox("Tomato");
         onion = new JCheckBox("Onion");
         peppers = new JCheckBox("Peppers");
         oil = new JCheckBox("Oil");
         vinegar = new JCheckBox("Vinegar");
 
         setBorder(BorderFactory.createTitledBorder("Condiment Options"));
 
         add(mayonnaise);
         add(lettuce);
         add(spinach);
         add(cheese);
         add(mustard);
         add(tomato);
         add(onion);
         add(peppers);
         add(oil);
         add(vinegar);
 
     }
 
     /***
      * Starts at 0 and adds the amount to the total depending on the bread selected
      * @return cost of condiment
      */
     public double getCondimentCost() {
         double condimentCost = 0.0;
 
         if (mayonnaise.isSelected())
             condimentCost += MAYONNAISE;
         if (lettuce.isSelected())
             condimentCost += LETTUCE;
         if (spinach.isSelected())
             condimentCost += SPINACH;
         if (cheese.isSelected())
             condimentCost += CHEESE;
         if (mustard.isSelected())
             condimentCost += MUSTARD;
         if (tomato.isSelected())
             condimentCost += TOMATO;
         if (onion.isSelected())
             condimentCost += ONION;
         if (peppers.isSelected())
             condimentCost += PEPPERS;
         if (oil.isSelected())
             condimentCost += OIL;
         if (vinegar.isSelected())
             condimentCost += VINEGAR;
 
         return condimentCost;
     }
 
 }