public class FractionSum{

   public static void main(String[] args){
      System.out.println(fractionSum(20));
   }
   
   public static double fractionSum(int n){
   
      double sum = 0;
      
      for (int i = 1; i <= n; i++){
      sum = sum + 1.0/i;
      }
      return sum;
   }
}