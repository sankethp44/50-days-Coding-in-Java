import java.util.Scanner;
class prg17 {
	public static void main(String args[])
	{
		float P, R, T;
        System.out.println("Enter Principle amount, rate of interest, time respectively:");
        Scanner sc = new Scanner(System.in);
        P=sc.nextFloat();
        R=sc.nextFloat();
        T=sc.nextFloat();
		float SI = (P * T * R) / 100;
		System.out.println("Simple interest = " + SI);
		sc.close();
	}
}
