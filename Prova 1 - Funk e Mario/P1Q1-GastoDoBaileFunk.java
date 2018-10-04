import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int dinheiro = in.nextInt();
		int custototal = 0;
		for(int x = 0; x<6; x++) {
			int custo = in.nextInt();
			String produto = in.nextLine();
			custototal = custototal + custo;
		}
		if(custototal <= dinheiro) {
			System.out.println("Mario gastara um total de R$ "+ (custototal) +".");
		}else if(custototal > dinheiro) {
			int faltam = Math.abs(dinheiro - custototal);
			System.out.println("Infelizmente nao sera possivel comprar tudo, faltam R$ "+ faltam +".");
		}
  }
}