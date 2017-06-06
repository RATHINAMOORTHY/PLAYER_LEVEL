import java.util.*;
class player206
{
    public static void main(String args[])
    {
        {
        Scanner in=new Scanner(System.in);
    	System.out.println("ENTER THE STRING");
   		String s=in.nextLine();
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
        	if(Character.isUpperCase(c[i]))
        	{
        		System.out.print(Character.toLowerCase(c[i]));
        	}
        	else
        	{
        		System.out.print(Character.toUpperCase(c[i]));
        	}
        }
        }
    }
}
