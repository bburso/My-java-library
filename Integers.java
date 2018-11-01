/* update 011118 */


public class Integers {

  public void print(int i) 
	{
    		
   		StringOutput so = new StringOutput();
 	   	 so.print(so.convertToString(i));
		 
  	}
  
  public void Adddisplay(int i1, int i2) 
	{
  		 StringOutput so = new StringOutput();

	   	 so.print("Adddisplay result is " 
	   			 + so.convertToString(i1) + "+"  + so.convertToString(i2) 
	   			 + "=" + so.convertToString(i1+i2));
	}
  public int AddReturn(int i1, int i2) 
	{
	  return i1+i2;
	}
  
}