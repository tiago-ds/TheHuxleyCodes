package nivel4;

import java.util.Scanner;

public class LetsEat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amigos = in.nextInt();
		String[] nomesAmigos = new String[amigos];
		int[] quantidades = new int[amigos];
		for(int x = 0; x < amigos; x++) {
			nomesAmigos[x] = in.next();
			quantidades[x] = in.nextInt();
		}
		System.out.println(servirPessoa(quantidades, nomesAmigos, amigos - 1, quantidades[amigos - 1]));
	}
	public static String servirPessoa(int[] quantidades, String[] nomes, int posicaoArray, int quantidadeNecessaria) {
		//última pessoa, e vai na fila só uma vez;
		if(posicaoArray == 0 && quantidades[0] <= 400) {
			return nomes[0] + " foi servido(a).\n";
		}
		//última pessoa, mas vai na fila mais de uma vez
		else if(posicaoArray == 0 && quantidades[0] > 400) {
			return nomes[0] + " foi servido(a).\n" + "Fica tranquilo(a), " + nomes[0] + " pode se servir novamente!" + servirPessoa(quantidades, nomes, posicaoArray, quantidades[posicaoArray] - 400);
		}
		//não é a última pessoa, e vai na fila só uma vez;
		else if(posicaoArray != 0 && quantidades[posicaoArray] <= 400) {
			return nomes[posicaoArray] + " foi servido(a).\n" + servirPessoa(quantidades, nomes, posicaoArray - 1, quantidades[posicaoArray - 1]);
		}
		//não é a última pessoa, mas vai na fila mais de uma vez
		else if(posicaoArray != 0 && quantidades[posicaoArray] > 400) {
			return nomes[posicaoArray] + " foi servido(a).\n" + "Fica tranquilo(a), " + nomes[posicaoArray] + " pode se servir novamente!\n" + servirPessoa(quantidades, nomes, posicaoArray - 1, quantidades[posicaoArray] - 400);
		}
		else {
			return "";
		}
	}
}
