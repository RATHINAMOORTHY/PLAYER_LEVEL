class romantonum
{
   public static void main(String args[])
  {
	if(args[0].equalsIgnoreCase("IV"))
	{
		System.out.print("4");
	}
	else
	{
	int sum=0;
    char ch[]=args[0].toCharArray();
	int[] no=new int[args[0].length()];
	for(int i=0;i<args[0].length();i++)
	{
		if(ch[i]=='v'||ch[i]=='V')
		{
			no[i]=5;
		}
		else if(ch[i]=='i'||ch[i]=='I')
		{
			no[i]=1;
		}
		else
		{
			no[i]=10;
		}
		sum=sum+no[i];
	}
	System.out.print(+sum);
			
  }
  }
}
