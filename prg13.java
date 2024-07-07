import java.util.Scanner;

public class prg13 {
    static void checkNeon(int n1)
    {
        int s=n1;
        int sqr=0,sum=0;
        sqr=(int) Math.pow(s,2);
        int result=sqr;
        while(sqr!=0)
        {
            result=sqr%10;
            sum+=result;
            sqr/=10;
        }
        if(sum==s)
        {
            System.out.println("It is a Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
    }
    public static void main(String[] args) {
        int n1;
        System.out.println("Enter a numebr to check whether it is a neon numebr or not:");
        Scanner s = new Scanner(System.in);
        n1=s.nextInt();
        checkNeon(n1);
        s.close();
    }
}
