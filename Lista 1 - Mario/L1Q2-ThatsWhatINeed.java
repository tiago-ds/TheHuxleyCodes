import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
	String s;
	int r = 0;
	s = in.nextLine();
	if(s.equals("Zero")){
            r = 0;
        }
        else if(s.equals("Um")){
            r = 1;
        }
	else if(s.equals("Dois")){
            r = 2;
        }
	else if(s.equals("Tres")){
            r = 3;
        }
	else if(s.equals("Quatro")){
            r = 4;
        }
	else if(s.equals("Cinco")){
            r = 5;
        }
        else if(s.equals("Seis")){
            r = 6;
        }  
	else if(s.equals("Sete")) {
            r = 7;
        }    
	else if(s.equals("Oito")){
            r = 8;
        }
        else if(s.equals("Nove")){
		r = 9;
        }
	System.out.print(r);
  }
}