package test.class3;

public class Circle {

	private int r;
	private double circum, area;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getCircum() {
		return circum;
	}
	public double getArea() {
		return area;
	}
	
	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}
	
	public void calcArea() {			// power : Á¦°ö -> Math.pow (Á¦°öÇÒ ¼ö, Á¦°ö È½¼ö)
		area = Math.PI * Math.pow(r, 2);
	}
}
