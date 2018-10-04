import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		int tamanhoMatriz = in.nextInt();
		double vRyu = in.nextDouble();
		double vKen = in.nextDouble();
		int[][] mRyu = new int[tamanhoMatriz][tamanhoMatriz];
		int[][] mKen = new int[tamanhoMatriz][tamanhoMatriz];
		int diagPRyu = 0;
		int diagPKen = 0;
		int diagSRyu = 0;
		int diagSKen = 0;
		//ler valores do Ryu
		for(int x = 0; x < tamanhoMatriz; x++) {
			for(int y = 0; y < tamanhoMatriz; y++) {
				mRyu[x][y] = in.nextInt();
			}
		}
		//ler valores do Ken
		for(int x = 0; x < tamanhoMatriz; x++) {
			for(int y = 0; y < tamanhoMatriz; y++) {
				mKen[x][y] = in.nextInt();
			}
		}
		//calcular a diagonal prim�ria (ryu)
		for(int x = 0, y = 0; x < tamanhoMatriz; x++, y++) {
			diagPRyu = diagPRyu + mRyu[x][y];
		}
		//calcular a diagonal secund�ria (ryu)
		for(int x = tamanhoMatriz - 1, y = 0; y < tamanhoMatriz; x--, y++) {
			diagSRyu = diagSRyu + mRyu[x][y];
		}
		//calcular a diagonal prim�ria (ken)
		for(int x = 0, y = 0; x < tamanhoMatriz; x++, y++) {
			diagPKen = diagPKen + mKen[x][y];
		}
		//calcular a diagonal secund�ria (ken)
		for(int x = tamanhoMatriz - 1, y = 0; y < tamanhoMatriz; x--, y++) {
			diagSKen = diagSKen + mKen[x][y];
		}
		//ler o numero de turnos
		int turnos = in.nextInt();
		//arrays para armazenar se no turno X o pers atacou ou defendeu
		String[] actRyu = new String[turnos];
		String[] actKen = new String[turnos];
		//leitura e atribui��o nos arrays
		for(int x = 0; x < turnos; x++) {
			actRyu[x] = in.next();
			actKen[x] = in.next();
		}
		for(int round = 0; round < turnos; round++) {
			//caso de A e A
			if(actRyu[round].equals("A") && actKen[round].equals("A")) {
				if(diagPRyu > diagPKen) {
					vKen = vKen - (diagPRyu - diagPKen);
				}
				else if(diagPKen > diagPRyu) {
					vRyu = vRyu - (diagPKen - diagPRyu);
				}
			}
			//caso de A e D
			if(actRyu[round].equals("A") && actKen[round].equals("D")) {
				if(diagPRyu > diagSKen) {
					vKen = vKen - (diagPRyu - diagSKen)/2;
				}
				else if(diagPRyu <= diagSKen) {
					vKen = vKen;
				}
			}
			//caso de D e A
			if(actRyu[round].equals("D") && actKen[round].equals("A")){
				if(diagPKen > diagSRyu) {
					vRyu = vRyu - (diagPKen - diagSRyu)/2;
				}
				else if(diagPKen <= diagSRyu) {
					vRyu = vRyu;
				}
			}
		}
		//impress�o do vencedor
		if(vRyu > vKen) {
			System.out.println("Ryu ganhou a batalha.");
		}
		else if(vKen > vRyu) {
			System.out.println("Ken ganhou a batalha.");
		}
		else {
			System.out.println("Houve empate.");
		}
  }
}