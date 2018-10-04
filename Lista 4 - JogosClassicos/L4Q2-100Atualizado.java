import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		String[][] jogadoresDef = new String[3][3];
		String[][] jogadoresAtk = new String[3][3];
		//la�os para ler o nome dos jogadores;
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				jogadoresDef[x][y] = in.next();
			}
		}
		//la�o para atribuicao na outra matriz
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				jogadoresAtk[x][y] = jogadoresDef[y][x];
			}
		}
		//impress�o da matriz
		System.out.printf("%s %s %s\n", jogadoresAtk[0][0], jogadoresAtk[0][1], jogadoresAtk[0][2]);
		System.out.printf("%s %s %s\n", jogadoresAtk[1][0], jogadoresAtk[1][1], jogadoresAtk[1][2]);
		System.out.printf("%s %s %s", jogadoresAtk[2][0], jogadoresAtk[2][1], jogadoresAtk[2][2]);
  }
}