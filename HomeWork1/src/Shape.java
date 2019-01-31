
public class Shape {
	String name;
	static int NumberOfShapes;
	
	public Shape(String name) {
		this.name = name;
		
	}
	public void DisplayShape() {
		System.out.println("the shape is a "+ name);
		
	}
	public void Count() {
		NumberOfShapes++;
	}
	public void DisplayNumberOfShapes() {
		System.out.println(NumberOfShapes + "shapes in the database");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("shape name");

	}

}
