import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int nTamanhos = in.nextInt();
		//inicializar os arrays de nome e tamanho
		String[] nomes = new String[nTamanhos];
		int[] tamanhos = new int[nTamanhos];
		//atribuir tamanhos a nomes de shurikens
		for(int x = 0; x < nTamanhos; x++) {
			nomes[x] = in.next();
			tamanhos[x] = in.nextInt();
		}
		//bubble sort
		for(int x = 0; x < tamanhos.length; x++) {
			for(int y = 0; y < tamanhos.length - 1; y++) {
				if(tamanhos[y] > tamanhos[y+1]) {
					//para o array de tamanho
					int aux = tamanhos[y+1];
					tamanhos[y+1] = tamanhos[y];
					tamanhos[y] = aux;
					//para o array de nomes;
					String auxS = nomes[y+1];
					nomes[y+1] = nomes[y];
					nomes[y] = auxS;
				}
			}
		}
		//ler e mostrar a posi��o desejada(recebe -1 para poder acessar o valor correto no array)
		int indice = in.nextInt() - 1;
		System.out.println("Naruto devera usar a shuriken " + nomes[indice] + " para esta maquina.");
  }
}