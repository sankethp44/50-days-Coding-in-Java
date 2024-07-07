
class prg12{

    static void checkArmstrong(int n1,int n2)
    {
        for(int j=n1+1;j<n2;j++){
            int y=j;
            int N=0;
            while(y!=0)
            {
                y/=10;
                N++;
            }

            y=j;
            int sum=0;
            while(y!=0)
            {
                int d=y%10;
                sum+=Math.pow(d,N);
                y/=10;
            }
            if (sum == j) 
                System.out.print(j + " ");
        }
         
    }
    public static void main(String[] args) {
        int n1=100;
        int n2=900;
        checkArmstrong(n1,n2);
        System.out.println();
    }
    
}