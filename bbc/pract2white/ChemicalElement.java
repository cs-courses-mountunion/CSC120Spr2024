import java.awt.*;

public class ChemicalElement {
    
    private String  name;
    private Integer atomicNumber, atomicWeight;
    private String crystalStructure;
    
    
    // constructor
    public ChemicalElement( String n, Integer an, Integer aw, String c ) {
        name = n;
        atomicNumber = an;
        atomicWeight = aw;
        crystalStructure = c;
    } // end of constructor
    
    
    // getters
    
    public String getName() {
        return name;
    }
    
    public Integer getAtomicNumber() {
        return atomicNumber;
    } // end of getAtomicNumber
    
    public Integer getAtomicWeight() {
        return atomicWeight;
    } // end of getAtomicWeight

    public String getCrystalStructure() {
        return crystalStructure;
    } // end of getCrystalStructure()

    

    public String toString() {
        return name + ", element # " + atomicNumber + ", has atomic weight = "
                + atomicWeight + " and a structure that is " + crystalStructure;
    } // end of toString
    
    
} // end of class ChemicalElement
