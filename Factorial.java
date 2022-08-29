import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int f=1,i,n;
        System.out.println("Enter a number:-");
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            f=f*i;
        }
        System.out.println("The fatorial is:-"+f);
    }
}