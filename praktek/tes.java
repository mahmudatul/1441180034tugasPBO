class tes{
	public static void main(String[] args) {
		Circle cahya = new Circle();
		Circle ardi = new Circle(30);
		Circle akbar = new Circle(60,"abanggalau");
		System.out.println("radius ="+ cahya.getRadius + "color ="+ cahya.color + "luas"+ cahya.getArea());
		System.out.println("radius ="+ ardi.getRadius + "color ="+ ardi.color + "luas"+ ardi.getArea());
		System.out.println("radius ="+ akbar.getRadius + "color ="+ akbar.color + "luas"+ akbar.getArea());

	}
}