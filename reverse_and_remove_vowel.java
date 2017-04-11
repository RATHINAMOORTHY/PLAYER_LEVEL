class reverse_and_remove_vowel
{
  public static void main(String args[])
  {
    StringBuffer sb=new StringBuffer(args[0]);
    System.out.println("REVERSED");
    System.out.println(sb.reverse());
    String s=new String(sb);
    System.out.println("VOWEL REMOVED");
    char[] ch=s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
		int flag=0;
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			flag++;
		}
		if(flag==0)
        System.out.print(ch[i]);
    }
  }
}
