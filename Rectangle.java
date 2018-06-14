
public class Rectangle
{
	
	protected int width;
	protected int length;
	protected int area;
	protected int perimiter;
	protected String myInstanceNameIs="Undefined";    
	protected String myObjectNameIs="RECTANGLE";
	
	public String GetMyObjectName () 
	{
	       return this.myObjectNameIs;
	}
	
	public String GetMyName () 
	{
	       return this.myInstanceNameIs;
	}
	
	public String UpdateMyName (String str) 
	{
	       return this.myInstanceNameIs = str;
	}
	
	
	public Rectangle ()  /* nullary constructor */
	{
	       this(1,1);
	       this.area=1;
	       this.perimiter=4;
	}
	
	
	public Rectangle (int width,int length)  /* constructor */
	{
	       this.width  = width;
	       this.length = length;
	       this.UpdateArea();
	       this.UpdatePerimiter();
	}
	
	public int GetWidth()  /* get Width */
	{
	       return this.width;
	}
	public int GetLength()  /* get Length */
	{
	       return this.length;
	}
	
	public int GetArea()  /* get AREA */
	{
	       return this.area;
	}
	
	public int GetPerimiter()  /* get Perimiter */
	{
	       return this.perimiter;
	}
	
	
	public void UpdateRectangle (int width,int length)  /* constructor */
	{
	       this.width  = width;
	       this.length = length;
	       this.UpdateArea();
	       this.UpdatePerimiter();
	}
	public void UpdateWidth (int width) 
	{
	       this.width  = width;
	       this.UpdateArea();
	       this.UpdatePerimiter();
	}
	public void UpdateLength (int length) 
	{
	       this.length  = length;
	       this.UpdateArea();
	       this.UpdatePerimiter();
	}
	
	
	
	/* private methods */
	
	protected void UpdateArea()
	{
		
		this.area = this.width * this.length;
				
	}
	protected void UpdatePerimiter()
	{
		
		this.perimiter = this.width * 2 +  this.length * 2;
				
	}
	
	
	
	
	
}
