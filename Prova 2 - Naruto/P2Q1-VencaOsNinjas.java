import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int linhas = in.nextInt();
		int colunas = in.nextInt();
		int[][] matriz = new int[linhas][colunas];
		double pontuacao = 0;
		//ler os valores na matriz
		for(int y = 0; y < linhas; y++) {
			for(int x = 0; x < colunas; x++) {
				int valorDaVez = in.nextInt();
				matriz[y][x] = valorDaVez;
			}
		}
		//linhas visitadas
		int nPosicoes = in.nextInt();
		for(int x = 0; x < nPosicoes; x++) {
			int coordX = in.nextInt()-1;
			int coordY = in.nextInt()-1;
			pontuacao = pontuacao + matriz[coordX][coordY];
		}
		int tempo = in.nextInt();
		pontuacao = (pontuacao/tempo);
		System.out.printf("%.2f", pontuacao);
  }
}