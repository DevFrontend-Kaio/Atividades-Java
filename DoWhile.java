public class DoWhile{
    
    public static void main(String[] args){
        
        System.out.println("Olá Dev!\n");
        
        var x = 1;
        do {
            System.out.println("Contador: " + x);
            x++;
            if(x == 11){
                break;
            }
        } while (true);
        
    }
    
}