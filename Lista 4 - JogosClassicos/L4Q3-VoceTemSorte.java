import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
		int tamanhoM = in.nextInt();
		int jogadas = in.nextInt();
		int coordX = 0;
		int coordY = 0;
		//vari?vel que facilita uma condi??o de impress?o l? embaixo
		int Break = 0;
		int[][] campo = new int[tamanhoM][tamanhoM];
		//atribui??o de valores da matriz
		for(int x = 0; x < tamanhoM; x++) {
			for(int y = 0; y < tamanhoM; y++) {
				campo[x][y] = in.nextInt();
			}
		}
		//ler coord x e y
		for(int x = 0; x < jogadas; x++) {
			coordX = in.nextInt();
			coordY = in.nextInt();
			int valoresDireita = 0;
			int valoresAbaixo = 0;
			int valoresDiagDireita = 0;
			//teste para n?o ser uma coordenada j? usada
			if(campo[coordX][coordY] == -1) {
				System.out.println("Essa casa ja foi selecionada.");
				continue;
			}
			//teste para somas do valor ? direita
			for(int direita = 0; direita < (tamanhoM - coordX); direita++) {
				if(campo[direita + coordX][coordY] != -1) {
					valoresDireita = valoresDireita + campo[direita + coordX][coordY];
				}
			}
			//teste para somas do valor abaixo
			for(int abaixo = 0; abaixo < (tamanhoM - coordY); abaixo++) {
				if(campo[coordX][abaixo+coordY] != -1) {
					valoresAbaixo = valoresAbaixo + campo[coordX][abaixo+coordY];	
				}
			}
			//teste para somas na diagonal Inferior Direita
			for(int diagX = 0, diagY = 0; diagX < (tamanhoM - coordX) && diagY < (tamanhoM - coordY); diagX++, diagY++) {
				if(campo[diagX + coordX][diagY + coordY] != -1) {
					valoresDiagDireita = valoresDiagDireita + campo[diagX + coordX][diagY + coordY];
				}
			}
			//setar as coordenadas pra uma casa j? selecionada:
			campo[coordX][coordY] = -1;
			//condi??o dos tr?s serem iguais
			if(valoresDireita == valoresAbaixo && valoresDireita == valoresDiagDireita) {
				System.out.println("Bomba encontrada.");
				System.out.println("Voce perdeu.");
				Break = 1;
				break;
			}
			//se algum for diferente, j? n?o ? bomba
			else {
				System.out.printf("Boa jogada, a casa (%d,%d) nao tinha bomba.\n", coordX, coordY);
			}
		}
		if(Break == 0) {
			System.out.println("Voce e uma pessoa de sorte.");
		}
		in.close();
  }
}