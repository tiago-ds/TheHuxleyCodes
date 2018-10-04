import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		String expressao = in.nextLine().replace(" ", "");
		char charDaVezInit = ' ';
		char charDaVezFin = ' ';
		String saida = "S/N";
			for(int x = 0, y = (expressao.length() - 1); x != y; x++, y--) {
				char charAtX = expressao.charAt(x);
				char charAtY = expressao.charAt(y);
				if(x - 1 == y) {
					break;
				}
				if(charAtX >= 'A' && charAtX <= 'Z') {
					int ascii = charAtX;
					charAtX = (char) (expressao.charAt(x) + 32);
				}
				if(charAtY >= 'A' && charAtY <= 'Z') {
					int ascii = charAtX;
					charAtY = (char) (expressao.charAt(y) + 32);
				}
				if(charAtX == charAtY) {
					saida = "SIM";
				}
				else if(charAtX != charAtY) {
					saida = "NAO";
				}
			
		}
		System.out.println(saida);
  }
}