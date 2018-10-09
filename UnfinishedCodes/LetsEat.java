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
		System.out.println(servirPessoa(quantidades, nomesAmigos, quantidades[amigos - 1], amigos - 1));
	}
	public static String servirPessoa(int[] qtd, String[] nomes, int quantidadeComida, int posicaoArray) {
		//é a última pessoa é é - de 400
		if(posicaoArray == 0 && qtd[posicaoArray] < 400) {
			return (nomes[posicaoArray] + " foi servido(a).\n");
		}
		//é a ultima pessoa e é + de 400
		else if(posicaoArray == 0 && qtd[posicaoArray] > 400) {
			return (nomes[posicaoArray] + " foi servido(a).\n" + "Fica tranquilo(a) " + nomes[posicaoArray - 1] + ", pode se servir novamente!" + servirPessoa(qtd, nomes, qtd[posicaoArray - 400], posicaoArray));
		}
		//não é a ultima pessoa e é - de 400
		else if(posicaoArray != 0 && qtd[posicaoArray] < 400) {
			return (nomes[posicaoArray] + " foi servido(a).\n" + servirPessoa(qtd, nomes, qtd[posicaoArray - 1], posicaoArray - 1));
		}
		//não é a ultima pessoa e é + de 400
		else {
			return (nomes[posicaoArray] + " foi servido(a).\n") +  "Fica tranquilo(a) " + nomes[posicaoArray - 1] + ", pode se servir novamente!" + servirPessoa(qtd, nomes, (qtd[posicaoArray - 1] - 400), posicaoArray - 1);
		}
	}
}
