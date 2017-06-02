import java.util.Arrays;
import java.util.Scanner;

public class sort42 {

	public static void main(String[] args) {
		System.out.print("ENTER THE SIZE OF ARRAY");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.print("ENTER THE ARRAY ELEMENTS");
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(b);
		if(Arrays.equals(a,b))
				{
			System.out.println("GIVEN VALUES ARE IN SORTED ORDER");
				}
		else
		{
			System.out.println("GIVEN VALUES ARE NOT IN SORTED ORDER");
		}
	}

}

