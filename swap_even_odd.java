class swap_even_odd
{
  public static void main(String args[])
  {
    char[] ch=args[0].toCharArray();
    for(int i=0;i<args[0].length();i+2)
    {
      System.out.print(ch[i]+ch[i+1]);
    }
  }
}

      
