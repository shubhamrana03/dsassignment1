import java.util.*;

public class powrec {

    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter base and power");
        int base = in.nextInt(); 
 int powerRaised = in.nextInt();
        int result = power(base, powerRaised);

        System.out.println(result);
    }

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
    }
}
