/*File: RobotFace.java
 * 
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import javafx.*;

public class RobotFace extends GraphicsProgram{
	private static final double HEAD_WIDTH=50;
	private static final double HEAD_HEIGHT=150;
	private static final double EYE_RADIUS=10;
	private static final double MOUTH_WIDTH=45;
	private static final double MOUTH_HEIGHT=20;
	
	public void run() {
		createHead(getWidth()/2,getHeight()/2); //center of canvas
		createEyes(getWidth()/2,getHeight()/2); //center of canvas
		createMouth(getWidth()/2,getHeight()/2); //center of canvas
		
	}
	private void createHead(double width,double height) {
		GRect head = new GRect(width,height);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);	
		add(head,width/2,height/2);
		
	}
	private void createEyes(double width,double height) {
		GOval leftEye= new GOval(width-EYE_RADIUS,height-EYE_RADIUS,2*EYE_RADIUS,2*EYE_RADIUS);
		GOval rightEye= new GOval(width-EYE_RADIUS,height-EYE_RADIUS,2*EYE_RADIUS,2*EYE_RADIUS);
		
		rightEye.setFilled(true);
		rightEye.setFillColor(Color.YELLOW);
		
		leftEye.setFilled(true);
		leftEye.setFillColor(Color.YELLOW);
		
		add(leftEye,(-10+width)-HEAD_WIDTH/4,(height-HEAD_HEIGHT/4));		
		add(rightEye,width+HEAD_WIDTH/4,height-HEAD_HEIGHT/4);
		
	}
	private void createMouth(double width,double height) {
		GRect mouth=new GRect(width-MOUTH_WIDTH/2,height-MOUTH_HEIGHT/2,MOUTH_WIDTH,MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth,width-MOUTH_WIDTH/2,height+MOUTH_HEIGHT/(2*4));
	}	
}


