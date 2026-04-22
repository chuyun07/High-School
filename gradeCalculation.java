import java.util.*;

class gradeCalculation{

   public static void main(String[] args){
 
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter the numnber of quizes you've taken");
      double[] arr = new double[kb.nextInt()];
      System.out.println("Enter your quiz grades in decimal form");
      for(int i = 0; i < arr.length; i++){
      
         arr[i] = kb.nextDouble();
      }
      System.out.println(quizAverage(arr));
      System.out.println("Tests?");
      double[] arr1 = new double[kb.nextInt()];
      System.out.println("Enter your test grades in decimal form");
      for(int i = 0; i < arr1.length; i++){
      
         arr1[i] = kb.nextDouble();
      }
      System.out.println(testAverage(arr1));
      System.out.println("Overall grade right now: " + average(quizAverage(arr), testAverage(arr1), arr, arr1));
   }
   
   static double testAverage(double[] arr){
   
      double total = 0.0;
      for(int i = 0; i < arr.length; i++){
      
         total = arr[i] + total;
      }
      return total/arr.length;
   }
   
   static double quizAverage(double[] arr){
   
      double total = 0.0;
      for(int i = 0; i < arr.length; i++){
      
         total = arr[i] + total;
      }
      return total/arr.length;   
   }
   
   static double average(double q, double t, double[] arr, double[] arr1){
   
      double total = 0.0;
      for(int i = 0; i < arr.length; i++){
      
         total = arr[i] + total;
      }
      for(int i = 0; i < arr1.length; i++){
      
         total = arr1[i] + total;
      }
      double max = (arr.length * 10) + (arr1.length * 100);
      return total/max;
      
   }
}