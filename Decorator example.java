/* interface class     - ?? why do we need this -  well its to effectively create an interface that is not implementaion specific  but ensures that the interface is built.   so the interface can specify a function like draw.  the actual implemenation can vary but it needs to exist??   
*/
/* update 011118 */

public interface Shape {
   void draw();
}


/* concrete classes implements shape interface   
*/

public class Rectangle implements Shape {

   @Override  
/* used to flag that the method is overriding the	 super classes version on the method  */

   public void draw() {
      System.out.println("Shape: Rectangle");
   }
}

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}

/* shape decorator  abstract class
*/
public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;  
/*protected -same package and sub classes */ 

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
   }	
}

/* concrete decorator class
*/
public class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}

/*   demo to use above
*/
public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}







