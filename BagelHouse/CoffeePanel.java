/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BagelHouse;
import javax.swing.JPanel;
import javax.swing.ButtonGroup; 
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.BorderFactory;


/**
 *
 * @author johnathon
 */
public class CoffeePanel extends JPanel {
    
    public final double NO_COFFEE = 0.0; 
    public final double REGULAR_COFFEE = 1.25; 
    public final double DECAF_COFFEE = 1.25; 
    public final double CAPPUCCINO = 2.00; 
    
    private JRadioButton noCoffee; 
    private JRadioButton regularCoffee; 
    private JRadioButton decafCoffee; 
    private JRadioButton cappuccino; 
    private ButtonGroup group; 
    
    public CoffeePanel() {
        
        this.setLayout(new GridLayout(4, 1));
        
        noCoffee = new JRadioButton("None");
        regularCoffee = new JRadioButton("Regular Coffee");
        decafCoffee = new JRadioButton("Decaf Coffee");
        cappuccino = new JRadioButton("Cappuccino");
        
        group = new ButtonGroup(); 
        group.add(noCoffee);
        group.add(regularCoffee);
        group.add(decafCoffee);
        group.add(cappuccino);
        
        this.setBorder(BorderFactory.createTitledBorder("Coffee"));
        this.add(noCoffee);
        this.add(regularCoffee);
        this.add(decafCoffee);
        this.add(cappuccino);
    }
    
    public double getCoffeeCost() {
        double coffeeCost = 0.0; 
        
        if (noCoffee.isSelected())
            coffeeCost = 0.0; 
        if (regularCoffee.isSelected())
            coffeeCost = REGULAR_COFFEE;
        if (decafCoffee.isSelected()) 
            coffeeCost = DECAF_COFFEE; 
        if (cappuccino.isSelected()) 
            coffeeCost = CAPPUCCINO; 
        
        return coffeeCost; 
    }
}
