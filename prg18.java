import java.util.Scanner;

public class prg18 {
    public static void main(String[] args) {
        double P ,R, T;
        double res;
        System.out.println("Enter Principal, rate of interest, time of the loan: ");
        Scanner sc = new Scanner(System.in);
        P=sc.nextDouble();
        R=sc.nextDouble();
        T=sc.nextDouble();

        res=P*(Math.pow(1+R/100, T));

        System.out.println("Compound interest is: "+res);
        sc.close();
    }
}
