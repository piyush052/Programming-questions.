import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Images extends JFrame {
	
	public static void main(String args []){
		
		DisplayMode dm=new DisplayMode(800, 600, 16,DisplayMode.REFRESH_RATE_UNKNOWN);
		Images i=new Images();
		i.run(dm);

		
	}

	private Screen s;
	private Image bg;
		private Image pic;
		private boolean loaded;
	
	private void run(DisplayMode dm) {
		// TODO Auto-generated method stub
		setBackground(Color.PINK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial",Font.PLAIN,24));
		
		loaded=false;
		
          s=new Screen();
		try{
		s.setFullScreenMode(dm, this);
		loadpics();
		try {
			Thread.sleep(35000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}finally{
			s.restoreScreen();
		}
		
		
	}
	
	private void loadpics() {
		// TODO Auto-generated method stub
		bg=new ImageIcon("/home/gipsy_danger/Documents/back.jpg").getImage();
		pic=new ImageIcon("/home/gipsy_danger/Documents/face.png").getImage();
		loaded = true;
		repaint();

	}

	public void paint(Graphics g ) {
		
		if(g instanceof Graphics2D){
			Graphics2D g2=(Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			
		}
//		g.drawString("hey its piyush ",200,200);
		
		if(loaded){
			g.drawImage(bg,0,0,null);
			
			g.drawImage(pic,200,200,null);

//			for (int i=0;i<500;i=i+20){
//			try {
//				Thread.sleep(200);
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			}
		}
	}

}