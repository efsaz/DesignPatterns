package EXs.bridge.abstraction;

import EXs.bridge.implementation.DrawAPI;

public abstract class Shape {
   protected DrawAPI drawAPI;
   
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();	
}