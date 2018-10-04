import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);
		int pessoas = in.nextInt();
		int[] corda = new int[pessoas];
		int maiorPC = 0;
		int pcDaVez = 0;
		int posInicio = 0;
		int contInicio = 0;
		int contFim = 0;
		int limite = corda.length;
		int inimigos = 1;
		//ler os numeros e coloc�-los no array
		for(int x = 0; x < corda.length; x++) {
			corda[x] = in.nextInt();
		}
		//la�o para diminuir o limite
		for(int x = 0; x <= corda.length; x++) {
			//la�o para definir a posInicio
			for(int y = 0; y <= corda.length; y++) {
				//la�o para somar os valores
				for(int z = posInicio; z < limite; z++) {
					pcDaVez = pcDaVez + corda[z];
					//System.out.printf("%d %d\n", pcDaVez, corda[z]);
					if(pcDaVez < 0) {
						//contInicio = z;
					}
					if(pcDaVez >= maiorPC) {
						maiorPC = pcDaVez;
						contInicio = y;
						contFim = z;
					}
				}
				//zerar o pcDaVez para n�o bugar no pr�ximo la�o
				pcDaVez = 0;
				posInicio = posInicio + 1;
			}
			limite = limite - 1;
		}
		//la�o para testar se s�o todos inimigos(caso sejam, a vari�vel INIMIGOS recebe o valor de 0, e n�o vai ativar a condi��o
		for(int x = 0; x < corda.length; x++) {
			if(corda[x] > 0) {
				inimigos = 0;
			}
		}
		if(inimigos == 1) {
			System.out.println("E uma armadilha");
		}
		else if(inimigos != 1 && contInicio+1 == contFim+1) {
			System.out.printf("Naruto deve libertar somente a posicao %d\n", contFim+1);
		}
		else {
			System.out.printf("Naruto deve libertar da posicao %d ate a posicao %d", contInicio+1, (contFim+1));
		}
  }
}