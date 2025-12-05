public class TwoRockets{
    public static void main(String[] args){
        top();
        box();
        boxU();
        box();
        top();
    
    }
    
    public static void top(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
        
    
    }
    
    public static void box(){
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    
    public static void boxU(){
        //System.out.println("+------+ +------+");
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        //System.out.println("+------+ +------+");
    }
}