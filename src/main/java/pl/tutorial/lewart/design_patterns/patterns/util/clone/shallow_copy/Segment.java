package pl.tutorial.lewart.design_patterns.patterns.util.clone.shallow_copy;


// more
// http://javastart.pl/static/efektywne-programowanie/plytkie-i-glebokie-kopiowanie-klonowanie-obiektow/
public class Segment implements Cloneable {

	private Point p1;
	private Point p2;

	public Segment(Point p1, Point p2) {

		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}
	
	public Point getP2() {
		return p2;
	}
	
    @Override
    public Object clone() throws CloneNotSupportedException {
    	
        return super.clone();
        // it is equal:
        // Segment segment = new Segment(this.p1, this.p2);
        // so reference is the same like in cloned object
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
