package Training_Java;

import java.util.*;

public class GreaterTest {

	public static void main(String[] args) {
		
		 Greater g = new Greater();
		 
	   Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   
	   g.max(x,y);
       g.min(10,20,30,40,50,60,70);
       g.max(11,22,33,44,55,66,77,88);
       
	}

}
