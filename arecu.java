import java.util.*;
class search
{
    int rec(int ar[], int l, int r, int x)
     {
          if (r < l)
             return -1;
          if (ar[l] == x)
             return l;
          return rec(ar, l+1, r, x);
     }
      
}




public class arecu
      {
 public static void main(String[] args) 
     {

        Scanner in = new Scanner(System.in);
        int n=0;
System.out.println("Enter array size and elements");
        n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt(); 
        }
        int x,a; 
  System.out.println("Enter element to search");
         x = in.nextInt();

        search s = new search();
        a = s.rec(arr, 0, arr.length-1, x);
        if (a != -1)
        {
           System.out.println("Element " + x + " is present at index " + 
                                                    (a+1));
        }
        else {
            System.out.println("Element " + x + " is not present");
        }
 }
}