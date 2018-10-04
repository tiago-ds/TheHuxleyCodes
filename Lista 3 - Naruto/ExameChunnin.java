import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		String[] participQuartas = new String[8];
		String[] lutadoresQuartas = new String[8];
		String[] ganhadoresQuartas = new String[4];
		String[] ganhadoresSemi = new String[2];
		String ganhadorFinal = " ";
		//ler nome dos participantes
		for(int x = 0; x < 8; x++) {
			participQuartas[x] = in.nextLine();
		}
		//ler o equivalente em codigo dos lutadores
		for(int x = 0; x < 8; x++) {
			int aux = in.nextInt();
			lutadoresQuartas[x] = participQuartas[aux];
		}
		//ler os ganhadores das lutas anteriores e coloca-los nas semifinais
		in.nextLine();
		int auxContQuartas = 0;
		for(int x = 0; x < 4; x++) {
			String ganhador = in.nextLine();
			if(ganhador.equals("A")) {
				ganhadoresQuartas[x] = lutadoresQuartas[auxContQuartas];
			}
			else if(ganhador.equals("B")) {
				ganhadoresQuartas[x] = lutadoresQuartas[(auxContQuartas) + 1];
			}
		auxContQuartas = auxContQuartas + 2;	
		}
		//ler os ganhadores das semifinais e colocalos nas finais
		int auxContSemi = 0;
		for(int x = 0; x < 2; x++) {
			String ganhador = in.nextLine();
			if(ganhador.equals("X")) {
				ganhadoresSemi[x] = ganhadoresQuartas[auxContSemi];			
			}
			else if(ganhador.equals("Y")) {
				ganhadoresSemi[x] = ganhadoresQuartas[auxContSemi+1];
			}
			auxContSemi = auxContSemi + 2;
		}
		//ler o ganhador da final
		String ganhador = in.nextLine();
		if(ganhador.equals("#")) {
			ganhadorFinal = ganhadoresSemi[0]; 
		}
		else if(ganhador.equals("%")) {
			ganhadorFinal = ganhadoresSemi[1];
		}
		System.out.println("Bem vindos ao Exame Chunnin!");
		System.out.println("Quartas de final 1: " + lutadoresQuartas[0] + " x " + lutadoresQuartas[1]);
		System.out.println("Quartas de final 2: " + lutadoresQuartas[2] + " x " + lutadoresQuartas[3]);
		System.out.println("Quartas de final 3: " + lutadoresQuartas[4] + " x " + lutadoresQuartas[5]);
		System.out.println("Quartas de final 4: " + lutadoresQuartas[6] + " x " + lutadoresQuartas[7]);
		System.out.println("Semifinal 1: " + ganhadoresQuartas[0] + " x " + ganhadoresQuartas[1]);
		System.out.println("Semifinal 2: " + ganhadoresQuartas[2] + " x " + ganhadoresQuartas[3]);
		System.out.println("Final: " + ganhadoresSemi[0] + " x " + ganhadoresSemi[1]);
		System.out.println("O grande vencedor e " + ganhadorFinal + "!");
		in.close();
  }
}