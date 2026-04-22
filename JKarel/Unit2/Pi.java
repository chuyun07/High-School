public class Pi
{
   private double p = 3.14159265359;
   private int count = 0;
   private int z = 1;
   public Pi()
   {
      this.p = p;
      this.count = count;
      this.z = z;
   }
   
   public static double piApproximation(int terms)
   {
      int z1 = 1;
      int count1 = 0;
      double p1 = 3.14159265359;
      double[] arr = new double[99999999];
      arr[0] = 4.0;
      for(int i = 0; i < 99999999; i++)
      {
         if(count1%2 == 0)
         {
            arr[i] = (4*(1-(1/(z1+2))));
            count1++;
         }
         else if(count1%2 != 0)
         {
            arr[i] = (4*(1+(1/(z1+2))));
            count1++;
         }
      }
      double h = p1 - arr[terms - 1];
      return h;
   }
}