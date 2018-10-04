import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
		int atk = 0;
		Scanner in = new Scanner(System.in);
		String H = in.nextLine();
		String I = in.nextLine();
		int L = in.nextInt();
		if(H.equals("Mario")) {
			if(I.equals("BoomerangFlower")) {
				atk = 32*4;
			}else if(I.equals("FireFlower")) {
				atk = 73*4;
			}else if(I.equals("IceFlower")){
				atk = 50*4;
			}
		}else if(H.equals("Luigi")) {
			if(I.equals("BoomerangFlower")) {
				atk = 28*4;
			}else if(I.equals("FireFlower")) {
				atk = 70*4;
			}else if(I.equals("IceFlower")){
				atk = 45*4;
			}
		}
		if(L <= atk) {
			System.out.print(H + " conseguiu derrotar o Bowser e salvar a princesa Peach.");
		}else if(L > atk){
			System.out.print("O Bowser conseguiu escapar.");
		}
		
	}
}