public class NumberGuids{

   public static void main (String[] args){
   
      numberGuids();
   }
   
   public static void numberGuids(){
      for(int i = 1; i<= 6; i++){
         
         for (int j = 1; j<= 9; j++){
            System.out.print(" ");
         }
         System.out.print("|");
      }
      
      System.out.println();
      
      
      for(int i = 1; i<= 6; i++){
         for (int j = 1; j<= 9; j++){
            System.out.print(j);
         }
         System.out.print(0);
      }
      System.out.println();
   }
}