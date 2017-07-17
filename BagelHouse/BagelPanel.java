package BagelHouse;
import javax.swing.JPanel; 
import javax.swing.JRadioButton; 
import javax.swing.ButtonGroup; 
import java.awt.GridLayout;
import javax.swing.BorderFactory;


/**
 *
 * @author johnathon
 */
public class BagelPanel extends JPanel {
    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50; 
    
    private JRadioButton whiteBagel; 
    private JRadioButton wheatBagel;
    private ButtonGroup group; 
    
    public BagelPanel() {
        this.setLayout(new GridLayout(2, 1));
        whiteBagel = new JRadioButton("White Bagel", true);
        wheatBagel = new JRadioButton("Wheat Bagel");
        
        group = new ButtonGroup();
        group.add(whiteBagel);
        group.add(wheatBagel);
        
        this.setBorder(BorderFactory.createTitledBorder("Bagel"));
        this.add(whiteBagel);
        this.add(wheatBagel);
    }
    
    public double getBagelCost() {
        double bagelCost = 0.0; 
        if(whiteBagel.isSelected())
            bagelCost = WHITE_BAGEL;
        else
            bagelCost = WHEAT_BAGEL;
        
        return bagelCost;
    }
}
