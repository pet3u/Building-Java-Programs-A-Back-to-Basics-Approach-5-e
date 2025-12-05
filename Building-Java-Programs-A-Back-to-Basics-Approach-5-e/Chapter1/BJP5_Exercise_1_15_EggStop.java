public class EggStop{
    public static void main(String[] args){
        topEgg();
        bottomEgg();
        
        System.out.println();
        
        topEgg();
        bottomEgg();
        System.out.println("+--------+");
        
        System.out.println();
        
        topEgg();
        System.out.println("|  STOP  |");
        bottomEgg();
        System.out.println("+--------+");
        
        
    }
    
    public static void topEgg(){
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    
    }
    
    public static void bottomEgg(){
        System.out.println("\\        /");
        System.out.println(" \\______/");
        
    
    }
}