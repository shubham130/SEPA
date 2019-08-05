import java.util.*;

class Point {
	double x, y;
	public Point() {
		x = 0;
		y = 0;
	}
	public void setPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void printPoint() {
		System.out.println("(x:" + x + ", y:" + y + ")");
	}
	public double findDistance(Point point) {
		return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
	}
	public Point findMidpoint(Point point) {
		Point p = new Point();
		p.setPoint((this.x + point.x) / 2, (this.y + point.y) / 2);
		return p;
	}
	public double slope(Point point) {
		return ((this.y - point.y) / (this.x - point.x));
	}
}
