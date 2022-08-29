import java.util.Scanner;
class Spy_arijit2{
    public static void main(String args[]){
        int n,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:-");
    n=sc.nextInt();
   Spy_arijit obj= new  Spy_arijit();
    c=obj.spy(n);
    if(c==1){
        System.out.println("!!The number is spy!!");
    }
    else{
        System.out.println("!!The number is not spy!!");
    }
    }
}