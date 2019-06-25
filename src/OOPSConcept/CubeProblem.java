package OOPSConcept;

public class CubeProblem {
	
	private int width;
	
	public CubeProblem(int width)
	{
		this.width=width;
	}
	
	public CubeProblem()
	{
		this.width=0;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public double getArea()
	{
		double area= 6*(this.width*this.width);
		return area;
	}
	
	public void outputCubeInfo()
	{
		System.out.println("Length of cube : "+this.width);
		System.out.println("Surface Area is : "+getArea());
	}
}
