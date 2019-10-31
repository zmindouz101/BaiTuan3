import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;


public class DisplayClock extends JFrame {
	
	public DisplayClock() {
		StillClock clock = new StillClock();
		MessagePanel messagePanel = new MessagePanel(clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond());
		messagePanel.setPreferredSize(new Dimension(40	, 40));
		messagePanel.setCentered(true);
		messagePanel.setForeground(Color.BLACK );
		messagePanel.setFont(new Font("Time", Font.BOLD, 18));
		messagePanel.setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		add(clock, BorderLayout.NORTH);
		add(messagePanel, BorderLayout.SOUTH);
	}
	
	   public static void main(String[] args)
	   {
		   DisplayClock frame = new DisplayClock();
		   frame.setSize(320, 320);
		   frame.setTitle("Display Clock");
		   frame.setLocationRelativeTo(null);
		   frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		   frame.setVisible(true);
		   frame.setBackground(Color.black);
	   }

}
