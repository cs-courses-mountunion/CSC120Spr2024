import java.awt.*;

public class MusicNotes {

    private Color noteColor;
    private Integer anchorX, anchorY;
    private Boolean eighthNotes;
    
    public MusicNotes( Color c, Boolean en ) {
        
        anchorX = 50;
        anchorY = 50;
        noteColor = c;
        eighthNotes = en;
        
    } // end of constructor
    
    public void setAnchorX(int x) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY(int y) {
        anchorY = y;
    } // end of setAnchorY
    
    public void draw( Graphics g ) {



        
        g.setColor(noteColor);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4));
        
        g.drawLine(anchorX+25, anchorY+10, anchorX+25, anchorY+60);
        g.drawLine(anchorX+65, anchorY, anchorX+65, anchorY+50);
        g.drawLine(anchorX+26, anchorY+10, anchorX+65, anchorY);
        g.fillOval(anchorX+2, anchorY+55, 25, 15);
        g.fillOval(anchorX+42, anchorY+45, 25, 15);
        
        if (eighthNotes == true) {
            g.drawLine(anchorX+26, anchorY+20, anchorX+65, anchorY+10);
        }
        
        
    } // end of draw
    
} // end of class MusicNotes
