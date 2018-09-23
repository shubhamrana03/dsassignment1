import java.util.Scanner;
import java.util.*;
class summ
{
 int som(int n)
{
if(n == 0)

 return 0;
return(n%10+som(n/10));
 }



}
public class sumrec
{
  public static void main(String[] args)
  {
    String a1,a2;
  int a,b;
    Scanner in = new Scanner(System.in);
      System.out.println("Enter digit string");
      a1 = in.next();
       a = Integer.parseInt(a1);
    summ s = new summ();
  b=s.som(a);
System.out.println("Sum is");

 System.out.println(b);
}
}