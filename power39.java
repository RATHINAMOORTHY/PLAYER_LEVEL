import java.math.*;
class power39
{
  public static void main(String args[])
  {
    int n=Integer.valueOf(args[0]);
    for(int i=0;i<=n/2;i++)
    {
      if(n==Math.pow(i,2))
      {
        System.out.print("POWER OF 2");
      }
      else
      {
        System.out.print("NOT POWER OF 2");
      }
    }
  }
}
