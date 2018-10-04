import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		//a = verde, b = vermelho, c = roxo, d = amarelo;
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		double custoa,custob,custoc,custod;
		String cor = "N/A";
		custoa = 80/a;
		custob = 100/b; 
		custoc = 120/c;
		custod = 80/d;
		double aaaa = 0;
		if(custoa>=custob && custoa>=custoc && custoa>=custod) {
			cor = "Verde";
			aaaa = custoa;
		}else if(custob>=custoa && custob>=custoc && custob>=custod) {
			cor = "Vermelho";
			aaaa = custob;
		}else if(custoc>=custoa && custoc>=custob && custoc>=custod) {
			cor = "Roxo";
			aaaa = custoc;
		}else if(custod>=custoa && custod>=custob && custod>=custoc) {
			cor = "Amarelo";
			aaaa = custod;
		}if(m<a && m<b & m<c && m<d) {
			cor =  "Acho que vou a pe :(";
		}
		System.out.println(cor);
  }
}