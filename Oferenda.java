import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		String p;
		if(d<=10) {
			p = "Arthur";
		}else if(d<=30) {
			p = "Luiz";
		}else if(d<=100) {
			p = "Pedro";
		}else {
			p = "Nenhum";
		}
		System.out.print(p);
  }
}