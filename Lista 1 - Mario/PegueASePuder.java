import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int impulso, distancia;
        double altura, peso;
        String yoshi;
        double h;
        impulso = in.nextInt();
        altura = in.nextDouble();
        distancia = in.nextInt();
        peso = in.nextDouble();
        String y = in.nextLine();
        y = in.nextLine();
        if(y.equals("Sim")){
            h = Math.pow(((impulso+5)),3)/(Math.sqrt(altura)+(distancia/2) + ((peso+50)/3));
        }else{
            h = Math.pow(((impulso)),3)/(Math.sqrt(altura)+(distancia/2) + ((peso)/3));
        }
        if(h > 100){
            System.out.println("Voce consegue");
        }else{
            System.out.println("Isso e perda de tempo");
        }
  }
}