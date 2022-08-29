public class Spy_arijit{
    public static int spy (int x){
        int d,s=0,m=1;
    while(x>0){
        d=x%10;
        s=s+d;
        m=m*d;
        x=x/10;
    }
    if(s==m){
        return 1;
    }
    else{
        return 0;
    }
    }
}