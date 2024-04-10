import java.awt.*;

public class Cube {
    
    private Integer anchorX, anchorY;
    private Color   cubeColor;
    
    
    // constructor
    public Cube( Color cc ) {
        java.util.Random gen = new java.util.Random();
        anchorX = gen.nextInt(720) + 10;
        anchorY = gen.nextInt(450) + 10;
        cubeColor = cc;
    } // end of constructor
    
    
    // setters
    public void setAnchorX( Integer x ) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY( Integer y ) {
        anchorY = y;
    } // end of setAnchorY
    
    public void setColor( Color c ) {
        cubeColor = c;
    }
    
    
    // getters
    public Integer getAnchorX() {
        return anchorX;
    } // end of getAnchorX
    
    public Integer getAnchorY() {
        return anchorY;
    } // end of getAnchorY
    
    public void draw( Graphics g ) {
        
        // draw front face
        g.setColor(cubeColor);
        g.fillRect(anchorX, anchorY, 40, 40);
        g.setColor(Color.BLACK);
        g.drawRect(anchorX, anchorY, 40, 40);
        
        // draw top face
        g.setColor(cubeColor.darker());
        Polygon topFace = new Polygon();
        topFace.addPoint(anchorX, anchorY);
        topFace.addPoint(anchorX+20, anchorY-10);
        topFace.addPoint(anchorX+60, anchorY-10);
        topFace.addPoint(anchorX+40, anchorY);
        g.fillPolygon(topFace);
        g.setColor(Color.BLACK);
        g.drawPolygon(topFace);
        
        // draw top face
        g.setColor(cubeColor.darker());
        Polygon rightFace = new Polygon();
        rightFace.addPoint(anchorX+40, anchorY);
        rightFace.addPoint(anchorX+60, anchorY-10);
        rightFace.addPoint(anchorX+60, anchorY+30);
        rightFace.addPoint(anchorX+40, anchorY+40);
        g.fillPolygon(rightFace);
        g.setColor(Color.BLACK);
        g.drawPolygon(rightFace);
        
    } // end of draw
    
} // end of class Cube
