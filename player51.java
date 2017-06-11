import java.util.Arrays;
import java.util.Scanner;

public class player51 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ELEMENTS FOR ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
        Arrays.sort(a);
        System.out.println("SECOND SMALLEST IN ARRAY = "+a[1]);
	}

}
