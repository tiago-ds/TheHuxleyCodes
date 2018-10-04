import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int l = in.nextInt();
        in.nextLine();
        String tipo = in.nextLine();
        int x = in.nextInt();
        int y = in.nextInt();
        //para saque
        if(tipo.equals("Saque")){
            //dentro de quadra
            if(x >= c/2 || x < c/4 || y > l || y < 0){
                System.out.println("A bola foi para fora");  
                }
            //fora de quadra
            else{
                    System.out.println("A bola foi rebatida");
                }
            }    
        //para rebatida    
        else{
            //dentro de quadra
            if(x >= c/2 || x < 0 || y > l || y < 0){
                System.out.println("A bola foi para fora");
            }
            //fora de quadra
            else{
                System.out.println("A bola foi rebatida");
            }
            
        }
  }
}