

import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.util.*;
import java.awt.Color;

public class RandomCircles extends GraphicsProgram {
	private static final int MAX_CIRCLE = 10;
	private static final double MIN_RADIUS = 5.0;
	private static final double MAX_RADIUS = 50.0;

	public void run() {

		for (int i = 0; i < MAX_CIRCLE; i++) {
			Random random = new Random();

			
			double radius = random.nextDouble() * (MAX_RADIUS - MIN_RADIUS);
			double x = random.nextDouble() * 100;
			double y = random.nextDouble() * 100;

			int r = random.nextInt(256);
			int g = random.nextInt(256);
			int b = random.nextInt(256);

			Color randomColor = new Color(r, g, b);

			GOval circle = new GOval(x, y, 2 * radius, 2 * radius);

			circle.setFilled(true);
			circle.setColor(randomColor);
			add(circle, x, y);
		}
	}

}
