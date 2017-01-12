import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Piyush extends JFrame {
	
	public static void main(String args []){
		
		DisplayMode dm=new DisplayMode(800, 600, 16,DisplayMode.REFRESH_RATE_UNKNOWN);
		Piyush b=new Piyush();
		b.run(dm);

		
	}
	
	private void run(DisplayMode dm) {
		// TODO Auto-generated method stub
		
		screen =new Screen();
		
		try{
			screen.setFullScreenMode(dm, new JFrame());
			loadPics();
			movieLoop();
			
			}finally{
				screen.restoreScreen();
			}
		
		
	}
	
	// main movie loop

	private void movieLoop() {
		// TODO Auto-generated method stub
		
		long startingTime=System.currentTimeMillis();
		long cumTime=startingTime;
		
		while(cumTime-startingTime < 15000){
			
			long timePassed=System.currentTimeMillis() - cumTime;
			cumTime +=timePassed;
			a.update(timePassed);
			
			Graphics g=screen.getFullScreenWindow().getGraphics();
			draw(g);	
			g.dispose();
			try{
			Thread.sleep(20);
			}catch(Exception e){
				
			}
		}
		
		
	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		g.drawImage(bg, 0, 0,null);
		g.drawImage(a.getImage(), 0, 0,null);

		
//		for(int i=0;i<2000;i=i+100){
//		
//		g.drawImage(a.getImage(), 0+i, 0+i,null);
////		
//		try {
//			Thread.sleep(20);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		}
		
	}

	private Screen screen;
	private Image bg;
	private Animation a;
	
	
	// load pics
	  public void loadPics(){
		  bg=new ImageIcon("/home/gipsy_danger/Documents/back.jpg").getImage();
		  Image fac1=new ImageIcon("/home/gipsy_danger/Documents/hello1.png").getImage(); 
		  Image fac2=new ImageIcon("/home/gipsy_danger/Documents/hello2.png").getImage(); 
          a=new  Animation();
          a.addScene(fac1, 250);
          a.addScene(fac2, 250);

          
	  }
	

//	private void run(DisplayMode dm) {
//		// TODO Auto-generated method stub
//		setBackground(Color.PINK);
//		setForeground(Color.WHITE);
//		setFont(new Font("Arial",Font.PLAIN,24));
//		
//		Screen s=new Screen();
//		try{
//		s.setFullScreenMode(dm, this);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}finally{
//			s.restoreScreen();
//		}
//		
//		
//	}
//	
//	public void paint(Graphics g ) {
		
//		if(g instanceof Graphics2D){
//			Graphics2D g2=(Graphics2D) g;
//			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
//			
//		}
//		g.drawString("hey its piyush ",200,200);
//	}

}
