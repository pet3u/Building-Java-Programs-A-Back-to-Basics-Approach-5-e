public class Lanterns{
   public static void main(String[] args){
      doubleLine();
      System.out.println("");
      pentagon();
      System.out.println("");
      extragon();
   }
   
   public static void doubleLine(){
      System.out.println("    *****");
      System.out.println("  *********  ");
      System.out.println("*************");
   }

   public static void pentagon(){
      doubleLine();
      System.out.println("* | | | | | *");
      System.out.println("*************");
      doubleLine();
   }

   public static void extragon(){
      doubleLine();
      System.out.println("    *****");
      System.out.println("* | | | | | *");
      System.out.println("* | | | | | *");
      System.out.println("    *****");
      System.out.println("    *****");
   }
}