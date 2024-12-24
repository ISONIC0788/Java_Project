public class Func {
    public static void main(String[] args) {
        hy();
      System.out.println(age(23, 34));
        System.out.println(myFr(23, 23));
    }
//    decration function
    static void hy(){
        System.out.println("Hellow world Frist function");
    }
    static String myFulln(String fname , String sname){
        return fname.concat(sname);
    }
    static int age(int a , int b ){
        return a + b;
    }
    static String myFrindn(String friendone , String friend2 , String friend3){
        return "Frist name "+friendone+"Second name"+friend2+"third name"+friend3;
    }
    static  int myFr(int x , int y){
        return x + y;
    }
}
