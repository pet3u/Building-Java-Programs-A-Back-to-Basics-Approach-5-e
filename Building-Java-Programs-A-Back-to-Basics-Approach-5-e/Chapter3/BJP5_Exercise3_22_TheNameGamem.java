public class TheNameGame{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = input.nextLine();
        
        song(userName);
    }
    
    public static void song(String name){
        Scanner newLine = new Scanner(name);
        String firstName = newLine.next();
        String lastName = newLine.next();
        
        verse(firstName);
        System.out.println();
        verse(lastName);
        
    }
    
    public static void verse(String name){
        System.out.println(name + " " + name + ", bo-B" + name.substring(1));
        System.out.println("Banana-fana fo-F" + name.substring(1));
        System.out.println("Fee-fi-mo-M" + name.substring(1));
        System.out.println(name.toUpperCase()+"!");
    }
    
    
}