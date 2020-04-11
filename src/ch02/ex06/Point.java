package ch02.ex06;

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
	 * Move Point is x and/or y direction
	 * 
	 * @param transX the x axis offset used for moving Point in x direction
	 * @param transY the y axis offset used for moving Point in y direction
	 */
	public void translate(double transX, double transY) {
		x += transX;
		y += transY;
	}

	/**
	 * Scale Point by a factor
	 * 
	 * @param scaleFactor the amount to scale both x and y positions
	 */
	public void scale(double scaleFactor) {
		x *= scaleFactor;
		y *= scaleFactor;
	}

}
