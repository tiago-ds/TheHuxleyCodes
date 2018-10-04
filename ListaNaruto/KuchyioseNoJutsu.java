import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int participantes = in.nextInt();
		if(participantes > 0) {
			in.nextLine();
			//Criar um array para cada animal, pra facilitar na hora da impressao;
			String[] sapo = new String[participantes];
			String[] cobra = new String[participantes];
			String[] lesma = new String[participantes];
			String[] macaco = new String[participantes];
			String[] cao = new String[participantes];
			
			//variaveis de contagem auxiliares;
			int auxSapo, auxCobra, auxLesma, auxMacaco, auxCao;
			auxSapo = auxCobra = auxLesma = auxMacaco = auxCao = 0;
			
			for(int x = 0; x < participantes  ; x++) {
				String participanteECaracteristica = in.nextLine();
				String[] array = participanteECaracteristica.split(" ");
				//Adicionar o "- " agora para facilitar a impress?o no fim do programa;
				String participante = "- " + array[0];
				if(array.length > 1 ){
					String caracteristica = array[1] + " ";
					/*teste para caso n?o seja dada uma caracter?stica. Como ser? adicionado um espa?o
					em branco no FINAL da string, se o primeiro espa?o da string for branco, ? porque
					n?o foi dada uma caracter?stica para o participante.*/
					if(caracteristica.charAt(0) == ' ') {
						//oi :)
					}
					/*caso o primeiro espa?o n?o seja em branco, h? uma caracter?stica. Por esse motivo os testes s?o
					"Caracteristica_" (para resolver isso poderia chamar o m?todo string.trim(), mas ? desnecess?rio*/
					else {
						if(caracteristica.equals("Coragem ") || caracteristica.equals("Determinacao ") || caracteristica.equals("Conviccao ")) {
							sapo[auxSapo] = participante;
							auxSapo = auxSapo + 1;
						}
						else if(caracteristica.equals("Ambicao ") || caracteristica.equals("Astucia ") || caracteristica.equals("Expertise ")) {
							cobra[auxCobra] = participante;
							auxCobra = auxCobra + 1;
						}
						else if(caracteristica.equals("Analise ") || caracteristica.equals("Suporte ") || caracteristica.equals("Tecnica ")) {
							lesma[auxLesma] = participante;
							auxLesma = auxLesma + 1;
						}
						else if(caracteristica.equals("Agilidade ") || caracteristica.equals("Inteligencia ") || caracteristica.equals("Destreza ")) {
							macaco[auxMacaco] = participante;
							auxMacaco = auxMacaco + 1;
						}
						else if(caracteristica.equals("Experiencia ") || caracteristica.equals("Perspicacia ") || caracteristica.equals("Pericia ")) {
							cao[auxCao] = participante;
							auxCao = auxCao + 1;
						}
					}
				}
				
				
			}
			//condi??o necess?ria, pois se n?o houver nenhum animal atribu?do, o programa mostrar? algo totalmente diferente
			if(auxSapo == 0 && auxCobra == 0 && auxLesma == 0 && auxMacaco == 0 && auxCao == 0) {
				System.out.println("Nao havera Jounins forte esse ano");
			}
			else {
				System.out.println("Sapos:");
				for (int x = 0; x < auxSapo; x++) {
					System.out.println(sapo[x]);
				}
				System.out.println("Cobras:");
				for (int x = 0; x < auxCobra; x++) {
					System.out.println(cobra[x]);
				}
				System.out.println("Lesmas:");
				for (int x = 0; x < auxLesma; x++) {
					System.out.println(lesma[x]);
				}
				System.out.println("Macacos:");
				for (int x = 0; x < auxMacaco; x++) {
					System.out.println(macaco[x]);
				}
				System.out.println("Caes:");
				for (int x = 0; x < auxCao; x++) {
					System.out.println(cao[x]);
				}
			}
		}
		else {
			System.out.println("Nao havera Jounins forte esse ano");
		}
		in.close();

	}
}