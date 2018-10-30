package Shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	public void RectConstructionTest() {
		Rectangle rectangle = new Rectangle (5, 10);
		assertTrue(rectangle instanceof Rectangle);
	}
	
	@Test
	public void GetSetWidthTest()
	{
		Rectangle rectangle = new Rectangle(5,10);
		rectangle.setWidth(8);
		assertEquals(8, rectangle.getWidth());
	}
	
	@Test
	public void GetSetLengthTest()
	{
		Rectangle rectangle = new Rectangle(5,10);
		rectangle.setLength(7);
		assertEquals(7, rectangle.getLength());
	}
	
	@Test
	public void AreaTest()
	{
		Rectangle rectangle = new Rectangle(5,10);
		assertEquals(50, rectangle.area());
	}
	
	@Test
	public void PerimeterTest()
	{
		Rectangle rectangle = new Rectangle(5,10);
		assertEquals(30, rectangle.perimeter());
	}
	
	@Test
	public void CompareToTest()
	{
		Rectangle rectangle1 = new Rectangle(5,10);
		Rectangle rectangle2 = new Rectangle(8,9);
		assertEquals(0, rectangle1.compareTo(rectangle2));
	}
	
	@Test
	public void CompareToTest2()
	{
		Rectangle rectangle1 = new Rectangle(8,9);
		Rectangle rectangle2 = new Rectangle(5,10);
		assertEquals(2, rectangle1.compareTo(rectangle2));
	}
	
	@Test
	public void CompareToTest3()
	{
		Rectangle rectangle1 = new Rectangle(5,10);
		Rectangle rectangle2 = new Rectangle(5,10);
		assertEquals(1, rectangle1.compareTo(rectangle2));
	}
}
