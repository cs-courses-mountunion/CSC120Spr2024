/* CSC 120
 * Practicum # 2
 *
 * Samantha Student
 *
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {



    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(1000, 600));
        setName("Practicum # 2 authored by Samantha Student");
        setUp();
        setUpTextArea();
        setBackground(Color.YELLOW);

        
        
        

        //*** 
        //    You must instantiate the array with the proper number of elements before this point
        //
        //    Here is information for instantiating each element of the array:
        //
        //    Sodium has Cubic structure, has weight of 23 and is atomic # 11
        //    Zinc has Hexagonal structure, has weight of 65 and is atomic # 30
        //    Mercury has Rhombohedral structure, has weight of 201 and is atomic # 80
        //    Palladium has Cubic structure, has weight of 106 and is atomic # 46
        //    Zirconium has Hexagonal structure, has weight of 91 and is atomic # 40
        //    Copper has Cubic structure, has weight of 64 and is atomic # 29
        //    Polonium has Rhombohedral structure, has weight of 209 and is atomic # 84
        //    Silver has Cubic structure, has weight of 108 and is atomic # 47
        //    Magnesium has Hexagonal structure, has weight of 24 and is atomic # 12
        

        outputArea.append("===========================\n");
        outputArea.append("\nAll Chemical Elements in the array:\n\n");
        displayAllChemicalElements();
        
        outputArea.append("\n===========================\n");
        outputArea.append("\nElements with Weight More than 100 in the array:\n\n");
        displayElementsHeavierThan100();
        
        outputArea.append("\n===========================\n");
        outputArea.append("\nElements with Hexagonal Structure in the array:\n\n");
        displayHexagonalElements();
        
        
    } // end of constructor
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        
    } // end of paintComponent()
    
    
    public void displayAllChemicalElements() {
        
        outputArea.append("   NOT YET IMPLEMENTED BY STUDENT" + "\n");
        
    }    
       
    public void displayElementsHeavierThan100() {
        
        outputArea.append("   NOT YET IMPLEMENTED BY STUDENT" + "\n");
        
    }    
       
    
    public void displayHexagonalElements() {
        
        outputArea.append("   NOT YET IMPLEMENTED BY STUDENT" + "\n");
        
    }    
       
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    private TextArea outputArea;
    
    public void setUpTextArea() {
        outputArea = new TextArea();
        outputArea.setBounds(20, 20, 960, 560);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(outputArea);
    }
    
    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
