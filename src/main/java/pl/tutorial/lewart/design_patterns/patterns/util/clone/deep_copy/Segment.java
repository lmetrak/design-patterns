package pl.tutorial.lewart.design_patterns.patterns.util.clone.deep_copy;

//more
//http://javastart.pl/static/efektywne-programowanie/plytkie-i-glebokie-kopiowanie-klonowanie-obiektow/
public class Segment implements Cloneable {

	private Point p1;
	private Point p2;

	public Segment(Point p1, Point p2) {

		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		// Segment s = (Segment) super.clone();

		/*
		 * 	Segment s = new Segment(); 
		 *  s.p1 = (Point) this.p1.clone();
		 *  s.p2 =(Point) this.p2.clone(); 
		 *  return s;
		 */

		Point p1 = (Point) this.p1.clone();
		Point p2 = (Point) this.p2.clone();

		return new Segment(p1, p2);
	}
	
	public Point getP1() {
		return p1;
	}
	
	public Point getP2() {
		return p2;
	}

	public class Point implements Cloneable {

		private int x;
		private int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

	}
}
