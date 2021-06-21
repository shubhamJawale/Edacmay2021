import java.io.*;
import java.util.*;
interface mammals
{
   default void show(){
       System.out.println("I am Mammals");
   }
}
interface marineAnimals
{
  default void show(){
       System.out.println("I am MarineAnimals");
   }
}

class mammalsc implements mammals
{
    public void show(){
   // System.out.println("I am Mammls class function");
    mammals.super.show();
    }
}

class marineAnimalsc implements marineAnimals
{
    public void show(){
   // System.out.println("I am Marine animals  class function");
    marineAnimals.super.show();
    }
}




class blueWhalesc  implements mammals,marineAnimals {
   
    public void show(){
   // System.out.println("I am Blue whale  class function");
     marineAnimals.super.show();
     mammals.super.show();
     
    System.out.println("i am blue whale");
    }
}

public class Solution {

    public static void main(String[] args) {
    mammalsc  m = new mammalsc();
    marineAnimalsc ma = new marineAnimalsc();
    blueWhalesc b = new blueWhalesc();
        m.show();
        ma.show();
        b.show();
    }
}