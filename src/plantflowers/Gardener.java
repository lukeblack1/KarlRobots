
package Task6;

import becker.robots.*;

public class Gardener extends Robot

{
 public Gardener(City aCity,int aStreet,int anAvenue,
                 Direction aDirection,int numThings)
 {
     super(aCity,aStreet,anAvenue,aDirection,numThings);
 }
 
 public void pickCones()
 {
  this.move();
  this.move();
  
  this.turnLeft();
  this.move();
  this.pickThing();
  this.move();
  this.pickThing();
  
  
  this.move();
  this.pickThing();
  
  this.turnAround();
  this.turnLeft();
  this.move();
  this.pickThing();
  this.turnLeft();
  this.turnAround();
  this.move();
  this.pickThing();
  this.move();
  this.pickThing();
  this.turnAround();
  this.turnLeft();
  this.turnAround();
  
  this.move();
  this.pickThing();
  this.turnLeft();
  
  this.move();
  this.pickThing();
  this.move();
  this.pickThing();
  
  //turning around
  
  this.move();
  this.turnLeft();
  this.move();
  this.move();
  
  this.putThing();
  this.turnLeft();
  this.move();
  this.putThing();
  this.move();
  this.putThing();
  this.move();
  this.putThing();
  this.move();
  this.putThing();
  
  
  this.turnAround();
  this.move();
  this.move();
  this.turnLeft();
  this.move();
  this.putThing();
  this.move();
  this.putThing();
  
  this.turnAround();
  this.move();
  this.move();
  this.move();
  this.putThing();
  this.move();
  this.putThing();
  
  
  this.move();
  this.move();
  
          
  
  
  

  
  
  
  
 }
 
 public void turnAround()
 {
  this.turnLeft();
  this.turnLeft();
  
  
 }
 
 
}


