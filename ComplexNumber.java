class ComplexNumber{
    int real,img;
    public ComplexNumber(int r1,int r2){
        this.real=r1;
        this.img=r2;
    }

    public void showC()
    {
        System.out.println(this.real + " + i" + this.img);
    }

    public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
    {
        ComplexNumber res = new ComplexNumber(0, 0);
        res.real=n1.real+n2.real;
        res.img=n1.img+n2.img;
        return res;
    }
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(5, 6);
        ComplexNumber n2 = new ComplexNumber(6, 5);
        n1.showC();
        n2.showC();

        ComplexNumber res= add(n1,n2);
        res.showC();
    }
}