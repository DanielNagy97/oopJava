package hu.iit.uni.miskolc.oop;

public class Rectangle {
	private int a;
	private int b;

	// konstruktor a,b oldallal
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// negyzet, mindket oldal a
	public Rectangle(int a) {
		this(a, a);
	}

	// terület
	public int area() {
		return a * b;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}
	
	public void setBoth(int a) {
		this.a=a;
		this.b=a;
		
	}
	
	public void setBoth(int a, int b) {
		this.a=a;
		this.b=a;
		
	}
	
	public boolean isBigger(Rectangle rectangle) {
		if(rectangle.area() < area()) {
			return true;
		}
		return false;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	

}
