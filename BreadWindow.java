/*
Bread Window extends JPanel to create the bread options and adds the prices
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
 public class BreadWindow extends JPanel {
     ButtonGroup radioButtonGroup;
     public final double WHITE_BREAD = 1.00;
     public final double WHEAT_BREAD = 1.50;
     public final double HOAGIE = 2.00;
     public final double WRAP = 1.00;
     private JRadioButton whiteBread;
     private JRadioButton wheatBread;
     private JRadioButton hoagie;
     private JRadioButton wrap;
 
 
     /***
      * Adds the buttons for the bread options and adds them to the GUI
      */
     public BreadWindow() {
 
         setLayout(new GridLayout(2, 1));
 
         whiteBread = new JRadioButton("White Bread");
         wheatBread = new JRadioButton("Wheat Bread");
         hoagie = new JRadioButton("Hoagie Roll");
         wrap = new JRadioButton("Wrap");
 
         radioButtonGroup = new ButtonGroup();
         radioButtonGroup.add(whiteBread);
         radioButtonGroup.add(wheatBread);
         radioButtonGroup.add(hoagie);
         radioButtonGroup.add(wrap);
 
 
         setBorder(BorderFactory.createTitledBorder("Breads"));
 
         add(whiteBread);
         add(wheatBread);
         add(hoagie);
         add(wrap);
 
     }
 
     /***
      * Starts at 0 and adds the amount to the total depending on the bread selected
      * @return cost of bread
      */
     public double getBreadCost() {
         double breadCost = 0.0;
 
         if (whiteBread.isSelected())
             breadCost = WHITE_BREAD;
         else if (wheatBread.isSelected())
             breadCost = WHEAT_BREAD;
         else if (hoagie.isSelected())
             breadCost = HOAGIE;
         else
             breadCost = WRAP;
 
         return breadCost;
     }
 }