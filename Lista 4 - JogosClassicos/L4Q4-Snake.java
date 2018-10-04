import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int tamanhoMapa = in.nextInt();
		char[][] mapa = new char[tamanhoMapa][tamanhoMapa];
		int nMovimentos = in.nextInt();
		int posCX = 0;
		int posCY = 0;
		//no final do programa, se essa vari�vel for igual a 1, ser� impresso "game over";
		int gameOver = 0;
		//leitura do mapa;
		for(int y = 0; y < tamanhoMapa; y++) {
			for(int x = 0; x < tamanhoMapa; x++) {
				char obj = in.next().charAt(0);
				mapa[x][y] = obj;
				if(obj == '#') {
					posCX = x;
					posCY = y;
				}
			}
		}
		//cada movimento � analisado num la�o do for
		for(int x = 0; x < nMovimentos; x++) {
			char movDaVez = in.next().charAt(0);
			//possibilidades de movimentos: Direita, Esquerda, Cima, Baixo.
			if(movDaVez == 'D') {
				//caso v� para a direita, esteja na ponta, e o espa�o do outro lado seja uma posi��o livre:
				if(posCX == tamanhoMapa - 1 && mapa[0][posCY] == '*') {
					mapa[0][posCY] = '#';
					mapa[posCX][posCY] = '*';
					posCX = 0;
				}
				//caso v� para a direita, esteja na ponta, e o espa�o do outro lado tenha um obst�culo:
				else if(posCX == tamanhoMapa - 1 && mapa[0][posCY] == '@') {
					gameOver = 1;
					break;
				}
				//caso v� para a direita, n�o esteja na ponta, mas o espa�o que pretendia ir tenha um obst�culo:
				else if(posCX < tamanhoMapa - 1 && mapa[posCX + 1][posCY] == '@') {
					gameOver = 1;
					break;
				}
				//caso v� para a direita, n�o esteja na ponta, e o espa�o que pretendia ir n�o tenha um obst�culo:
				else if(posCX < tamanhoMapa - 1 && mapa[posCX + 1][posCY] == '*') {
					mapa[posCX + 1][posCY] = '#';
					mapa[posCX][posCY] = '*';
					posCX = posCX + 1;
				}
			}
			// para os outros movimentos � a mesma ideia
			else if(movDaVez == 'E') {
				if(posCX == 0 && mapa[tamanhoMapa - 1][posCY] == '*') {
					mapa[tamanhoMapa - 1][posCY] = '#';
					mapa[posCX][posCY] = '*';
					posCX = tamanhoMapa - 1;
				}
				else if(posCX == 0 && mapa[tamanhoMapa - 1][posCY] == '@') {
					gameOver = 1;
					break;
				}
				//condi��es para ela n�o estar na ponta:
				else if(mapa[posCX - 1][posCY] == '@') {
					gameOver = 1;
					break;
				}
				else if(mapa[posCX - 1][posCY] == '*') {
					mapa[posCX - 1][posCY] = '#';
					mapa[posCX][posCY] = '*';
					posCX = posCX - 1;
				}
			}
			else if(movDaVez == 'C') {
				if(posCY == 0 && mapa[posCX][tamanhoMapa - 1] == '*') {
					mapa[posCX][tamanhoMapa - 1] = '#';
					mapa[posCX][posCY] = '*';
					posCY = tamanhoMapa - 1;
				}
				else if(posCY == 0 && mapa[posCX][tamanhoMapa - 1] == '@') {
					gameOver = 1;
					break;
				}
				else if(mapa[posCX][posCY - 1] == '@') {
					gameOver = 1;
					break;
				}
				else if(mapa[posCX][posCY - 1] == '*') {
					mapa[posCX][posCY - 1] = '#';
					mapa[posCX][posCY] = '*';
					posCY = posCY - 1;
				}
			}
			else if(movDaVez == 'B') {
				if(posCY == tamanhoMapa - 1 && mapa[posCX][0] == '*') {
					mapa[posCX][0] = '#';
					mapa[posCX][posCY] = '*';
					posCY = 0;
				}
				else if(posCY == tamanhoMapa - 1 && mapa[posCX][0] == '@') {
					gameOver = 1;
					break;
				}
				else if(mapa[posCX][posCY + 1] == '@') {
					gameOver = 1;
					break;
				}
				else if(mapa[posCX][posCY + 1] == '*') {
					mapa[posCX][posCY + 1] = '#';
					mapa[posCX][posCY] = '*';
					posCY = posCY + 1;
				}
			}
		}
		for(int a = 0; a < tamanhoMapa; a++) {
			for(int b = 0; b < tamanhoMapa; b++) {
				System.out.print(mapa[b][a]);
				if(b != tamanhoMapa - 1) {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		if(gameOver == 1) {
			System.out.println("Game over.");
		}
  }
}