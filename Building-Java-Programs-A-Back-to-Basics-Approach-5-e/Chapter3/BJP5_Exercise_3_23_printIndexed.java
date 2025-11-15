public class BJP5_Exercise_3_23_printIndexed{

   public static void main(String[] args){
   
      printIndexed("PETRU");
   }
   public static void printIndexed(String word){
         for(int i = 0; i < word.length(); i++){
         System.out.print(word.charAt(i) + "" + ((word.length()-1)-i));
      }
   }
}