import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		String poxaNaruto = in.nextLine();
		int participantes = in.nextInt();
		String[] ninjaX = new String[participantes];
		int[] chakraX = new int[participantes];
		int[] jutsusX = new int[participantes];
		//arrays para ajudar na ordena??o e impress?o de valores;
		String[] classificados = new String[participantes];
		String[] desclassificados = new String[participantes];
		String[] nomesArrumados = new String[participantes];
		int[] potencialFinal = new int[participantes];
		int[] potencialFinalArrumado = new int[participantes];
		int contClassificados = 0;
		int contDesclassificados = 0;		
		for(int x = 0; x < participantes; x++) {
			if(poxaNaruto.equals("Tudo certo")) {
				ninjaX[x] = in.next();
				chakraX[x] = in.nextInt();
				jutsusX[x] = in.nextInt();
			}
			else if(poxaNaruto.equals("Esse naruto...")) {
				ninjaX[x] = in.next();
				chakraX[x] = in.nextInt();
				jutsusX[participantes - 1 - x] = in.nextInt();
			}
		}
		//atribuir o potencial ao ninja
		for(int x = 0; x < participantes; x++) {
			potencialFinal[x] = chakraX[x] - jutsusX[x];
		}
		//Duplica??o de arrays de inteiros para compara??o
 		for(int x = 0; x < participantes; x++) {
			potencialFinalArrumado[x] = potencialFinal[x];
		}
 		//Duplica??o de arrays de Strings para compara??o
		for(int x = 0; x < participantes; x++) {
			nomesArrumados[x] = ninjaX[x];
		}
		//bubble sort
		for(int x = 0; x < participantes; x++) {
			for(int y = 0; y < participantes - 1; y++) {
				if(potencialFinalArrumado[y] <= potencialFinalArrumado[y+1]) {
					int aux = potencialFinalArrumado[y];
					potencialFinalArrumado[y] = potencialFinalArrumado[y + 1];
					potencialFinalArrumado[y + 1] = aux;
					String auxS = nomesArrumados[y];
					nomesArrumados[y] = nomesArrumados[y + 1];
					nomesArrumados[y + 1] = auxS;
				}
			}
		}
		//contagem de classificados e desclassificados
		for(int x = 0; x < participantes; x++) {
			if(potencialFinalArrumado[x] > 0) {
				contClassificados++;
			}
			else if(potencialFinalArrumado[x] < 0) {
				contDesclassificados++;
			}
		}
		//Fun??es para imprimir os arrays em ordem.
		int auxCont = contClassificados;
		for(int x = 0; x < participantes; x++) {
			
			if(auxCont > 0) {
				System.out.println(nomesArrumados[x] + " esta classificado(a)");
				auxCont--;
			}else {
				System.out.println(nomesArrumados[x] + " esta desclassificado(a)");
			}
		}
		
		if(contClassificados > 0) {
			System.out.println("\nKakashi tera um total de "+ contClassificados +" aluno(s) nesse semestre");
		}
		else {
			System.out.println("\nEsse semestre ninguem veio treinar na aldeia da folha");
		}
	
  }
}