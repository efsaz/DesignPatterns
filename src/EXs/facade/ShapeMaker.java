package EXs.facade;

import EXs.facade.complex.Circle;
import EXs.facade.complex.Rectangle;
import EXs.facade.complex.Shape;
import EXs.facade.complex.Square;

public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}