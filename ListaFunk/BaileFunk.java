import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        String daVez = "N/A";
        int cAn, cLu, cJo, cKe, cLi, cResto;
        cAn = cLu = cJo = cKe = cLi = 0;
        cResto = 0;
        String maior = "";
        String maior2 = "";
        for (int x = 0; x != C; x++) {
            daVez = in.next();
            if (daVez.equals("Anitta")) {
                cAn = cAn + 1;
                //System.out.println("anita");
            } else if (daVez.equals("Ludmilla")) {
                cLu = cLu + 1;
            } else if (daVez.equals("Jojo")) {
                cJo = cJo + 1;
            } else if (daVez.equals("Kevinho")) {
                cKe = cKe + 1;
            } else if (daVez.equals("Livinho")) {
                cLi = cLi + 1;
            } else {
                cResto = cResto + 1;
                //System.out.println("resto");
            }

        }
        //System.out.println(cResto);
        //Anitta
        if (cAn >= cLu && cAn >= cJo && cAn >= cKe && cAn >= cLi && cAn >= cResto) {
            maior = "Anitta";
            if (cAn == cLu) {
                maior2 = "Ludmilla";
            } else if (cAn == cJo) {
                maior2 = "Jojo";
            } else if (cAn == cKe) {
                maior2 = "Kevinho";
            } else if (cAn == cLi) {
                maior2 = "Livinho";
            } else if (cAn == cResto) {
                maior = "Anitta";
            }
        } //Jojo
        else if (cJo >= cAn && cJo >= cLu && cJo >= cKe && cJo >= cLi && cJo >= cResto) {
            maior = "Jojo";
            if (cJo == cLu) {
                maior2 = "Ludmilla";
            } else if (cJo == cKe) {
                maior2 = "Kevinho";
            } else if (cJo == cLi) {
                maior2 = "Livinho";
            }
        }else if (cKe >= cAn && cKe >= cLi && cKe >= cLu && cKe >= cJo && cKe >= cResto) {
            maior = "Kevinho";
            if(cKe == cLi){
                maior2 = "Livinho";
            } else if(cKe == cLu){
                maior2 = "Ludmilla";
            }
        }

        //Livinho
        else if (cLi >= cAn && cLi >= cLu && cLi >= cKe && cLi >= cJo && cLi >= cResto) {
            maior = "Livinho";
            if (cLi == cLu) {
                maior2 = "Ludmilla";
            }
        } //Ludmilla
        else if (cLu >= cAn && cLu >= cLi && cLu >= cKe && cLu >= cJo && cLu >= cResto) {
            maior = "Ludmilla";
        } //Kevinho
        
        //Resto
        else if (cResto > cAn && cResto > cLi && cResto > cLu && cResto > cJo) {
            maior = "resto";
        }
        //System.out.println(maior);
        if (maior2.equals("")) {
            if (maior.equals("resto")) {
                System.out.println("As pessoas querem ver outra pessoa");
            } else {
                System.out.println("As pessoas estao esperando por " + maior + ".");
            }
        } else {
            System.out.println("Houve um empate entre: " + maior + ", " + maior2);
        }
  }
}