import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		int a, l , p , h, m;
		a = in.nextInt();
		l = in.nextInt();
		p = in.nextInt();
		h = in.nextInt();
		m = (a + l + (Math.abs(a-l))) / 2;
		m = (m + p+ (Math.abs(m-p))) / 2;
		m = m*h;		
		System.out.print(m);
  }
}