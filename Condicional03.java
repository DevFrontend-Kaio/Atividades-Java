import java.util.Scanner;

public class Condicional01{
    public static void main(String[ ] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();
        scanner.close();
        
        if(nome.equals("Kaio")){
              System.out.println("Nome Coreto!");
        } else {
            System.out.println("Nome Incoreto!");
        }
       
        
    }
}