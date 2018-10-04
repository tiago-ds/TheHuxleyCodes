import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double tangL = in.nextDouble();
		double termos = in.nextDouble();
		double vodkaL = tangL;
		double auxiliargeral = 0;
		if(termos == 0) {
			vodkaL = 0;
		}else {
			if(termos != 0) {
				termos -= 1;
			}
			for(double aux = 1; aux != termos+1; aux++) {
				//M?todo para calcular fatorial{
				double fat = 1;
				//M?todo para calcular qual a pot?ncia{
				double pot = aux*2;
				//Acaba aqui}
				double totfat = pot+1;
				for(int i = 1; i <= totfat; i++) {
					fat*=i;
				}
				//Acaba aqui}
				
				//Teste para saber qual o termo
				if(aux == 0) {
					vodkaL = vodkaL;
				}
				if(aux % 2 == 1) {
					vodkaL = vodkaL - Math.pow(tangL, pot)/fat;
				}
				else if(aux % 2 == 0) {
					vodkaL = vodkaL + Math.pow(tangL, pot)/fat;
				}
			}
		}
		
		System.out.printf("%.3f", Math.abs(vodkaL));


    
  }
}