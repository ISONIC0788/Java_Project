public class RecusiveFunc {
    public static void main(String[] args) {
        // base case that allow to stop infinite  iteration
        // recusive case part of function it call it self in  to solve small problems
        System.out.println(factorial(5));
        System.out.println(factorial2(6));
    }
    static  int factorial(int n ){
        if(n == 0){
            return 1;
        }else {
            return n * factorial(n - 1);
        }

    }
    static int factorial2(int a ){
        if(a > 0){
            return a * factorial2(a - 1);
        }else {
            return 1;
        }
    }
}
