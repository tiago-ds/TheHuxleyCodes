import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		String pessoa1 = in.nextLine();
		String pessoa2 = in.nextLine();
		String pessoa3 = in.nextLine();
		String pessoa4 = in.nextLine();
		String pessoa5 = in.nextLine();
		String pos1 = "Princesa", pos2="a", pos3="a", pos4="a", pos5 ="a";
		//Mario
		if(pessoa2.equals("Mario") || pessoa4.equals("Mario")) {
			pos2 = "Mario";
		}else if(pessoa3.equals("Mario") || pessoa5.equals("Mario")) {
			pos3 = "Mario";
		}
		//Toad
		if(pessoa2.equals("Toad") || pessoa4.equals("Toad")) {
			if(pos2.equals("a")) {
				pos2 = "Toad";
			}else{
				pos4 = "Toad";
			}
		}
		if(pessoa3.equals("Toad") || pessoa5.equals("Toad")) {
			if(pos3.equals("a")) {
				pos3 = "Toad";
			}else{
				pos5 = "Toad";
			}
		}
		
		//Luigi
		if(pessoa3.equals("Luigi") || pessoa5.equals("Luigi")) {
			if(pos3.equals("a")) {
				pos3 = "Luigi";
			}else{
				pos5 ="Luigi";
			}
		}if(pessoa2.equals("Luigi") || pessoa4.equals("Luigi")) {
			if(pos2.equals("a")) {
				pos2 = "Luigi";
			}else {
				pos4 = "Luigi";
			}
		}
		//Yoshi
		if(pessoa2.equals("Yoshi") || pessoa4.equals("Yoshi")) {
			pos4 = "Yoshi";
		}if(pessoa3.equals("Yoshi") || pessoa5.equals("Yoshi")) {
			pos5 = "Yoshi";
		}
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);
		System.out.println(pos4);
		System.out.println(pos5);
  }
}