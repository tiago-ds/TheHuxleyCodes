import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cache = in.nextDouble();
        double dinheirotot = 0;
        String curso = "";
        while(in.hasNext()){
            curso = in.nextLine();
            if(curso.contains("CC ")){
                dinheirotot = dinheirotot + 5;
            }else if(curso.contains("EC ")){
                dinheirotot = dinheirotot + 10;
            }else{
                dinheirotot = dinheirotot + 15; 
            }
        }
        if(dinheirotot >= cache){
            System.out.println("Cebruthius!");
        }else{
            System.out.println("Escamou!");
        }
    }
}