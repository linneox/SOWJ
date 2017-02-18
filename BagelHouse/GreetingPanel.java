/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BagelHouse;
import javax.swing.JPanel; 
import javax.swing.JLabel;



/**
 *
 * @author johnathon
 */
public class GreetingPanel extends JPanel {
    private JLabel greeting; 
    
    public GreetingPanel() {
        greeting = new JLabel("Welcome to DAAAA Bagel House");
        this.add(greeting);
        
        
    }
    
}
