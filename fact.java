public class fact {
    public static void main(String args[]){
             int n=5;
             int ans=fact(n);
             System.out.println(ans);
    }
    public static int fact(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        int ca=fact(n-1);
        int fact_n=n*fact(n-1);
        return fact_n;
    }


}
