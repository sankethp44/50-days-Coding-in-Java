public class prg10 {
    static void prime(int N){
        int x,y,flg;
        for (x=2;x<N;x++)
        {
            flg=0;
            for(y=2;y*y<=x;y++)
            {
                if(x%y==0)
                {
                    flg=1;
                    break;
                }
            }
            if(flg==0)
                {
                    System.out.print(x+" ");
                }
        }
    }
    public static void main(String[] args) {
        prime(45);
    }
}
