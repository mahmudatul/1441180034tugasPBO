// nama class circle.java
class Circle {
	// variabel radius dan color
	// radius -> double
	// color -> string

	private double radius;
	private String color;

	// konstruktor untuk class circle??
		// karena nama kelas sama dengan nama fungsi

	public Circle(){

		radius = 1.0;
		color = "pink";

	}

	public Circle (double r){

		radius = r;
		color = "pink";
	}

	public Circle (double r, String c){

		radius = r;
		color = c;
	}

	public double getRadius() {

		return  radius;
	}

	public String getColor(){

		return color;

	}

	public double getArea(){

		return radius*radius*Math.PI;
	
	
	}
}