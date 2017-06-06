import java.util.*;
class player210
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
    	System.out.println("ENTER THE NUMBER");
   		String s=in.nextLine();
   		char[] c=s.toCharArray();
   		Arrays.sort(c);
   		String s1=new String(c);
   		System.out.println(s1);
        
    }
}
