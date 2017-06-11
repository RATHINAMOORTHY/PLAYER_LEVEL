import java.util.Scanner;

public class player17 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		String s1=in.nextLine();
		StringBuffer sb=new StringBuffer(s1);
		sb.insert(3,'.');
		sb.insert(7,'.');
		sb.insert(11,'.');
		System.out.println(sb);
	}

}
