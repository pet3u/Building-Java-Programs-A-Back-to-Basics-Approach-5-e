public class BJP5_Exercise_3_17_padString{
   
   public static void main(String[] args){
      System.out.println(padString("Hello", 10));
   }
   
   public static String padString(String word, int numPad){
      char charPad = ' ';
      String padWord = "";
   
      for(int i = 0; i < numPad - word.length(); i++){
         padWord = charPad + padWord;
      }
      
      return padWord + word;
   }
   
}