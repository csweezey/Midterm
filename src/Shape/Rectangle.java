package Shape;

public class Rectangle extends Shape implements Comparable<Rectangle> {
	
	private int Width;
	private int Length;
	
	public Rectangle(int Width, int Length)
	{
		super();
		this.Width= Width;
		this.Length= Length;
	}
	
	public int getWidth()
	{
		return Width;
	}
	
	public void setWidth(int Width)
	{
		this.Width=Width;
	}
	
	public int getLength()
	{
		return Length;
	}
	
	public void setLength(int Length)
	{
		this.Length=Length;
	}
	public double area()
	{
		return Width*Length;
	}
	
	public double perimeter()
	{
		return (2*Width)+(2*Length);
	}
	
	public int compareTo(Rectangle newRectangle)
	{
		if (this.area() < newRectangle.area())
		{
			return 0;
		}
		if (this.area()== newRectangle.area())
		{
			return 1;
		}
		else {
			return 2;
		}
	}
}
