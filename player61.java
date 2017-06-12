
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class player61{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ELEMENTS FOR ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("ENTER THE ELEMENT");
		int n1=in.nextInt();
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
			}
				if(sum==n1)
				{
					for(int k=i;k<n;k++)
					{
						System.out.print(a[k]+"+");
					}
					System.out.print("= "+sum);
				}
		}

	}

}
