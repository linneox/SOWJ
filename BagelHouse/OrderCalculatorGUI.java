package BagelHouse;
import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author johnathon
 */
public class OrderCalculatorGUI extends JFrame {
    
    private BagelPanel bagels; 
    private ToppingPanel toppings;
    private CoffeePanel coffee; 
    private GreetingPanel banner; 
    private JPanel buttonPanel; 
    private JButton calcButton; 
    private JButton exitButton; 
    private final double TAX_RATE = 0.06;
    
    public OrderCalculatorGUI() {
        this.setTitle("Order Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        banner = new GreetingPanel(); 
        bagels = new BagelPanel(); 
        toppings = new ToppingPanel(); 
        coffee = new CoffeePanel();
        
        this.buildPanel();
        this.add(banner, BorderLayout.NORTH);
        this.add(bagels, BorderLayout.WEST);
        this.add(toppings, BorderLayout.CENTER);
        this.add(coffee, BorderLayout.EAST);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        
    }
    
    private void buildPanel() {
        buttonPanel = new JPanel(); 
        calcButton = new JButton("Calculate");
        exitButton = new JButton("Exit");
        
        calcButton.addActionListener(new CalcButtonListener());
        exitButton.addActionListener(new ExitButtonListener());
        
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
    }
    
    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            double subtotal; 
            double tax; 
            double total; 
            
            subtotal = bagels.getBagelCost() + toppings.getToppingCost() + coffee.getCoffeeCost();
            tax = subtotal * TAX_RATE; 
            total = subtotal + tax; 
            
            JOptionPane.showMessageDialog(null, String.format("Subtotal: $%,.2f\n" + 
                                                        "Tax: $%,.2f\n" + 
                                "Total: $%,.2f", subtotal, tax, total));
        }
    }
    
    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new OrderCalculatorGUI();
    }
}
