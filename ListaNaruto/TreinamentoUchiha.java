import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int tamanhoDoAlvo = in.nextInt();
		int kunaisJogadas = in.nextInt();
		char[] alvoSasuke = new char[tamanhoDoAlvo];
		char[] alvoItachi = new char[tamanhoDoAlvo];
		int pontuacaoSasuke = 0;
		int pontuacaoItachi = 0;
		//posi��es do alvo acertadas por sasuke
		for(int x = 0; x < kunaisJogadas; x++) {
			int posAcertada = in.nextInt() - 1;
			//condi��o para o cara ter acertado fora do alvo
			if(posAcertada < 0 || posAcertada > tamanhoDoAlvo - 1) {
				
			}
			//dentro do alvo..
			else {
				alvoSasuke[posAcertada] = 'X';
			}
		}
		//posi��es do alvo acertadas por itaxe
		for(int x = 0; x < kunaisJogadas; x++) {
			int posAcertada = in.nextInt() - 1;
			//condi��o para o cara ter acertado fora do alvo
			if(posAcertada < 0 || posAcertada > tamanhoDoAlvo - 1) {
				
			}
			//dentro do alvo..
			else {
				alvoItachi[posAcertada] = 'X';
			}
		}
		//algoritmo que testa a pontua��o dos alvos do Sasuke
		for(int x = 0; x < tamanhoDoAlvo; x++) {
			if(alvoSasuke[x] == 'X') {
				//Lembrar que se o tamanho do alvo for IMPAR ele tem um "valor" PAR, pois come�a da pos 0;
				//Teste para tamanho IMPAR(antes do meio)
				if((tamanhoDoAlvo % 2 == 1) && (x <= (tamanhoDoAlvo - 1) / 2)) {
					int pontPosX = x + 1;
					pontuacaoSasuke = pontuacaoSasuke + pontPosX;
				}
				//Teste para tamanho IMPAR(depois do meio)
				else if((tamanhoDoAlvo % 2 == 1) && (x > (tamanhoDoAlvo - 1) / 2)) {
					int pontPosX = (tamanhoDoAlvo - x);
					pontuacaoSasuke = pontuacaoSasuke + pontPosX;
				}
				//Teste para tamanho PAR(antes e no primeiro meio)
				else if((tamanhoDoAlvo % 2 == 0) && (x <= ((tamanhoDoAlvo) / 2) - 1)) {
					int pontPosX = (x + 1);
					pontuacaoSasuke = pontuacaoSasuke + pontPosX;
				}
				//Teste para tamanho PAR(no segundo meio)
				else if((tamanhoDoAlvo % 2 == 0) && (x > ((tamanhoDoAlvo) / 2) - 1) && x == (tamanhoDoAlvo / 2)) {
					int pontPosX = x;
					pontuacaoSasuke = pontuacaoSasuke + pontPosX;
				}
				//Teste para tamanho PAR(depois dos meios)
				else if((tamanhoDoAlvo % 2 == 0) && ( x > ((tamanhoDoAlvo) / 2) - 1)){
					int pontPosX = (tamanhoDoAlvo - x);
					pontuacaoSasuke = pontuacaoSasuke + pontPosX;
				}
			}
		}
		//Algoritmo para a pontua��o do ITAXE
		for(int x = 0; x < tamanhoDoAlvo; x++) {
			if(alvoItachi[x] == 'X') {
				//Lembrar que se o tamanho do alvo for IMPAR ele tem um "valor" PAR, pois come�a da pos 0;
				//Teste para tamanho IMPAR(antes do meio)
				if((tamanhoDoAlvo % 2 == 1) && (x <= (tamanhoDoAlvo - 1) / 2)) {
					int pontPosX = x + 1;
					pontuacaoItachi = pontuacaoItachi + pontPosX;
				}
				//Teste para tamanho IMPAR(depois do meio)
				else if((tamanhoDoAlvo % 2 == 1) && (x > (tamanhoDoAlvo - 1) / 2)) {
					int pontPosX = (tamanhoDoAlvo - x);
					pontuacaoItachi = pontuacaoItachi + pontPosX;
				}
				//Teste para tamanho PAR(antes e no primeiro meio)
				else if((tamanhoDoAlvo % 2 == 0) && (x <= ((tamanhoDoAlvo) / 2) - 1)) {
					int pontPosX = (x + 1);
					pontuacaoItachi = pontuacaoItachi + pontPosX;
				}
				//Teste para tamanho PAR(no segundo meio)
				else if((tamanhoDoAlvo % 2 == 0) && (x > ((tamanhoDoAlvo) / 2) - 1) && x == (tamanhoDoAlvo / 2)) {
					int pontPosX = x;
					pontuacaoItachi = pontuacaoItachi + pontPosX;
				}
				//Teste para tamanho PAR(depois dos meios)
				else if((tamanhoDoAlvo % 2 == 0) && ( x > ((tamanhoDoAlvo) / 2) - 1)){
					int pontPosX = (tamanhoDoAlvo - x);
					pontuacaoItachi = pontuacaoItachi + pontPosX;
				}
			}
		}
		//Hora de retornar valores
		System.out.println("Sasuke: " + pontuacaoSasuke);
		System.out.println("Itachi: " + pontuacaoItachi);
		if(pontuacaoSasuke > pontuacaoItachi && pontuacaoItachi > 0) {
			System.out.println("Sasuke Uchiha");
		}
		else if(pontuacaoSasuke == pontuacaoItachi && pontuacaoSasuke != 0){
			System.out.println("O empate nunca existiu, voce esta preso num genjutsu");
		}
		else if(pontuacaoItachi > pontuacaoSasuke && pontuacaoSasuke != 0) {
			System.out.println("Itachi Uchiha");
		}
		else if(pontuacaoItachi > 0 && pontuacaoSasuke == 0) {
			System.out.println("Itachi Uchiha");
			System.out.println("Voce e fraco, lhe falta odio");
		}
		else if(pontuacaoSasuke > 0 && pontuacaoItachi == 0) {
			System.out.println("Sasuke Uchiha");
			System.out.println("Um genjutsu desse nivel nao funciona em mim");
		}
		else if(pontuacaoSasuke == pontuacaoItachi && pontuacaoItachi == 0) {
			System.out.println("Os Uchihas nem sao tao bons mesmo");
		}
  }
}