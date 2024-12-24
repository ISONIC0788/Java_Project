public class NewRecusiv{
    public static void main(String[] args) {
        {
            // local variable
            int a = 10 , b = 20 ;
//            int f = a ;
//            a = b ;
//            b = f ;
              b = b-a ; // 10
              a = b + a ;
            System.out.println(a+"\n"+b);
        }
       int result = fact(10);
        int sumres = sum(5);
        System.out.println(result);
        System.out.println(sumres);
        showname();
        funcspli();
    }
    // recusive function that make factorila number
    static  int fact(int n){
        if(n > 0){
            return n * fact(n -1 );
        }else {
            return 1;
        }
    }
    static  void  showname(){
        String name = "ITUZE Ebed";
        String name2 = "Ebed Meleck";
        String result = name.concat(name2);
        System.out.println(result);
        System.out.println("The DAtatype"+result.getClass().getSimpleName());
    }
    static int sum(int a ){
        if(a>0){
            return a + sum(a -1 );
        }else {
            return 1;
        }
    }
    static void funcspli(){
        String myafull = "ITUZE AGACYO EBEDI MELECK";
        String[] ArrayFull = myafull.split(" ");
        System.out.println(ArrayFull);
    }



}
