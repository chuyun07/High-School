public class Bucket
{
   private static int totalWater;
   private int myWater;
   private int capWater;
   
   public Bucket(int capWater)
   {
      this.capWater = capWater;
   }
   
   public int fill()
   {
      myWater = capWater;
      return myWater;
   }
   
   public int spill()
   {
      myWater = 0;
      return myWater;
   }
   
   public pourInto(Bucket arg)
   {
       
}