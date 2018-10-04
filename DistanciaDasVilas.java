import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x,z;
        x = in.nextInt();
        z = in.nextInt();
        double h,k,s;
        h = Math.sqrt(Math.pow((34 - x),2) + Math.pow((220 - z), 2));
        k = Math.sqrt(Math.pow((0 - x), 2) + Math.pow((0 - z), 2));
        s = Math.sqrt(Math.pow((140 - x), 2) + Math.pow((456 - z), 2));
        System.out.printf("Distancia para Hogsmeade: %,.2f\n", h);
        System.out.printf("Distancia para Kakariko:%, .2f\n", k);
        System.out.printf("Distancia para Solitude:%, .2f\n", s);
  }
}