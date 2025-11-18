public class BJP5_Exercise_3_13_pay{

   public static void main(String[] args){
      System.out.print(pay(15.0, 10));
      }
      
   public static double pay(double a, int b){
      double wage = 0;
      double regularWage = 0;
      double overtimeWage = 0;
      int regularHour = Math.min(8, b);
      int overTime = (Math.max(8, b)) - 8;
      
      for(int i = 1; i <= regularHour; i++){
         regularWage = regularWage + a;
         //System.out.println(regularWage + " ");
      }
      for(int i = 1; i <= overTime; i++){
         overtimeWage = overtimeWage + 1.5 * a;
         //System.out.println("OT " + overtimeWage + " ");
      }
      wage = regularWage + overtimeWage;
      return wage;
   }
}
