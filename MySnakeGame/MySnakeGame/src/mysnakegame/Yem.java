
package mysnakegame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JLabel;

/**
 *
 * @author hp
 */
public class Yem extends JLabel{
    public int mGenislik=20;
    
    Yem()
    {
        setPosition(300, 300);
    }
    
    @Override
    public void paint(Graphics g)
    {
        
        Graphics2D g2 = (Graphics2D)g;
        
        Ellipse2D elipse = new Ellipse2D.Double(1, 1, mGenislik-2, mGenislik-2);
        
        g2.setColor(Color.black);
        
        g2.setStroke(new BasicStroke(2));
        
        g2.draw(elipse);        
        
        g2.setColor(Color.red);
        
        g2.fill(elipse);
    }
    
    public void setPosition(int PosX, int PosY)
    {
        setBounds(PosX, PosY, mGenislik, mGenislik);
    }
}
