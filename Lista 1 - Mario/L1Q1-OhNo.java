import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		String item = "oi";
		if(numero == 1) {
			item = "Life Mushroom";
		}
		else if(numero == 2) {
			item = "Fire Flower";
		}
		else if(numero == 3) {	
			item = "Boost Star";
		}
		else if(numero == 4) {
			item = "Mega Mushroom";
		}else {
			System.out.print("Programa n�o amig�vel");
		}
		System.out.print(item);
  }
}