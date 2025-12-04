public class NumbersOutput{
    
    public static final int numRange = 10;
    public static final int repetition = 6;
    
    public static void main(String[] args){
        
        for (int j = 1; j <= repetition; j++){
            
            for (int i = 1; i < numRange; i++){
                System.out.print(" ");
            } 
            System.out.print("|");
        }
        System.out.println();
        
        for (int j = 1; j <= repetition; j++){
            
            for (int i = 1; i < numRange; i++){
                System.out.print(i);
            } 
            System.out.print("0");
        }
    }

}