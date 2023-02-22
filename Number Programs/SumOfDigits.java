//program to find the sum of digits in a number
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int copy=num;
        int sum=0;
        while (copy!=0)
        {
            int d=copy%10; //extracting a digit
            sum=sum+d; //Sum = sum + digit
            copy=copy/10; //dividing the number by 10
        }
        System.out.println("The sum of all digits in the number is: "+sum);
        sc.close();
    }
}
