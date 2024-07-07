import java.util.Scanner;
public class prg16 {
    static int fibo(int n){
        if(n<2){
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int num,res=0;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num*2;i++)
        {
            if(i%2==0)
            res+=fibo(i);
        }
        System.out.println("The resultant values are:"+res);
        sc.close();
    }
}
