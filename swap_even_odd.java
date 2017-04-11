class swap_even_odd
{
  public static void main(String args[])
  {
    char[] ch=args[0].toCharArray();
	if(args[0].length()%2==0)
	{
    for(int i=0;i<args[0].length();i=i+2)
    {		
	  System.out.print(ch[i+1]);
      System.out.print(ch[i]);
    }
	}
	else
	{
    for(int i=0;i<args[0].length()-1;i=i+2)
    {		
	  System.out.print(ch[i+1]);
      System.out.print(ch[i]);
    }
	System.out.print(ch[args[0].length()-1]);
	}
		
  }
}

      
