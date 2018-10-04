import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		String tudo = "";
		String tudoDaVez = "";
		String daVez = "";
		int simbolos = 0;
		while(in.hasNext()) {
			daVez = in.nextLine().replace(" ", "");
			//Adicionar um char vazio para ativar a condi��o de fim da linha(no final)
			//daVez = daVez + " ";
			for(int x = 0; x < daVez.length(); x++) {
				//m�todo pra achar o char analisado nessa rodada do FOR
				char charDaVez = (daVez.charAt(x));
				//transformar em string para poder concatenar sem problemas
				String charDaVezString = Character.toString(charDaVez);
				//primeira condi��o, para caso a letra esteja mai�scula
				if(charDaVez >= 'A' && charDaVez <= 'Z') {
					int ascii = (int) charDaVez;
					charDaVezString = Integer.toString(ascii - 64);
					tudoDaVez = tudoDaVez + charDaVezString;
				}
				//condi��o para cada o char seja um s�mbolo. Nesse caso, ele vai ser desprezado
				else if(charDaVez == '*' || charDaVez == ')' || charDaVez == '$' || charDaVez == '!' || charDaVez == '+' || charDaVez == '@' || charDaVez == '-' || charDaVez == '/' || charDaVez == '(' || charDaVez == '%' || charDaVez == ',' || charDaVez == '.' || charDaVez == '?') {
					tudoDaVez = tudoDaVez + "";
					simbolos += 1;
				}
				//condi��o para letras min�sculas
				else if(charDaVez >= 'a' && charDaVez <= 'z') {
					//caso a quantidade de simbolos seja impar(letra minuscula)
					if(simbolos % 2 == 1) {
						//replace � a vari�vel local para auxiliar na troca de Case
						//nesse caso n�o precisaria, mas pra padronizar..
						String replace = charDaVezString.toLowerCase();
						tudoDaVez = tudoDaVez + replace;
					}
					//caso a quantidade seja par(letra maiuscula)
					else if(simbolos % 2 == 0) {
						//replace � a vari�vel local para auxiliar na troca de Case
						String replace = charDaVezString.toUpperCase();
						tudoDaVez = tudoDaVez + replace;
					}
				}
				//condi��o para n�meros
				else if(charDaVez >= '0' && charDaVez <= '9') {
					//agora � testar n�mero por n�mero
					if(charDaVez == '0') {
						tudoDaVez = tudoDaVez + '*';
					}
					else if(charDaVez == '1') {
						tudoDaVez = tudoDaVez + ')';
					}
					else if(charDaVez == '2') {
						tudoDaVez = tudoDaVez + '$';
					}
					else if(charDaVez == '3') {
						tudoDaVez = tudoDaVez + '!';
					}
					else if(charDaVez == '4') {
						tudoDaVez = tudoDaVez + '+';
					}
					else if(charDaVez == '5') {
						tudoDaVez = tudoDaVez + '@';
					}
					else if(charDaVez == '6') {
						tudoDaVez = tudoDaVez + '-';
					}
					else if(charDaVez == '7') {
						tudoDaVez = tudoDaVez + '/';
					}
					else if(charDaVez == '8') {
						tudoDaVez = tudoDaVez + '(';
					}
					else if(charDaVez == '9') {
						tudoDaVez = tudoDaVez + '%';
					}
				}
				//condi��o para caso a linha tenha acabado
				/*else if(charDaVez == ' ') {
					tudoDaVez = tudoDaVez + "\n";
				}*/
				//tudoDaVez = tudoDaVez + charDaVez;
				
			}
			//somar a String da linha com o que j� tem(adicionando a quebra de linha)
			//resetar os s�mbolos, pois a quantidade deles n�o afeta pra a pr�xima linha;
			simbolos = 0;
			tudo = tudoDaVez + "\n" + tudo;
			tudoDaVez = "";
		}
		
		
		System.out.println(tudo);
  }
}