package Shape;

public class Cuboid extends Rectangle{
	
	private int Depth;
	
	public Cuboid(int Width, int Length, int Depth)
	{
		super(Width, Length);
		this.Depth=Depth;
	}
	
	public int getDepth()
	{
		return Depth;
	}
	
	public void setDepth(int Depth)
	{
		this.Depth=Depth;
	}
	
	@Override
	public double area()
	{
		return 2*(super.getWidth()*super.getLength()+super.getLength()*Depth+super.getWidth()*Depth);
	}
	
	public double volume()
	{
		return super.getLength()*super.getWidth()*Depth;
	}
	
	@Override
	public double perimeter()
	{
		throw new UnsupportedOperationException("Unsupported Operation");
	}
	
	public class SortByArea implements Comparator<Cuboid>
	{
		public int compare(Cuboid one, Cuboid two)
		{
			return one.area.compareTo(two.area);
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>
	{
		public int compare(Cuboid one, Cuboid two)
		{
			return one.volume.compareTo(two.volume);
		}
	}
}
