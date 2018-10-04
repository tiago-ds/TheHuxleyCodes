import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		//percursos
		int percursoM = 0, percursoY = 0, percursoT = 0;
		String percursoMA = "", percursoYO = "", percursoTO = "";
		//Vencedor
		String vencedor = "";
		//Mario
		String C1M = in.next();
		int d1M = in.nextInt();
		String C2M = in.next();
		int d2M = in.nextInt();
		String C3M = in.next();
		int d3M = in.nextInt();
		String C4M = in.next();
		int d4M = in.nextInt();
		//Yoshi
		String C1Y = in.next();
		int d1Y = in.nextInt();
		String C2Y = in.next();
		int d2Y = in.nextInt();
		String C3Y = in.next();
		int d3Y = in.nextInt();
		String C4Y = in.next();
		int d4Y = in.nextInt();
		//Toad
		String C1T = in.next();
		int d1T = in.nextInt();
		String C2T = in.next();
		int d2T = in.nextInt();
		String C3T = in.next();
		int d3T = in.nextInt();
		String C4T = in.next();
		int d4T = in.nextInt();
		//Mario
		percursoMA = C1M + C2M + C3M + C4M;
		if(percursoMA.equals("EsquerdaEsquerdaEsquerdaEsquerda") || percursoMA.equalsIgnoreCase("direitaesquerdaesquerdaesquerda") || percursoMA.equalsIgnoreCase("esquerdaesquerdaesquerdadireita")) {
			System.out.println("Mario caiu em um buraco negro.");
			percursoM = 1520125000;
		}else {
			percursoM = d1M + d2M + d3M + d4M;
		}
		//Yoshi
		percursoYO = C1Y + C2Y + C3Y + C4Y;
		if(percursoYO.equalsIgnoreCase("EsquerdaEsquerdaEsquerdaEsquerda") || percursoYO.equalsIgnoreCase("direitaesquerdaesquerdaesquerda") || percursoYO.equalsIgnoreCase("esquerdaesquerdaesquerdadireita")) {
			System.out.println("Yoshi caiu em um buraco negro.");
			percursoY = 151251225;
		}else {
			percursoY = d1Y + d2Y + d3Y + d4Y;
		}
		//Toad
		percursoTO = C1T + C2T + C3T + C4T;
		if(percursoTO.equalsIgnoreCase("EsquerdaEsquerdaEsquerdaEsquerda") || percursoTO.equalsIgnoreCase("direitaesquerdaesquerdaesquerda") || percursoTO.equalsIgnoreCase("esquerdaesquerdaesquerdadireita")) {
			System.out.println("Toad caiu em um buraco negro.");
			percursoT = 124151521;
		}else {
			percursoT = d1T + d2T + d3T + d4T;
		}
		//Vencedor
		if(percursoM < percursoY && percursoM < percursoT) {
			vencedor = "Mario venceu a corrida!";
		}else if(percursoY < percursoM && percursoY < percursoT) {
			vencedor = "Yoshi venceu a corrida!";
		}else if(percursoT < percursoM && percursoT < percursoY){
			vencedor = "Toad venceu a corrida!";
		}else {
			vencedor = "Mario venceu a corrida!";
		}
		System.out.print(vencedor);
  }
}