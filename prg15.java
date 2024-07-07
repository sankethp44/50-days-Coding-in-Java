import java.util.Scanner;

public class prg15 {
    static int facto(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n * facto(n-1);
        }
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number to find out its factorial: ");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("The factorial of "+num+" is "+facto(num));
        sc.close();
    }
}
