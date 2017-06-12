import java.util.Scanner;
public class player117 {
	public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		 Scanner in=new Scanner(System.in);
		 String n=in.nextLine();
		 char[] c=new String((new StringBuffer(n)).reverse()).toCharArray();
		 for(char c1:c)
		 {
			 System.out.print(c1+"-");
		 }
	}
}
