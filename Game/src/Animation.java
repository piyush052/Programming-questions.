import java.awt.Image;
import java.util.ArrayList;
import java.util.Scanner;

public class Animation {
	private ArrayList scenes;
	private int sceneIndex;
	private long movieTime;
	private long totalTime;
	
	
	//CONSTRUCTOR	
	public Animation(){
		scenes=new ArrayList();
		totalTime=0;
		start();
		
	}
	// start animation for begining

      public   synchronized void start() {
		// TODO Auto-generated method stub
	movieTime=0;
	sceneIndex=0;


	}

	// add scene to aaray list and set time
	public synchronized void  addScene(Image i, long t) {
		// TODO Auto-generated method stub
		
		totalTime+=t;
		scenes.add(new OneScene(i,totalTime));
		
	}
	
	// change scene
	public synchronized void update(long timePassed	){
		if(scenes.size()>1){
			movieTime+=timePassed;
			if(movieTime>=totalTime){
				movieTime=0;
				sceneIndex=0;
			}
			
			while(movieTime > getScene(sceneIndex).endTime){
				sceneIndex++;
				
			}
		}
		
	}
	
	// get animation current scene 
	
	public synchronized Image getImage(){
		if (scenes.size()==0){
			return null;
			
		}else{
			return getScene(sceneIndex).pic;
		}
	}
	// getScene
	private OneScene getScene(int x){
		return (OneScene)scenes.get(x);
		
	}
//  Privete inner class
	
	private class OneScene{
		Image pic;
		long endTime;
		public OneScene(Image pic, long endTime) {
			// TODO Auto-generated constructor stub
			this.pic=pic;
			this.endTime=endTime;
		}
		
		
	}
}
