import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		String direita = in.nextLine().toLowerCase();
		String meio = in.nextLine().toLowerCase();
		String esquerda = in.nextLine().toLowerCase();
		String C = "Vou em frente";
		if(direita.startsWith("f") && direita.endsWith("r")) {
			C = "Direita";
		}else if(esquerda.startsWith("f") && esquerda.endsWith("r")) {
			C = "Esquerda";
		}else if(meio.startsWith("f") && meio.endsWith("r")) {
			C = "Meio";
		}
		System.out.print(C);

    
  }
}