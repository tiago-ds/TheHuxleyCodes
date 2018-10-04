import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        int d,c, t, diasM;
		Scanner in = new Scanner(System.in);
		d = in.nextInt();
		c = in.nextInt();
		diasM = d*108000;
		t = diasM/c; 
		System.out.print(t);
    
  }
}