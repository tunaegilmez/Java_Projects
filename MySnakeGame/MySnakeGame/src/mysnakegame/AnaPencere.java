
package mysnakegame;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class AnaPencere extends JFrame {
    
    private int mGenislik = 600;
    private int mYukseklik = 600;
    
    private static AnaPencere mPencere = null;
    
    private AnaPencere()
    {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        SetDimension(mGenislik, mYukseklik);
        setResizable(false);
        
        Yilan Y = new Yilan();
        add(Y);
        
    }
    public static AnaPencere PencereGetir()
    {
        if(mPencere == null)
            mPencere = new AnaPencere();
            
        return mPencere;
    }
            
            
    public void SetDimension(int Genislik,int Yukseklik)
    {
        Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        int PosX = 0;
        int PosY = 0;
        
        if(mGenislik+100 > Dim.width)
            mGenislik = Dim.width-100;
        if(mYukseklik+100 > Dim.height)
            mYukseklik = Dim.height-100;
        
        PosX = (Dim.width-mGenislik)/2;
        PosY = (Dim.height-mYukseklik)/2;
        
        setBounds(PosX, PosY, mGenislik, mYukseklik);
        
    }
}
