import java.math.*;
class power39
{
  public static void main(String args[])
  {
    int n=Integer.valueOf(args[0]),flag=0;
    for(int i=0;i<=n/2;i++)
    {
      if(n==Math.pow(i,2))
      {
        System.out.print("POWER OF TWO");
		flag=1;
		break;
      }
	}
	
      if(flag==0)
      {
        System.out.print("NOT POWER OF TWO");
      }
    
  }
}
