//Ch02 page 15 - page 20
//Karel Robot Workbook

//Luke Black
//06 09 2018
//EC1405935

package Task6;

import Task6.Garden;
import Task6.Garden;
import Task6.Gardener;
import Task6.Gardener;
import Task6.Gardener;
import becker.robots.*;


public class PlantFlowers 

{

    
    public static void main(String[] args) 
    {
    /*
        City berlin = new City();
        Wall eWall = new Wall(berlin, 1,2, Direction.EAST);
        Wall nWall = new Wall(berlin, 1,2, Direction.NORTH);
        Wall wWall = new Wall(berlin, 1,2, Direction.WEST);
        Wall sWall = new Wall(berlin, 1,2, Direction.SOUTH);
      */
        City berlin = new City("MyCity.txt");
        
        
        
        
        Gardener karel = new Gardener(berlin,5,1,Direction.EAST,8);
        
        karel.pickCones();
        
        
       //Plant
    
     
     //PROBLEM
     
    
     
     
        //karel.plantFlowers();
        
    }

    private static void putThing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

        
        
        
    
    

