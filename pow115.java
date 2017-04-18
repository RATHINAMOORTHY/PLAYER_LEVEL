import java.util.*;
class pow115
{
  public static void main(String args[])
  {
    int sum=0;
    int n=Integer.valueOf(args[0]);
    while(n!=0)
    {
      int i=n%10;
      sum=sum+(i*i);
      n=n/10;
    }
    System.out.print(+sum);
  }
}
  
