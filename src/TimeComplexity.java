public class TimeComplexity {
    static int recusive(int a ){
        if(a>0){
            return a + recusive(a -1);
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeComplexity demo = new TimeComplexity();
        System.out.println(demo.findSum(99999));
        System.out.println("Time taken " + (System.currentTimeMillis()-now)+"mill seconds ");
        System.out.println(recusive(5));
    }
    public int findSum(int n ){
        return n * (n + 1)/2 ;
    }

//    public int findSum(int n){
//        int sum = 0;
//        for(int i =1 ; i <= n; i++){
//          sum = sum +1 ;
//        }
//        return sum;
//    }
}
