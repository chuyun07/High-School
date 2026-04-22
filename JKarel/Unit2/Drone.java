import java.util.*;
import java.io.*;

public class Drone
{
   private int bat;
   private int max;
   private int x;
   private int y;
   private Order o;
   
   public Drone(int battery, int x1, int y1)
   {
      bat = battery;
      max = battery;
      x = x1;
      y = y1;
      o = null;
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public int getBat()
   {
      return bat;
   }
   
   public void moveTowards(int x2, int y2)
   {
      if(x2 < x)
      {
         x--;
         bat--;
      }
      else if(x2 > x)
      {
         x++;
         bat--;
      }
      else if(y2 < y)
      {
         y--;
         bat--;
      }
      else if(y2 > y)
      {
         y++;
         bat--;
      }
      else
      {
         System.out.println("already here");
      }
   }
   
   public boolean arrived()
   {
      if(x == o.getX())
      {
         if(y == o.getY())
         {
            return true;
         }
      }
      return false;
   }
   
   public void dropOffOrder()
   {
      System.out.println(o);
      o = null;
      
   }
   
   public void fillOrder()
   {
      if(arrived() == false)
      {
         moveTowards(x, y);
      }
      else
      {
         dropOffOrder();
      }
   }
   
   public void pickUpNewOrder(Order o1)
   {
      o = o1;
   }
}