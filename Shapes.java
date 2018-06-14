import java.util.Scanner;


public class Shapes {
	
	
	public void CreateShapes()
	{
		StringOutput soi = new StringOutput();
		BBInput bbin = new BBInput();
		Rectangle[] rec = new Rectangle[4];
		int recId =0;
		
		
		Square sq = new Square(1);
		String arg1str;
		String allshapes = " 'SQUARE' or 'RECTANGLE' ";
		
		
		soi.print("Do you want to create a " + allshapes + "?" );
		arg1str=bbin.GetText();
		
		 while (true)
		  {
		  
			 if (arg1str.equals("RECTANGLE")  )
			 {
				 
			     soi.print("So you want to create a RECTANGLE " );
				 soi.print("Enter a width");
				 rec[recId].UpdateWidth(bbin.GetInteger());
				 soi.print("Enter a length");
				 rec[recId].UpdateLength(bbin.GetInteger());
				 rec[recId].UpdateMyName("Rectangle " + recId);
				 
				 soi.print("Thanks my name is " + rec[recId].GetMyName() + 
						 	" and i am " + rec[recId].GetLength() + 
						 	" by" + rec[recId].GetWidth());
				 
				 
				 soi.print("I am " + rec[recId].area + " in Area");
				 
				 soi.print("My perimeter is " + rec[recId].perimiter);
				 
				 
				 
			 }
			 else if (arg1str.equals("SQUARE")  )
			 {
				 
				 soi.print("Enter a side length");
				 sq.UpdateSquare(bbin.GetInteger());
				 soi.print("Squares side length is " + sq.GetWidth());	 
				 soi.print("Squares area is " + sq.area);
				 soi.print("Squares perimeter is " + sq.perimiter);
				 
				 
			 }
			 else 
			 {
				 System.err.println("You havnt specified a valid argument try " + allshapes +" ");
			 }
		 
			 soi.print("Do you want to create some more shapes.  if you do type 'YES' thanks");
			
			 if(bbin.Confirmation(bbin.GetText()))
			 {
				 soi.print("Specify 'SQUARE' or 'RECTANGLE'");
				 arg1str = bbin.GetText();	 
			 }
			 else
			 {
				 soi.print("Are you sure you? Type 'NO' if you want to continue");
				 if(!bbin.Confirmation(bbin.GetText()))
			 		{
					 soi.print("In that case specify " + allshapes + " ");
					 arg1str = bbin.GetText();
			 		}
				 else
				 {
					 break;
				 }
			 } /* end of else */
		  } /* end of outer while loop */
		 
		 
		 
		 
		 
		
	}
	
	public void CalcShapes()
	{
		String arg1str; 
		int length;
		int width;
		
		BBInput bbin = new BBInput();
		StringOutput soi = new StringOutput();
		Scanner reader = new Scanner(System.in);  /* Reading from System.in */
		 soi.print("Welcome to shape calculator");
		 soi.print("Specify 'AREA' or 'PERIMITER'");
		 arg1str = reader.next(); 
		 
		 while (true)
		  {
		  
			 if (arg1str.equals("AREA") || arg1str.equals("PERIMITER") )
			 {
				 soi.print("So you want to calculate the " +arg1str + ". I can only do rectangles so I need length and width");
				 length=0;
				 width=0;
				 soi.print("Please enter the length in whole Metres: "); 
				 length = bbin.GetInteger();
				 soi.print("Length entered is :("+ length + ") so now enter the width in whole Metres: ");
				 width = bbin.GetInteger();
				 soi.print("width entered is :("+ width + "m)");
			 
				 if (arg1str.equals("AREA"))
				 	{
					 soi.print("The area is:(" + length * width + "m2)");
				 	}
				 else if (arg1str.equals("PERIMITER"))
				 {
					 soi.print("The perimter is:(" + (length*2) + (width * 2) + ")");
				 }
			 }
			 else 
			 {
				 System.err.println("You havnt specified a valid argument try 'AREA' or 'PERIMITER'  ");
			 }
		 
			 soi.print("Do you want to do another calculation.  if you do type 'YES' thanks");
			
			 if(bbin.Confirmation(reader.next()))
			 {
				 soi.print("Specify 'AREA' or 'PERIMITER'");
				 arg1str = reader.next();	 
			 }
			 else
			 {
				 soi.print("Are you sure you? Type 'NO' if you want to continue");
				 if(!bbin.Confirmation(reader.next()))
			 		{
					 soi.print("In that case specify 'AREA' or 'PERIMITER'");
					 arg1str = reader.next();
			 		}
				 else
				 {
					 break;
				 }
			 } /* end of else */
		  } /* end of outer while loop */
		 
		 
	
	}
	
	

}
