/* update 011118 */
public class Square extends Rectangle {
	
	protected String myObjectNameIs="SQUARE";
	
	public String GetMyObjectName () 
	{
	       return this.myObjectNameIs;
	}

	public Square ()  /* nullary constructor */
	{
	       this(1);
	       super.area=1;
	       super.perimiter=4;
	}
	
	
	public Square (int length)  /* constructor */
	{
	       super.length = length;
	       super.width = length;
	}
	
	public void UpdateSquare (int length)  
	{
		   super.length = length;
	       super.width = length;
	       super.UpdateArea();
	       super.UpdatePerimiter();
	}
	
	
	
}
