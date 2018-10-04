import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int ryosNaruto = in.nextInt();
		int ryosTotal = 0;
		int dias = in.nextInt();
		int[] days = new int[dias];
		for(int x = 0; x < days.length; x++) {
			int tigelas = in.nextInt();
			if(tigelas == 0) {
				days[x] = 0;
			}
			else if(tigelas == 1) {
				days[x] = 10;
			}
			else if(tigelas >= 2 && tigelas <= 10) {
				days[x] = 9*(tigelas);
			}
			else if(tigelas > 10) {
				days[x] = 8*(tigelas);
			}
		}
		for(int x = 0; x < days.length; x++) {
		    ryosTotal = ryosTotal + days[x];
		}
		if(ryosTotal == 0) {
			System.out.println("Naruto nao apareceu para comer");
		}
		else {
			if(ryosTotal <= ryosNaruto) {
				System.out.println("Naruto conseguiu pagar a sua conta!");
			}
			else if(ryosTotal > ryosNaruto) {
				System.out.println("Naruto, faltam " + Math.abs(ryosNaruto - ryosTotal) + " ryos!");
			}
		}
		in.close();
  }
}