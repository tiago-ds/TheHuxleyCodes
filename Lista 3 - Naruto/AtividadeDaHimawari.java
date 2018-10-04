import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int tamanho = in.nextInt();
		
		int total = 0; 
		int auxArray = 0;
		int Break = 0;
		int nLoops = 0;
		int podeoun = 0;
		if(tamanho == 0) {
			System.out.println("Esse numero deve estar errado...");
		}
		else if(tamanho < 0) {
			System.out.printf("0 \n 0");
		}
		else {
			int[] valores = new int[tamanho];
			for(int x = 0; x < valores.length; x++) {
				valores[x] = in.nextInt();
				if(valores[x] == 0) {
					podeoun = 1;
				}
				
			}
			int valorSoma = in.nextInt();
			if(valorSoma == 0 && podeoun == 0) {
				System.out.println("Esse numero deve estar errado...");
			}else {
				while(total != valorSoma) {
					if(total + valores[auxArray] > 0 &&  total + valores[auxArray] > valorSoma || total + valores[auxArray] < 0 && total + valores[auxArray] < valorSoma) {
						System.out.println("Esse numero deve estar errado...");
						Break = 1;
						break;
					}
					else {
						total = total + valores[auxArray];
						if(total != valorSoma) {
							auxArray++;
							if(auxArray == valores.length) {
								auxArray = 0;
								nLoops = nLoops + 1;
							}
						}
						else {
							break;
						}		
					}		
				}
				if(Break == 0) {
					System.out.print(auxArray + " ");
					System.out.println(nLoops);
				}
			}
			
		}
  }
}