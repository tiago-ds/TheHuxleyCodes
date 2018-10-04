import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x, y, z, a = 0, b = 0, c = 0;
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if(x != y && x != z && y != z){
            if(x > y && x > z){
                if(y > z){
                    a = x;
                    b = y;
                    c = z;
                }else{
                    a = x;
                    b = z;
                    c = y;
                }
            }else if(y > x && y > z){
                if(x > z){
                    a = y;
                    b = x;
                    c = z;
                }else{
                    a = y;
                    b = z;
                    c = x;
                }
            }else if(z > x && z > y){
                if(x > y){
                    a = z;
                    b = x;
                    c = y;
                }else{
                    a = z;
                    b = y;
                    c = x;
                }
            }
        }else{
            if(x == y || x == z){
                if(x == y && x > z){
                    a = x;
                    b = y;
                    c = z;
                }else if(x == z && x > y){
                    a = x;
                    b = z;
                    c = y;
                }else if(x == y && x < z){
                    a = z;
                    b = x;
                    c = y;
                }else{
                    a = y;
                    b = x;
                    c = z;
                }
            }if(y == z){
                if(y > x){
                    a = y;
                    b = z;
                    c = x;
                }else{
                    a = x;
                    b = y;
                    c = z;
                }
            }
        }
        System.out.printf("%d %d %d\n", a, b, c);
        in.close();
    
  }
}