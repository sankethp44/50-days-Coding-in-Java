public class prg9 {
    static int gcd(int x, int y)
    {
        if (y==0)
        {
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        System.out.println("The gcd of two numbers are:");
        int result=gcd(100, 88);
        System.out.println(result);

    }
}
