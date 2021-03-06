package EXs.bridge;

import EXs.bridge.abstraction.Circle;
import EXs.bridge.abstraction.Shape;
import EXs.bridge.implementation.GreenCircle;
import EXs.bridge.implementation.RedCircle;

public class BridgePatternDemo {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

      redCircle.draw();
      greenCircle.draw();
   }
}