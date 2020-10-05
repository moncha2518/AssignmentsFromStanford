import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GCanvas;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class DrawingLines extends GraphicsProgram {

	private GLine line; /* Private instance variable */

	public void run() {
		addMouseListeners();

	}

	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();

		line = new GLine(x, y, x, y);
		add(line);
	}

	public void mouseDragged(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x, y);

	}

}
