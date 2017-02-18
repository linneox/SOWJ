/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BagelHouse;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.BorderFactory;

/**
 *
 * @author johnathon
 */
public class ToppingPanel extends JPanel {
    
    public final double CREAM_CHEESE = 0.50; 
    public final double BUTTER = 0.25;
    public final double PEACH_JELLY = 0.75; 
    public final double BLUEBERRY_JAM = 0.75; 
    
    private JCheckBox creamCheese; 
    private JCheckBox butter; 
    private JCheckBox peachJelly;
    private JCheckBox blueberryJam; 
    
    public ToppingPanel() {
        
        this.setLayout(new GridLayout(4,1));
        
        creamCheese = new JCheckBox("Cream Cheese");
        butter = new JCheckBox("Butter");
        peachJelly = new JCheckBox("Peach Jelly");
        blueberryJam = new JCheckBox("Blueberry Jam");
        
        this.setBorder(BorderFactory.createTitledBorder("Toppins"));
        this.add(creamCheese);
        this.add(butter);
        this.add(peachJelly);
        this.add(blueberryJam);
        
    }
    
    public double getToppingCost() {
        double toppingCost = 0.0;
        
        if (creamCheese.isSelected())
            toppingCost += CREAM_CHEESE;
        if (butter.isSelected())
            toppingCost += BUTTER; 
        if (peachJelly.isSelected())
            toppingCost += PEACH_JELLY; 
        if (blueberryJam.isSelected())
            toppingCost += BLUEBERRY_JAM; 
            
        return toppingCost; 
    }
}
