public class TwoRectangles{
    public static final int WIDTH = 6;
    public static final int HEIGHT = 8;
    public static void main(String[] args){
        char symbolStar = '*';
        drawRectangle(WIDTH, HEIGHT, symbolStar);
        
    }
    
    public static void drawRectangle(int width, int height, char symbol){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++){
                System.out.print(' ');
            }
            
            for(int j = 1; j <= width; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
}