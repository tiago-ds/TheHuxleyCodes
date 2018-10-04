import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int packs, sobra, qtd, vilas;
		Scanner in = new Scanner(System.in);
		packs = in.nextInt();
		sobra = packs%3;
		qtd = packs - sobra;
		vilas = qtd/3;
		System.out.println(vilas);
		System.out.print(sobra);
  }
}