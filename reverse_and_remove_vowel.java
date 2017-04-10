class reverse_and_remove_vowel
{
  public static void main(String args[])
  {
    StringBuffer sb=new StringBuffer(args[0]);
    System.out.print("REVERSED");
    System.out.println(sb.reverse());
    System.out.print("VOWEL REMOVED");
    char[] ch=args[0].toCharArray();
    for(int i=0;i<args[0].length();i++)
    {
      if(ch[i]!='a'||ch[i]!='e'||ch[i]!='i'||ch[i]!='o'||ch[i]!='u')
        System.out.print(ch[i]);
    }
  }
}
