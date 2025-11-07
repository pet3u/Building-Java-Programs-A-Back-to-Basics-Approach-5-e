public class Fibonacci{

   public static void main(String[] args){

      int k1 = 1;
      int k2 = 1;
      int k = 0;
      System.out.print(k1 + " ");
      System.out.print(k1 + " ");
      System.out.print(k2 + " ");
      
      for ( int i = 2; i <= 22; i++ ){
         k = k1 + k2;
         k1 = k2;
         k2 = k;
         System.out.print(k + " ");
      }
   }
}