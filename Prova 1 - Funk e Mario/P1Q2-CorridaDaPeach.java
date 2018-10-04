import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int nCompetidores = in.nextInt();
		int distancia = in.nextInt();
		int mTempoAtual = 0;
		String competMTempoAtual = "";
		for (int x = 0; x < nCompetidores; x++) {
			String nome = in.next();
			int tempolivre = (in.nextInt()*60);
			int intervaloObst = in.nextInt();
			int tempoObst = in.nextInt();
			int TEMPO = (distancia / intervaloObst)*(tempoObst) + tempolivre;
			if(x == 0) {
				mTempoAtual = TEMPO;
				competMTempoAtual = nome;
			}else {
				if(TEMPO < mTempoAtual) {
					mTempoAtual = TEMPO;
					competMTempoAtual = nome;
				}
			}
		}
		System.out.printf("%s venceu a corrida em %d segundos!", competMTempoAtual, mTempoAtual);
  }
}