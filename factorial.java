class factorial
{
  public static void main(String args[])
  {
    int total=1;
    int a=Integer.valueOf(args[0]);
    for(int i=a;i>0;i--)
    {
      total=total*i;
    }
    System.out.print(+total);
  }
}
