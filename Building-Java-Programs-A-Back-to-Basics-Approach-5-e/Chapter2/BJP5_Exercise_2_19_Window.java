public class Window{
    public final static int ratio = 5;
    
    public static void main(String[] args){
        window(ratio);
    }
    public static void window(int ratio){
        
        printBrim(ratio);
        System.out.println();
        
        for(int i = 0; i < 2; i++){
           for(int j = 0; j < ratio; j++){
               printPipe(ratio);
               System.out.println();
           }
           printBrim(ratio);
           System.out.println();
        }
    }
    
    public static void printBrim(int ratio) {
         System.out.print("+");
         
         for(int i = 0; i < 2; i++){
            for(int j = 0; j < ratio; j++){
               System.out.print("=");
            }
            System.out.print("+");
        }
        
    }
    
    public static void printPipe(int ratio) {
         System.out.print("|");
         for(int i = 0; i < 2; i++){
            for(int j = 0; j < ratio; j++){
               System.out.print(" ");
            }
          
          System.out.print("|");
        }
    }
}


















