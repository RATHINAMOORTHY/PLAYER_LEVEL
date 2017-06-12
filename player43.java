import java.util.Scanner;

public class player43 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE STRING 1");
		String s1=in.nextLine();
		System.out.println("ENTER THE STRING 2");
		String s2=in.nextLine();
		if(s1.contains(s2))
		{
			System.out.println("STRING 2 IS SUB-STRING OF STRING 1");
		}
		if(s2.contains(s1))
		{
			System.out.println("STRING 1 IS SUB-STRING OF STRING 2");
		}

	}

}
