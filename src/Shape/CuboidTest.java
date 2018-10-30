package Shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboidTest {

	@Test
	public void CuboidConstructionTest() 
	{
		Cuboid cuboid = new Cuboid(3,9,11);
		assertTrue(cuboid instanceof Cuboid);
	}
	
	@Test
	public void GetSetDepthTest()
	{
		Cuboid cuboid = new Cuboid(3,9,11);
		cuboid.setDepth(14);
		assertEquals(14, cuboid.getDepth());
	}
	
	@Test
	public void AreaTest()
	{
		Cuboid cuboid = new Cuboid(3,5,7);
		assertEquals(142, cuboid.area());
	}
	
	@Test
	public void VolumeTest()
	{
		Cuboid cuboid = new Cuboid(3,5,7);
		assertEquals(105, cuboid.volume());
	}
	
	@Test
	public void PerimeterTest()
	{
		Cuboid cuboid = new Cuboid(3,5,7);
		Throwable exception = assertThrows(UnsupportedOperationException.class, ()-> cuboid.perimeter());
		assertEquals("expected messages", exception.getMessage());
	}
	
	@Test
	public void SortByAreaTest()
	{
		Cuboid cuboid1= new Cuboid(3,5,7);
		Cuboid cuboid2= new Cuboid(10,9,11);
		cuboid1.SortByArea(cuboid2);
	}
	
	@Test
	public void SortByVolumeTest()
	{
		Cuboid cuboid1= new Cuboid(3,5,7);
		Cuboid cuboid2= new Cuboid(10,9,11);
		cuboid1.SortByArea(cuboid2);
	}

}
