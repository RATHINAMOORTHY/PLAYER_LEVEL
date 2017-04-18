class validate24
{
  public static void main(String args[])
  {
    for(int i=0;i<args.length;i++)
    {
      int n1=args[i].length();
      char[] c=args[i].toCharArray();
      if(Character.isDigit(c[0])&&Character.isDigit(c[n1-1]))
      {
        System.out.println(args[i]+"=>TRUE");
      }
      else
      {
         System.out.println(args[i]+"=>FALSE");
      }   
    }
  }
}
