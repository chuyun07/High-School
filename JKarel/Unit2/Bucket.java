public class Bucket
{
   private static int totalWater;
   private int myWater = 0;
   private int capWater;
   
   public Bucket(int capWater)
   {
      this.capWater = capWater;
      this.myWater = myWater;
   }
   
   public int fill()
   {
      for(int i = 0; i < capWater; i++)
      {
         myWater++;
      }
      return myWater;
   }
   
   public int spill()
   {
      myWater = 0;
      return myWater;
   }
   
   public int getCap()
   {
      return capWater;
   }
   
   public int getMyWater()
   {
      return myWater;
   }
   
   public void pourInto(Bucket arg)
   {
      int x = myWater;
      arg.fill();
      myWater = myWater - arg.getCap();
   }
   
   public int getTotalWater()
   {
      return totalWater;
   }
}