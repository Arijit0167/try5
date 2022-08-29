import java.util.Scanner;
class Positive{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number check positive or not:-");
        n=sc.nextInt();
        if(n>0){
            System.out.println("!!The number is positive!!");
        }
        else if(n==0){
            System.out.println("!!The number is zero!!");
        }
        else{
            System.out.println("!!The number is negative!!");
        }
    }
}
