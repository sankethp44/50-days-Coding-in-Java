import java.util.Scanner;

public class prg14 {
    static void isVOrC(char c){
        char c1=c;
        if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'||c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U'){
            System.out.println("The character "+ c1 +" is a vowel");
        }
        else{
            System.out.println("The character "+ c1 +" is a consonant");
        }
    }
    public static void main(String[] args) {
        char c;
        System.out.println("Enter a character to check whether it is a vowel or a consonant");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        isVOrC(c);
        sc.close();
    }
}
