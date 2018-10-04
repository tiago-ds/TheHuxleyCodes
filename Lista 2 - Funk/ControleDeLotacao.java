import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lotacao = in.nextInt();
		int total, fila, VIP, espacoDisp, auxFila;
		total = fila = VIP = auxFila = 0;
		espacoDisp = (lotacao - total);
		while(in.hasNext()) {
			String movimento = in.next();
			String quantidade = in.next();
			//Caso de VIP(vip s� conta entrada)
			if(quantidade.equals("VIP")) {
				total = total + 1;
				//condi��o para o espa�o dispon�vel n�o ser menor que 0
				if(lotacao >= total) {
					espacoDisp = (lotacao - total);
				} else {
					espacoDisp = 0;
				}
				//VIP = VIP + 1;
				System.out.println("1 pessoas entraram na casa. Atualmente ha " + total + " pessoas no evento.");
			}
			else {
				int nMovimento = Integer.parseInt(quantidade);
				if(movimento.equals("Entraram")) {
					//condi��o de ter espa�o suficiente pra todo mundo
					if(espacoDisp > 0 && espacoDisp >= nMovimento) {
						total = total + nMovimento;
						System.out.println(nMovimento +" pessoas entraram na casa. Atualmente ha " + total + " pessoas no evento.");
						espacoDisp = (lotacao - total);
					}
					//condi��o de ter espa�o, mas n�o para todo mundo. nesse caso, pessoas v�o para a fila
					else if(espacoDisp > 0 && espacoDisp < nMovimento) {
						total = total + espacoDisp;
						auxFila = nMovimento - espacoDisp;
						System.out.println(espacoDisp +" pessoas entraram na casa. Atualmente ha " + total + " pessoas no evento.");
						espacoDisp = lotacao - total;
						fila = fila + auxFila;
						
						System.out.println("Infelizmente a casa esta lotada, " + auxFila + " pessoas foram redirecionadas para a fila.");
						System.out.println("A fila agora contem "+ fila +" pessoas.");
						espacoDisp = (lotacao - total);
					}
					//condi��o da casa estar cheia, mas sem exceder a lota��o
					else if(espacoDisp == 0) {
						fila = fila + nMovimento;
						auxFila = nMovimento - espacoDisp; 
						System.out.println("Infelizmente a casa esta lotada, " + auxFila + " pessoas foram redirecionadas para a fila.");
						System.out.println("A fila agora contem "+ fila +" pessoas.");
						espacoDisp = (lotacao - total);
					}
					//condi��o da casa estar cheia, e com o limite de lota��o excedido(por conta de vips)
					else if(espacoDisp < 0) {
						//espacoDisp = 0;
						fila = fila + nMovimento;
						auxFila = nMovimento - espacoDisp;
						System.out.println("Infelizmente a casa esta lotada, " + auxFila + " pessoas foram redirecionadas para a fila.");
						System.out.println("A fila agora contem "+ fila +" pessoas.");
						espacoDisp = (lotacao - total);
					}
				}
				else if(movimento.equals("Sairam")) {
					//Subtrai-se logo aqui o quanto saiu do total de pessoas, al�m de calcular o espacoDisponivel
					total = total - nMovimento;
					espacoDisp = lotacao - total;
					//condi��o para sair e n�o ter fila
					if(fila == 0) {
						System.out.println(nMovimento + " pessoas sairam da casa. Atualmente ha " + total + " pessoas no evento.");
					}else {
						//condi��o para sair com espa�o dispon�vel > 0
						if(espacoDisp > 0) {
							//se a fila for menor que o espa�o disponivel, todos v�o entrar e a fila vai zerar.
							if(fila <= espacoDisp) {
								System.out.println(nMovimento + " pessoas sairam da casa. Atualmente ha " + total + " pessoas no evento.");
								System.out.println(fila + " pessoas da fila entraram na casa.");
								System.out.println("Todos que estavam na fila de espera conseguiram entrar, atualmente nao ha fila de espera.");
								total = total + fila;
								fila = 0;
								espacoDisp = lotacao - total;
							}
							//se a fila for maior que o espa�o dispon�vel, ela vai diminuir, mas a casa vai encher e v�o sobrar pessoas.
							else if(fila > espacoDisp) {
								System.out.println(nMovimento + " pessoas sairam da casa. Atualmente ha " + total + " pessoas no evento.");
								auxFila = espacoDisp;
								System.out.println(espacoDisp + " pessoas da fila entraram na casa.");
								fila = fila - espacoDisp;
								System.out.println("A fila agora contem " + fila + " pessoas.");
								total = total + espacoDisp;
								espacoDisp = lotacao - total;
							}
						}
						//condi��o para sair com espa�o dispon�vel = 0
						else if(espacoDisp == 0) {
							System.out.println(nMovimento + " pessoas sairam da casa. Atualmente ha " + total + " pessoas no evento.");
						}
						//condi��o para sair com espa�o dispon�vel < 0(por conta de vips)
						else if(espacoDisp < 0) {
							System.out.println(nMovimento + " pessoas sairam da casa. Atualmente ha " + total + " pessoas no evento.");
						}
					}
							
					
					
					}
			}System.out.println("");
		}
		System.out.println("Vai Troinha, agora pede o ubii!");
	}
	
}