import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JPanel;


public class MessagePanel extends JPanel
{
   private String message = "Chao Ban";
   private int ToaDoX = 20;
   private int ToaDoY = 20;
   private boolean centered;
   private int TrungGian = 10;
   
   public MessagePanel()
   {
	   
   }
   
   public MessagePanel(String message)
   {
	   this.message = message;
   }
	
   
   public String getMessage()
   {
	   return this.message;
   }
   
   public void setMessage()
   {
	   this.message = message;
	   repaint();
   }
   
   public int getToaDoX()
   {
	   return this.ToaDoX;
   }
   
   public void setToaDoX(int ToaDoX)
   {
	   this.ToaDoX = ToaDoX;
	   repaint();
   }
   
   public int getToaDoY()
   {
	   return this.ToaDoY;
   }
   
   public void setToaDoY(int ToaDoY)
   {
	   this.ToaDoY = ToaDoY;
	   repaint();
   }

   public void setCentered(boolean centered) 
   {
	   this.centered = centered;
	   repaint();
   }

	public boolean isCentered()
	{
		return centered;
	}

	public void setTrungGian(int TrungGian) 
	{
		this.TrungGian = TrungGian;
		repaint();
	}

	public int getTrungGian() 
	{
		return TrungGian;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if (centered)
		{
			FontMetrics fm = g.getFontMetrics();
			
			int stringWidth = fm.stringWidth(message);
			int stringAscent = fm.getAscent();
			
			ToaDoX = getWidth()/2 - stringWidth/2;
			ToaDoY = getHeight()/2 + stringAscent/2;
		}
		
		g.drawString(message, ToaDoX, ToaDoY);
	}
	
	public void moveLeft()
	{
		ToaDoX -= TrungGian;
		repaint();
	}
	
	public void moveRight()
	{
		ToaDoX += TrungGian;
		repaint();
	}
	
	public void moveUp()
	{
		ToaDoY -= TrungGian;
		repaint();
	}
	
	public void moveDown()
	{
		ToaDoY += TrungGian;
		repaint();
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(200, 30);
	}



}
