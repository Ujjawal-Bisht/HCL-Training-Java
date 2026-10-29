package Day02;
class rec{
    public static void recurr(int n){
        if(n == 0) return ;

        System.out.print(n + " ") ;

        recurr(n-1) ;
    }

    public static void main(String[] args){
        recurr(5) ;
    }
}