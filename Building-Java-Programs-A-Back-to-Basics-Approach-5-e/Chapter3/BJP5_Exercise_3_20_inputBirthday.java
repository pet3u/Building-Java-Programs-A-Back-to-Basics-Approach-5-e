import java.util.*;

public class BJP5_Exercise_3_20_inputBirthday{
   
   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
   
      inputBirthday(input);
   }
   
   public static void inputBirthday(Scanner myInput){
      System.out.print("On what day of the month were you born? ");
      String day = myInput.next();
      
      System.out.print("What is the name of the month in which you were born? ");
      String month = myInput.next();
      
      System.out.print("During what year were you born? ");
      String year = myInput.next();
      
      System.out.println("You were born on " + month + " " + day + ", " + year + ". You're mighty old!");
   }
}