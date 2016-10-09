

public class Triangle extends GeometricObject {
	
	private double side1 = 3;
	private double side2 = 4;
	private double side3 = 5;
	
	// changes 
	
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public Triangle(double side1, double side2, double side3)
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public double getPerimeter(){
		return side1+side2+side3;
				
	}
	
	@Override
	public double getArea(){
		double area = ((side1*side2)/2);
		
	}
	}
	{
		
	}
	
	

}
