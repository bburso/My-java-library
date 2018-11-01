/* update 011118 */
import java.util.InputMismatchException;
import java.util.Scanner; 


public class BBInput 
{

	public int GetInteger()
	{
	 int i;
	 int i2=0;
	 String clearstr; 
	 /* BB GIT TEST */
	 Scanner reader = new Scanner(System.in);  /* Reading from System.in */
	 StringOutput soi = new StringOutput();
	 
	 while (true)
	  {
		 for( i=0; i < 1; i++ )
		 {
			 try	{ i2 = reader.nextInt(); 	}
			 catch (InputMismatchException e) 
			 		{ 	soi.print("Entry is not an integer or has decimals please try again");	
			 		clearstr=reader.next(); 
			 		continue; 					}
		 }
		 if (i2 != 0) 	{ break;}
	  }
	 
	 reader =null;
	 return i2;
	 
	}
	
	public String GetText()
	{
		String str1;
		Scanner reader = new Scanner(System.in);  /* Reading from System.in */
		str1=reader.next();
		
		return str1;
	}
	
	
	public boolean Confirmation(String str1)   
	{
		 
		 boolean flag=false;
		 
	 
		 if( (str1).equals("YES") || (str1).equals("yes")  || (str1).equals("Y") || (str1).equals("y") )
		 {
			 flag=true;
		 }
		 else
		 {
			 flag=false;
		 }
		 
		 return flag;
		
	}
	
	
}
