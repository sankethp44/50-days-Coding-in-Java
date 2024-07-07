public class prg11 {

    public static void leapYear(int year)
    {
        boolean isLeapYear=false;
        if (year%4==0)
        {
            isLeapYear=true;
            if(year%100==0)
            {
                if(year%400==0)
                {
                    isLeapYear=true;
                }
                else{
                    isLeapYear=false;
                }
            }
        }
        else
        isLeapYear=false;

        if (!isLeapYear)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }
    public static void main(String[] args) {
        leapYear(1944);
    }
}
