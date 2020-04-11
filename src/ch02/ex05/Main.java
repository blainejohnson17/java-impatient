package ch02.ex05;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		System.out.println("initial => point1 x: " + point1.getX() + ", point1 y: " + point1.getY());
		
		Point point2 = new Point(3, 4);
		System.out.println("initial => point2 x: " + point2.getX() + ", point1 y: " + point2.getY());
		
		point2 = point2.translate(1, 3).scale(0.5);
		System.out.println("after translate & scale => point2 x: " + point2.getX() + ", point1 y: " + point2.getY());
	}

}
