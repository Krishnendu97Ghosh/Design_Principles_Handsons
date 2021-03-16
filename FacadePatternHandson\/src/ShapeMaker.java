
public class ShapeMaker {
	private Shape circle = new Circle();
	private Shape rectangle = new Rectangle();
	private Shape square = new Square();
	public ShapeMaker()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void drawCircle()
	{
		circle.draw();
	}
	
	public void drawRectangle()
	{
		rectangle.draw();
	}
	
	public void drawSquare()
	{
		square.draw();
	}
	
	

}
