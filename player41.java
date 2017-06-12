import java.util.Scanner;

public class player41 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE STRINGS for 1st set");
		String s1=in.nextLine();
		String s2=in.nextLine();
		System.out.println("ENTER THE STRING for 2nd set");
		String s3=in.nextLine();
		String s4=in.nextLine();
		String c1=s1.replaceAll(String.valueOf(s1.charAt(s1.length()-1)),"");
		String c2=s2.replaceAll(String.valueOf(s2.charAt(s2.length()-1)),"");
		String c3=s3.replaceAll(String.valueOf(s3.charAt(s3.length()-1)),"");
		String c4=s4.replaceAll(String.valueOf(s4.charAt(s4.length()-1)),"");
		if(c1.length()+c2.length()==c3.length()+c4.length())
		{
			System.out.println("ENTERED STRINGS ARE ISOMORPHIC");
		}
		else
		{
			System.out.println("ENTERED STRINGS ARE NOT ISOMORPHIC");
		}
	}

}
