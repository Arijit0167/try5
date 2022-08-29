import java.util.Scanner;
class Adition{
    public static void main(String args[]){
        int a,b,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:-");
        a=sc.nextInt();
        System.out.println("Enter second Number:-");
        b=sc.nextInt();
        s=a+b;
        System.out.println("The addition is:-"+s);

    }
}