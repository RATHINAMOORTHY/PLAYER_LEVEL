import java.util.Scanner;

public class player113 {

	public static void main(String[] args) {
		 System.out.println("ENTER THE DATE OF BIRTH");
		 Scanner in=new Scanner(System.in);
		 String dob=in.nextLine();
		 int[] a=new int[3];
		 int i=0,flag;
		 if(dob.length()==10)
		 {
		 for(String s:dob.split("/"))
         {
			 a[i++]=Integer.valueOf(s);
         }
		 if((a[0]>0&&a[0]<32)&&(a[1]>0&&a[1]<13)&&(a[2]>1900&&a[1]<2018))
		 {
			 System.out.println("DATE OF BIRTH IS VALID");
		 }
		 else
		 {
			 System.out.println("DATE OF BIRTH IS NOT VALID");
		 }

		 }
		 else
		 {
			 System.out.println("DATE OF BIRTH IS NOT VALID");
		 }
	}

}
