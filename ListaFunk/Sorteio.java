import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int sorteado = 15412;
        int contagem = in.nextInt();
        for(int i = 0; i != contagem; i++){
            int num = in.nextInt();
            if(num == i+1){
                sorteado = num;
            }
        }
        System.out.println("o ingresso de numero " + sorteado + 
                " foi sorteado");
    }
}
