package ch02.ex05;

/**
 * A Point Object represents a point in 2 dimensional space
 * 
 * @author Blaine Johnson
 * @version 1.0
 */
public class Point {

	private double x = 0;
	private double y = 0;

	public Point() {
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Get x position
	 * 
	 * @return the current x position
	 */
	public double getX() {
		return x;
	}

	/**
	 * Get x position
	 * 
	 * @return the current x position
	 */
	public double getY() {
		return y;
	}

	/**
	 * New Point moved from position of receiver
	 * 
	 * @param transX the x axis offset used for moving Point in x direction
	 * @param transY the y axis offset used for moving Point in y direction
	 * @return a new Point object which has been translated
	 */
	public Point translate(double transX, double transY) {
		return new Point(x + transX, y + transY);
	}

	/**
	 * New Point scaled from position of receiver
	 * 
	 * @param scaleFactor the amount to scale both x and y positions
	 * @return a new Point object which has been scaled
	 */
	public Point scale(double scaleFactor) {
		return new Point(x * scaleFactor, y * scaleFactor);
	}

}
