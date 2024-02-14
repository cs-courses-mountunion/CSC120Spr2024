import java.awt.*;

public class Penguin {

    private Color penColor;
    private Integer anchorX, anchorY;
    private Boolean facingRight;
    
    public Penguin( Color c, Boolean fr ) {
        
        anchorX = 100;
        anchorY = 100;
        penColor = c;
        facingRight = fr;
        
    } // end of constructor
    
    public void setAnchorX(int x) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY(int y) {
        anchorY = y;
    } // end of setAnchorY
    
    public void draw( Graphics g ) {

        
        
        
        // feet
        g.setColor(Color.BLACK);
        g.fillRoundRect(anchorX+5, anchorY+87, 12, 10, 5, 5);
        g.fillRoundRect(anchorX+23, anchorY+87, 12, 10, 5, 5);
        
        // body and wings
        g.setColor(penColor);
        g.fillOval(anchorX, anchorY, 40, 40);
        g.fillOval(anchorX-5, anchorY+15, 50, 80);
        g.fillOval(anchorX-10, anchorY+40, 10, 50);
        g.fillOval(anchorX+40, anchorY+40, 10, 45);
        g.setColor(Color.WHITE);
        g.fillOval(anchorX-2, anchorY+28, 44, 59);
        
        
        // beak and eye
        Polygon beak = new Polygon();
        if (facingRight == true) {
            beak.addPoint(anchorX+37, anchorY+10);
            beak.addPoint(anchorX+37, anchorY+20);
            beak.addPoint(anchorX+57, anchorY+12);
        }
        else {
            beak.addPoint(anchorX+3, anchorY+10);
            beak.addPoint(anchorX+3, anchorY+20);
            beak.addPoint(anchorX-17, anchorY+12);
        }
        g.setColor(Color.ORANGE);
        g.fillPolygon(beak);
        g.setColor(Color.BLACK);
        g.drawPolygon(beak);
        if (facingRight == true) {
            g.fillOval(anchorX+22, anchorY+10, 8, 8);
        }
        else {
            g.fillOval(anchorX+13, anchorY+10, 8, 8);
        }
        
        
    } // end of draw
    
} // end of class Penguin
