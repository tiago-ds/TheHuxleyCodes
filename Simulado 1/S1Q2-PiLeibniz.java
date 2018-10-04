import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int termos = in.nextInt();
		double num = 0;
		double quantd = 0;
		double pi = 0;
		if(termos == 0) {
			num = 0;
		}
		else {
			for(int x = 0; x < termos; x++) {
				if(x == 0) {
					quantd = 1/1;
				}else {
					double valordeX = (x+1)*2;
					quantd = 1/(valordeX-1);
				}	
				if(x % 2 == 0) {
					pi = pi + quantd;
				}
				else if(x % 2 == 1) {
					pi = pi - quantd;
				}
				 
			}
		}
		pi = pi*4;
		
		System.out.printf("%.5f", pi);
  }
}